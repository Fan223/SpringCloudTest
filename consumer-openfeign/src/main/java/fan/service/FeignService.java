package fan.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 消费者接口
 *
 * @author Fan
 * @since 2023/1/11 15:32
 */
@FeignClient("provider")
public interface FeignService {

    /**
     * 远程调用 get() 方法
     *
     * @return {@link String}
     * @author Fan
     * @since 2023/1/11 17:09
     */
    @GetMapping("/user/get")
    String get();
}
