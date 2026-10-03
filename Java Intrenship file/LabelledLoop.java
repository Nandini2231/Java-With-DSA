public class LabelledLoop {
    public static void main(String[] args) {
        first:
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==1){
                    System.out.println("visited");
                    continue first;
                }
                System.out.println(i+""+j);
            }
            }
    }
    
}
