package DataStructure;

import java.util.Iterator;

/**
 * Created by lord on 2015/11/1 0001.
 */
public class Bag<Item> implements Iterable<Item>{
    private int size;
    private boolean isEmpty;
    private static class Node<Item>{
        private Item item;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    public Bag(){}
    public int size(){
        return size;
    }
    public void add(){}
    public boolean isEmpty(){
        return isEmpty;
    }
}
