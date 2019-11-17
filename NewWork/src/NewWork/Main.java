package NewWork;

import java.util.Scanner;

public class Main {
    public static void main(java.lang.String[] args) {
        System.out.println("请输入一段由英文和数字组成的字符串，回车结束输入");
        Scanner in = new Scanner(System.in);
        char[] chars = in.nextLine().toCharArray();
        Transform transform = new Transform(chars);
        System.out.println(transform.toUpperCase());
        System.out.println(transform.toLowerCase());

        Record record = new Record(chars);
        record.getMessages();


        System.out.println("请输入一个纯数字数组，每个数之间以空格分隔，回车结束输入");
        String[] input = in.nextLine().split(" ");
        double[] arrays = new double[input.length];
        for (int index = 0; index < arrays.length; index++) {
            arrays[index] = Double.valueOf(input[index]);
        }
        NumberCompare numbers1 = new NumberCompare(arrays);
        numbers1.getIsAlreadySort();
        Object[] min = numbers1.showMin();
        Object[] max = numbers1.showMax();
        System.out.println("minValue = " + min[0] + "\titsIndex = "+ min[1]);
        System.out.println("maxValue = " + max[0] + "\titsIndex = "+ max[1]);

        numbers1.sort();
        numbers1.getIsAlreadySort();
        min = numbers1.showMin();
        max = numbers1.showMax();
        System.out.println("minValue = " + min[0] + "\titsIndex = "+ min[1]);
        System.out.println("maxValue = " + max[0] + "\titsIndex = "+ max[1]);

        System.out.println("min = " + numbers1.sortMinValue());
        System.out.println("max = " + numbers1.sortMaxValue());
    }

}
