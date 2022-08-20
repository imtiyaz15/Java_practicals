import java.security.Principal;
import java.util.Scanner;
import java.util.concurrent.CountedCompleter;

public class BasicPrograms{
    public void fibonacci(int input){
        System.out.println("Fibonacii series for "+input);
        int n1 =0, n2= 1, n3,count = input;
        if(count == 0){
            System.out.print(n1);
        }
        else if(count>=0){
            System.out.print(n1+" "+n2);
        }
        else{
            System.out.println("Invalid input");
        }
        
       
            for (int i =2; i<=count; ++i){
                n3 = n1+n2;
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;
            
            }
    }
    public void primeNumber(int input){
        /*Prime number is a number that is greater than 1 and 
        divided by 1 or itself only. In other words, prime numbers can't be divided by 
        other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers. */
        int flag =0;
        if(input>=2){
            for(int i = 2; i<=input; i++){
                if(input%i==0){
                    flag +=1;
                } 
            }
            if(flag==1){
                System.out.println("\nNote: "+input+" is a Prime number");
            }
            else{
                System.out.println("\nNote: "+input+ " is not a Prime number");
            }
        }
        else{
            System.out.println("\nNote: 1 and -ve cannot be a prime number");
        }
    }

    public void generatePrimeNumber(int input){
        //Generate Prime N number 
        int n = 2, flag=0;
        int count= input;
        int counter=0;
        System.out.println("<===First "+input+" Prime numbers generated===>");
        while(n>0){

            for(int j = 2; j<=n; j++){
                if(n%j==0){
                    flag=flag+1;
                    if(flag>1){
                        flag=0;
                        break;
                    }
                }  
                
                
            }
            if(flag==1){
                System.out.print(" "+n);
                counter +=1;
                flag=0;
                if(counter == count){
                 break;
                }
            }
            
            ++n;

        }
            
            
    }
    
    public static void main(String args[]){ 
        System.out.print("Provide your input her: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        BasicPrograms obj = new BasicPrograms();
        scan.close();
        obj.fibonacci(input);
        obj.primeNumber(input);
        obj.generatePrimeNumber(input);

    }
}