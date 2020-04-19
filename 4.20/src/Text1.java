import java.util.Arrays;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
class MyArrayList {

    public int[] elem;//数组
    public int usedSize;//有效的数据个数
    public static final int intCapacity = 10;//初始容量

    public MyArrayList() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }
    public void display(){
        for (int i = 0; i < usedSize ; i++) {
            System.out.println(Arrays.toString(this.elem));
        }


        if (pos>0||pos<usedSize){
            for (int i = usedSize-1; i < pos; i--) {
                elem[i+1] = elem[i];

            }
        }
    }
    public int getPsos(int pos){
        if (usedSize == 0 ) {
            return -1;
        }else if (pos < 0&&pos>usedSize) {
            return -1;
            }
        return elem[pos];
        }
    public boolean contains( )toFind{
    }){
        for (int i = 0; i < usedSize; i++) {
            if(elem[i] == toFind){
                return true;
            }
        }
        return false;
    }
    public int search(int toFind){
        for (int i = 0; i < usedSize ; i++) {
            if (elem[i]  == toFind){
                return i;
            }
            return -1;
        }
        return  -1;
    }
}

public class Text1 {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();


    }

}
