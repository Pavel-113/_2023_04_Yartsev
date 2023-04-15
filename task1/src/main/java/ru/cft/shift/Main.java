package ru.cft.shift;

public class Main {
    public static void main(String[] args) {
        try {
            for (String str : args) {
                Integer.valueOf(str);
//                if ( Integer.valueOf(str) < 0) {
//
//                }
            }
            Table Result = new Table();
            Result.getMulTable(Integer.valueOf(args[0]), Integer.valueOf(args[1]));

        } catch (NumberFormatException e) {
            System.out.println("Аргумент должен быть положительным числом от 1 до 32");
        }

    }
}
