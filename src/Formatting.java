import java.util.Calendar;
import java.util.Locale;


public class Formatting {
    public static void main(String[] args) {
        long n = 461012;
        // printf() = 	an optional method to control, format, and display text to the console window
        //				two arguments = format string + (object/variable/value)
        //				% [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character]
        System.out.printf("%b",myBoolean);
        System.out.printf("%c",myChar);
        System.out.printf("%s",myString);
        System.out.printf("%d",myInt);
        System.out.printf("%f",myDouble);

        //[width]
        // minimum number of characters to be written as output
        System.out.printf("Hello %10s",myString);

        //[precision]
        // sets number of digits of precision when outputting floating-point values
        System.out.printf("You have this much money %.1f",myDouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        //System.out.printf("You have this much money %,f",myDouble);

        System.out.format("%d %n", n);      //  -->  "461012"
        System.out.format("%08d%n", n);    //  -->  "00461012"
        System.out.format("%+8d%n", n);    //  -->  " +461012"
        System.out.format("%,8d%n", n);    // -->  " 461,012"
        System.out.format("%+,8d%n%n", n); //  -->  "+461,012"

        double pi = Math.PI;

        System.out.format("%f %n", pi);       // -->  "3.141593"
        System.out.format("%.3f%n", pi);     // -->  "3.142"
        System.out.format("%10.3f%n", pi);   // -->  "     3.142"
        System.out.format("%-10.3f%n", pi);  // -->  "3.142"


                Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", c, c, c); // -->
        System.out.format("%tl:%tM %tp%n", c, c, c);  // -->
        System.out.format("%tD%n", c);    // -->

        System.out.println("------------------------");
        String data = "Hello World!";
        System.out.printf("Printing a string: %s\n", data);
        System.out.printf("Printing a string in uppercase: %S\n", data);
        int x = 100;
        System.out.printf("Printing a decimal integer: %d\n", x);
        int hours = 100;
        double days = 100/24.0; // used 24.0 to avoid integer division
        System.out.print("days: ");
        System.out.printf("%.3f",days);
        // -------- Specifying Width --------
        System.out.printf("%-10.2f%n", 18.0); // left aligned: -
        System.out.printf("%10.2f%n", 20.0); // right aligned
        System.out.printf("%10.3f", 10.2); // no text
        System.out.printf("%n"); // only %n
        System.out.printf("%10.2f%5d%n", 15.7,3); // no text and %n
        System.out.printf("%10.2f%d%n", 15.7,3); // no space before 3
        System.out.printf("%10.2f", 15.7);
        System.out.printf("%n%10.2f%n%5d%n", 11.3,8);
        // --- mix different data types --------------
        System.out.printf("%s is %d years old","Jane", 23);
    }
    }



