/*
 *@author Yakovlev Alexandr
 */
public class Lesson05 {

    //возведение в степень с рекурсией и четностью делали на первом занятии
    private static int pre(int value, int n) {
        if (n == 0)
            return 1;
        else if (n % 2 == 0) {
            return pre(value * value, n / 2);
        } else {
            return value * pre(value, n-1);
        }
    }
}
