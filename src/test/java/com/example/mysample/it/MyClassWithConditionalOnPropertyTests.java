package com.example.mysample.it;

import com.example.MyApplication;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        classes = MyApplication.class)
public class MyClassWithConditionalOnPropertyTests {

    @Autowired
    private TestRestTemplate template;

    @Test
    void contextLoads() {
        ResponseEntity<String> response = template.getForEntity("/", String.class);
        System.out.println("Running ConditionalOnProperty annotation verification");
        assertThat(response.getBody()).isEqualTo("Hello World! Conditional On Property Used");
    }


}
