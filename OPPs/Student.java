

public class Student{
    public static void main(String args[]){
        Details dt = new Details();
        //There are 3 ways to assign values in the object
        // 1. By reference variable
        // 2. By method
        // 3. By constructor
        //!-------First Way:By reference variable --------!
        dt.id = 101;
        dt.name = "Imtiyaz";
        System.out.println("ID: "+dt.id+", Name: "+dt.name);
        //!-------Second Way: By method--------!
        dt.insertData(102, "Mohith");
        dt.displayData();

        //!-------Third Way: By constructor----------!
        Details d1 = new Details();
        Details d2 = new Details();
        Details d3 = new Details();
        d1.insertData(103, "Rahul");
        d2.insertData(104, "Mohini");
        d3.insertData(105, "Mandakini");
        d1.displayData();
        d2.displayData();
        d3.displayData();       
        new Details().insertData(106, "Imran");
      //  new Details().displayData(); 
        
    }
}