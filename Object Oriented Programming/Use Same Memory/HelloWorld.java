class Counter{
    static int count=0;
    Counter(){
        count++;
        System.out.print(Counter.count+"\t");
    }
}
public class Hello{
    public static void main(String[] args){
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
    }
}
// output :1 2 3
