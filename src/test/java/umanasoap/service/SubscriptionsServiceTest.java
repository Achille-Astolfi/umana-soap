package umanasoap.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import umanasoap.application.UmanaSoapApplication;

@SpringBootTest(classes = UmanaSoapApplication.class)
class SubscriptionsServiceTest {
    @Autowired
    private SubscriptionsService subscriptionsService;

    @Test
    void contextLoads() {
        assertNotNull(subscriptionsService);
    }

}