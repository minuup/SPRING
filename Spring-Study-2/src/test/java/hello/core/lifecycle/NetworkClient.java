package hello.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class NetworkClient implements InitializingBean,DisposableBean {
    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출, url = " + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void connect() {
        System.out.println("connect = " + url);
    }

    public void call(String message) {
        System.out.println("call: " + url + " message = " + message);
    }

    //서비스 종료시 호출
    public void disConnect(){
        System.out.println("close " + url);
    }


//
//
    //    1    implements InitializingBean , DisposableBean 인터페이스 상속시에 사용가능
//
    @Override
    public void destroy() throws Exception {
        System.out.println("close " + url);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        connect();
        call("초기화 연결 메세지");
    }
//

        //2
//    public void init() {
//        System.out.println("NetworkClient.init");
//        call("초기화 연결 메세지");
//        connect();
//    }
//
//    public void close() {
//        System.out.println("NetworkClient.close");
//        disConnect();
//    }


    //    3
//    @PostConstruct
//    public void init(){ // 의존관계가 주입이 다 끝나면 작동한다.
//        System.out.println("NetworkClient.init");
//        setUrl("http://hello-spring.dev");
//        connect();
//        call("초기화 연결 메세지");
//    }
//    @PreDestroy
//    public void close() {
//        System.out.println("NetworkClient.close");
//        disConnect();
//    }
}
