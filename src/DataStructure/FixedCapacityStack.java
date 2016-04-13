package DataStructure;

import java.util.Iterator;

/**
 * Created by lord on 2015/11/8 0008.
 */
public class FixedCapacityStack<Item> implements Iterable<Item>{
    private Item[] fStack;
    //private boolean isEmpty;
    private int size;

    public FixedCapacityStack(int cap){
        fStack=(Item[]) new Object[cap];
    }

    public void push(Item item){
        if(size==fStack.length) resize(2*fStack.length);
        fStack[size++]=item;
    }
    public Item pop(){
        Item item=fStack[--size];
        fStack[size]=null;
        if(size>0 && size==fStack.length/4) resize(fStack.length/2);
        return item;
    }
    public boolean isEmpty(){
        return size==0;
        //return isEmpty;
    }
    public int size(){
        return  size;
    }
    private void resize(int newSize){
        Item[] temp= (Item[]) new Object[newSize];
        for(int i=0;i<size;i++) temp[i]=fStack[i];
        fStack=temp;//update address
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }
    private class ReverseArrayIterator implements Iterator<Item>{
        private int i=size;
        public boolean hasNext(){
            return i>0;
        }
        public Item next(){
            return fStack[--i];
        }
        public void remove(){}
    }
}
