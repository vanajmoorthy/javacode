public class LinkedList {
    private class Node {
        int val;
        Node next;
        
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }
    
    private Node start;
    public LinkedList() {
        start = null;
    }
    
    public int count() {
        int count = 0;
        Node curr = start;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        return count;
    }
    
    public int get(int idx) {
        Node curr = start;
        for (int i = 0; i < idx; i++) {
            curr = curr.next;
        }
        return curr.val;
    }
    
    public void set(int val, int idx) {
        Node curr = start;
        for (int i = 0; i < idx; i++) {
            curr = curr.next;
        }
        curr.val = val;
    }
    
    public void add(int val) {
        if (start == null) {
            start = new Node(val);
            return;
        }
        
        Node curr = start;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(val);
    }
    
    public void insert(int val, int idx) {
        if (idx == 0) {
            Node n = new Node(val);
            n.next = start;
            start = n;
            return;
        }
        
        Node curr = start;
        for (int i = 0; i < idx - 1; i++) {
            curr = curr.next;
        }

        Node n = new Node(val);
        n.next = curr.next;
        curr.next = n;
    }
    
    public void display() {
        int cnt = this.count();
        for (int i = 0; i < cnt; i++) {
            System.out.println(i + ": " + this.get(i));
        }
    }

    public static void main(String[] args) {
        LinkedList object = new LinkedList();
        object.display();
    }
}