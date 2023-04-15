package ru.cft.shift;

public class Table {

    private StringBuilder LineSb = new StringBuilder();
    private int countDigit_a = 0;
    private int countDigit_ab;


    private void getCountDigit (int a, int b){
        countDigit_a = getNUm(a);
        countDigit_ab = getNUm(a * b);
    }
    private int getNUm(int number) {
        int numbersCount = 0;
        do {
            numbersCount++;
            number /= 10;
        } while(number != 0);
        return numbersCount;
    }

    private void printSymbol(String symbol) {
        System.out.print(symbol);
    }

    private void getLine(int b) {
        int len = b * (countDigit_ab + 1);
        for (int i = 0; i < countDigit_a; i++) LineSb.append("-");
        while(len != 0) {
            if (len % (countDigit_ab + 1) != 0) {
                LineSb.append("-");
            } else {
                LineSb.append("+");
            }
            len--;
        }
    }

    void getMulTable(int a, int b) {
        getCountDigit(a, b); // проведение предварительных расчетов
        getLine(b); // формирование промежуточной линии
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                if (j * i != 0) {
                    for (int z = 0; z < countDigit_ab - getNUm(i * j); z++) printSymbol(" "); // печать пробелов в ячейках
                    System.out.print(i * j); // печать результата умножения
                } else {
                    if (j != 0) for (int z = 0; z < countDigit_ab - getNUm(1 * j); z++) printSymbol(" "); // печать пробелов верхнего ряда
                    if (j != 0) {
                        System.out.print(j); // печать верхней шапки
                    } else {
                        for (int z = 0; z < countDigit_a - getNUm(i * 1); z++) printSymbol(" "); // печать пробелов левого ряда
                        if (i != 0) {
                            System.out.print(i); // печать левой колонки
                        } else {
                            printSymbol(" "); // печать пробела вмето ноля в левом вепхнем углу.
                        }
                    }
                }
                if (j != b) printSymbol("|"); // не ставим bar в конце
            }
            System.out.print("\n" + LineSb + "\n");
        }
    }
}
