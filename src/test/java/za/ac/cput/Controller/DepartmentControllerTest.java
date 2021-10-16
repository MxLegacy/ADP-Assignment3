package za.ac.cput.Controller;
/*      DepartmentControllerTest.java
        Entity
        Author: Devon Daniels (217299822)

 */
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import za.ac.cput.Entity.Course;
import za.ac.cput.Entity.Department;

import za.ac.cput.factory.CourseFactory;
import za.ac.cput.factory.DepartmentFactory;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class DepartmentControllerTest {

    private static Department department = DepartmentFactory.buildDepartment("Information ", "TEch", "Science", "lecturer");
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/department";


    @Test
    void create() {
        String url = baseURL + "/create";
        ResponseEntity<Department> postResponse = restTemplate.postForEntity(url, department, Department.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        department = postResponse.getBody();
        System.out.println("Saved course: " + department);
        assertEquals(department.getDeptName(), postResponse.getBody().getDeptName());
    }

    @Test
    void read() {
        String url = baseURL + "/read";
        System.out.println("URL: " + url);
        ResponseEntity<Department> postResponse = restTemplate.getForEntity(url, Department.class);
        assertNull(department.getDeptName(), postResponse.getBody().getDeptName());
    }

    @Test
    void update() {
        Department updated = new Department.Builder().copy(department).setDeptName("Networking").Build();
        String url = baseURL + "/update";
        System.out.println("URL:" + url);
        System.out.println("post data: " + updated);
        ResponseEntity<Department> response = restTemplate.postForEntity(url, updated, Department.class);
        assertNotNull(response.getBody());
    }

    @Test
    void delete() {
        String url = baseURL + "/delete";
        System.out.println("URL: " + url);
        restTemplate.delete(url);

    }

    @Test
    void getall() {
        String url = baseURL + "/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("Show All:");
        System.out.println(response);
        System.out.println(response.getBody());
    }
}

