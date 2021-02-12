import com.lzh.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyTest {
    public static void main(String[] args) {
//        User user = new User();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        User user = (User)context.getBean("user");
//        User user2 = (User)context.getBean("user");
//
//        System.out.println(user==user2);

        User user = (User)context.getBean("userNew");
        user.show();
    }
}
