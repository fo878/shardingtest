package lyh.demo.shardingtest.service;

import lyh.demo.shardingtest.domain.DemoSubject;
public interface DemoSubjectService{


    int deleteByPrimaryKey(Integer id);

    int insert(DemoSubject record);

    int insertSelective(DemoSubject record);

    DemoSubject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DemoSubject record);

    int updateByPrimaryKey(DemoSubject record);

}
