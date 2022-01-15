package 第21题;

public class Student implements Comparable<Student>{
    private String name;
    private int Chinese;
    private int Math;
    private int English;

    @Override
    public String
    toString() {
        return  name+","+Chinese+","+Math+","+English+"\r\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public Student() {
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        Chinese = chinese;
        Math = math;
        English = english;
    }

    @Override
    public int compareTo(Student o) {
        int result= (o.getChinese()+o.getEnglish()+o.getMath())-(this.getChinese()+this.getEnglish()+this.getMath());
        result= result==0?1:result;
        return result;
    }
}
