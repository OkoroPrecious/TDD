package tdd;

//                                               PseudoCode:
//  prompt user to input a score number;
//  store the score number;
//  if the number is greater and equal to 55, output pass;
//  if the number is less than 55, output fail.


import java.util.Scanner;

public class PassFailApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input a score number: ");
        double scoreNumber = input.nextDouble();
        if(scoreNumber >= 55){
            System.out.print("pass");
        }
        if (scoreNumber < 55){
            System.out.print("fail");
        }



    }
}
