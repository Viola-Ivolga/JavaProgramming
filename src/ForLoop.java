import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
                int sum = 0;

                for(int i = 0;i<=10; i++)

                {
                    sum += i;

                }
                System.out.println("Sum: " + sum);

            }
        }


// Write a program that prompts the user to input a positive integer.
// It should then print the multiplication table of that number.



//public class WhileLoop {
//    public static void main(String[] args){
//        Scanner number = new Scanner(System.in);
//        int num;
//        System.out.println("Enter a positive number: ");
//        num = number.nextInt();
//
//        System.out.println("Multiplication table of " + num);
//
//        for(int i = 1; i<=10;i++){
//            System.out.println(num + "x" + i + "=" + (num*i));
//        }
//    }
//}
