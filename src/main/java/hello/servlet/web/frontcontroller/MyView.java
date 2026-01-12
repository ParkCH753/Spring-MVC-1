package hello.servlet.web.frontcontroller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.util.Map;

@AllArgsConstructor
public class MyView {

    private String viewPath;

    public void render(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        modelToRequestAttributes(model, request);
        request.getRequestDispatcher(viewPath).forward(request, response);

    }

    public void render(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher(viewPath).forward(request, response);
    }

    private void modelToRequestAttributes(Map<String, Object> model, HttpServletRequest request) {
        // model.forEach((key,value) -> request.setAttribute(key,value));
        model.forEach(request::setAttribute);
    }
}
