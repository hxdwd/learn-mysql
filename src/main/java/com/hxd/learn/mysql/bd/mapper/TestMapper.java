package com.hxd.learn.mysql.bd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hxd.learn.mysql.bd.model.TestDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * bd.model.TestDO
 *
 * @author huangxiaodong
 * @date 2021/3/31  11:44
 */
public interface TestMapper extends BaseMapper<TestDO> {

    /**
     * 查询by name
     *
     * @param name /
     * @return /
     */
    List<TestDO> selectByName(@Param("name") String name);

    /**
     * 插入
     *
     * @param testDO /
     * @return /
     */
    int insertSelective(TestDO testDO);


}
