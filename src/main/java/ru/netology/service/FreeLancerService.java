package ru.netology.service;

public class FreeLancerService {
    public int calculate(int income, int expenses, int threshold) {
        int counter = 0; //счетчик месяцев дохода
        int money = 0; //количество денег на счету
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                // отдыхаем
                money -= expenses;
                money /= 3;
                counter++;
            } else {
                // работаем
                money += income;
                money -= expenses;
            }

        }
        return counter;

    }
}
