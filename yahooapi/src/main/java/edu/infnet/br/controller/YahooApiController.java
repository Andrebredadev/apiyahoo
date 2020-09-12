package edu.infnet.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import edu.infnet.br.service.YahooApiService;


@RestController
@RequestMapping("/api")
public class YahooApiController {
	
	public static String StringtoJson(String string) {
		return new Gson().fromJson(string, JsonObject.class).toString();
	}
	
	
	@Autowired
	private YahooApiService yahooApiService;
	
	@RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)	
	public ResponseEntity<?> params(@RequestParam(value = "filters", defaultValue = "TLS.AX,MUS.AX") String filters){		

		String params = yahooApiService.params(filters);
		
		System.out.println(YahooApiController.StringtoJson(params));
		
		return ResponseEntity.ok().body(YahooApiController.StringtoJson(params));
	}
	

}
