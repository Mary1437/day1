import java.util.Scanner;
class  Program3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>b && a>c){
          System.out.println("a is big");
        }
        if (a<b && a<c){
            System.out.println("a is small");
        }
        if (b>a && b>c){
            System.out.println("b is big");        
        }
        if (b<a && b<a){
            System.out.println("b is small");
        }
        if (c>a && c>b){
            System.out.println("c is big");
        }
        if (c<a && c<b){
            System.out.println("c is small");
        }
        sc.close();
    }
}