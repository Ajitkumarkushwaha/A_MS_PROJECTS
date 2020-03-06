package com.kushwaha.binding;

import lombok.Data;

/**
 * 
 * 
 * @author AJIT KUMAR
 * @version 1.0
 * @since 05-03-2020
 *
 */

@Data
public class CurrencyExchange {
	
	private Integer currencyId;
	private String currencyFrom;
	private String currencyTo;
	private Double currencyCost;

}
