package example.recuresion;

public class OneToN {
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
