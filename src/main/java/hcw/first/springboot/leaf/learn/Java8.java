package hcw.first.springboot.leaf.learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Company: 道盟科技
 * @Author : hechengwen
 * @Time : 2018/10/26 15:49
 * @Desc :
 * @version:
 */
public class Java8 {

    public static void main(String[] args) {
        List<String> names1 = new ArrayList<String>();
        names1.add("Google ");
        names1.add("Runoob ");
        names1.add("Taobao ");
        names1.add("Baidu ");
        names1.add("Sina ");

        Collections.sort(names1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("使用 Java 7 语法: " + names1);

        List<String> names2 = new ArrayList<String>();
        names2.add("Google ");
        names2.add("Runoob ");
        names2.add("Taobao ");
        names2.add("Baidu ");
        names2.add("Sina ");
        // Lambda允许把函数作为一个方法的参数（函数作为参数传递进方法中。)

        Collections.sort(names2, (String a, String b) -> a.compareTo(b));
        Collections.sort(names2, (a, b) -> {
            return a.compareTo(b);
        });
        System.out.println("使用 Java 8 语法: " + names2);

        hasFunctionalInterface(new FunctionalInterfaceDemo() {
            @Override
            public void doSoming(String str) {
                System.out.println(str + "以前的实现");
            }
        });

        hasFunctionalInterface((String e) -> System.out.println(e + "lambda的方式..."));

        FunctionalInterfaceImpl functionalInterface = new FunctionalInterfaceImpl();

        hasFunctionalInterface(functionalInterface::doSoming);

        Converter<String, Integer> converter = new Converter<String, Integer>() {
            @Override
            public Integer convert(String from) {
                return Integer.parseInt(from);
            }
        };

        System.out.println("普通转换：" + converter.convert("0100"));

        /**
         *  语法：
         *      <函数式接口>  <变量名> = (参数1，参数2...) -> {
         *                     //方法体
         *      }
         *
         *      1、=右边的类型会根据左边的函数式接口类型自动推断；
         *      2、如果形参列表为空，只需保留()；
         *      3、如果形参只有1个，()可以省略，只需要参数的名称即可；
         *      4、如果执行语句只有1句，且无返回值，{}可以省略，若有返回值，则若想省去{}，则必须同时省略return，且执行语句也保证只有1句；
         *      5、形参列表的数据类型会自动推断；
         *      6、lambda不会生成一个单独的内部类文件；
         *      7、lambda表达式若访问了局部变量，则局部变量必须是final的，若是局部变量没有加final关键字，系统会自动添加，此后在修改该局部变量，会报错；
         */
        Converter<String, Integer> converter1 = (String from) -> {
            return Integer.parseInt(from);
        };
        System.out.println("lambda转换：" + converter1.convert("0101"));

        Converter<String, Integer> converter2 = (from) -> Integer.parseInt(from);
        System.out.println("more simply lambda转换：" + converter2.convert("0102"));

        Converter<String, Integer> converter3 = from -> Integer.parseInt(from);
        System.out.println("again more simply lambda转换：" + converter3.convert("0103"));

        List<Married> marrieds = new ArrayList<>();
        marrieds.add(new Married("zhang", "1243"));
        marrieds.add(new Married("san", "4123"));

        Collections.sort(marrieds, new Comparator<Married>() {
            @Override
            public int compare(Married o1, Married o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        Collections.sort(marrieds, (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });
        System.out.println(marrieds);


    }

    public static void hasFunctionalInterface(FunctionalInterfaceDemo functionalInterfaceDemo) {
        functionalInterfaceDemo.doSoming("运行在：");
    }

}
