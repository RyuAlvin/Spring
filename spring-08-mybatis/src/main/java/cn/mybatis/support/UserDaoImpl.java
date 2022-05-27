package cn.mybatis.support;

import cn.mybatis.dao.UserMapper;
import cn.mybatis.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * dao继承Support类，直接利用getSqlSession()获得，然后直接注入SqlSessionFactory
 *  比起方式一，不需要管理SqlSessionTemplate，而且对事务的支持更加友好，可跟踪源码查看
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserMapper {

    @Override
    public List<User> getAllUser() {
        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);
        return mapper.getAllUser();
    }
}
