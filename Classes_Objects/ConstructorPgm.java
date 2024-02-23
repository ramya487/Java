class Machine {
    String name;
    int code;

    public Machine(){
        this(8);
        System.out.println("First constructor running");
        System.out.println("Name: "+this.name);
        System.out.println("Code: "+code);
    }

    public Machine(String name){
        System.out.println("Second constructor running");
        this.name = name;
    }

    public Machine(int code){
        this("Json");
        System.out.println("Third constructor running");
        this.code = code;
    }

    public String getName(){
        return name;
    }

    public int getCode(){
        return code;
    }
}
public class ConstructorPgm {
    public static void main(String[] args) {
        new Machine();
    }
}
