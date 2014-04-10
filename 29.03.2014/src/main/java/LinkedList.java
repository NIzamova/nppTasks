/**
 * Created by N on 05.04.14.
 */
public class LinkedList<T> implements List<T>{
    private class Refer<T>{
        T data;
        Refer next;
    }

    private Refer<T> head;
    private Refer<T> tail;


    public LinkedList(){
        this.head=new Refer<T>();
        this.head.next=null;
        this.head.data=null;
        this.tail=head;
    }

   public  LinkedList(T val){
        this.head=new Refer<T>();
        this.head.data=val;
        this.head.next=null;
        this.tail=head;
    }

   public  LinkedList (LinkedList<T> list){
        Refer<T> list1=this.head;
        Refer<T> list2=list.head;
        while(list2.next!=null) {
            list1.data = list2.data;
            list1 = list1.next;
            list2 = list2.next;
        }
    }

    public int size(){
        int size=0;
        Refer <T> indicator = head;
        while (indicator!=null)
            size++;
        return size;
    }

   public void add(T data){
    tail.next=new Refer<T>();
    tail.next.data=data;
    tail=tail.next;
    tail.next=null;
}

    public T remove(){
Refer<T> indicator=head;
        while(indicator.next!=tail)
            indicator=indicator.next;
        T val=tail.data;
        indicator.next=null;
        tail=indicator;
        return val;
    }
    public T peek() {
        return tail.data;
    }

}
