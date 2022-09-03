package pe.com.bootcamp.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app.uri")
@org.springframework.context.annotation.Configuration
public class UriConfiguration {
	//@Value("${app.uri.httpbin}")
	private String httpbin;

	public String getHttpbin() {
		return httpbin;
	}

	public void setHttpbin(String httpbin) {
		this.httpbin = httpbin;
	}		
}