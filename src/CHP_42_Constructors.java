
class MyEmployee1 {
    // First constructor
    MyEmployee1(String s, int i){
        System.out.println("The name of the first employee is : " + s);
        System.out.println("The id of the first employee is : " + i);
    }
    //    Constructor overloaded
    MyEmployee1(String s, int i, int salary){
        System.out.println("The name of the second employee is : " + s);
        System.out.println("The id of the second employee is : " + i);
        System.out.println("The salary of second employee is : " + salary);
    }

}

public class CHP_42_Constructors {
    public static void main(String[] args) {
        MyEmployee1 shubham = new MyEmployee1("Shubham",1);
        MyEmployee1 harry = new MyEmployee1("Harry",2,70000);



    }
}

