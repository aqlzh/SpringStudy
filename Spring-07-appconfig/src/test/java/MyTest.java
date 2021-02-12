import com.lzh.config.Appconfig;
import com.lzh.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.security.auth.login.AppConfigurationEntry;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class) ;
          User    getUser  =  (User) context.getBean("getUser") ;
        System.out.println(getUser.getName());
    }

}
