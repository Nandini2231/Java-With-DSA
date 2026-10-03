public class ReverseNumber {
//     public static void main(String[] args) {
//         int number=1234;
//         int ReversedNumber=0;

//         while(number !=0){
//             int digit=number%10;
//             ReversedNumber=ReversedNumber*10+digit;
//             number /=10;
//         }
// System.out.println("Reversed Number:"+ReversedNumber);
//         }
//     }
    

    //by  calling  methods
 public static int reversed(int a){
    int rev=0;
    
    while(a!=0){
        int digit=a%10;
        rev=rev*10+digit;
        a=a/10;
    }
    return rev;
 }

 public static void main(String[] args) {
    int r=reversed(4567);

     System.out.println("Reversed number is"+r);
 }
}