package fan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户 Controller
 *
 * @author Fan
 * @since 2023/1/10 16:43
 */
@RestController
public class UserController {

    @GetMapping("/user/get")
    public String get() {
        return "provider-1 user get";
    }

    @GetMapping("/test")
    public String test() {
        return "provider-1 test";
    }
}
