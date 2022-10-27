package FactoryMethod.FileFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        FactoryFile factory = new FactoryFile();
        factory.getFile(password);
    }
}
