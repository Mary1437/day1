import java.util.Scanner;
class Program1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.nextLine();
        System.out.println("Enter age");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter class");
        String Studentclass=sc.nextLine();
        System.out.println("Enter place");
        String place=sc.nextLine();
        System.out.println("Details of student");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("class:");
        System.out.println("place:"+place);
    }
}
