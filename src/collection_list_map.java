import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class collection_list_map {
    /*
    // Collection
        --> Can be seen as a framework in java.
        --> Provides architecture to store and manipulate group of objects.

     // List
        --> Provides the maintenance of ordered collection.
        --> Contains different index methods to update, delete, insert and search for different elements.
        --> The most common classes of lists used are ArrayList and LinkedList.

     // Map
        --> Contains different values on the basis of key.
        --> can be useful if searchs updates or deleting element on the basis of a key.
     */

    public static void main(String[] args){

        // Lists
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Chikoo");
        fruits.set(2, "WaterMelon");  // This replaces the value at 2 with Watermelon.
        fruits.remove(1);  // This will remove the value at 1.
        System.out.println(fruits.size());  // This will print the size of the list.
        System.out.println(fruits);  // This will print all the elements in the list.
        System.out.println(fruits.get(1));  // This will print the element at 1.


        // Maps
        Map cars = new HashMap();
        cars.put(1, "Verna");
        cars.put('a', "Elantra");
        cars.put(4, "Audi");
        cars.put('b', "Honda");

        System.out.println(cars);
        System.out.println(cars.size());  // This will print the size of the map.
        System.out.println(cars.get('b'));  // This will give the element at index 'b'.
        cars.remove('b');  // This will remove the element from the map.
        System.out.println(cars);
        System.out.println(cars.size());

    }
}
