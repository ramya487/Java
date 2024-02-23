class Machine {
    private String name; // can access only within the class
    public final static int code = 56; // can access anywhere but cannout be reassigned
    // using final keyword it is must to assign the variable when creatiion

    public static int count = 0;
    public int id;

    Machine(){
        id = count;
        System.out.println("ID: "+id);
        count++;
    }

    // public void setName(String name){
    //     this.name = name;
    // }

    // public String getName(){
    //     return this.name;
    // }

    // public void setCode(int code){
    //     Machine.code = code;
    // }

    // public int getCode(){
    //     return Machine.code;
    // }

    // private static void displayCode(){
    //     System.out.println("Code: "+code);
    //     // static methods cannot access non static data (name in this case)
    //     // since static members are created at the time of class creation
    //     // but whereas instance members are created at the time of object creation
    // }

    // public static void accessPrivateStaticMethod(){
    //     Machine.displayCode();
    // }

}
public class StaticFinalKeyword {
    public static void main(String[] args) {
        System.out.println(Machine.count);
        Machine obj1 = new Machine();
        Machine obj2 = new Machine();
        Machine obj3 = new Machine();
        Machine obj4 = new Machine();
        System.out.println(Machine.count);
    }
}
