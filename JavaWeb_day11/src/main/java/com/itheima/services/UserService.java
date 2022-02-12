package com.itheima.services;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import com.itheima.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


public class UserService {


    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public User login(String username, String password) {
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User select = mapper.select(username, password);

        sqlSession.close();
        return select;
    }

    public boolean register(User user) {
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        boolean add = mapper.add(user);

        sqlSession.close();
        return add;
    }

}
