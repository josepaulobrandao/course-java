package util;

public class CurrentConverter {
	public static final double IOF = 0.06;
	
	public static double ConverterMoeda(double precoDolar, double quantosDolares) {
		double result = precoDolar * quantosDolares;
		result += result * IOF;
		return result;
	}
}