package lyh.demo.shardingtest;

import lyh.demo.shardingtest.service.ExampleService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingtestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ShardingtestApplicationTests {

    @Autowired
    private ExampleService exampleService;

    @Test
    void contextLoads() {
    }


    @Test
    void test3() throws SQLException {
        exampleService.run();
    }
}
