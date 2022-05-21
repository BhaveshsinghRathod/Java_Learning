public class loopss {
    public static void main(String[] args){
        /*
        // For Loop
            -->Can be considered as control flow statement that will iterate a part of a program several times
            --> as if we know the number of possible iterations
            --> example:
            --> for(int i = 0; i < 10; i++){
            system.out.println(i);
            }


        // While loop
            -->Is also a control flow statement that will run a part of a program on the basis of certain Boolean condition
            -->is used when the number of iterations is unknown or not fixed
            -->example:
            --> int i = 0
            while(i<0){
               System.out.println(i);
               i++;
               }

         */


        for (double d = 0; d < 15; d++){    // initial value for d is 0, so the printing will begin from 0, condition is d smaller than 15, so it will print till 15-1 i.e. 14.
            System.out.println(d);
        }

        for (double d = 1; d < 15; d+=0.75){
            System.out.println(d);
        }
    }
}
