package SelectionSort;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        int min; // sağında kalan sayıların en
        //küçüğünün indexisi tutacağız
        int[] arr1={17,15,9,8,7,5,4,3,2,1,0};
int count=0;
        for(int i =0; i< arr.length; i++) {
            min=i;
            for(int j= i+1 ; j< arr.length;j++) {
                if(arr[j]<arr[min]) {
                    min = j;
                }
                count++;
            }
            // swap işlemi
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min] = temp;
        }
        System.out.println("count: "+count);
    }
}
