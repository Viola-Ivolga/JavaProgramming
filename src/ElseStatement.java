

// ************* exercise # 3 statements & comparisons ************* //

public class ElseStatement{
    public static void main(String[] args) {

        System.out.println(max(3,4,5));

    }
    public static int max(int num1, int num2, int num3){

        if(num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2>=num1 && num2 >= num3){
            return num2;
        }else {
            return num3;
        }

    }
}


// ************* exercise # 2 ************* //

//public class ElseStatement{
//    public static void main(String[] args) {
//        boolean isMale = false;
//        boolean isTall = false;
//
//        if(isMale && isTall){
//            System.out.println("You are a tall male");
//        } else if(isMale && !isTall) {
//            System.out.println("you are short male");
//        } else if(!isMale && isTall) {
//            System.out.println("You are not a male, but are tall");
//        } else {
//            System.out.println("you are not male and not tall");
//
//        }
//    }
//}





// ************* exercise # 1 ************* //

//public class ElseStatement{
//    public static void main(String[] args) {
//        boolean isMale = true;
//        boolean isTall = true;
//
//        if(isMale && isTall) {
//            System.out.println("You are tall male");
//        } else {
//            System.out.println("You are not male or not tall");
//        }
//    }
//}
