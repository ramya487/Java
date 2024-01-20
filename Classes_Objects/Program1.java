class Person { // class
    String name;// variables / state / data (instance variables)
    int age;

    // methods / behaviour
    void speak() {
    System.out.println("My name is "+name+" and my age is "+age);
    }

    void greet(){
        System.out.println("Hello there!!!");
    }
    
    int calculateYearsToRetire(){
        return 60-age;
    }

    int getAge(){
        return age;
    }

    String getName(){
        return name;
    }
}

public class Program1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Alex";
        person1.age = 45;
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        int years = person1.calculateYearsToRetire();
        System.out.println("Years to retire: "+years);
        // person1.greet();
        // person1.speak();
    }
}
