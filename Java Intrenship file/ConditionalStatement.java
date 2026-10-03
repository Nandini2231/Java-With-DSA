public class ConditionalStatement {
    public static void main(String[]args){
        //if statement
        
        /*
        int a=18;
        if(a<15){
           System.out.println("Inside if block"); //part of if block(immediate one statement after if condition)
       System.out.println("10 is less than 15");
         } 
         //always executes as it is of if block
        //this statement will be executed
        // as if considers one statement by default again below statement is outside of if block
        System.out.println("iam not in if");
        */


        //if-else statement
/* 
        int i=110;
        if(i>15){
            System.out.println("i is less than 15");
        }
        else{
            System.out.println("i is greater than 15");
        }
        System.out.println("statement after if block");
        */


        //Nested if statement

       /*  int i=10;
        if(i<15){
            if(i<5){
                //System.out.println("the value less than 15 and less than 5");
               
            }
            System.out.println("after if statemt"); 
        }
*/


     //if-else-if ladder
/* 
     int i=20;
      if(i==10) {
     System.out.println("i is 10");
     }
    else if(i==20){
        System.out.println("i is 20");
    }
    else if(i==15){
        System.out.println("i is 15");
    }
    else {
        System.out.println("i is not present");
    }
    System.out.println("After if statement");
    */



//switch statement

//rule switch i.e with out break statement
    int num=20;
    switch(num){
        case 5 -> System.out.println("it is 5");
        case 10 -> System.out.println("it is 10");
        case 15 -> System.out.println("it is 15");
        case 20 -> System.out.println("it is 20");
        default -> System.out.println("Not present");
        
    }
        }
    }
