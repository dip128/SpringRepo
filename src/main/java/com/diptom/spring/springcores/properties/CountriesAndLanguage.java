package com.diptom.spring.springcores.properties;

import java.util.Properties;

public class CountriesAndLanguage {
	private Properties countryandlang;

	public Properties getCountryandlang() {
		return countryandlang;
	}

	public void setCountryandlang(Properties countryandlang) {
		this.countryandlang = countryandlang;
	}

	@Override
	public String toString() {
		return String.format("CountriesAndLanguage [countryandlang=%s]", countryandlang);
	}
	
}
