package LearnCollections;

import java.util.*;

public class ListIterators {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();

        cars.add("Virtus");
        cars.add("Slavia");
        cars.add("Verna");

        List<String> vehicles = new ArrayList<>();
        vehicles = cars.subList(1,2);
        vehicles.add("Limo");
        System.out.println(vehicles);
        // loop over
        //1
        for(int i=0; i< cars.size(); i++){
            System.out.println(cars.get(i));
        }
        //2
        for(String car : cars){
            System.out.println(car);
        }
        //3
        Iterator<String> it = cars.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
