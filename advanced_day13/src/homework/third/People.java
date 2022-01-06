package homework.third;

/**
 * @author slowdowntime
 * @version 1.0
 * @description: TODO
 * @date 2022/1/3 0:27
 */
public class People {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public People() {
    }

    public People(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
