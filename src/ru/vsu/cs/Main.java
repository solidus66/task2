package ru.vsu.cs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = enterCoordinate('x');
        int y = enterCoordinate('y');

        String rightCoordinateQuarter = findRightCoordinateQuarter(x, y);
        System.out.println("Right coordinate quarter is " + rightCoordinateQuarter);
    }

    public static int enterCoordinate(char coordinateName)
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

    static String findRightCoordinateQuarter(int x, int y)
    {
        if (checkCoordinateQuarterI(x, y))
        {
            return "Quarter I";
        }

        if (checkCoordinateQuarterII(x, y))
        {
            return "Quarter II";
        }

        if (checkCoordinateQuarterIII(x, y))
        {
            return "Quarter III";
        }

        if (checkCoordinateQuarterIV(x, y))
        {
            return "Quarter IV";
        }

        {
            return findRightCoordinateQuarter(x, y);
        }
    }
}