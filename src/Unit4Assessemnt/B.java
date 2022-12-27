package Unit4Assessemnt;

public class B {
    static int count;

    public B(){
        count ++;
    }
    public B(int i){
        count += i;
    }
    public void B(String s){
        count += s.length();
    }
}
class Test {
    public static void main(String[] args) {
        new B();
        B a = new B();
        B a2 = new B(6);
        B a3 = new B(5);
        System.out.println(B.count);
    }
}
