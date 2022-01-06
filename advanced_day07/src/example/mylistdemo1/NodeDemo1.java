package example.mylistdemo1;

/**
 * @author zhaosong
 * @version 1.0
 * @description
 * @date 2021/12/24 12:59
 */
public class NodeDemo1 {
    public static void main(String[] args) {
        //构建单向链表
        Node1 node1 = new Node1("杨过", null);
        Node1 node2 = new Node1("小龙女", null);
        Node1 node3 = new Node1("尹志平", null);
        node1.node = node2;
        node2.node = node3;

        //遍历单向链表
        //定义临时节点
        Node1 root = node1;
        while (true){
            if (root != null){
                //如果当前节点不为null，打印当前节点元素
                System.out.println(root.ele);
                //将当前节点的指向节点赋值给临时节点，进行再次遍历打印
                root = root.node;
            }else {
                break;
            }
        }
    }
}

//描述节点类
class Node1{
    public String ele;//当前元素
    public Node1 node;//表示下一个指向节点

    public Node1(String ele, Node1 node) {
        this.ele = ele;
        this.node = node;
    }
}
