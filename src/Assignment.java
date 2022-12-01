import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        int num;
        System.out.println("Enter your grade: ");
        num = grade.nextInt();
        if(num>=90 && num <=100){
            System.out.println("A");
        } else if(num>=80 && num <=89){
            System.out.println("B");
        } else if (num>=70 && num <=79){
            System.out.println("C");
        }else if (num>=60 && num <=69) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }

        // ******** # 4 *********//
//        int x = 15;
//        if(x<10 || x >20){
//            System.out.println("Out of range");
//        } else if(x>=10 || x<=20 )
//            System.out.println("In range");

        //*********from 1 to 3 ******//
//        int x =7;
//        if(x<10){
//            System.out.println("Less than 10");
//        } else if(x>10){
//            System.out.println("Greater than 10");
//        } else if (x>=10 && x<=20){
//            System.out.println("Between 10 and 20");
//        }else if (x>=20) {
//            System.out.println("Greater than 20");
//        }
    }
}
