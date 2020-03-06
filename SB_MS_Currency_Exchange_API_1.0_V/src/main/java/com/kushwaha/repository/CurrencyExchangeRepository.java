package com.kushwaha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kushwaha.entity.CurrencyExchange;

/**
 * 
 * 
 * @author AJIT KUMAR
 * @version 1.0
 * @since 05-03-2020
 *
 */

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Integer> {
	
	//@Query(value = "SELECT CE FROM CurrencyExchange CE where CE.currencyFrom=:currencyFrom AND CE.currencyTo=:currencyTo")
	public CurrencyExchange findByCurrencyFromAndCurrencyTo(String currencyFrom, String currencyTo);

}
