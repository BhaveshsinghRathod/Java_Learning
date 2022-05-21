import java.util.Scanner;
public class Scanner_method_numbersandboolean {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word");
        String txt = scan.next();  // We can also give a number as input, but the only problem that we will face is, while performing any operation the number will be operated as a string.
        System.out.println(txt);
        System.out.println("Enter a number");
        double txt2 = scan.nextDouble();
        System.out.println(txt2);
        System.out.println("Enter a boolean i.e. True or False");
        boolean txt3 = scan.nextBoolean();
        System.out.println(txt3);
    }
}
