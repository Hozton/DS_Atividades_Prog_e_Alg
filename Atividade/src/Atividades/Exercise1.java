package Atividades;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert your school grade: ");
        byte grade = scan.nextByte();
        if (grade <= 6){

            System.out.println("You have failed the subject. Focus more on the studies! Minimum grade to pass: 7");

        }else{

            System.out.println("Congratulations! You have passed the subject!");

    }

 }

}