package umanasoap.application.repository;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

import umanasoap.application.TestConfiguration;
import umanasoap.application.UmanaSoapApplication;

@DataJpaTest
@ContextConfiguration(classes = {TestConfiguration.class, UmanaSoapApplication.class})
class CandidatesRepositoryTest {
    @Autowired
    private CandidatesRepository candidatesRepository;

    @Test
    void contextLoads() {
        assertNotNull(candidatesRepository);
    }

}
