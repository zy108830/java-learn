package pers.imooc.first.集合框架;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xinchao on 28/09/2017.
 */
public class ListCls {

    private List<String> fruits = new ArrayList<>();

    public static void main(String[] args) {
        ListCls lc=new ListCls();
        lc.listAdd();
        lc.printLength();
    }

    private void listAdd(){
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        System.out.println(fruits.toString());
    }

    private void printLength(){
        System.out.println(fruits.size());
    }
}
