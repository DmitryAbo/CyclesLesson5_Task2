package ru.netology;

public class Sqr {

    public static int numSqr(int lowLimit, int UpLimit) {
        int  numSqr = 0;                            //кол-во квадратов находящихся в заданных диапазонах

        for (int i = 10; i < 100; i++) {            // перебираем от 10 до 99
            int sqr = i * i;                        // вычисляем квадрат числа
            if (sqr > lowLimit & sqr < UpLimit) {   // опеделяем лежит ли значение в заданном диапазоне
                numSqr++;
            }
        }

        return numSqr;

    }
}
