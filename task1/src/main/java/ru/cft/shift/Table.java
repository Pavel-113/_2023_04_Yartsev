package ru.cft.shift;

public class Table {

    private StringBuilder LineSb = new StringBuilder();
    private int countDigit_a;
    private int countDigit_b;
    private int countDigit_ab;


    void getCountDigit (int a, int b){
        countDigit_a = getNUm(a);
        countDigit_b = getNUm(b);
        countDigit_ab = getNUm(a * b);
    }
    int getNUm(int number) {
        int numbersCount = 0;
        do {
            numbersCount++;
            number /= 10;
        } while(number != 0);
        return numbersCount;
    }

    void printSymbol(String symbol) {
        System.out.print(symbol);
    }

    void getLine(int a, int b) {
        int len = b * (getNUm(a * b) + 1) - getNUm(b);
        int k = len + getNUm(a) - 1;
        for (int i = 0; i < getNUm(b); i++) LineSb.append("-");
        LineSb.append("+");
        while(k != 0) {
            if (k % (getNUm(a * b) + 1) != 0) {
                LineSb.append("-");
            } else {
                LineSb.append("+");
            }
            k--;
        }
    }

    void getMulTable(int a, int b) {
        getLine(a, b);
        getCountDigit(a, b);
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {

                if (j*i != 0) {
                    for (int z = 0; z < getNUm(a * b) - getNUm(i * j); z++) printSymbol(" ");
                    System.out.print(i * j);
                    if (j != b) printSymbol("|");
                } else {
                    if (j != 0) for (int z = 0; z < getNUm(a * b) - getNUm(1 * j); z++) printSymbol(" ");
                    if (j != 0) {
                        System.out.print(j);
                    } else {
                        for (int z = 0; z < getNUm(a) - getNUm(i * 1); z++) printSymbol(" ");
                        System.out.print(i);
                    }
                    if (j != b) printSymbol("|");
                }
            }
            System.out.print("\n" + LineSb + "\n");
        }
    }

}
