package Atividades;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String []args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert a number: ");
        int number = scan.nextInt();
        if (number % 2 == 0){
            System.out.println("the number " + number + " is even");

        }else{
            System.out.println("the number "  +  number   +  " is odd");

        }
    }
}
