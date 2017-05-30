package org.wipro.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"org.wipro.code"})
public class WebCrawlerWiproApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebCrawlerWiproApplication.class, args);
	}
}
