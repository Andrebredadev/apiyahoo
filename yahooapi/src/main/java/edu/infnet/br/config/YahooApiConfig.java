package edu.infnet.br.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class YahooApiConfig {
	
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
