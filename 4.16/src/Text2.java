import com.sun.deploy.security.SelectableSecurityManager;
import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
public class Text2 {
 /*   public static int find(int[] arr, int x){
        int le = 0;
        int ri = arr.length-1;
        int mid = (le + ri)/2;
        while (le < ri){
            mid = (le + ri)/2;
        }if(x > arr[mid]){
            le = mid + 1;
        }else(x < arr[mid]){

        }
    }*/
    public static boolean up(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main2(String[] args) {
        int[] arr = {1,2,5,4,3};
        System.out.println(up(arr));
    }
    //冒泡排序
    public static void gulu(int[] arr){
        boolean fa = false;//没有发生交换
        for (int i = 0; i < arr.length-1; i++) {
            fa = false;
            for (int j = 1; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    fa = true;
                }
                }
            if(fa == false){
                break;
            }
        }
    }
    public static void main1(String[] args) {
        int[] arr = {1,2,3,4,5};
        gulu(arr);
        System.out.println(Arrays.toString(arr));
    }
}
