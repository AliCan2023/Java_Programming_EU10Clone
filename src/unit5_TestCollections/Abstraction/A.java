package unit5_TestCollections.Abstraction;

public interface A {
    void readBook();
    abstract void watchTV();
}
abstract  class B implements A{
    public void readBook(){
        System.out.println("Reading book");
    }
}
