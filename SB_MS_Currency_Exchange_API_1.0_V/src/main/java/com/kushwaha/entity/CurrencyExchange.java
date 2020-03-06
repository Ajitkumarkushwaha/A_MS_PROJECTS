package com.kushwaha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 
 * 
 * @author AJIT KUMAR
 * @version 1.1
 * @since 05-03-2020
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CURRENCY_EXCHANGE")
public class CurrencyExchange {

	@Id
	@GeneratedValue
	@Column(name = "CURRENCY_ID")
	private Integer currencyId;
	@Column(name = "CURRENCY_FROM")
	private String currencyFrom;
	@Column(name = "CURRENCY_TO")
	private String currencyTo;
	@Column(name = "CURRENCY_COST")
	private Double currencyCost;

}
