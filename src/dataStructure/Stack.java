package DataStructure;

import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by lord on 2015/11/8 0008.
 */
public class Stack<Item> implements Iterable<Item> {
    private Node first;//top of the stack
    private int size;
    private class Node{
        Item item;
        Node next;
    }
    @Override
    public Iterator<Item> iterator() {
        return null;
    }
    public void push(Item item){
        Node oldFirst=first;
        first=new Node();//or first will always be null
        first.item=item;
        first.next=oldFirst;
        /*Node newFirst=new Node();
        newFirst.next=first;
        newFirst.item=first.item; //first is null ,no item
        first=newFirst;*/
        size++;
    }
    public Item pop(){
        Item item=first.item;
        first=first.next;
        size--;
        return item;
    }
    public int size(){return size;}
    public boolean isEmpty(){return size==0;}//or first==null

    public static void main(String args[]){
        Stack<String> s=new Stack<String>();
        Scanner scanner=new Scanner(System.in);
        //PrintWriter out=new PrintWriter(System.out);
        while(scanner.hasNext()){
            String item=scanner.next();
            if(!item.equals("-")) s.push(item);
            else if(!s.isEmpty()) System.out.println(s.pop());
        }
        System.out.println("(" + s.size() + " left on stack)");
    }
}
