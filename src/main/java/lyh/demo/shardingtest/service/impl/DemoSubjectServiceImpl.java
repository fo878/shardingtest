package lyh.demo.shardingtest.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import lyh.demo.shardingtest.domain.DemoSubject;
import lyh.demo.shardingtest.mapper.DemoSubjectMapper;
import lyh.demo.shardingtest.service.DemoSubjectService;
@Service
public class DemoSubjectServiceImpl implements DemoSubjectService{

    @Resource
    private DemoSubjectMapper demoSubjectMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return demoSubjectMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DemoSubject record) {
        return demoSubjectMapper.insert(record);
    }

    @Override
    public int insertSelective(DemoSubject record) {
        return demoSubjectMapper.insertSelective(record);
    }

    @Override
    public DemoSubject selectByPrimaryKey(Integer id) {
        return demoSubjectMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(DemoSubject record) {
        return demoSubjectMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DemoSubject record) {
        return demoSubjectMapper.updateByPrimaryKey(record);
    }

}
