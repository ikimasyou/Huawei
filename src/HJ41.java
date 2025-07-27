import java.util.*;
public class HJ41 {

	HJ41(){
		Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while(in.hasNext()){
            int size=in.nextInt();in.nextLine();
            MyLinkedList list=new MyLinkedList(in.nextInt());
            for(int i=1;i<size;i++){
                list.add(in.nextInt());
            }
            in.nextLine();
            int rf=in.nextInt();
            System.out.println(list.getByRI(rf));
        }
	}
}
class MyLinkedList{
    private class Node{
        public int val;
        public Node next;
        Node(int val,Node next){
            this.val=val;
            this.next=next;
        }
    }
    Node head,tail;
    int size;
    MyLinkedList(int val){
        head=new Node(val,null);
        tail=head;
        size=1;
    }
    public void add(int val){
        Node newNode=new Node(val,null);
        tail.next=newNode;
        tail=newNode;
        size++;
    }
    public int getByRI(int ri){
        Node curr=head;
        for(int i=0;i<size-ri;i++){
            curr=curr.next;
        }
        return curr.val;
    }
}
