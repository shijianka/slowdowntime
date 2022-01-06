package example;

/**
 * @author zhaosong
 * @version 1.0
 * @description
 * @date 2021/12/24 18:42
 */
public class NodeTest {
    public static void main(String[] args) {
        //构建链表结构
        Node node1 = new Node("杨过", null);
        Node node2 = new Node("小龙女", null);
        Node node3 = new Node("尹志平", null);
        node1.node = node2;
        node2.node = node3;

        //遍历链表
        Node root = node1;//临时存储节点对象
        while (true){
            if (root != null){//如果当前节点对象不为null
                System.out.println(root.ele);//打印当前节点元素
                root = root.node;//并把当前结点指向节点重新赋值给root
            }else {
                break;
            }
        }
    }
}

//节点类
class Node{
    public String ele;//当前节点元素
    public Node node;//指向下一个节点

    public Node(String ele, Node node) {
        this.ele = ele;
        this.node = node;
    }
}