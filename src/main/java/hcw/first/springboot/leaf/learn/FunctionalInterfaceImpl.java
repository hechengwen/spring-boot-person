package hcw.first.springboot.leaf.learn;

/**
 * @Company: 道盟科技
 * @Author : hechengwen
 * @Time : 2018/10/26 16:43
 * @Desc :
 * @version:
 */

public class FunctionalInterfaceImpl implements FunctionalInterfaceDemo {
    @Override
    public void doSoming(String str) {
        System.out.println(str + "方法的引用");
    }
}
