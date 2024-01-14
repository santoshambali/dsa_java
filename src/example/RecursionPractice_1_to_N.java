package example;

public class RecursionPractice_1_to_N {
    public static void fun(int n){
        if (n == 0){
            return;
        }
        fun(n-1);
        System.out.println( n);
    }

    public static void main(String[] args){
        fun(9);
    }
}
