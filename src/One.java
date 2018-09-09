public class One {
    public static void main(String[] args) {
        System.out.println("The sum for n=1000 is " + eulerOne(1000));
    }

    public static int eulerOne(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
