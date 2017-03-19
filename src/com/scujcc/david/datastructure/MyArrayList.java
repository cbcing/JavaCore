package com.scujcc.david.datastructure;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by David on 3/19/17.
 */
public class MyArrayList<E> implements Iterable<E> {
    private int theSize;
    private E [] theItems;

    public int size(){
        return theSize;
    }

    public E remove(int idx){
        E removedItem = theItems[idx];
        for (int i = 0; i < size() - 1; i++){
            theItems[i] = theItems[i+1];
        }
        theSize--;
        return removedItem;
    }

    public Iterator<E> iterator(){
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<E>{
        private int current = 0;

        public boolean hasNext(){
            return current < size();
        }

        public E next(){
            if (!hasNext()){
                throw new NoSuchElementException();
            }
            return theItems[current++];
        }

        public void remove(){
            MyArrayList.this.remove(--current);
        }
    }
}
