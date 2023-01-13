package fan.service;

/**
 * Hystrix 接口
 *
 * @author Fan
 * @since 2023/1/12 9:34
 */
public interface HystrixService {

    /**
     * 正常接口
     *
     * @return {@link String}
     * @author Fan
     * @since 2023/1/12 9:34
     */
    String normal();

    /**
     * 超时接口
     *
     * @return {@link String}
     * @author Fan
     * @since 2023/1/12 9:35
     */
    String timeout();
}
