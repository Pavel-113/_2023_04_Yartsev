package ru.cft.shift;

public class Table {

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

    void printVertBar() {
        System.out.print("|");
    }

    void printSpace() {
        System.out.print(" ");
    }

    void getMulTable(int a, int b) {
        int len = b* (getNUm(a * b) + 1) - getNUm(b);
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                if (j*i != 0) {
                    for (int z = 0; z < getNUm(a * b) - getNUm(i * j); z++) printSpace();
                    System.out.print(i * j);
                    if (j != b) printVertBar();
                } else {
                    if (j != 0) for (int z = 0; z < getNUm(a * b) - getNUm(1 * j); z++) printSpace();
                    if (j != 0) {
                        System.out.print(j);
                    } else {
                        for (int z = 0; z < getNUm(a) - getNUm(i * 1); z++) printSpace();
                        System.out.print(i);
                    }
                    if (j != b) printVertBar();
                }
            }

            System.out.print("\n");
            for (int z = 0; z < getNUm(b); z++) printSymbol("-");
            printSymbol("+-");
            int tmp  = len;
            while(tmp != 0) {
                if (tmp % (getNUm(a * b) + 1) != 0) {
                    printSymbol("-");
                } else {
                    printSymbol("+");
                }
//                System.out.print(len);
                tmp--;
            }
            System.out.print("\n");
        }
    }

}
