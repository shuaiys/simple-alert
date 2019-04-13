package com.galen.alert.core.dao;

import com.galen.alert.core.domain.AlertRuleUserDO;
import com.galen.alert.core.domain.AlertRuleUserDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlertRuleUserDAO {
    long countByExample(AlertRuleUserDOExample example);

    int deleteByExample(AlertRuleUserDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AlertRuleUserDO record);

    int insertSelective(AlertRuleUserDO record);

    List<AlertRuleUserDO> selectByExample(AlertRuleUserDOExample example);

    AlertRuleUserDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AlertRuleUserDO record, @Param("example") AlertRuleUserDOExample example);

    int updateByExample(@Param("record") AlertRuleUserDO record, @Param("example") AlertRuleUserDOExample example);

    int updateByPrimaryKeySelective(AlertRuleUserDO record);

    int updateByPrimaryKey(AlertRuleUserDO record);
}