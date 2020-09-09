public class TestCircle {
    public static void main(String[] args) {
        Circle obj = new Circle();
        System.out.println(obj.getArea());
        System.out.println(obj.getRadius());
        System.out.println(obj.getColor());

        Circle obj2 = new Circle(9,"blue");
        System.out.println(obj2.getArea());
        System.out.println(obj2.getRadius());
        System.out.println(obj2.getColor());

        obj.setColor("orange");
        obj2.setColor("maroon");

        System.out.println(obj.getColor());
        System.out.println(obj2.getColor());

        obj.setRadius(34872);        
        obj.setRadius(3);
        
        System.out.println(obj.getRadius());
        System.out.println(obj2.getRadius());
    }
}
