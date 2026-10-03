public class ReturningMethod {
    void myMeth(){
        for (int i= 0; i< 10;i++) {
            if(i==5)
                return;
            System.out.println(i);
            
        }
    }
    public static void main(String[] args) {
        ReturningMethod obj=new ReturningMethod();
        obj.myMeth();
        System.out.println("Control has returned back");
    }
    
}
