import java.util.Scanner;   // necessary to import this to use Scanner

public class scanner_methods_and_string {
    public static void main(String[] args){
        String hi = "Hello";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String txt = scan.next();   // This line takes String user input.
        System.out.println(hi);
        System.out.println(txt);

    }
}
