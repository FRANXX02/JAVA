import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.zip.ZipInputStream;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
public class Text1 {
    public static int[] copyOf(int[] arr){
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            ret[i] = arr[i];
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] ret = copyOf(arr);
        System.out.println(Arrays.toString(ret));
    }
    public static String add(int[] arr){
        String ret = "[";
        for (int i = 0; i < arr.length ; i++) {
            ret += arr[i];
            if(i<arr.length-1){
                ret+=",";
            }
        }
        return ret+"]";
    }
    public static void main7(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(add(arr));
    }
    //判断升序
    public static boolean up(int[] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main5(String[] args) {
        int[] arr = {1,2,324,5};
        System.out.println(up(arr));
    }

    // 从范围找数字5
    public static void main4(String[] args) {
        int[] arr = {1,3,5,7,9};
        System.out.println(Arrays.binarySearch(arr, 1, 4, 5));
    }


    //求数组最大值
    public static int maxN(int[] arr){
        int ret = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(ret < arr[i]){
                ret = arr[i];
            }
        }
        return ret;
    }
    public static void main3(String[] args) {
        int[] arr = {1,3,5,7,9};
        System.out.println(maxN(arr));

    }
    //拷贝数组的四种方法
    public static int[] copyArr(int[] arr){
        int[] ret= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = arr[i];
        }
        return ret;
    }
    public static void main2(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = copyArr(arr);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[arr.length];
        System.arraycopy(arr,0,arr3,0,arr.length);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = arr.clone();
        System.out.println(Arrays.toString(arr4));

    }
    //打印数组的3中方法
    public static void main1(String[] args) {
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for (int x: arr) {
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));
      }
    }
