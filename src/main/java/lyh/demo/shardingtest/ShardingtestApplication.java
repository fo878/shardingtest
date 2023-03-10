package lyh.demo.shardingtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"lyh.demo.shardingtest.**.mapper","lyh.demo.shardingtest.repository"})
public class ShardingtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingtestApplication.class, args);
    }

}
