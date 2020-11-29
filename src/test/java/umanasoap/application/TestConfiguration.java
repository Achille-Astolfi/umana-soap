package umanasoap.application;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class TestConfiguration {
	@Bean(name="umana-xsd")
	XsdSchema umanaBean() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/umana-xsd.xsd"));
	}
}