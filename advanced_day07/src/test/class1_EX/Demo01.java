package test.class1_EX;

public class Demo01 {
    public static void main(String[] args) {
        aaa();
    }

    private static void aaa() {

        try {
            bbb();
        } catch (RuntimeException e) {
            System.out.println("bbb把异常抛给我，我只能自己处理了...");;
        }
        System.out.println(111);
        System.out.println(111);
        System.out.println(111);
    }
    private static void bbb() {
        System.out.println(222);
        System.out.println(222);
        System.out.println(222);
        throw new RuntimeException();
    }

}
