import java.util.HashSet;

public class Main {

    //Egyszerűbb megoldás
    private static boolean CheckSum(int[] array1, int[] array2, int sum){
        for (int x : array1) {
            for (int y : array2) {
                if (x + y == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    //Optimalizált megoldás
    public static boolean CheckSumOpt(int[] array1, int[] array2, int sum) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : array1) {
            set.add(x);
        }
        for (int y : array2) {
            int diff = sum - y;
            if (set.contains(diff)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {8,9};
        int sum = 13;

        boolean result1 = CheckSum(array1, array2, sum);
        boolean result2 = CheckSumOpt(array1, array2, sum);
        System.out.println(result1);
        System.out.println(result2);

    }
}