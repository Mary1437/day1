public class Scope {
    public static void main(String[] args) {
        int a =10;//global variable
        int c;
        {
            int b=20;//local variable
            c=b;
            System.out.println(a);
            System.out.println(c);
        }
    }
    
}
