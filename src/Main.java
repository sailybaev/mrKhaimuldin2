import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Azat" , "Bolatbekov" , "COder" , -9000);
        Employee e2 = new Employee("Alikhan" , "Sailybaev" , "CEO" , 10000000);
        Student s1 = new Student("Rabat" , "Karabek" , 4.0);
        Student s2 = new Student("Zhaman" , "Oqidy" , 2.0);


        ArrayList<Person> arr = new ArrayList<>();
        arr.add(e1);
        arr.add(e2);
        arr.add(s1);
        arr.add(s2);

        Collections.sort(arr);
        System.out.println(arr.get(0));
        printData(arr);


    }



}