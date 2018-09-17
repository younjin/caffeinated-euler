import java.util.ArrayList;
import java.util.List;

public class Two {
    public static void main(String[] args) {
        System.out.println("fib(n) is " + fibSum(3));
//        System.out.println("Solution is " + eulerTwo(50));
    }

    public static List<Integer> fibList = new ArrayList<>();
    fibList.add(0,1);
    fibList.add(1,1);

    private static int fibSum(int n) {
        Integer fn = fibList.get(n);

        if (fn == NULL) {
            
        }


        if (n < 1) {
            return 0;
        } else if (n == 1) {
            return fibList.get(1);
        } else {
            int fn = fibList.get(n - 1) + fibList.get(n - 2);
            fibList.add(n, fn);
            return fn;
        }
    }

//    private static int eulerTwo(int n) {
//        int sum = 0;
//        for (int i = 1; i < n; i++) {
//            int fib = fibSum(i);
//            if (fib % 2 == 0) {
//                sum += fib;
//            }
//        }
//        return sum;
//    }
}