import java.util.*;

public class S08Sort {

    public static void main(String args[]) {
        LinkedList<Person> ll = new LinkedList<Person>();
        ll.add(new Person(23, "Shrawan1"));
        ll.add(new Person(25, "Shrawan2"));
        ll.add(new Person(13, "Shrawan3"));
        ll.add(new Person(81, "Shrawan4"));
        ll.add(new Person(35, "Shrawan5"));

        Collections.sort(ll, new PersonComparator());
        Collections.reverse(ll);
        // Collections.shuffle(ll);

        System.out.println(ll);
    }

}

class Person {
    int age;
    String name;

    Person(int a, String s) {
        age = a;
        name = s;
    }

    public String toString() {
        return Integer.toString(this.age);
    }
}

class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.age - o1.age;
    }
}
