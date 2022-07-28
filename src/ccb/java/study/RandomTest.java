package ccb.java.study;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class RandomTest {

    public static boolean isExist(Integer[] a, int r) {
       /* //倒序排序
        Arrays.sort(a, Collections.reverseOrder());


        //二分查找
       if( Arrays.binarySearch(a,r)>=0)
       {
           return true;
       }*/
        for (int i = 0; i < a.length; i++) {
            if (a[i] == r) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("请输入要生成的数量：");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Integer[] a = new Integer[n];

        for (int i = 0; i < a.length; i++) {
            //初始值，自动装箱，Integer i=-1
            a[i] = -1;
        }

        Random random = new Random();


        int j = 0;

        while (j < n) {
            int r = random.nextInt(5);

            if (!isExist(a, r)) {
                a[j] = r;
                j++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
