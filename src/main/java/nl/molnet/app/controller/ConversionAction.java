package nl.molnet.app.controller;

import jodd.madvoc.meta.Action;
import jodd.madvoc.meta.InOut;
import jodd.madvoc.meta.MadvocAction;
import jodd.petite.meta.PetiteInject;
import nl.molnet.app.business.TemperatureConvertor;

/**
 * Conversion action.
 */
@MadvocAction
public class ConversionAction {

	@PetiteInject
	TemperatureConvertor temperatureConvertor;
	
	@InOut
	int celsius;

    @InOut
    int fahrenheit;
    
    @Action
    public void convert() {
        System.out.println("getVIEW");
    }
    
    @Action
	public String toCelsius() {
		System.out.println("postAction to celsius");
		celsius = temperatureConvertor.toCelsius(fahrenheit);
		System.out.println("from " + fahrenheit + " Fahrenheit to " + celsius + " Celsius");
		return "ok";
	}

}
