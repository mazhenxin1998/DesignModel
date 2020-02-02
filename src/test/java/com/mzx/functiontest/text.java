package com.mzx.functiontest;

/**
 * @author ZhenXinMa
 * @date 2020/2/1 17:18
 */
public class text {
    public static void main(String[] args) {
//
//        Function function = (int i, int j) -> {
//            return i + j;
//        };
//
//        System.out.println(function.add(1, 2));
        Function function = new Function() {
            @Override
            public String toString() {
                return super.toString();
            }
        };
        function.select();

}

}
