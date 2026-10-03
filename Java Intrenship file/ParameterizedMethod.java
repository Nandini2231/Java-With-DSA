public class ParameterizedMethod {
    public int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        int result;
        ParameterizedMethod obj=new ParameterizedMethod();
        result=obj.add(4,7);
        System.out.println("The result after addition is:"+result);
    }
    
}
