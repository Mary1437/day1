import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a number");
        a =sc.nextInt();
        System.out.println("Enter a number");
        b =sc.nextInt();
        System.out.println("Enter a number");
        c =sc.nextInt();
        int d=a+b-c;
        System.out.println(d);
    }
} 
