package fan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务 1 启动类
 *
 * @author Fan
 * @since 2023/1/10 16:40
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Provider1Application {
    public static void main( String[] args ) {
        SpringApplication.run(Provider1Application.class, args);
    }
}
