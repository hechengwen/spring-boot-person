package hcw.first.springboot.leaf.learn;

import lombok.Data;

/**
 * @Company: 道盟科技
 * @Author : hechengwen
 * @Time : 2018/10/29 10:51
 * @Desc :
 * @version:
 */
@Data
public class Married {
    private String name;
    private String password;

    public Married(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
