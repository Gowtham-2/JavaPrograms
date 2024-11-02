public class Example {
    int s;
    int q;
    Example(int s,int q){
        this.q=q;
        this.s=s;
    }
    public static void main(String[] args) {
        Example ex1=new Example(1,2);
        Example ex2=new Example(2,3);
        System.out.println(ex2.s+" "+ ex2.q);
        System.out.println(ex2);
    }
}
