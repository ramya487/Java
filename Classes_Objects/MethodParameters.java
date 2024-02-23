class Frog {
    private String name;
    private int age;

    // when the parmeter and the instance variable are same identifier names
    // need to use this which refers to the instance variable
    // this is basically a notation that refers to the current object
    // something like replacing this with the current object name (instance of class)
    
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
public class MethodParameters {
    public static void main(String[] args) {
        Frog young = new Frog();
        System.out.println("Name: "+young.getName());
        System.out.println("Age: "+young.getAge());
    }
}
