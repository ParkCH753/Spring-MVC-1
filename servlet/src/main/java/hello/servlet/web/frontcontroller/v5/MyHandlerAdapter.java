package hello.servlet.web.frontcontroller.v5;

import hello.servlet.web.frontcontroller.ModelView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface MyHandlerAdapter {

    // 어댑터가 해당 컨트롤러를 처리할 수 있는지 판단하는 메서드
    boolean supports(Object handler);

    // 실제 핸들러를 호출하고 결과로 ModelView를 반환
    // V4로 구현을 할 경우 ModelView를 만들어서 반환해줘야 한다.
    ModelView handle (HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException;
}
