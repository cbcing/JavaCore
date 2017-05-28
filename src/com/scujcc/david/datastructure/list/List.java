package com.scujcc.david.datastructure.list;

/**
 * Created by David on 5/28/17.
 */
public interface List<T> {
    boolean isEmpty();  //判空

    int length();   //长度

    T get(int i);   //获取

    void set(int i, T x);   //改

    void append(T x);       //增

    void insert(int i, T x);    //插入

    T search(T key);    //查

    T remove(int i); //删

    void removeAll(); //删全部
}
