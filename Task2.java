class Smartphone{
    String company="iQOOZ10R";
    int cost=26000;
    String OS="android";
    int Storagecapacity=256;
    void takephoto(){
        System.out.println("clicks photo");
    }
}
public class Task2 {
    public static void main(String[] args) {
        Smartphone phone=new Smartphone();
        System.out.println(phone.company);
        System.out.println(phone.cost);
        System.out.println(phone.OS);
        System.out.println(phone.Storagecapacity);
        phone.takephoto();
    }
    
}
