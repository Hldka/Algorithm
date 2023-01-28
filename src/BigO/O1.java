package BigO;

public class O1 {//O(1) --> Constant complexity

    public static void main(String[] args) {
        int[] arr={10,2,20,40,55,7};
        //task :array'in son elemanini ekrana basin
        System.out.println(arr[arr.length - 1]);//O(1)
        // task :verilen bir sayinin cift olup olmama durumu
        int x=24;
        if (x%2==0) System.out.println("cift ");//O(1)


    }
}
