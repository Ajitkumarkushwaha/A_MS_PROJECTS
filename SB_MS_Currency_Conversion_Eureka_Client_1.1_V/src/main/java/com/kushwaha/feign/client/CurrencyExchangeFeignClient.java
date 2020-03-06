package com.kushwaha.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kushwaha.binding.CurrencyExchange;

/**
 * 
 * 
 * @author AJIT KUMAR
 * @version 1.0
 * @since 05-03-2020
 *
 */

@FeignClient(name = "CURRENCY-EXCHANGE-API")
public interface CurrencyExchangeFeignClient {
	
	@GetMapping(value = "/getCurrencyCost/{currencyFrom}/{currencyTo}")
	public CurrencyExchange invokeCurrencyExchangeApi(@PathVariable String currencyFrom, @PathVariable String  currencyTo);

}
