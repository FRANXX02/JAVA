import java.awt.font.TextHitInfo;
import java.util.Arrays;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
public class List {
    private int[] elem;
    private int usedSize;
    private static final int box= 10;//容量是10
    public List() {
        this.elem = new int[box];//不new容量默认就为空
        this.usedSize = 0;
    }
    public int[] getElem() {
        return elem;
    }

    public void setElem(int[] elem) {
        this.elem = elem;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }
    //
    //更新
    public void setPos(int pos,int value){
        checkPos(pos);
        this.elem[pos] = value;
        System.out.println(Arrays.toString(this.elem));
    }

    //删除第一次出现的数字
    public void remove(int toRemove){
        int index = search(toRemove);
        if (index == -1) {
            System.out.println("没没有需要删除的数字");
        }
        for (int i = index; i < this.usedSize-1 ; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedSize--;
    }
    // 获取顺序表长度
    public int size(){
        return this.usedSize;
    }
    //
    private void checkPos(int pos){
        if (pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("pos位置从不合法");
        }
    }
    //判断顺序表是否为空
    private boolean isEmpty(){
        return usedSize == 0;
    }
    //获取pos位置的元素
    public int getPos(int pos){
        if (isEmpty()) {
            throw new RuntimeException("顺序表为空");
            //return -1;
        }
        if (pos <= this.usedSize&&pos >= 0) {
            return this.elem[pos];
        }
        return -1;

    }
    //查找某个元素对应位置
    public int search(int toFind){
        for (int i = 0; i < this.usedSize ; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    //判断是否包含元素
    public boolean contains(int toFind){
        for (int i = 0; i < this.usedSize ; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    //判断是否满了
    private boolean isFull(){
        return this.usedSize == this.elem.length;
    }
    //打印顺序表
    public void display(){
       /* for (int i =0; i < this.elem.length; i++) {
            System.out.print(elem[i]+" ");
        }*/
        System.out.println(Arrays.toString(this.elem));
    }
    //在pos位置新增元素
    public void add(int pos, int key){
        if (isFull()) {
            this.elem  = Arrays.copyOf(this.elem,this.elem.length*2);
        }
        checkPos(pos);
       /* if (pos < 0 || pos > this.usedSize) {
            return;
        }*/
        for(int i = usedSize-1; i >=pos; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = key;
        this.usedSize++;
        System.out.println(Arrays.toString(this.elem));
    }
}
