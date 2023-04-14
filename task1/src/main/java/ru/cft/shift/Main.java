package ru.cft.shift;

public class Main {
    public static void main(String[] args) {
        try {
            for (String str : args) {
//                System.out.println("аргумент = " + Integer.valueOf(str));
                Integer.valueOf(str);
            }

            int a = Integer.valueOf(args[0]);
            int b = Integer.valueOf(args[1]);

            Table Result = new Table();
            Result.getMulTable(a, b);

        } catch (NumberFormatException e) {
            System.out.println("Аргумент должен быть числом");
        }

    }
}
