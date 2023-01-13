package fan.service.impl;

import fan.service.FeignService;
import org.springframework.stereotype.Service;

/**
 * 服务降级 Service
 *
 * @author Fan
 * @since 2023/1/12 13:57
 */
@Service
public class FallbackServiceImpl implements FeignService {

    @Override
    public String get() {
        return "服务调用失败，提示来自：Consumer-OpenFeign";
    }
}
