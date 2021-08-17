package za.ac.cput.Controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import za.ac.cput.Entity.AcademicStaff;

import za.ac.cput.factory.AcademicStaffFactory;


import static org.junit.jupiter.api.Assertions.*;

class AcademicStaffControllerTest {
    private static AcademicStaff academicStaff = AcademicStaffFactory.ASBuilder("Joshua Simmons","Professor", "Engineering", "Information Technology");
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost/8080/AcademicStaff";


    @Test
    void create() {
        String url = baseURL + "/create";
        ResponseEntity<AcademicStaff> postResponse = restTemplate.postForEntity(url, academicStaff, AcademicStaff.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        academicStaff = postResponse.getBody();
        System.out.println("Saved: " + academicStaff);
        assertEquals(academicStaff.getASname(), postResponse.getBody().getASname());
    }

    @Test
    void read() {
        String url = baseURL + "/read/" + academicStaff.getASname();
        System.out.println("URL: " + url);
        ResponseEntity<AcademicStaff>response = restTemplate.getForEntity(url, AcademicStaff.class);
        assertEquals(academicStaff.getASname(), response.getBody().getASname());
    }

    @Test
    void update() {
        AcademicStaff update = new AcademicStaff.ASBuilder().copy(academicStaff).setASname("Joshua").build();
        String url = baseURL + "/update";
        System.out.println("URL: " + url);
        System.out.println("Post: " + update);
        ResponseEntity<AcademicStaff>response = restTemplate.postForEntity(url, update, AcademicStaff.class);
        assertNotNull(response.getBody());
    }

    @Test
    void delete() {
        String url = baseURL + "/delete/" + academicStaff.getASname();
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