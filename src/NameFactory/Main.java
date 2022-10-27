package NameFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FactoryName factory = new FactoryName();
        List<String> allNames = new LinkedList<>();
        String name = sc.nextLine();
        while (!name.equalsIgnoreCase("finish")){
            allNames.add(String.valueOf(factory.getName(name)));
            name = sc.nextLine();
        }
        allNames.forEach(System.out::println);
    }
}