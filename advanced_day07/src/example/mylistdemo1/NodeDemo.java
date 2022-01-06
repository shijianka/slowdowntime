package example.mylistdemo1;

/**
 * @author zhaosong
 * @version 1.0
 * @description
 * @date 2021/12/23 1:25
 */
public class NodeDemo {
    public static void main(String[] args) {
        //构建单向链表
        Node node1 = new Node("杨过",null);
        Node node2 = new Node("小龙女",null);
        Node node3 = new Node("尹志平",null);
        node1.next = node2;//节点指向
        node2.next = node3;//节点指向
        //遍历链表
        //定义root辅助节点，初始值代表头节点
        Node root = node1;
        while (true){
            if (root != null){
                System.out.println(root.ele);//打印当前节点元素的值
                root = root.next;//将当前节点的指向节点，重新赋值给当前节点
            }else {
                break;
            }
        }
    }
}

//描述节点类
class Node{
    public String ele;//元素
    public Node next;//代表当前节点指向的下一个节点

    public Node(String ele, Node next) {
        this.ele = ele;
        this.next = next;
    }
}