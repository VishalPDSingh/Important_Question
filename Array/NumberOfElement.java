package Array;

public class NumberOfElement {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int count = 0;

        for(int i=0; i<arr.length; i++)
        {
            count++;
        }
        System.out.println("The length of array is "+count);

        System.out.println("The length of array using the properties "+arr.length);
    }
}
