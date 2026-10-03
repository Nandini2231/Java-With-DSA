class Simple{
    int p,n,r,si;
    void getdata(){
        p=2000;
        n=2;
        r=3;
    }
void calc()
{
     si=p*n*r/100;

}
void disp()
{
    System.out.println(si);
}
}
public class SimpleIntrestExample{
    public static void main(String[] args) {
        Simple obj=new Simple();
        obj.getdata();
        obj.calc();
        obj.disp();
    }
}

