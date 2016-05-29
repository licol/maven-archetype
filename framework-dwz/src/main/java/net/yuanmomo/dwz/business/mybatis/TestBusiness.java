package net.yuanmomo.dwz.business.mybatis;

import java.util.ArrayList;
import java.util.List;
import net.yuanmomo.dwz.bean.Test;
import net.yuanmomo.dwz.bean.TestParam;
import net.yuanmomo.dwz.mybatis.mapper.TestMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestBusiness {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table test
     *
     * @mbggenerated
     */
    private static Logger logger = LoggerFactory.getLogger(TestBusiness.class);

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table test
     *
     * @mbggenerated
     */
    @Autowired 
    private TestMapper testMapper;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated
     */
    @Transactional(propagation=Propagation.REQUIRED,isolation =Isolation.REPEATABLE_READ, rollbackFor = Exception.class)
    public int insertSelective(Test obj) throws Exception {
        if(obj  == null ){
            return 0;
        }
        return testMapper.insertSelective(obj);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated
     */
    @Transactional(propagation=Propagation.REQUIRED,isolation =Isolation.REPEATABLE_READ, rollbackFor = Exception.class)
    public int insertSelective(List<Test> list) throws Exception {
        int insertCount = 0;
        if (list == null || list.size() == 0) {
            return insertCount;
        }
        for (Test  obj : list) {
            if (obj == null) {
                continue;
            }
            try {
                insertCount += this.testMapper.insertSelective(obj);
            } catch (Exception e) {
                throw e;
            }
        }
        return insertCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated
     */
    public Test getTestByKey(Long key) throws Exception {
        return this.testMapper.selectByPrimaryKey(key);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated
     */
    @Transactional(propagation=Propagation.REQUIRED,isolation =Isolation.REPEATABLE_READ, rollbackFor = Exception.class)
    public int update(Test obj) throws Exception {
        if(obj  == null ){
            return 0;
        }
        return this.testMapper.updateByPrimaryKeySelective(obj);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated
     */
    @Transactional(propagation=Propagation.REQUIRED,isolation =Isolation.REPEATABLE_READ, rollbackFor = Exception.class)
    public int update(List<Test> list) throws Exception {
        int updateCount = 0;
        if (list == null || list.size() == 0) {
            return updateCount;
        }
        for (Test  obj : list) {
            if (obj == null || obj.getId() == null || obj.getId() <= 0 ) {
                continue;
            }
            try {
                updateCount += this.testMapper.updateByPrimaryKeySelective(obj);
            } catch (Exception e) {
                throw e;
            }
        }
        return updateCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated
     */
    public List<Test> selectTestList(TestParam param) throws Exception {
        return this.testMapper.selectByExample(param);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated
     */
    public int countTestList(TestParam param) throws Exception {
        return this.testMapper.countByExample(param);
    }
}