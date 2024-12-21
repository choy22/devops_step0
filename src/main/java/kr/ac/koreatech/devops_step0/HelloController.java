package kr.ac.koreatech.devops_step0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class HelloController {
    
    @GetMapping("/")
    public String index() {
        log.info("helloController 실행");  
        return "index.html";
    }
    
}
