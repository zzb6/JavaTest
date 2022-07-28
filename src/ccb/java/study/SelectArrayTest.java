package ccb.java.study;

import java.util.Arrays;

/*选择排序测试*/

public class SelectArrayTest
{
    int []array;

    public SelectArrayTest() {
        this.array=new int[]{10,99,2,6,7,33,55,1000,2,1};
    }

    public SelectArrayTest(int[] array) {
        this.array = array;
    }


    @Override
    public String toString() {
        return "选择排序---{" +
                "array=" + Arrays.toString(array);
    }


    public static void main(String[] args) {

        SelectArrayTest selectArrayTest=new SelectArrayTest();

        for(int i=0;i<selectArrayTest.array.length-1;i++)
        {
            //假设最小的值是每次循环的第一个值，i保存的是数组下标
            int min=i;

            int temp;

            for(int j=i;j<selectArrayTest.array.length;j++)
            {
                if(selectArrayTest.array[min]>selectArrayTest.array[j])
                {
                    min=j;
                }
            }

            temp=selectArrayTest.array[i];
            selectArrayTest.array[i]=selectArrayTest.array[min];
            selectArrayTest.array[min]=temp;
        }

        System.out.println(selectArrayTest.toString());

    }
}
