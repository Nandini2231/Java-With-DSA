public class StringBufferAndBuilder {
    public static void main(String[] args) {
        // StringBuffer sb=new StringBuffer("Hello");
        StringBuilder sb=new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("Afrer Appending:"+sb);
        sb.insert(5," Nandini ");
        System.out.println("After inserting:"+sb);
        sb.replace(6,13,"java");
        System.out.println("After replacing:"+sb);
        sb.delete(6,10);
        System.out.println("after deleting:"+sb);
    }
}
