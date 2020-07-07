package util;

public class CurrencyConverter {
	
	public static double converterDolar(double dolarValue, double dolarQuantity) {
		double reaisValue = (dolarValue * dolarQuantity);
		
		return reaisValue * 0.06 + reaisValue;
	}

}
