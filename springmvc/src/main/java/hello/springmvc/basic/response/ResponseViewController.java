package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
class ResponseViewController {

    /**
     * 뷰를 직접 만들어 호출하는 형식
     */
    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1() {
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "hello!");

        return mav;
    }

    /**
     * @ResponseBody가 없으면 `response/hello`로 뷰 리졸버가 실행된다.
     * -> templates/response/hello.html 실행
     * @ResponseBody가 있으면 `response/hello`그대로 HTTP body에 들어간다.
      */
    @RequestMapping("/response-view-v2")
    public String responseViewV2(Model model) {
        model.addAttribute("data", "hello!");
        return "response/hello";
    }

    /**
     * void를 반환하는 경우 HTTP 메시지 바디를 처리하는 파라미터가 없으면
     * 요청 URL을 참고해서 논리 뷰 이름으로 사용한다.
     */
    @RequestMapping("/response/hello")
    public void responseViewV3(Model model) {
        model.addAttribute("data", "hello!");
    }
}
