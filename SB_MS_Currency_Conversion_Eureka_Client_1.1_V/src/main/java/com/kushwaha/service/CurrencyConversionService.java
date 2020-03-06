package com.kushwaha.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kushwaha.binding.CurrencyExchange;
import com.kushwaha.constatnt.AppConstatnt;
import com.kushwaha.feign.client.CurrencyExchangeFeignClient;

/**
 * 
 * 
 * @author AJIT KUMAR
 * @version 1.0
 * @since 05-03-2020
 *
 */

@Service
public class CurrencyConversionService {

	private static final Logger logger = LoggerFactory.getLogger(CurrencyConversionService.class);

	@Autowired
	private CurrencyExchangeFeignClient currencyExchangeFeignClient;
	public Double getCurrencyInfo(String currencyFrom, String currencyTo, Double quantity) {
		logger.debug(AppConstatnt.METHOD_EX_STARTED_STR);
		CurrencyExchange currencyConversion = currencyExchangeFeignClient.invokeCurrencyExchangeApi(currencyFrom, currencyTo);
		Double currencyConversionValue = currencyConversion.getCurrencyCost() * quantity;
		logger.debug(AppConstatnt.METHOD_EX_ENDED_STR);
		return currencyConversionValue;

	}

}
