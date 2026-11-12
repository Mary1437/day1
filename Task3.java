class Car{
    String color;
    void Speed(int num){
        System.out.println("speed..."+num);
    }
}
public class Task3 {
    public static void main(String[]args) {
        Car tesla=new Car();
        Car ferari=new Car();
        tesla.color="black";
        ferari.color="white";
        System.out.println(tesla.color);
        System.out.println(ferari.color);
        tesla.Speed(400);
        ferari.Speed(500);  
    }
    
}
