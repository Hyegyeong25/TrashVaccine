package kopo.poly.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
public class indexController {
    @GetMapping(value = "index")
    public String indexPage() throws Exception {
        log.info(this.getClass().getName() + ".indexPage Start~!!");
        log.info("hi");
        log.info(this.getClass().getName() + ".indexPage End~!!");
        return "index";
    }
}
