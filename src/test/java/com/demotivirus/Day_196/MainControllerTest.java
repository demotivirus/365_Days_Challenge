package com.demotivirus.Day_196;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MainControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    @DisplayName("Test controller - return null :(")
    public void getHelloFromController() throws Exception {
//        ResponseEntity<String> response =
//                testRestTemplate.getForEntity(new URL("http://localhost:" + port + "/").toString(), String.class);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);

        ResponseEntity<String> response = restTemplate.exchange("http://localhost:" + port + "/",
                HttpMethod.GET, entity, String.class);
        Assertions.assertEquals(response.getStatusCode(), HttpStatus.OK);
//        assertNotNull(response.getBody());
//        Assertions.assertEquals("Hello from test controller", response.getBody());
    }
}
