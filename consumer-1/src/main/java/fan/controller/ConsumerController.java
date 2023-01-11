package fan.controller;

import fan.service.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 消费者 Controller
 *
 * @author Fan
 * @since 2023/1/11 15:30
 */
@RestController
public class ConsumerController {

    @Resource
    private FeignService consumerService;

    @GetMapping("/user/get")
    public String get() {
        return consumerService.get();
    }

    @GetMapping("/test")
    public String test() {
        return "consumer-1 test";
    }
}
