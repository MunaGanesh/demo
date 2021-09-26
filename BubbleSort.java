import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
     //  BubbleSort A=new BubbleSort();
      //  System.out.println("completed sorting");
        int arr[]={3,4,2,8,9};
        int n=arr.length;
        int temp;
        System.out.println("Given Numbers :" + "{3,4,2,8,9}");
      //while(flag){
        for (int i=0;i<n-1;i++){
           // flag = 0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j] >arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
//                    flag = 1;
                    }
                }
//            if flag=0;
//            break;
            }
        for (int i=0; i < n ;i++) {
        //    String Sorted = Arrays.toString(arr[i]);
            System.out.println("Sorted Array :" + arr[i]);
        }
        }
    }

