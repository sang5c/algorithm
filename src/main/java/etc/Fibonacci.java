package etc;

class Fibonacci {

    private static final int MIN_NUMBER = 1;

    public static void main(String[] args) {
        int number = 7;
        int recursiveResult = recursiveFibo(number);
        System.out.println(recursiveResult);

        int dynamicResult = dpFibo(number);
        System.out.println(dynamicResult);
    }

    private static int dpFibo(int number) {
        if (number <= MIN_NUMBER) {
            return number;
        }
        int[] cache = new int[number + 1];
        cache[0] = 0;
        cache[1] = 1;

        for (int i = 2; i <= number; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[number];
    }

    private static int recursiveFibo(int number) {
        if (number <= MIN_NUMBER) {
            return number;
        }
        return recursiveFibo(number - 1) + recursiveFibo(number - 2);
    }

}
