public class comparing {
    public static void main(String[] args){



        // Comparing Operators
        double a = 1.6;
        double b = 2.34;
        double c = 3;
        double d = 5;

        String hi = "hello";
        String hey = "hello";

        boolean try1 = a==b;
        //boolean try2 = a==hi;
        boolean try3 = hi==hey;
        boolean try4 = c>d;

        System.out.println(try1);  // The ans will be "false" as the two doubles are not same.
        //System.out.println(try2);  // This will give error as te two data types are different
        System.out.println(try3);
        System.out.println(try4);
        System.out.println(!try4);


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////


        //Logical Operators
        boolean try5 = a==b || c<d;
        boolean try6 = a<=b && c==d;
        boolean try7 = a>=d && c<=d || a>=d;

        System.out.println(try5);
        System.out.println(try6);
        System.out.println(try7);

    }
}
