package com.lzh.mapper;

import com.lzh.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{

    public List<User> selectUser() {

      User user =  new User (5,"小海","678907") ;

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class) ;
        mapper.addUser(user) ;
        return mapper.selectUser();
    }

    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public void deleteUser(int id) {
        getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
