package edu.infnet.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class YahooApiService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String params(String filters) {
		
		return restTemplate.getForObject("https://query1.finance.yahoo.com/v7/finance/quote?symbols=TLS.AX,MUS.AX ", String.class, filters);
		
	}

}
