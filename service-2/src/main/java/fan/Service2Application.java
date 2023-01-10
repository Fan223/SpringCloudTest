package fan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务2启动类
 *
 * @author Fan
 * @since 2023/1/10 16:40
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Service2Application {
    public static void main( String[] args ) {
        SpringApplication.run(Service2Application.class, args);
    }
}
