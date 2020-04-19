import java.util.Arrays;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/

public class Text2{
    public static int[] change(int[] arr){
        int le = 0;
        int ri = arr.length-1;
        while (le<ri) {
            while (le % 2 == 0 && le < ri) {
                le++;
            }
            while (ri % 2 != 0 && le < ri) {
                ri--;
            }
            int tmp = arr[le];
            arr[le] = arr[ri];
            arr[ri] = tmp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,1,5,2};
        System.out.println(Arrays.toString(change(arr)));

    }
    //交换数组
    public static void swap(int[] arr1,int[] arr2){
        int x = arr1.length;
        int y = arr2.length;
            for (int i = 0; i < x; i++) {
                int tmp = arr1[i];
                arr2[i] = arr1[i];
                arr1[i] = tmp;
            }
            return  Arrays.toString(arr2);
    }
    public static void main1(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        System.out.println("交换后的arr2是 "+(swap(arr1,arr2));
    }
    }
