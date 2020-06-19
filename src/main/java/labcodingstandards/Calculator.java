// Copyright (C) 2020
package labcodingstandards;

import java.util.Scanner;


/**
 *Taller de Ingenieria de Software 2.
 *@author Grupo #3
 */
public class Calculator {
/**
 * Metodo main para iniciar la ejecucion de cualquier programa Java.
 * @param args parametro tomado de la linea de comandos o una fuente alterna.
 */
public static void main(final String[] args) {
//CHECKSTYLE:ON
Scanner reader = new Scanner(System.in);
        System.out.print("1. +\n2. -\n3. *\n4. /\nEnter an operator: ");
        char operator = reader.nextLine().charAt(0);
        double first;
        double second;
        String input;
        while (true) {
        System.out.print("Enter first number:");
        input = reader.nextLine();
            try {
            first = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }
        while (true) {
        System.out.print("Enter second number: ");
        input = reader.nextLine();
            try {
            second = Integer.parseInt(input);
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
 * Metodo que retorna un valor o un error.
 * @param f valor para calular la suma o resta
 * @param s valor para calular la suma o resta
 * @param o valor para calular la suma o resta
 * @return mensaje con el resultado final
 */
private String operation(final double f, final double s, final char o) {
double result = 0;
switch (o) {
            case '1':
                result = f + s;
                break;
            case '2':
                result = f - s;
                break;
            case '3':
                result = f * s;
                break;
            case '4':
                result = f / s;
                break;
            default:
            return "Error! operator is not correct";
        }
return "The result is: " + result;
}
}
