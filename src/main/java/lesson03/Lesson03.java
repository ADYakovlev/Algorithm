package lesson03;

import lesson03.Stack;

/*
 *@author Yakovlev Alexandr
 */
public class Lesson03 {

    public static void main(String[] args) {
        System.out.println(reverseString("hellO"));
    }

    private static String reverseString(String str){
        Stack stack = new Stack(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.insert(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append((char)stack.remove());
        }

        return sb.toString();
    }

}
