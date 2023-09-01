package hello.core.member;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("문광훈");

        String name = helloLombok.getName();
        System.out.println("helloLombok = " + helloLombok);
    }
}
