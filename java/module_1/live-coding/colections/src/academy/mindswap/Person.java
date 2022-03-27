package academy.mindswap;

public class Person implements Comparable<Person> {

    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person o) {
        int result = Integer.compare(age,o.getAge());
        if(result == 0) {
            result = name.compareTo(o.getName());
        }
        return result;

    }
}
