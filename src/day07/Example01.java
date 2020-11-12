package day07;

/**
 * 链表底层实现
 */
public class Example01 {

    public static void main(String[] args) {
        NodeManger nm = new NodeManger();
        nm.add(7);
        nm.add(6);
        nm.add(5);
        nm.add(4);
        nm.add(3);
        nm.show();
        System.out.println("-------------------");
        boolean isExit = nm.find(7);
        if(isExit) System.out.println("存在");
        else System.out.println("不存在");
        System.out.println("-------------------");
        //传入：data  index
        nm.insert(77 , 1);
        nm.show();
        System.out.println("-------------------");
        nm.delete(7);
        nm.show();
        System.out.println("-------------------");
        //更新操作
    }
}
class NodeManger{

    private Node root;
    private int currentIndex;

    /**
     * 添加方法
     * @param data
     */
    public void add(int data){
        if(null != this.root){
            this.root.addNode(data);
        }else{
            this.root = new Node(data);
        }
    }

    /**
     * 显示所有节点
     */
    public void show(){
        if(null != this.root){
            System.out.print(this.root.getData() + "->");
            this.root.showNode();
        }
    }

    /**
     * 查询一个节点是否存在
     * @param data
     * @return
     */
    public boolean find(int data) {
        if(null != this.root){
            if(data == this.root.getData()) return true;
            else return this.root.findNode(data);
        }
        return false;
    }

    /**
     * 出入一个节点
     * @param data
     * @param index
     */
    public void insert(int data, int index) {
        if(0 == index){
            Node newNode = new Node(data);
            newNode.next = this.root;
            this.root = newNode;
        }else{
            this.root.insertNode(data , index);
        }
    }

    /**
     * 删除一个节点
     * @param data
     */
    public void delete(int data) {
        if(null != this.root){
            if(this.root.getData() == data)
                this.root = this.root.next;
            else {
                this.root.deleteNode(data);
            }
        }
    }


    class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }

        /**
         * 递归添加好下一个节点
         * @param data
         */
        public void addNode(int data) {
            if(null != this.next){
                this.next.addNode(data);
            }else{
                this.next = new Node(data);
            }
        }

        public boolean findNode(int data) {
            if(null != this.next){
                if(data == this.next.data)
                    return true;
                else return this.next.findNode(data);
            }
            return false;
        }

        /**
         * 内部类中的方法是要被递归的
         * @param data
         * @param index
         */
        public void insertNode(int data, int index) {
            currentIndex++;
            if(currentIndex == index){
                Node newNode = new Node(data);
                newNode.next = this.next;
                this.next = newNode;
            }else{
                this.next.insertNode(data , index);
            }
        }


        public void deleteNode(int data) {
            if(null != this.next){
                if(this.next.data == data)
                    this.next = this.next.next;
                else this.next.deleteNode(data);
            }
        }
        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void showNode() {
            if(null != this.next){
                System.out.print(this.next.data + "->");
                this.next.showNode();
            }
        }


    }
}