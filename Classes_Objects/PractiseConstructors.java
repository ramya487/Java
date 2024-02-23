class Machine {
    String name;
    int code;

    Machine(){
        this(564);
        System.out.println(this.name);
        System.out.println(this.code);
    }
    Machine (int code){
        this("Helen");
        this.code = code;
    }
    Machine (String name){
        this.name = name;
    }
}
public class PractiseConstructors {
    public static void main(String[] args) {
        Machine object1 = new Machine();
    }
}
