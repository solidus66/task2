package ru.vsu.cs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int x = readCoordinate('x');
        int y = readCoordinate('y');

        Quarter CoordinateQuarter = findCoordinateQuarter(x, y);
        System.out.println("Right coordinate quarter is Quarter " + CoordinateQuarter);
    }

    static int readCoordinate(char coordinateName)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter %S: ", coordinateName);
        {
            return scanner.nextInt();
        }
    }

    static boolean checkCoordinateQuarterI(int x, int y)
    {
        return (x > 0) && (y > 0);
    }

    static boolean checkCoordinateQuarterII(int x, int y)
    {
        return (x < 0) && (y > 0);
    }

    static boolean checkCoordinateQuarterIII(int x, int y)
    {
        return (x < 0) && (y < 0);
    }

    static boolean checkCoordinateQuarterIV(int x, int y)
    {
        return (x > 0) && (y < 0);
    }

    static Quarter findCoordinateQuarter(int x, int y)
    {
        if (checkCoordinateQuarterI(x, y))
        {
            return Quarter.I;
        }

        if (checkCoordinateQuarterII(x, y))
        {
            return Quarter.II;
        }

        if (checkCoordinateQuarterIII(x, y))
        {
            return Quarter.III;
        }

        if (checkCoordinateQuarterIV(x, y))
        {
            return Quarter.IV;
        }
            return findCoordinateQuarter(x, y);
    }
}