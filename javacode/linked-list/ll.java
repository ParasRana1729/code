public class ll{
    private Node head;
    private Node tail;
    private int size;

    public ll(){
        this.size = 0;
    }
    
    private class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}
