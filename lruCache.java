import java.util.HashMap;

public class lruCache {
    class Node{
        int key,value;
        Node prev,next;

        Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    private int capacity;
    private HashMap<Integer,Node> map;
    private Node head,tail;

    public void LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        tail=new Node(0,0);
        head=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            remove(node);
            insertToFront(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.value=value;
            remove(node);
            insertToFront(node);
        }else{
            if(map.size()==capacity){
                Node lru=tail.prev;
                remove(lru);
                map.remove(lru.key);
            }
            Node newNode=new Node(key,value);
            insertToFront(newNode);
            map.put(key,newNode);
        }
    }

    private void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    private void insertToFront(Node node){
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
    }
}
