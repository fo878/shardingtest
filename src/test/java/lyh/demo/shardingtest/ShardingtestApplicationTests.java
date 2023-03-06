package lyh.demo.shardingtest;

import lyh.demo.shardingtest.domain.DemoSubject;
import lyh.demo.shardingtest.service.DemoSubjectService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingtestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ShardingtestApplicationTests {

    @Autowired
    private DemoSubjectService demoSubjectService;

    @Test
    void contextLoads() {
    }

    @Test
    void test1() {
        DemoSubject demoSubject = demoSubjectService.selectByPrimaryKey(1);
        System.out.println(demoSubject);
    }

    @Test
    void test2() {
        DemoSubject demoSubject = new DemoSubject();
        demoSubject.setId(2);
        demoSubject.setName("数学");
        demoSubject.setScore("100");
        demoSubject.setTeacherid("123");
        demoSubject.setCreatetime(new Date());
        demoSubject.setWeight("0.6");
        demoSubject.setDescription("123");
        demoSubject.setTeachername("数学老师");
        demoSubjectService.insert(demoSubject);
    }

}
