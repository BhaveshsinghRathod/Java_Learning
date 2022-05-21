public class Car_Color_Finder {
    // Find the color of the car with the help of loop and if-else statements. If a car is of a particular color then return a statement,
    // and if it is of some other color then return other statement. Use If-else statements, Arrays and Loops.
    public static void main(String[] args){
        String [] color = new String[5];
        color[0] = "White";
        color[1] = "Blue";
        color[2] = "Black";
        color[3] = "Red";
        color[4] = "Grey";

        for (int i = 0; i<color.length; i++){
            if(color[i].equals("White")){
                System.out.println("car number " + i + " is White");
            }
            else if(color[i].equals("Blue")){
                System.out.println("Car number " + i +" is Blue");
            }
            else if(color[i].equals("Black")){
                System.out.println("Car number " + i + " is Black");
            }
            else if (color[i].equals("Red")) {
                System.out.println("Car number " + i + " is red");
            }
            else if(color[i].equals("Grey")){
                System.out.println("Car number " + i + " is grey");
            }
        }
    }
}
