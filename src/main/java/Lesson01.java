/*
 *@author Yakovlev Alexandr
 */
public class Lesson01 {
    public static void main(String[] args) {
        System.out.println(toExp(2, 10));
        System.out.println(toExpR(2, 10));
        System.out.println(pre(2, 11));

        int[] arr = {4, 5, 7, 6, 1, 0};
        System.out.println(arrMin(arr));
        System.out.println(arrMean(arr));
    }
    private static int toExp(int value, int n) {
        int res = 1;
        for (int i = 0; i < n; i++)
            res = value * value;

        return res;
    }

    private static int toExpR(int value, int n) {
        if (n == 0) return 1;
        return toExpR(value,  n-1) * value;
    }

//    1.1. Возведение в степень используя чётность степени
    private static int pre(int value, int n) {
        if (n == 0)
            return 1;
        else if (n % 2 == 0) {
            return pre(value * value, n / 2);
        } else {
            return value * pre(value, n-1);
        }
    }
//1.2. Поиск минимального элемента в массиве
    private static int arrMin(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] < res)
                res = arr[i];

        return res;
    }
// 1.3. Нахождение среднего арифметического массива
    private static float arrMean(int[] arr) {
        float res = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++)
            res += arr[i];

        return res / size;
    }


}
