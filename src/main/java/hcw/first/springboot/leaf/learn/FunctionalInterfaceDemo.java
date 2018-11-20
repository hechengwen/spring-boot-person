package hcw.first.springboot.leaf.learn;

/**
 * @Company: 道盟科技
 * @Author : hechengwen
 * @Time : 2018/10/26 16:42
 * @Desc : 函数接口表示只有一个方法的接口就叫函数接口,可以使用注解 @FunctionalInterface 来标识这个接口是函数接口
 * 这不是强制性的。但是，如果添加另一个抽象方法插入此注释错误地标记接口，Java编译器会通知显示有错误。
 * @version:
 */
@FunctionalInterface
public interface FunctionalInterfaceDemo {
    void doSoming(String str);
}
