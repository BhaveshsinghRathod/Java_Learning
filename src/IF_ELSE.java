import java.util.Scanner;

public class IF_ELSE {
    public static void main(String[] args){

        // Example of if-else statement
        double a = 10;
        double b = 2.5;

        if(b>a){
            System.out.println("b is greater than a");
        }
        else{
            System.out.println("a is greater than b");
        }

        //Example of if-elseif-else statement
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your age?");
        int c = scan.nextInt();

        if(c<18){
            System.out.println("You are under legal age");
        }
        else if(c==18){
            System.out.println("You will be above legal age soon");
        }
        else if(c>18){
            System.out.println("You are well above legal age");
        }
        else{
            System.out.println("No proper input");
        }
    }
}
