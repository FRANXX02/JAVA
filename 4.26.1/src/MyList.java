import java.util.Arrays;

/**
 * program:
 * description:
 * author: 陈一坤
 * date:
 **/
public class MyList {
    private int[] elem;
    private int usedsize;
    private static final int box = 10;

    public int[] getElem() {
        return elem;
    }

    public void setElem(int[] elem) {
        this.elem = elem;
    }

    public int getUsedsize() {
        return usedsize;
    }

    public void setUsedsize(int usedsize) {
        this.usedsize = usedsize;
    }
    public MyList() {
        this.elem = new int[box];
        this.usedsize = 0;
    }
    //判断pos是否合法
    public void checkPos(int pos){
        if (pos < 0 || pos > usedsize) {
            throw new RuntimeException("pos位置不合法");
        }
    }
    //判断是否满了
    private boolean isFull() {
        return this.usedsize == this.elem.length;
    }
    //打印顺序表
    public void display(){
//        for (int i = 0; i < this.usedsize-1; i++) {
//            System.out.print(this.elem[i]+" ");
//        }
        System.out.println(Arrays.toString(elem));
    }
    //判断是否包含某元素
    public boolean contains(int toFind){
        for (int i = 0; i < this.usedsize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    //在pos位置插入key
    public void add(int pos, int key) {
        checkPos(pos);
        if (isFull()) {
            this.elem = Arrays.copyOf(elem,elem.length*2);
        }
        for (int i = this.usedsize-1; i >= pos ; i--) {
            elem[i+1] = elem[i];
        }
        elem[pos] = key;
        usedsize++;
        System.out.println(Arrays.toString(elem));
    }
    //查找某个元素对应位置
    public int search(int toFind){
        for (int i = 0; i < this.usedsize ; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    //删除第一次出现的数字
    public void remove(int toRemove) {
        int n = search(toRemove);
        if (n == -1){
            System.out.println("没有要删除的数字");
        }
        for (int i = n; i < this.usedsize ; i++) {
            this.elem[i] = this.elem[i+1];
        }
        this.usedsize--;
        System.out.println(Arrays.toString(elem));
    }
    //更新
    public void setPos(int pos,int value){
        checkPos(pos);
        this.elem[pos] = value;
        System.out.println(Arrays.toString(elem));
    }
    }
