public class StringFormats {
    public static void main(String[] args) {
        String name="John";
        int age=22;
        double height=6.3738;
    //     String formattedString=String.format("Name:%s,Age:%d,Height:%.2f feet",name,age,height);
    //     System.out.println(formattedString);
    System.out.printf("Name:%s,Age:%d,Height:%.2f feet",name,age,height);
     }
}
