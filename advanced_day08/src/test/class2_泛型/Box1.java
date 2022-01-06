package test.class2_泛型;

public class Box1<A> {
    private A a;
    public A getA(){
        return a;
    }
    public void setA(A a){
        this.a=a;
    }

    @Override
    public String toString() {
        return "Box1{" +
                "a=" + a +
                '}';
    }
}
