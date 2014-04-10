/**
 * Created by N on 05.04.14.
 */
public class Stack<T> {
    private LinkedList<T> list;

       Stack(){
           list = new LinkedList<T>();
       }

    Stack(T val){
        list = new LinkedList<T>(val);
    }

    Stack(LinkedList<T> List) {
        list = new LinkedList<T>(List);
    }

    public void Push (T val) {
        list.add(val);
    }


    public T Pop(){
         return list.remove();
    }


    public T Peek(){
        return list.peek();
    }


    public int Size(){
        return list.size();
    }



}
