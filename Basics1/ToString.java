public class ToString {
    String classVar;

    public ToString(String var){
        classVar = var;
    }

    // public String toString(){
    //     return classVar;
    // }
    // uncomment the above method to see the String value being returned
    
    public static void main(String[] args){
        ToString obj = new ToString("A new String");
        System.out.println(obj);
    }
}
