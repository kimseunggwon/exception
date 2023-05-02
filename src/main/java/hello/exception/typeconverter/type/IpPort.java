package hello.exception.typeconverter.type;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *    equals :  두 객체의 내용이 같은지, 동등성(equality) 를 비교하는 연산자
 *    hashCode : 두 객체가 같은 객체인지, 동일성(identity) 를 비교하는 연산자
 *    @EqualsAndHashCode어노테이션을 사용하면 자동으로 이 메소드를 생성할 수 있다.
 *    @EqualsAndHashCode(callSuper = true)로 설정시 부모 클래스 필드 값들도 동일한지 체크하며, false(기본값)일 경우 자신 클래스의 필드 값만 고려한다.
 */
@Getter
@EqualsAndHashCode
public class IpPort {

    private String ip;
    private int port;

    public IpPort(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
}
