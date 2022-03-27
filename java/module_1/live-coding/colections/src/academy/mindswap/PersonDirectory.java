package academy.mindswap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PersonDirectory {
    public static void main(String[] args) {


        Person p2 = new Person(21,"Mary");
        Person p3 = new Person(22,"Peter");
        Person p4 = new Person(22,"Paul");
        Person p1 = new Person(21,"John");
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
        public int compare(Person o1, Person o2) {

            int result = Integer.compare(o2.getAge(),o1.getAge());
            if(result == 0) {
                result = o2.getName().compareTo(o1.getName());
            }

            return result;
        }} ;

        Queue<Person> priorityQueue = new PriorityQueue<> (comparator /*new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                int result = Integer.compare(o1.getAge(),o2.getAge());
                if(result == 0) {
                    result = o1.getName().compareTo(o2.getName());
                }

                return result;
            }
        }*/);

        priorityQueue.add(p1);
        priorityQueue.add(p2);
        priorityQueue.add(p3);
        priorityQueue.add(p4);

        while(!priorityQueue.isEmpty()){
            Person person = priorityQueue.poll();
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
