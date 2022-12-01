
//Write a program that lets the user enter decimal dollars and cent and outputs the monetary equivalent in single dollars, quarters, dimes, nickels, and pennies.
//
//        For example:
//        Input:  		3.87
//        Output:	3 dollars
//        3 quarters
//        1 dime
//        0 nickels
//        2 pennies


import java.util.Scanner;
public class PracticeFormatting {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        float myNumber;
        System.out.println("Enter amount of dollars: ");
        myNumber = num.nextInt();

        System.out.printf("");

    }
}

//public class PracticeFormatting {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("-------------------------------");
//        for(int i = 0;i<3; i++){
//            String sl = sc.next();
//            int x = sc.nextInt();
//            System.out.printf("%-14s %03d %n" , sl,x);
//        }
//        System.out.println("--------------------------------");
//    }
//}
