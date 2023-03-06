package lyh.demo.shardingtest.domain;

import java.util.Date;
import lombok.Data;

/**
    * 课程表
    */
@Data
public class DemoSubject {
    private Integer id;

    /**
    * 课题名称
    */
    private String name;

    /**
    * 教师ID
    */
    private String teacherid;

    /**
    * 教师名称
    */
    private String teachername;

    /**
    * 创建时间
    */
    private Date createtime;

    /**
    * 分数
    */
    private String score;

    /**
    * 权重
    */
    private String weight;

    /**
    * 描述
    */
    private String description;
}