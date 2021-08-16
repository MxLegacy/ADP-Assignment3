package za.ac.cput.Controller;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import za.ac.cput.Entity.NonAcademicStaff;
import za.ac.cput.factory.NonAcademicStaffFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class NonAcademicStaffControllerTest {
    private static NonAcademicStaff nonAcademicStaff = NonAcademicStaffFactory.createNonAcademicStaff("Tatum","Supervisor","Janitorial", "0001");
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost/8080/nonAcademicStaff";

    @Test
    void create() {
        String url = baseURL + "/create";
        ResponseEntity<NonAcademicStaff>postResponse = restTemplate.postForEntity(url, nonAcademicStaff, NonAcademicStaff.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        nonAcademicStaff = postResponse.getBody();
        System.out.println("Saved: " + nonAcademicStaff);
        assertEquals(nonAcademicStaff.getNASname(), postResponse.getBody().getNASname());
    }

    @Test
    void read() {
        String url = baseURL + "/read/" + nonAcademicStaff.getNASname();
        System.out.println("URL: " + url);
        ResponseEntity<NonAcademicStaff>response = restTemplate.getForEntity(url, NonAcademicStaff.class);
        assertEquals(nonAcademicStaff.getNASname(), response.getBody().getNASname());
    }

    @Test
    void update() {
        NonAcademicStaff update = new NonAcademicStaff.NASBuilder().copy(nonAcademicStaff).setNASname("Tatum").build();
        String url = baseURL + "/update";
        System.out.println("URL: " + url);
        System.out.println("Post: " + update);
        ResponseEntity<NonAcademicStaff>response = restTemplate.postForEntity(url, update, NonAcademicStaff.class);
        assertNotNull(response.getBody());
    }

    @Test
    void delete() {
        String url = baseURL + "/delete/" + nonAcademicStaff.getNASname();
        System.out.println("URL: " + url);
        restTemplate.delete(url);
    }

    @Test
    void getAll() {
        String url = baseURL + "/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String>entity = new HttpEntity<>(null, headers);
        ResponseEntity<String>response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("List All: ");
        System.out.println(response);
        System.out.println(response.getBody());
    }
}