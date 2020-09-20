import com.springioc.test.ClassPathXmlApplicationContext;
import com.springioc.test.entity.UserEntity;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

public class HelloServiceTest {  //传统写法(紧密耦合)
    @Test
    public void traditionalTest(){
        UserEntity service = new ClassPathXmlApplicationContext();
        service.sayHello();
    }

    //使用Spring
    @Test
    public void springTest(){
        // 工厂+反射+配置文件，实例化Service对象
        ApplicationContext applicationContext = new org.springframework.context.support.ClassPathXmlApplicationContext("applicotionContext.xml");
        //通过工厂根据配置的实例名称获取实例对象
        UserEntity service2=(UserEntity) applicationContext.getBean("helloService");
        service2.sayHello();
    }
}

