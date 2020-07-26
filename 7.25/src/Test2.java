import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * program:
 * description:数组
 * author: 陈一坤
 * date:
 **/
public class Test2 {
    //给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
    public static void change(int[] arr){
        int m =0;
        int n=arr.length-1;
        while(m<n){
            if (arr[m]%2==) {
                
            }
        }
    }
    //二分法查查找数组
    public static int binarySearch(int[] arr, int find){
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (find<arr[mid]) {
                right = mid-1;
            }else if (find > arr[mid]) {
                left=mid+1;
            }else return mid;
        }
        return -1;
    }
    //数组转字符串
    public static String toString(int[] arr){
        String string ="[";
        for (int i = 0; i <arr.length ; i++) {
            string+=arr[i];
            if (i != arr.length-1) {
                string+=", ";
            }
        }string+="]";
        return string;
    }
    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组
    public static int[] copyOf(int[] arr){
        int[] arr2=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            arr2[i]=arr[i];
        }
        return arr2;
    }
    //数组是否有序
    public static boolean isSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] >arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 4 , 5};
        isSort (arr);
        System.out.println (Arrays.toString (copyOf (arr)));
        System.out.println (toString (arr));
        System.out.println (binarySearch (arr , 2));
    }
}
