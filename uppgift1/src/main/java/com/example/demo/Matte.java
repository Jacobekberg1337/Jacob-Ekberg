package com.example.demo;

public class Matte {

	public static String calcutale(String numbers[], String expression) {
		double number, result = 0;
		
		
		for(int i = 0; i < numbers.length; i++) {
			try{
				number = Double.parseDouble(numbers[i]);
			} catch(NumberFormatException e) {
				if (expression == "add" || expression == "sub") {
					number = 0;
				} else {
					number = 1;
				}
			}
			
			if(i == 0) {
				result = number;
			} else {
				switch(expression){
					case "add" :
						result += number;
						break;
					case "sub" :
						result -= number;
						break;
					case "multi" :
						result *= number;
						break;
					case "div" :
						result /= number;
				}
			}
		}
		
		return "<h1>" + result + "</h1>";
	}
	
}
