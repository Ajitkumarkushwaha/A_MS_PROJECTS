package com.kushwaha.ms.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kushwaha.constatnt.AppConstatnt;
import com.kushwaha.entity.CurrencyExchange;
import com.kushwaha.service.CurrencyExchangeService;

/**
 * 
 * 
 * @author AJIT KUMAR
 * @version 1.1
 * @since 05-03-2020
 *
 */

@RestController
public class CurrencyExchangeResource {

	private static final Logger logger = LoggerFactory.getLogger(CurrencyExchangeResource.class);

	@Autowired
	private CurrencyExchangeService currencyExchangeService;
	
	@GetMapping(value = "/getCurrencyCost/{currencyFrom}/{currencyTo}", produces = {"application/json"})
	public ResponseEntity<CurrencyExchange> reteriveCurrencyCost(@PathVariable String currencyFrom, @PathVariable String currencyTo) {
		logger.debug(AppConstatnt.METHOD_EX_STARTED_STR);
		CurrencyExchange currencyExchange = currencyExchangeService.getByCurrencyFromAndCurrencyTo(currencyFrom, currencyTo);
		logger.debug(AppConstatnt.METHOD_EX_ENDED_STR);
		return new ResponseEntity<CurrencyExchange>(currencyExchange, HttpStatus.OK);
	}
}
