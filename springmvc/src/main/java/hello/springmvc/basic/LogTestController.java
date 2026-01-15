package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Slf4j
@RestController
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest(){

        String name = "Spring";

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        // 만약 출력 에러 단계가 높아서 출력하지 않아도 될 때
        // 위 방식은 계산일 일어나지 않지만, 이 방식은 계신이 일어난다.
        // -> 성능 저하 유발
        log.debug("String concat log=" + name);
        return "ok";
    }
}
