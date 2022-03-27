package academy.mindswap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream {

    static class Person{
        String name;
        int age;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        // 1. Create a stream of Person objects
        // 2. Filter the stream to only include people whose name is longer than 5 characters
        // 3. Print the names of the people
        // 4. Print the number of people in the stream

        List<Person> people = Arrays.asList(new Person("Johnny",24), new Person("Mary",16), new Person("Mike",49), new Person("Bob",72));

        //List<String> filteredPeople = new ArrayList<>();
        Consumer<Person>  consumer = p -> System.out.println(p.name);
      //  people.forEach(consumer);
      //  people.forEach(System.out::println);

        /*String filteredPeople =  people.stream()
                .map(person -> person.getName().toLowerCase())
                .filter(name -> name.length() > 4 || name.equals("bob"))
                .sorted()
                .collect(Collectors.joining(","));
              //.collect(Collectors.joining(", "));

        System.out.println(filteredPeople);*/

        Integer sum = people.stream()
               // .map(person -> person.age)
                .flatMapToInt(person -> IntStream.of(person.age))
              //  .reduce(0, (acc, actual)-> IntStream.of(23, 34, 56, 12, 2, 94)
        //.filter(num -> num % 2 == 0)
                .sum();

      // System.out.println(sum);

        Person[] humans = {
                new Person("Alexandra", 30),
                new Person("John", 12),
                new Person("Charlotte", 22),
                new Person("Edith", 42),
                new Person("Anna", 3)
        };

// FINDING AN ADULT HUMAN WHOSE NAME STARTS WITH A
        Optional<Person> result = Arrays.stream(humans)
                .filter(human -> human.getName().startsWith("A"))
                .filter(human -> human.getAge() > 18)
                .findFirst();

// DEALING WITH AN OPTIONAL OBJECT
        String human = result.isPresent() ? result.get().getName() : "no results";
        System.out.println(human);


    }
}
