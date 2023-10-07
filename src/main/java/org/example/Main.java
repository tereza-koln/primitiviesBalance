package org.example;

public class Main {
    public static void main(String[] args) {
        int inicialBalance = 1100;
        int added = 1200;

        int bonus =0;
        if (added > 1000) {
            bonus = added / 100;
        }

        int finalBalance = inicialBalance + added + bonus;
        System.out.println("Итоговый баланс:" + finalBalance);
    }
}