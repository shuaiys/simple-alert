package com.galen.alert.core.dao;

import com.galen.alert.core.domain.AlertRuleDO;
import com.galen.alert.core.domain.AlertRuleDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlertRuleDAO {
    long countByExample(AlertRuleDOExample example);

    int deleteByExample(AlertRuleDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AlertRuleDO record);

    int insertSelective(AlertRuleDO record);

    List<AlertRuleDO> selectByExampleWithBLOBs(AlertRuleDOExample example);

    List<AlertRuleDO> selectByExample(AlertRuleDOExample example);

    AlertRuleDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AlertRuleDO record, @Param("example") AlertRuleDOExample example);

    int updateByExampleWithBLOBs(@Param("record") AlertRuleDO record, @Param("example") AlertRuleDOExample example);

    int updateByExample(@Param("record") AlertRuleDO record, @Param("example") AlertRuleDOExample example);

    int updateByPrimaryKeySelective(AlertRuleDO record);

    int updateByPrimaryKeyWithBLOBs(AlertRuleDO record);

    int updateByPrimaryKey(AlertRuleDO record);
}