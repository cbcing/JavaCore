package com.scujcc.david.datastructure.list;

import com.scujcc.david.datastructure.Node;

/**
 * Created by David on 5/28/17.
 */
/*
 * 带头节点的单链表。
 */
public class SingleLinkedList<T> implements List<T> {
    public Node<T> head;

    // 默认构造方法构造空单链表。创建头结点，data和next值均为null。
    public SingleLinkedList(){
        this.head = new Node<T>();
    }

    // 以结点元素构造单链表
    public SingleLinkedList(T[] element) {
        this();
        Node<T> rear = this.head;
        for (int i = 0; i < element.length; i++) {
            rear.next = new Node<T>(element[i], null);
            rear = rear.next;
        }
    }

    // 单链表的深拷贝
    public SingleLinkedList(SingleLinkedList<T> list) {
        this();
        Node<T> p = list.head.next;
        Node<T> rear = this.head;
        while (p != null) {
            rear.next = new Node<T>(p.data, null);
            rear = rear.next;
            p = p.next;
        }
    }

    //创建单链表。
    private Node<T> create(T[] elements, int i) {
        Node<T> p = null;
        if (i < elements.length) {
            p = new Node<T>(elements[i], null);
            p.next = create(elements, i + 1);
        }
        return p;
    }

    //复制单链表。
    private Node<T> copy(Node<T> p) {
        Node<T> q = null;
        if (p != null) {
            q = new Node<T>(p.data, null);
            q.next = copy(p.next);
        }
        return q;
    }

    //判空
    @Override
    public boolean isEmpty() {
        return this.head.next == null;
    }

    //取长
    @Override
    public int length() {
        int i = 0;
        Node<T> p = this.head.next;
        while (p != null) {
            i++;
            p = p.next;
        }
        return i;
    }

    //获取其中某个元素
    @Override
    public T get(int i) {
        if (i > 0) {
            Node<T> p = this.head.next;
            for (int j = 0; p != null && j < i; j++)
                p = p.next;
            if (p != null)
                return p.data;
        }
        return null;
    }

    //更新其中某个元素
    @Override
    public void set(int i, T x) {
        if (x == null)
            return;
        if (i >= 0) {
            Node<T> p = this.head.next;
            for (int j = 0; p != null && j < i; j++)
                p = p.next;
            if (p != null)
                p.data = x;
        } else
            throw new IndexOutOfBoundsException(i + "");
    }

    //添加元素（末尾）
    @Override
    public void append(T x) {
        insert(Integer.MAX_VALUE, x);
    }

    //插入元素（任意位置）
    @Override
    public void insert(int i, T x) {
        if (x == null)
            return;
        Node<T> p = this.head;
        for (int j = 0; p.next != null && j < i; j++)
            p = p.next;
        p.next = new Node<T>(x, p.next);
    }

    //查找
    @Override
    public T search(T key) {
        if (key == null)
            return null;
        Node<T> p = this.head.next;
        while (p != null) {
            if (p.data.equals(key))
                return p.data;
            p = p.next;
        }
        return null;
    }

    //删除
    @Override
    public T remove(int i) {
        if (i >= 0) {
            Node<T> p = this.head;
            // 定位到待删除节点i的前驱节点
            for (int j = 0; p.next != null && j < i; j++)
                p = p.next;
            if (p.next != null) {
                T old = p.next.data;// 获得原对象
                p.next = p.next.next;// 删除p的后继节点
                return old;
            }
        }
        return null;
    }

    //删除全部
    @Override
    public void removeAll() {
        this.head.next = null;
    }
}
