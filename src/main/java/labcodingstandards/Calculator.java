// Copyright (C) 2020
package labcodingstandards;

import java.util.Scanner;


/**
 * Taller de Ingenier�a de Software 2 
 * @author Grupo #3
 * 
 */
public class Calculator {
/**
 * M�todo main para iniciar la ejecuci�n de cualquier programa Java.
 * @param args par�metro tomado de la linea de comandos o una fuente alterna.
 */
	public static void main(String[] args) {
		//CHECKSTYLE:ON
		Scanner reader = new Scanner(System.in);
		
        System.out.print("1. +\n2. -\n3. *\n4. /\nEnter an operator: ");
        
        char operator = reader.nextLine().charAt(0);
        double first;
        double second;
        String input;
        
        while (true) {
        	System.out.print("Enter first number: ");
        	input = reader.nextLine();
        	
            try {
            	first=Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }
        
        while (true) {
        	System.out.print("Enter second number: ");
        	input = reader.nextLine();
        	
            try {
            	second=Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }

        Calculator cal = new Calculator();
        String result = cal.operation(first, second, operator);

        System.out.printf(result);
		reader.close();
	}
	
/**
 * M�todo que devuelve un valor o un error en caso de que el operador sea incorrecto
 * @param first valor para calular la suma o resta
 * @param second valor para calular la suma o resta 
 * @param operator valor para calular la suma o resta
 * @return mensaje con el resultado final
 */
	private String operation(double first, double second, char operator) {
		double result = 0;
		switch(operator)
        {
            case '1':
                result=first+second;
                break;
            case '2':
                result=first-second;
                break;
            case '3':
                result=first*second;
                break;
            case '4':
                result =first/second;
                break;
            default:
            	return "Error! operator is not correct";
        }
		return "The result is: "+result;
	}
}
