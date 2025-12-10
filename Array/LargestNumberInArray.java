package Array;

public class LargestNumberInArray {

    public static int largestNum(int arr[])
    {
        // largest number 
        int max = arr[0];

        for(int i=0; i<=arr.length-1; i++)
        {
            if(arr[i]> max)
            {
                max = arr[i];
            }
        }
       return max;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,50,69,74,23,256,-25};
        int ans = largestNum(arr);
        System.out.println(ans);
    }
}
