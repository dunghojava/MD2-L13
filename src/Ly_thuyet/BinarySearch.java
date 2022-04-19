package Ly_thuyet;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            integerList.add(i);
        }
        int search = 900000;
        long startTimeBinary = System.nanoTime();
        binarySearch(integerList, search, 0, integerList.size() - 1);
        long endTimeBinary = System.nanoTime();
        long checkTimeBinary = endTimeBinary - startTimeBinary;
        System.out.println("check time binary = " + checkTimeBinary);
    }

    public static int binarySearch(List<Integer> integers, int search, int start, int end) {
        while (end >= start) {
            int center = (end - start) / 2;
            if (search < integers.get(center)) {
//                end = center - 1;
                return binarySearch(integers, search, start, center - 1);
            } else if (search == integers.get(center)) {
                return center;
            } else {
//                start = center + 1;
                return binarySearch(integers, search, center + 1, end);
            }

        }
        return -1;
    }
}
