public class RunStatic{
    //Example of static block which runs before main method
    static{
        System.out.println("I am in static block");
    }

     public static void main(String args[]){
        System.out.println("I am in main method");
    }
}
