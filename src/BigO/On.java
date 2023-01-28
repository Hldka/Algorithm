package BigO;
//elimizdeki veri seti artikca calistirilma üsresi de dogru orantili olarak artiyor
public class On {//O(n)--> linear Complexity

    public static void main(String[] args) {
        int[] arr={10,2,20,40,55,7};//6 eleman
        //array'in bütün elemanlarini ekrana basin
        for (int item:arr) {
            System.out.println(item+", ");// 6 islem

        }
    }

}
