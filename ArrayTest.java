package com.prakash;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.*;

public class ArrayTest {
    public static void main(String args[]) throws FileNotFoundException {
        File inputfile = new File("D:/PRAKASH/MypROGRAMS/Numbers.txt");
        Scanner scan = new Scanner(inputfile);
        int sum = 0, count = 0;
        double d = 0.0;
        while(scan.hasNextLine())
        {
            int Line1 = Integer.parseInt(scan.next());
            sum = sum + Line1;
            count++;
        }
        d = sum/count;
        System.out.print(d);
    }
}
