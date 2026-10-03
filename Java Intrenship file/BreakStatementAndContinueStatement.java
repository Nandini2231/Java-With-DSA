

public class BreakStatementAndContinueStatement {
    public static void main(String args[]){
       /*  for(int i=0;i<10;i++){
            if (i==5){
                // break;

            }
            System.out.println(i);
           
        }
        System.out.println("End of the loop");
   
   */
   
        //continue statement
        /* 
        for(int i=0;i<=15;i++){
            if(i==10||i==12){
                continue;
            }
            System.out.println(i+"");
        }
        System.out.println("End of the loo");

*/


        //example 2:
int count=20;
while(count>=0){
    if(count==7||count==15){
        count--;
        continue;
    }
    System.out.println(count+"");
    count--;
}
    

    }
}



