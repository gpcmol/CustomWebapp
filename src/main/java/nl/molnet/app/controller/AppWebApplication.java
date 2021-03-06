package nl.molnet.app.controller;

import javax.servlet.ServletContext;

import jodd.madvoc.component.MadvocConfig;
import jodd.madvoc.petite.PetiteWebApplication;
import jodd.petite.PetiteContainer;
import jodd.petite.config.AutomagicPetiteConfigurator;

/**
 * Web application.
 */
public class AppWebApplication extends PetiteWebApplication {

	protected PetiteContainer petite;
	
	public AppWebApplication () {
		initPetite();
	}

	void initPetite() {
		System.out.println("Init petite");
		petite = new PetiteContainer();
		AutomagicPetiteConfigurator  automagicPetiteConfigurator = new AutomagicPetiteConfigurator();
		automagicPetiteConfigurator.setIncludedEntries(this.getClass().getPackage().getName() + ".*");
		automagicPetiteConfigurator.configure(petite);
	}

	/**
	 * Returns application container (Petite).
	 */
	public PetiteContainer getPetite() {
		return petite;
	}

	@Override
	protected PetiteContainer providePetiteContainer() {
		return super.providePetiteContainer();
	}

	@Override
	protected void init(MadvocConfig madvocConfig, ServletContext servletContext) {
		madvocConfig.setResultPathPrefix("/WEB-INF/jsp");
		super.init(madvocConfig, servletContext);
	}

}