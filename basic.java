import java.lang.reflect.Array;
import java.util.Arrays;

class DataStructureandAlgorithms{
    int nums;
    String snums;
//    static int length=5;

    // pprint all elements of an array or traversal of an arrqay 
    public void  printall(int array[]){
        for (int i : array) {
            System.out.print(i+" ");
        }
    }

    // //swap funtions
    // public void swap(int array[],int n){
    //     int temp=0;
    // }
    // finding maximum and minimum
    public int[]  max_min(int array[] ){
        int i =0;
        int max =array[i] ;
        int min =array[i];
        for(i=1;i<array.length-1;i++){
             //max=array[i];
             //min=array[i];
             if(max<array[i] ){
                max=array[i];
             }
             if (min>array[i]) {
                min=array[i];
             }
    }
     return new int[] {max, min};

}
public int[] reversing_array(int array[]){
int result[] = {0,0,0,0,0,0};
        for(int j=0;j<array.length;j++){
            result[j]=array[array.length-1-j];
        }
return result;    
}
public int[]  rev(int array[]){
    int start=0;
    int end=array.length-1;
    int temp=0;
    for(int i =0;start<end;i++){
        temp=array[end];
        array[end]=array[start];
        array[start]=temp;
        start++;
        end--;
    }
    return array ;
}
}
public class basic {
    public static void main(String[] args) {
        System.out.println("hello aman");
        int demoarray[]={1,2,3,4,5,6};
        DataStructureandAlgorithms obj=new DataStructureandAlgorithms();
        //obj.printall(demoarray);
        int[] maximum_minimum=obj.rev(demoarray);
        System.out.println(Arrays.toString(maximum_minimum));

    }
}
