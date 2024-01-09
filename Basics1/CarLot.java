class Car {
    int licencePlateNumber = 1234;
    String name = "Benze";
}

public class CarLot {
    Car obj2;

    public CarLot(Car object) {
        obj2 = object;
    }

    public Car returnAObject(){
        return obj2;
    }

    public static void main(String[] args){
        Car obj1 = new Car();
        System.out.println("Car Object in main method: "+obj1);
        CarLot obj = new CarLot(obj1);
        System.out.println("CarLot Object in main method: "+obj);
        System.out.println("Object inside the CarLot class: "+obj.returnAObject());
        CarLot object = new CarLot(obj1);
        System.out.println("CarLot Object2: "+object);
        System.out.println("Object inside CarLot class - 2: "+object.returnAObject());
    }
}