package za.ac.cput.Controller;
/*      CourseControllerTest.java
        Entity
        Author: Devon Daniels (217299822)

 */
import org.apache.catalina.authenticator.SavedRequest;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.Entity.Course;

import za.ac.cput.factory.CourseFactory;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class CourseControllerTest {

    private static Course course = CourseFactory.buildCourse("MTech: Information Technology ", "  Thesis (R5IT01R)", "Information Technology");
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL= "http://localhost:8080/course";


    @Test

    void create() {
        String url = baseURL + "/create";
        ResponseEntity<Course> postResponse = restTemplate.postForEntity(url, course, Course.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        course = postResponse.getBody();
        System.out.println("Saved course: " + course);
        assertEquals(course.getCourseName(), postResponse.getBody().getCourseName());
    }

    @Test
    void read(){
        String url = baseURL +"/read";
        System.out.println("URL: " + url);
        ResponseEntity<Course> postResponse = restTemplate.getForEntity(url, Course.class);
        assertNotEquals(course.getCourseName(), postResponse.getBody().getCourseName());
    }

    @Test
    void update(){
        Course updated = new Course.Builder().copy(course).setCourseName("Multimedia").Build();
        String url = baseURL + "/update";
        System.out.println("URL:" + url);
        System.out.println("post data: " + updated);
        ResponseEntity<Course> response = restTemplate.postForEntity(url, updated, Course.class);
        assertNotNull(response.getBody());
    }

    @Test
    void delete() {
        String url = baseURL + "/delete";
        System.out.println("URL: " + url);
        restTemplate.delete(url);

    }

    @Test
    void getall(){
        String url = baseURL + "/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("Show All:");
        System.out.println(response);
        System.out.println(response.getBody());
    }


}