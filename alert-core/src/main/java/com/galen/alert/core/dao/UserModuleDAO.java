package com.galen.alert.core.dao;

import com.galen.alert.core.domain.UserModuleDO;
import com.galen.alert.core.domain.UserModuleDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserModuleDAO {
    long countByExample(UserModuleDOExample example);

    int deleteByExample(UserModuleDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserModuleDO record);

    int insertSelective(UserModuleDO record);

    List<UserModuleDO> selectByExample(UserModuleDOExample example);

    UserModuleDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserModuleDO record, @Param("example") UserModuleDOExample example);

    int updateByExample(@Param("record") UserModuleDO record, @Param("example") UserModuleDOExample example);

    int updateByPrimaryKeySelective(UserModuleDO record);

    int updateByPrimaryKey(UserModuleDO record);
}