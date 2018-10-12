/*
 *@author Yakovlev Alexandr
 */
public class Lesson01 {
    public static void main(String[] args) {
        int a = 2; //value
        int n = 10; //exp
        long res;
        res = toExp(a,n);
        System.out.println(res);
    }

    public static long toExp(int value, int exp){
        long res;
        res = value;
        for (int i = 1; i < exp; i++) {
            res = res * value;
            System.out.println(res);
        }
        return res;
    }
}
