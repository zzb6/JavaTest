package ccb.java.study;

public class BinarySelectTest {

    /**
     * 这是分支dev的代码！！！ version 2
     */
    //二分查找，折半
    static int BinarySelect(int[]array,int dest){

        int begin=0;
        int end=array.length-1;

        while (begin<=end)
        {
            int mid=(begin+end)/2;

            if(array[mid]==dest){
                return mid;
            }else if (array[mid]<dest)
            {
                begin=mid+1;
            }else if(array[mid]>dest)
            {
                end=mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] a={1,3,5,7,11,18,21,33,66,77};

        System.out.println(BinarySelect(a,66));
    }
}
