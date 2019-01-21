package me.first.project;


/**
 * @author ziheng kejun
 * @date 2019/1/18
 */
public class Main {

    public static void main(String[] args) {
        /*
         * 变量定义遵循
         * 修饰符 变量类型 变量 = 赋值 ;
         */
        String yourmotherboom = "你妈也死了";

        int second = 2;

        double onepoinone = 1.1;

        /*
         * 打印变量内容，输出结果为你妈也死了
         */
        System.out.println(yourmotherboom);

        /*
         * 将second转换为String类型
         */
        info(String.valueOf(second));

        info(String.valueOf(M2.getResult(6)));

    }

    /**
     *
     * @param info
     */
    public static void info(String info){
        System.out.println(info);
    }
}
