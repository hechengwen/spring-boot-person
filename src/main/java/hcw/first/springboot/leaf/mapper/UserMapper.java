package hcw.first.springboot.leaf.mapper;

import hcw.first.springboot.leaf.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Company: 道盟科技
 * @Author : hechengwen
 * @Time : 2018/10/26 10:11
 * @Desc :
 * @version:
 */

@Mapper
public interface UserMapper {
    User getUserById(@Param("uid") Integer uId);
}
