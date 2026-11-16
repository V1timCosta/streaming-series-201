package main;

import utils.Input;

public class Main {
    public static void main(String[] args) {

        Serie s1 = new Serie("Mentalista", "Netflix");
        Serie s2 = new Serie(Input.st("informe o nome da serie"));


        System.out.println(s1);
        System.out.println(s2);


        if (!s1.setNota(Input.db("Informe uma nota:"))) {
            System.out.println("Nota invalida!");
        }
    }


}

