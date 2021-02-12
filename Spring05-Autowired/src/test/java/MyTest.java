import com.lzh.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1(){
     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml") ;

      Person person  =  context.getBean("person", Person.class) ;
      person.getCat().shot();
      person.getDog().shot();
    }

}
