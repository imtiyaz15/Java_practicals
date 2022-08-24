public class Pattern{
    int i,j,row=5;
    int counterRows=row;
    // *	*	*	*	*
    // *	*	*	*	*
    // *	*	*	*	*
    // *	*	*	*	*
    // *	*	*	*	*

    public void pattern1(){
        for(i=0;i<row;i++){ // traversing rows
            for(j=0;j<row;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
        // *	 	 	 	 
        // *	*	 	 	 
        // *	*	*	 	 
        // *	*	*	*	 
        // *	*	*	*	*

    public void pattern2(){
        for(i=0;i<row;i++){ // traversing rows
            for(j=0;j<=i;j++){ //To print * columnwise
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    public void pattern3(){
        // *	*	*	*	*
        //      *	*	*	*
        //          *	*	*
        //              *	*
        //                  *
   
        for(i=0;i<row;i++){ // traversing rows
            
            for(j=counterRows;j>0;j--){ 
                System.out.print(" *");
            }
            counterRows -= 1;

            System.out.println();
        }
    }
    public void pattern4(){
        //                  *
        //              *	*
        //          *	*	*
        //      *	*	*	*
        //  *	*	*	*	*

        for(i=0;i<row;i++){ // traversing rows
            
            for(j=2*(row-i);j>=0;j--){ 
                System.out.print(" ");
            }
            

            for(int k=0;k<=i;k++){
              System.out.print("* ");
            }
             System.out.println();
        }
       
    }
    public void pattern4Method2(){
        //                  *
        //              *	*
        //          *	*	*
        //      *	*	*	*
        //  *	*	*	*	*

        // size of the triangle
     
    // loop to print the pattern
    for ( i = 0; i < row; i++) {
      // print spaces
      for ( j = 1; j < row - i; j++) {
        System.out.print(" "); //Remove space, you will get new shape
      }
      // print stars
      for (int k = 0; k <= i; k++) {
        System.out.print("*"); //add spca afer *, you will get new shape
      }
      System.out.println();
    }
       
    }
    public static void main(String args[]){
        Pattern obj = new Pattern();
        //obj.pattern4();
        obj.pattern4Method2();
        
    }
}
