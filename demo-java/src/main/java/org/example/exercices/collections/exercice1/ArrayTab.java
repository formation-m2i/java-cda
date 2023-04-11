package org.example.exercices.collections.exercice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class ArrayTab {


    public static void main()
    {
        ArrayList<Integer> tab = new ArrayList<>();
        tab.add(1);
        tab.add(4);
        tab.add(5);
        tab.add(-2);
        tab.add(9);
        tab.add(200);
        tab.add(-15);
        tab.add(10);

        Collections.sort(tab);
        System.out.println("tr1 "+ tab);

        tab.sort(null); // null => ordre naturel
        System.out.println("tri2 "+ tab);


        tab.sort(ComparatorInt);
        System.out.println("tri3 "+ tab);


        Collections.sort(tab, ComparatorInt);
        System.out.println("tri4 " + tab);


        //Ordre inverse

        Collections.sort(tab);
        Collections.reverse(tab);
        System.out.println(tab);

        tab.sort(Collections.reverseOrder());
        System.out.println(tab);



        //Rang pair
        for (int i = 0; i < tab.size(); i+=2) {
            System.out.println(tab.get(i));
        }


        ListIterator<Integer> it = tab.listIterator();

        while (it.hasNext())
        {
            if(it.nextIndex()%2 == 0)
                System.out.println(it.next());
            else {
                it.next();
            };
        }


        //mise a zéro valeurs négatives

        ListIterator i = tab.listIterator();

        while (i.hasNext())
        {
            int value = (int) i.next();
            if(value < 0)
            {
                int id = i.nextIndex()-1;
                tab.set(id, 0);
            }
        }

        System.out.println(tab);

        for (int j = 0; j < tab.size(); j++) {
            if(tab.get(j)<0)
                tab.set(j, 0);
        }

        System.out.println(tab);


    }

    public static Comparator<Integer> ComparatorInt = new Comparator<Integer>() {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    };
}
