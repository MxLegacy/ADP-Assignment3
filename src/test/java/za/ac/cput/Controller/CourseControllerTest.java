package za.ac.cput.Controller;
/*      CourseControllerTest.java
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
import za.ac.cput.factory.CourseFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CourseControllerTest {

    private static Course course = CourseFactory.buildCourse("first", "ADP", "HR");
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/course";

    @Test
    void create() {
        String url = baseURL + "/create";
        ResponseEntity<Course> postResponse = restTemplate.postForEntity(url, course, Course.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        course = postResponse.getBody();
        System.out.println("Course is: " + course);
        assertEquals(course.getCourseName(), postResponse.getBody().getCourseName());
    }

    @Test
    void read(){
        String url = baseURL + "/create";
        ResponseEntity<Course> postResponse = restTemplate.postForEntity(url, course, Course.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        course = postResponse.getBody();
        System.out.println("Course is Saved: " + course);
        assertEquals(course.getCourseName(), postResponse.getBody().getCourseName());

    }



    @Test
    void update() {
        Course update = new Course.Builder().copy(course).setCourseName("Human Resources Management").Build();
        String url = baseURL + "/update";
        System.out.println("URL: " + url);
        System.out.println("Post: " + update);
        ResponseEntity<Course>response = restTemplate.postForEntity(url, update, Course.class);
        assertNotNull(response.getBody());
    }

    @Test
    void delete() {
        String url = baseURL + "/delete/" + course.getCourseName();
        System.out.println("URL: " + url);
        restTemplate.delete(url);
    }

    @Test
    void getAll() {
        String url = baseURL + "/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String>response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("List All: ");
        System.out.println(response);
        System.out.println(response.getBody());
    }
}