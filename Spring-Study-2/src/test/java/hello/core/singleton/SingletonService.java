package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();
    //자기 자신을 내부에 static으로 선언
    //객체 생성후 static영역의 instance를 초기화후 instance에 new SingletonService 저장

    public static SingletonService getInstance() {
        return instance; // getInstance() 로만 instance 호출가능! 이미 생성된 SingletonService를 불러온다 이제
    }

    private SingletonService(){
        //보안 : 외부에서 new SingletonService() 를 생성못하도록 오로지 하나의 객체만을 갖기위해서
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
