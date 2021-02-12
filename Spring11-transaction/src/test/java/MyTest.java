import com.lzh.mapper.UserMapper;
import com.lzh.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
        UserMapper userMapper     =  context.getBean("userMapper", UserMapper.class) ;
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }
    }
}
