package Practice;

import java.util.Arrays;

public class MergeSort {
    static int[] merge(int[]arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[]left=merge(Arrays.copyOfRange(arr,0,mid));
        int[]right=merge(Arrays.copyOfRange(arr,mid,arr.length));

        return sort(left,right);
    }

    private static int[] sort(int[] left, int[] right) {
        int[]mix=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while ((i<left.length && j<right.length)){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }else {
                mix[k]=right[j];
                j++;
            }
            k++;
       }
        while (i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }
        while (j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }
        return mix;
    }

    public static void main(String[] args) {
int[]arr={9,3,2,1,6,7};
arr=merge(arr);
        System.out.println(Arrays.toString(arr));
    }
}
