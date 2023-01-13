package fan.controller;

import fan.service.HystrixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Hystrix Controller
 *
 * @author Fan
 * @since 2023/1/12 9:35
 */
@RestController
public class HystrixController {

    @Resource
    private HystrixService hystrixService;

    @GetMapping("/normal")
    public String normal() {
        return hystrixService.normal();
    }

    @GetMapping("/timeout")
    public String timeout() {
        return hystrixService.timeout();
    }
}
