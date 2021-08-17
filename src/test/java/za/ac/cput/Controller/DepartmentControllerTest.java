package za.ac.cput.Controller;
/*      DepartmentControllerTest.java
        Entity
        Author: Devon Daniels (217299822)

 */
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import za.ac.cput.Entity.Course;
import za.ac.cput.Entity.Department;

import za.ac.cput.factory.DepartmentFactory;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DepartmentControllerTest {

    private static Department department = DepartmentFactory.buildDepartment("ICT", "Information Technology", "HRM", "Lecturer");
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/dept";

    @Test
    void create() {
        String url = baseURL + "/create";
        ResponseEntity<Department> postResponse = restTemplate.postForEntity(url, department, Department.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        department = postResponse.getBody();
        System.out.println("Department is Saved: " + department);
        assertEquals(department.getDeptName(), postResponse.getBody().getDeptName());
    }

    @Test
    void read() {
        String url = baseURL + "/create";
        ResponseEntity<Department> postResponse = restTemplate.postForEntity(url, department, Department.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        department = postResponse.getBody();
        System.out.println("Course is Saved: " + department);
        assertEquals(department.getDeptName(), postResponse.getBody().getDeptName());

    }
    @Test
    void update() {
        Department update = new Department.Builder().copy(department).setDeptName("Design").Build();
        String url = baseURL + "/update";
        System.out.println("URL: " + url);
        System.out.println("Post: " + update);
        ResponseEntity<Course>response = restTemplate.postForEntity(url, update, Course.class);
        assertNotNull(response.getBody());
    }

    @Test
    void delete() {
        String url = baseURL + "/delete/" + department.getDeptName();
        System.out.println("URL: " + url);
        restTemplate.delete(url);
    }

    @Test
    void getAll() {
        String url = baseURL + "/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("List All: ");
        System.out.println(response);
        System.out.println(response.getBody());
    }
    }
