package com.lzh.mapper;

import com.lzh.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl  implements UserMapper{
    //使用操作，用sqlSession 来执行，现在使用SqlSessionTemplate
    private SqlSessionTemplate sqlSession ;
    public void setSqlSession(SqlSessionTemplate sqlSession){
        this.sqlSession =sqlSession ;
    }
    @Override
    public List<User> selectUser() {
    UserMapper mapper  = sqlSession.getMapper(UserMapper.class) ;
        return mapper.selectUser();
    }
}
