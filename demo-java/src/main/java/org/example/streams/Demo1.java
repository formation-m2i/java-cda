package org.example.streams;

import java.util.*;

public class Demo1 {

    public static void main() {


        List<String> prenoms = Arrays.asList("lucas","theo","karim","kevin","vincent","alex", "cassandre","matthieu","belhassen","toto","karim");

        System.out.println("Filter  : ");
        prenoms.stream()
                .filter(p-> p.startsWith("k"))
                .forEach(System.out::println);

        System.out.println("Count  : ");
        System.out.println();
        System.out.println("Le nombre de personne qui commence par un t est de : " + prenoms.stream().filter(p->p.startsWith("t")).count());
        System.out.println();
        System.out.println("Distinct  : ");
        prenoms.stream().distinct().forEach(System.out::println);
        System.out.println("Limit  : ");
        System.out.println();
        prenoms.stream().limit(4).forEach(System.out::println);
        System.out.println("Sorted  : ");
        System.out.println();
        prenoms.stream().sorted().forEach(System.out::println);
        System.out.println();
        System.out.println("Sorted inverse : ");
        System.out.println();
        prenoms.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, Genre.NONBINAIRE, 176,3500));
        employeeList.add(new Employee(2, Genre.FEMME, 180,3400));
        employeeList.add(new Employee(3, Genre.HOMME, 190,3900));
        employeeList.add(new Employee(4, Genre.FEMME, 168,3600));
        employeeList.add(new Employee(5, Genre.NONBINAIRE, 189,3700));


        double totalSalaire = employeeList.stream().mapToDouble(e-> e.getSalaire()).sum();

        System.out.println("Le total des salaires est " + totalSalaire);

        Optional<Employee> employee = employeeList.stream().filter(e-> e.getTaille()>=176).findFirst();

        System.out.println("Le premier emplyee qui fait au moins 176 cm est  " + employee.get());







    }




}
