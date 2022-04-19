package Ly_thuyet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimKiemTuyenTinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> integerList = new ArrayList<>();
        System.out.println("Nhap search: ");
        int search = input.nextInt();
        for (int i = 0; i < 1000000; i++) {
            integerList.add(i);
        }
        long startTime = System.nanoTime();
        lianearSearch(integerList, search);
        long endTime = System.nanoTime();
        long checkTime = endTime - startTime;
        System.out.println("check time = " + checkTime);
    }
    public static void lianearSearch(List<Integer> integerList, int search) {
        int count = 0;
        for (int i = 0; i < integerList.size(); i++) {
            if (search == i) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println(" co " + count + " gia tri " + search);
        } else {
            System.out.println("khong co gia tri search");
        }
    }

}
