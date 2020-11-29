package umanasoap.application;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.XsdSchema;

@SpringBootApplication
public class UmanaSoapApplication {
	@Bean
	public DefaultWsdl11Definition umana(@Qualifier("umana-xsd") XsdSchema umana) {
		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
		wsdl11Definition.setPortTypeName("UmanaPort");
		wsdl11Definition.setTargetNamespace("http://umanasoap/webservice");
		wsdl11Definition.setSchema(umana);
		return wsdl11Definition;
	}

	public static void main(String[] args) {
		SpringApplication.run(UmanaSoapApplication.class, args);
	}

}
