package com.tcs.docker_k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DockerK8sApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerK8sApplication.class, args);
	}
	
	@GetMapping("/healthcheck")
	public String health() {
		return "<h1>Hi There!! Heath check is OK</h1>";
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		return "<h1>Welcome to our Website!!! </h1>";
	}

}
