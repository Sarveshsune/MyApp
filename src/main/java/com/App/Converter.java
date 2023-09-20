package com.App;

public class Converter {
	
	public static double kmToMile(int distance)
	{
		double tomile = distance * 0.621;
		return tomile;
	}
	
	public static int cTof(int temp)
	{
		int tofarhenheit = (temp * 9/5)+32;
		return tofarhenheit;
	}
	
	public static int fToc(int temp)
	{
		int tocelcius = (temp - 32)*5/9;
		return tocelcius;
	}
	
	public static double MileToKm(int distance)
	{
		double tokm = distance * 1.609;
		return tokm;
	}
	

}

