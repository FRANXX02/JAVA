import java.util.Arrays;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
public class MyArraylist {
    public int[] elem;//null
    public int usedSize;//0
    public MyArraylist() {
        this.elem = new int[5];
    }
    // 清空顺序表
    public void clear() {

    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int ret=search (toRemove);
        for (int i = ret; i <this.usedSize-1 ; i++) {
            elem[i]=elem[i+1];
        }
    }
    // 获取顺序表长度
    public int size() {
        return usedSize;
    }

    //把pos设置成value
    public void setPos(int pos,int value){
        this.elem[pos]=value;
    }
    //获取pos位置的元素
    public int getPos(int pos){
        return elem[pos];
    }
    //查找元素
    public int search(int toFind ){
        for (int i = 0; i <this.usedSize ; i++) {
            if (toFind == elem[i]) {
                return i;
            }
        }
        return -1;
    }
    //判断包含
    public boolean contains(int toFind){
        for (int i = 0; i < this.usedSize ; i++) {
            if (toFind == elem[i]) {
                return true;
            }
        }
        return false;
    }
//新增数据
    public void add(int pos,int data){
        if (pos<0||pos >this.usedSize) {
            System.out.println ("pos位置不合法" );
            return;
        }
        if (this.elem.length == this.usedSize) {
            this.elem=Arrays.copyOf (this.elem,this.elem.length*2);
        }
        for (int i = this.usedSize-1; i >=pos ; i--) {
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }
//打印顺序表
    public void display(){
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print (this.elem[i] +" ");
        }
        System.out.println ( );
    }
}
