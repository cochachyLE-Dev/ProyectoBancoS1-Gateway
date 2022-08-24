package pe.com.bootcamp.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@ConfigurationProperties
@Data
public class UriConfiguration {
	@Value("${app.uri.httpbin}")
	private String httpbin;	
}