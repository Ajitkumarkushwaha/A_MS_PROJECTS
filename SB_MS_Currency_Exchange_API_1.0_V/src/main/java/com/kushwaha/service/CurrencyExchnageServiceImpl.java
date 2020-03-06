package com.kushwaha.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kushwaha.constatnt.AppConstatnt;
import com.kushwaha.entity.CurrencyExchange;
import com.kushwaha.repository.CurrencyExchangeRepository;

/**
 * 
 * 
 * @author AJIT KUMAR
 * @version 1.1
 * @since 05-03-2020
 *
 */

@Service
public class CurrencyExchnageServiceImpl implements CurrencyExchangeService {

	private static final Logger logger = LoggerFactory.getLogger(CurrencyExchnageServiceImpl.class);

	@Autowired
	private CurrencyExchangeRepository currencyExchangeRepository;

	@Override
	public CurrencyExchange getByCurrencyFromAndCurrencyTo(String currencyFrom, String currencyTo) {
		logger.debug(AppConstatnt.METHOD_EX_STARTED_STR);
		CurrencyExchange currencyExchange = currencyExchangeRepository.findByCurrencyFromAndCurrencyTo(currencyFrom,
				currencyTo);
		logger.debug(AppConstatnt.METHOD_EX_ENDED_STR);
		return currencyExchange;
	}

}
