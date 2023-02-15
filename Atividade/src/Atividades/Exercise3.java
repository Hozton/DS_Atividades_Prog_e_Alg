package Atividades;

import java.util.Scanner;

public class Exercise3 {

    public static void main (String []args){

        Scanner scan = new Scanner (System.in);
        System.out.println("Insert a number: ");
        int number1 = scan.nextInt();
        System.out.println("Insert another number: ");
        int number2 = scan.nextInt();
        if (number1 > number2) {

            System.out.println(number1 + " is bigger than " + number2);

        }else{

            System.out.println(number1 + " is smaller than " + number2);

        }
    }
}
