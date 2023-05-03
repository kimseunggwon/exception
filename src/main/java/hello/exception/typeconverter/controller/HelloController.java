package hello.exception.typeconverter.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

    /**   HTTP 요청 파라미터는 모두 문자로 처리된다
     */
    @GetMapping
    public String helloV1(HttpServletRequest request) {
        String data = request.getParameter("data");  // 문자 타입으로 조회
        Integer intValue = Integer.valueOf(data); // 숫자 타입으로 변경

        System.out.println("data = " + data);
        System.out.println("intValue = " + intValue);

        return "ok";
    }

    /**   HTTP 쿼리 스트링으로 전달하는 data=10 부분에서 10은 숫자 10이 아니라 문자 10이다
     *    @RequestParam 을 사용하면 이 문자 10을 Integer 타입의 숫자 10으로 받을 수 있다
     */
    @GetMapping("/hello-v2")
    public String helloV2(@RequestParam Integer data) {

        System.out.println("data = " + data);
        return "ok";
    }




}









