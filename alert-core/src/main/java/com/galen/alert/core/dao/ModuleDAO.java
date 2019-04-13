package com.galen.alert.core.dao;

import com.galen.alert.core.domain.ModuleDO;
import com.galen.alert.core.domain.ModuleDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ModuleDAO {
    long countByExample(ModuleDOExample example);

    int deleteByExample(ModuleDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ModuleDO record);

    int insertSelective(ModuleDO record);

    List<ModuleDO> selectByExample(ModuleDOExample example);

    ModuleDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ModuleDO record, @Param("example") ModuleDOExample example);

    int updateByExample(@Param("record") ModuleDO record, @Param("example") ModuleDOExample example);

    int updateByPrimaryKeySelective(ModuleDO record);

    int updateByPrimaryKey(ModuleDO record);
}