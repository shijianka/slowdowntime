package HOMEWORK;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class third {
    /**
     * ## 题目三：
     * <p>
     * 请按要求编写多线程应用程序，模拟多个人通过一个山洞：
     * <p>
     * ​	1.这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒；
     * <p>
     * ​	2.随机生成10个人，同时准备过此山洞，并且定义一个变量用于记录通过隧道的人数。显示每次通过山洞人的姓名，和通过顺序；
     */
    public static void main(String[] args) {
        ArrayList<People> arrayList = new ArrayList<>();
        arrayList.add(new People("1号"));
        arrayList.add(new People("2号"));
        arrayList.add(new People("3号"));
        arrayList.add(new People("4号"));
        arrayList.add(new People("5号"));
        arrayList.add(new People("6号"));
        arrayList.add(new People("7号"));
        arrayList.add(new People("8号"));
        arrayList.add(new People("9号"));
        arrayList.add(new People("10号"));
        ArrayBlockingQueue<People> arrayBlockingQueue = new ArrayBlockingQueue<>(1);
        In in = new In(arrayList, arrayBlockingQueue);
        Out out = new Out(arrayBlockingQueue);

        in.start();
        out.start();

    }
}

class People {
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

class In {
    ArrayList<People> people;
    ArrayBlockingQueue<People> arrayBlockingQueue;

    public In(ArrayList<People> people, ArrayBlockingQueue<People> arrayBlockingQueue) {
        this.people = people;
        this.arrayBlockingQueue = arrayBlockingQueue;
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    arrayBlockingQueue.put(people.get(i));

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    public void start() {
        Thread thread = new Thread(runnable);
        thread.start();
    }
}

class Out {
    ArrayList<People> outPeople = new ArrayList<>();
    ArrayBlockingQueue<People> arrayBlockingQueue;

    public Out(ArrayBlockingQueue<People> arrayBlockingQueue) {
        this.arrayBlockingQueue = arrayBlockingQueue;
    }

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                while (true) {
                    People take = arrayBlockingQueue.take();
                    for (int i = 0; i < 5; i++) {
                        System.out.println(take + "正在通过山洞...(" + (5 - i) + "s)");
                        Thread.currentThread().sleep(1000);
                    }
                    System.out.println(take + "成功通过山洞！");
                    outPeople.add(take);
                    System.out.println("已经通过的人数是:" + outPeople.size());
                    System.out.print("已经通过的人的先后顺序是：");
                    for (People outPerson : outPeople) {
                        System.out.print(outPerson + " ");
                    }
                    System.out.println(" ");
                    if (outPeople.size() == 10) {
                        System.exit(0);
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    };

    public void start() {
        Thread thread = new Thread(runnable);
        thread.start();
    }
}