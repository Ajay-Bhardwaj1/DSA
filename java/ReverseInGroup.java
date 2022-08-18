import java.util.Arrays;

public class ReverseInGroup {
    public static void main(String[] args) {
        System.out.println("Reverse Array in group");
        int[] arr={2,4,65,6,2,4,6,4,3,5,6,4,66,33,5,12,46,32,67};
        int n=arr.length;
        int k=4;
       ReverseInGroup1(arr , n , k );



    }
    static void  ReverseInGroup1(int[] arr, int n,int k){
        for(int i=0;i<n;i=i+k)
        {
            int start=i;
            int end =Math.min(i+k-1,n-1);
            while(start <= end)
            {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
