package com.scujcc.david.datastructure.list;

/**
 * Created by David on 5/28/17.
 */

/*
 * 顺序表。
 */
public class SeqList<T> implements List<T> {

    private Object[] element;
    private int length;

    public SeqList(int size) {
        this.element = new Object[size];
        this.length = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override
    public int length() {
        return this.length;
    }

    @Override
    public T get(int i) {
        if (i >= 0 && i < this.length)
            return (T)this.element[i];
        return null;
    }

    @Override
    public void set(int i, T x) {
        if (x == null)
            return;
        if (i >= 0 && i < this.length)
            this.element[i] = x;
        else
            throw new IndexOutOfBoundsException(i + "");
    }

    @Override
    public void append(T x) {
        this.insert(this.length, x);
    }

    @Override
    public void insert(int i, T x) {
        if (x == null)
            return;
        if (this.length == element.length) {
            Object[] temp = this.element;
            this.element = new Object[temp.length * 2];
            for (int j = 0; j < temp.length; j++)
                this.element[j] = temp[i];
        }
        if (i < 0)
            i = 0;
        if (i > this.length)
            i = this.length;
        for (int j = this.length - 1; j >= i; j--)
            this.element[j + 1] = this.element[j];
        this.element[i] = x;
        this.length++;
    }

    @Override
    public T search(T key) {
        int find = this.indexOf(key);
        return find == -1 ? null : (T)this.element[find];
    }

    // 顺序表查找关键字是key元素，返回首次出现的元素，若查找不成功则返回-1
    public int indexOf(T key) {
        if (key != null)
            for (int i = 0; i < this.length; i++)
                if (this.element[i].equals(key))
                    return i;
        return -1;
    }

    @Override
    public T remove(int i) {
        if (this.length == 0 || i >= this.length || i < 0)
            return null;
        T old = (T)this.element[i];
        for (int j = i; j < this.length; j++)
            this.element[j] = this.element[j + 1];
        this.element[this.length - 1] = null;
        this.length--;
        return old;
    }

    @Override
    public void removeAll() {
        this.length = 0;
    }
}
