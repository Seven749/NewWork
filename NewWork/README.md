[toc] 

# 第一次学习任务



## 项目名称：NewWork

## 实现内容：

#### 1.字符串的大小写转换

#### 2.统计一行字符串中字母、空格、数字和其他字符的数量

#### 3.找到一个数组的最大值和最小值，并同时返回其位置

#### 4.对数组进行排序

## 具体实现

### First：构思

#### 三部分

1. 字符串的大小写转换
2. 统计字符串中字母、空格、数字和其他字符的数量
3. 对数组的排序，和求最值及其下标

### Second：依次实现

#### Transform[^1]

**Transform**通过维护一个__char[]类型的数组__实现字符串中字母的大小写转换



##### 构造函数

```java
public Transform(char[] input) {...}
```



##### 大写转换

```java
public char[] toUpperCase() {...}
```



##### 小写转换

```java
public char[] toLowerCase() {...}
```

__________________

#### Recode[^2]

Recode通过维护一个**char[]类型数组**，以及四个**int类型的变量**实现对字符串中各种字符的统计



##### 构造函数

```java
public Recode(char[] input) {...}
```



##### 获取统计信息

```java
public void getMessages() {...}
```

----------

#### NumberCompare[^3]

NumberCompare通过维护一个**double[]类型的数组**，以及一个**boolean类型的变量**实现对数组的排序以及获取最值及其位置

##### 构造函数

调用构造函数时，可以指定是否进行排序，若未指定则默认false。

```java
public NumberCompare(double[] input, boolean isSort) {...}
public NumberCompare(double[] input) {
	this(input, false)
}
```



##### 获取数组是否已经排序

```java
public void getIsAlreadySort() {...}
```



##### 进行排序（从小到大）

```java
public void sort() {...}
```



##### 展示最值及其位置

```java
public Object[] showMin() {...}
public Object[] showMax() {...}
```



##### 进行排序并返回最值

```java
public double sortMinValue() {...}
public double sortMaxValue() {...}
```



##### 获取维护的数组

```java
public double[] getArray() {...}
```

---

### 进行测试

#### Main

```java
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

```

#### 预期结果

我们第一次要求输入时，输入 abc123ABC

预期结果为

> ABC123ABC
> abc123abc
>
> Messages:
> 字符串abc123abc中,
> 一共有6个字母；
> 一共有3个数字；
> 一共有0个空格；
> 一共有0个其他字符。

第二次要求输入时，输入111 222 333 561 662 235 511.33 999.999 0.1121

预期结果为

>排序情况为：false
>minValue = 0.1121	itsIndex = 8
>maxValue = 999.999	itsIndex = 7
>排序情况为：true
>minValue = 0.1121	itsIndex = 0
>maxValue = 999.999	itsIndex = 8
>min = 0.1121
>max = 999.999

#### 实际结果

![result](H:\JavaDemo\Raspberry\NewWork\src\result.png)