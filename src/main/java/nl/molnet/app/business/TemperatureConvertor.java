package nl.molnet.app.business;

import jodd.petite.meta.PetiteBean;

@PetiteBean
public class TemperatureConvertor {

    /**
     * Converts celsius to fahrenheit
     * @param celsius
     * @return fahrenheit
     */
	public int toFahrenheit(int celsius) {
		return celsius * 9 / 5 + 32;
	}
	
	/**
	 * Converts fahrenheit to celcius
	 * @param fahrenheit
	 * @return celsius
	 */
	public int toCelsius(int fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}

}
