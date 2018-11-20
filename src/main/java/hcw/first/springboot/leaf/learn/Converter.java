package hcw.first.springboot.leaf.learn;

/**
 * @Company: 道盟科技
 * @Author : hechengwen
 * @Time : 2018/10/26 17:26
 * @Desc :
 * @version:
 */
@FunctionalInterface
public interface Converter<F, T> {

    T convert(F from);

}
