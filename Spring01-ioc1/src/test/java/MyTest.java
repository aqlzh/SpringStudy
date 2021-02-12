import com.lzh.dao.UserDaoImpl;
import com.lzh.service.UserService;
import com.lzh.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

//        // 用户实际调用的是业务层，dao层无需接触
//       UserServiceImpl userService = new UserServiceImpl();        //之前这里需要频繁更改
//
//        ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
//
//
//        userService.getUser();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl") ;

        userServiceImpl.getUser();
    }
}
