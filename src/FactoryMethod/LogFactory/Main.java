package FactoryMethod.LogFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String numeros = "";
        for(int i=1;i<11;i++){
            numeros = numeros.concat(String.valueOf(i) + " ");
        }
        Scanner sc = new Scanner(System.in);
        String locationLog = sc.nextLine();
        FactoryLog factory = new FactoryLog();
        factory.getLog(locationLog, numeros);
    }
}
