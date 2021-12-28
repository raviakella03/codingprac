package org.ravi.codingprac.controllerimpl;

import lombok.extern.slf4j.Slf4j;
import org.ravi.codingprac.controller.AlgoExpertController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/algo-expert")
@Slf4j
public class AlgoExpertControllerImpl implements AlgoExpertController {

    @GetMapping("/{question}")
    public String workWithAlgoExpertCode(@PathVariable String question) {
        log.info("workWithAlgoExpertCode " + question);
        return question;
    }

    @GetMapping("/prod")
    public @ResponseBody String callProdService() {
        return "callProdService";
    }
}