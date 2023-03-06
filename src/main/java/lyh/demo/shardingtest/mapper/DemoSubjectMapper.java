package lyh.demo.shardingtest.mapper;

import lyh.demo.shardingtest.domain.DemoSubject;

public interface DemoSubjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DemoSubject record);

    int insertSelective(DemoSubject record);

    DemoSubject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DemoSubject record);

    int updateByPrimaryKey(DemoSubject record);
}