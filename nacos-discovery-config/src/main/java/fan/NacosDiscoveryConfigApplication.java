package fan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Nacos 注册中心及配置中心启动类
 *
 * @author Fan
 * @since 2023/1/13 10:24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosDiscoveryConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryConfigApplication.class, args);
    }
}
