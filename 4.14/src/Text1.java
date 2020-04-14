import java.util.Arrays;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
public class Text1 {
    public static void main(String[] args) {

    }
    //求数组的平均值
    public static double avg(int[] x) {
        int ret = 0;
        double sum;
        for (int i = 0; i < x.length; i++) {
            ret += x[i];
        }
        sum = ret/x.length;
        return sum;
    }
    public static void main1(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(avg(arr));
    }
}
