public class basic_data_storage {
    public static void main(String[] args){
        double[] Data = new double[3];    // Array of doubles named data containing 3 elements
        Data[0] = 1.5;                    // Index of Array starts from 0,   Once we have created array, that cannot be extended
        Data[1] = 3.34;
        Data[2] = 5;

        double A = Data[0] + Data[1];

        System.out.println(Data[2]);
        System.out.println(A);

        if(Data[0] > Data[2]){
            System.out.println(Data[0] + " is greater than " + Data[2]);
        }
        else{
            System.out.println(Data[0] + " is smaller than " + Data[2]);
        }


        String [] Dataa = new String[2];
        Dataa[0] = "Hello_buddy";
        Dataa[1] = "Kem_palty";

        System.out.println(Dataa[0] + " " + Dataa[1]);

    }
}
