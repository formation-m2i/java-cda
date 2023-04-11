package org.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {


    public static void main() {

        List<Integer> liste = new ArrayList<>();


        liste.add(2);
        liste.add(3);
        liste.add(5);
        liste.add(29);
        liste.add(214);

        System.out.println("--- Iterator ---");

        Iterator iter = liste.iterator();

        while (iter.hasNext()){
            System.out.println("Iterato : " + iter.next());
        }

        System.out.println("--- ListIterator --- ");

        ListIterator i = liste.listIterator();

        while (i.hasNext()){
            System.out.println("nombre : " + i.next());
        }

        while (i.hasPrevious()){
            System.out.println("nombre sens inverse : " + i.previous());
        }



    }







}
