package unidad10.ejemplos.loggers;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Programa {

	static Logger logger = Logger.getLogger(Programa.class);
	
	public static void main(String[] args) {

		System.out.println("Esto es un mensaje de depuración");
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("Mensaje debug");
		logger.info("Este es un mensaje de infromación");
		logger.warn("Este es un mensaje de warning");
		logger.error("Este es un mensaje de error");
		logger.fatal("Este es un mensaje fatal");

	}

}
