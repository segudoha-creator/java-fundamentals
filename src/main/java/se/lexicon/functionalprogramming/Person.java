package se.lexicon.functionalprogramming;

public class Person {

    private String name;
    private int age;
    private String city;
    private boolean active;


// Constructor

    public Person(String name, int age, String city, boolean active) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.active = active;

        // Gitter

    }
    public String getName() {
         return name;

    }
    public int getAge() {
        return age;

    }
    public String getCity() {
        return city;

    }
    public boolean isActive(){
        return active;

    }

    // Setter

    public void setName(String name) {
         this.name = name;
    }
    public void setAge(int age) {
        this.age = age;

    }
    public void setCity(String city) {
        this.city = city;

    }
    public void setActive(boolean active) {
        this.active = active;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", active=" + active +
                '}';
    }
}
