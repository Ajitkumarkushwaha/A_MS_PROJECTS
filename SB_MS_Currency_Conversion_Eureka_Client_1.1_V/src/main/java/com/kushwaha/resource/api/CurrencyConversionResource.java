package com.kushwaha.resource.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kushwaha.constatnt.AppConstatnt;
import com.kushwaha.service.CurrencyConversionService;

/**
 * 
 * 
 * @author AJIT KUMAR
 * @version 1.0
 * @since 05-03-2020
 *
 */

@RestController
public class CurrencyConversionResource {

	private static final Logger logger = LoggerFactory.getLogger(CurrencyConversionResource.class);

	
	@Autowired
	private CurrencyConversionService currencyConversionService;
	
	@GetMapping(value = "/getCurrencyConversionValue/{currencyFrom}/{currencyTo}/{quantity}", produces = {"application/json"})
	public ResponseEntity<String> getCurrencyConversionValue(@PathVariable String currencyFrom, @PathVariable String currencyTo, @PathVariable Double quantity) {
		logger.debug(AppConstatnt.METHOD_EX_STARTED_STR);
		Double currencyConversionValue = currencyConversionService.getCurrencyInfo(currencyFrom, currencyTo, quantity);
		String resp = "Currency Conversion In Ruppes Is -: "+currencyConversionValue;
		logger.debug(AppConstatnt.METHOD_EX_ENDED_STR);
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}
}
