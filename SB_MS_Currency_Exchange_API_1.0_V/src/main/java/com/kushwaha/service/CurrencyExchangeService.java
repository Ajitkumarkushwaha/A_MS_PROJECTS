package com.kushwaha.service;

import com.kushwaha.entity.CurrencyExchange;

/**
 * 
 * 
 * @author AJIT KUMAR
 * @version 1.1
 * @since 05-03-2020
 *
 */

public interface CurrencyExchangeService {
	
	public CurrencyExchange getByCurrencyFromAndCurrencyTo(String currencyFrom, String currencyTo);

}
