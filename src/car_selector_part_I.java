import java.sql.SQLOutput;
import java.util.Scanner;

public class car_selector_part_I {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        // We will make a simple car selector
        System.out.println("Heyy there, am lappy, am here show you a car.");
        System.out.println("Do you want a car?");
        System.out.println("Y or N");
        String want_car = scan.next();

        if(want_car.equals("Y") || want_car.equals("y")){
            System.out.println("Which color car do you want?");
            System.out.println("We have cars in White, Black, Red and Grey color");
            System.out.println("W for White");
            System.out.println("B for Black");
            System.out.println("R for Red");
            System.out.println("G for grey");
            String color = scan.next();

            if (color.equals("W") || color.equals("w")){
                System.out.println("We have 2 models in White color");
            }
            else if (color.equals("B") || color.equals("b")){
                System.out.println("We have only 1 model in Black");
            }
            else if (color.equals("R") || color.equals("r")){
                System.out.println("Right now we don't have red color in stock. Would you like us to order it?");
                System.out.println("Y or N");
                String stock1 = scan.next();

                if(stock1.equals("Y") || stock1.equals("y")){
                    System.out.println("Sure, it would be in stock soon.");
                }
                else{
                    System.out.println("No Problem Thank you");
                }
            }
            else if (color.equals("G") || color.equals("g")){
                System.out.println("We have 3 models in Grey");
            }
            else{
                System.out.println("Not selected anything");
            }
        }
        else{
            System.out.println("Thanks");
            System.out.println("Have a nice day");
        }
    }
}
