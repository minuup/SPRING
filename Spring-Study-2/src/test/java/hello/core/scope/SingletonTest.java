package hello.core.scope;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SingletonTest {

    @Test
    void singletonBeanTest(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        AppConfig singletonBean1 = ac.getBean(AppConfig.class);
        AppConfig singletonBean2 = ac.getBean(AppConfig.class);
        System.out.println("SingletonBean1 = " + singletonBean1.memberRepository());
        System.out.println("SingletonBean2 = " + singletonBean2.memberRepository());
        Assertions.assertThat(singletonBean1.memberRepository()).isSameAs(singletonBean2.memberRepository());

        ac.close();
    }

//    @Scope("singleton")
//    static class SingletonBean{
//
//        @PostConstruct
//        public void init(){
//            System.out.println("SingletonBean.init");
//        }
//
//        @PreDestroy
//        public void destroy(){
//            System.out.println("SingletonBean.destroy");
//        }
//    }
}
