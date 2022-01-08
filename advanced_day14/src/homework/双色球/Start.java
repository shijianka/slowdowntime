package homework.双色球;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Start {
    public static void main(String[] args) {
        //创建员工集合
        ArrayList<Personnel> listPersonnel = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            listPersonnel.add(new Personnel(i+""));
        }

        Door d = new Door();
        Enter enter1 = new Enter(d.door1,listPersonnel);

        Enter enter2 = new Enter(d.door2,listPersonnel);
        Pass pass1 =new Pass(d.door1);
        Pass pass2 =new Pass(d.door2);
        pass1.setName("前");
        pass2.setName("后");
        enter1.start();
        enter2.start();
        pass1.start();
        pass2.start();



    }
}
