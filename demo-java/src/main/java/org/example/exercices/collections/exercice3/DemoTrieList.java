package org.example.exercices.collections.exercice3;

import java.util.ArrayList;
import java.util.List;

public class DemoTrieList {

    public static <ListeTriee> void main(String[] args) {
        List<String> newList = new ArrayList<>();
        newList.add("hello");
        newList.add("allons");
        newList.add("y");
        newList.add("bye");

        ListTriee list = new ListTriee(newList);
        list.affiche();

        list.add("ailleurs");
        list.affiche();

        list.add("chenille");
        list.affiche();

        list.add("zebre");
        list.affiche();
    }



}
