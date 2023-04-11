package org.example.collections;

import org.example.collections.entity.RandomPerson;

import java.util.LinkedList;

public class LinkedListDemo {


    public static LinkedList<RandomPerson> linkedList = new LinkedList<>();


    public static void main() {

        System.out.println("Demo sur LinkedList : ");

        RandomPerson.addData(5, linkedList);
        RandomPerson.affichePerson(linkedList);

        RandomPerson randomPerson = new RandomPerson();
        randomPerson.firstName = "Belhassen";

        linkedList.addFirst(randomPerson);

        RandomPerson.affichePerson(linkedList);

        //   linkedList.removeFirst();

        //    RandomPerson.affichePerson(linkedList);

        RandomPerson randomPerson2 = new RandomPerson();

        randomPerson2 = randomPerson;

        linkedList.addFirst(randomPerson2);

        RandomPerson.affichePerson(linkedList);

        linkedList.removeFirstOccurrence(randomPerson2);

        System.out.println("Le premier est : " + linkedList.getFirst());


    }


}
