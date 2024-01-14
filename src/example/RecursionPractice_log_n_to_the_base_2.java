package example;

public class RecursionPractice_log_n_to_the_base_2 {

    public static int fun (int n){
        if(n == 1)
            return 0;
        else
            System.out.println(n%2);
            return 1 + fun(n/2);
    }

    public static void main(String[] args) {
       System.out.println(fun(16));
    }
}
