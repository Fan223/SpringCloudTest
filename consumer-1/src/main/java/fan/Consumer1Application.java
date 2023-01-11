package fan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 消费者 1 启动类
 *
 * @author Fan
 * @since 2023/1/11 15:28
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class Consumer1Application {
    public static void main( String[] args ) {
        SpringApplication.run(Consumer1Application.class, args);
    }
}
