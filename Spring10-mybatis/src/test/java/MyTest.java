import com.lzh.mapper.UserMapper;
import com.lzh.pojo.User;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSession ;
import org.apache.ibatis.session.SqlSessionFactory ;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.InputStreamResource;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class MyTest {
    @Test
    public void test() throws IOException {
//        String resources ="mybatis-config.xml" ;
//        InputStream in = Resources.class.getResourceAsStream(resources) ;
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in) ;
//        SqlSession sqlSession = sessionFactory.openSession(true) ;
//
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        List<User> userlist = mapper.selectUser() ;
//
//        for (User user : userlist) {
//            System.out.println(user);
//        }
  ApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml") ;
  UserMapper userMapper = context.getBean("userMapper2",UserMapper.class);
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }
   }

}
