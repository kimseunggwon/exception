# 예외 처리와 오류 페이지 공부

api /server/ Exception(예외) / 오류 / 스프링 타입 컨버터 공부하기 

# 개발 환경 및 기술
- Intellij IDEA Ultimate 
- Java 17
- Spring Boot 3.0.4
- validation
- thymeleaf

-서블릿 예외 처리 
- 오류 화면 제공 페이지 등록
- 필터
- 인터셉터

-오류페이지 작동 흐름
- WAS `/error-page/500` 다시 요청 -> 필터 -> 서블릿 -> 인터셉터 -> 컨트롤러(/error-page/ 500) -> View

-스프링부트 오류페이지
- WebServerCustomizer 사용해 에러 페이지 만들기 
- 스프링 부트가 제공하는 BasicErrorController 는 HTML 페이지를 제공하는 경우에는 매우 편리하다. 4xx, 5xx 등등 모두 잘 처리해준다.

-API 예외 처리
- API 예외 = @ExceptionHandle,@ControllerAdvice 조합하여 예외처리

-타입 컨버터
