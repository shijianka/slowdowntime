package homework.fourth;

public class TestTime {
    static long start=0;
    static long end=0;
    private TestTime(){}
    public static long test(){
        if(start==0){
            start = System.currentTimeMillis();
            return 0;
        }else {
            end = System.currentTimeMillis();
            System.out.println("耗时为"+(end-start)+"ms");
            return end -start;
        }
    }
}
