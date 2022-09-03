package pe.com.bootcamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Bean;

import pe.com.bootcamp.configurations.UriConfiguration;

@SpringBootApplication
@RefreshScope
public class GatewayApplication {

	@Autowired
	UriConfiguration configuration;
	
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
	
//	@Bean
//	RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//		return builder.routes()
//			.route("path_route", r -> r.path("/get")
//				.uri(configuration.getHttpbin()))
//			.route("host_route", r -> r.host("*.myhost.org")
//				.uri(configuration.getHttpbin()))
//			.route("rewrite_route", r -> r.host("*.rewrite.org")
//				.filters(f -> f.rewritePath("/foo/(?<segment>.*)", "/${segment}"))
//				.uri(configuration.getHttpbin()))
//			.build();
//	}
}
