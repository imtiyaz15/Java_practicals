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
            
            for(j=0;j<row-1;j++){ 
                System.out.print("sp ");
            }
            

            for(int k=0;k<j;k++){
                System.out.println(" *");
            }
            System.out.println();
        }
       
    }
    public static void main(String args[]){
        Pattern obj = new Pattern();
        obj.pattern4();
        
    }
}
