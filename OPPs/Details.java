//Note: This class is using by Student class
class Details{
    int id;
    String name;

    void insertData(int i, String n){
        id=i;
        name=n;

    }
    void displayData(){
        System.out.println("ID: "+id+", Name: "+name);
    }

}