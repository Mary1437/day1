class Employee{
    String name="Ammu";
    int id=12453678;
    int salary=30000;
    void work(){
        System.out.println("Writing a code");
 }
}
public class Task1 {
    public static void main(String[] args) {
        Employee emp=new Employee();
            System.out.println(emp.name);
            System.out.println(emp.id);
            System.out.println(emp.salary);
            emp.work();
    }
}    

