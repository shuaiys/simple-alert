package com.galen.alert.core.dao;

import com.galen.alert.core.domain.AlertMsgRecordDO;
import com.galen.alert.core.domain.AlertMsgRecordDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlertMsgRecordDAO {
    long countByExample(AlertMsgRecordDOExample example);

    int deleteByExample(AlertMsgRecordDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AlertMsgRecordDO record);

    int insertSelective(AlertMsgRecordDO record);

    List<AlertMsgRecordDO> selectByExampleWithBLOBs(AlertMsgRecordDOExample example);

    List<AlertMsgRecordDO> selectByExample(AlertMsgRecordDOExample example);

    AlertMsgRecordDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AlertMsgRecordDO record, @Param("example") AlertMsgRecordDOExample example);

    int updateByExampleWithBLOBs(@Param("record") AlertMsgRecordDO record, @Param("example") AlertMsgRecordDOExample example);

    int updateByExample(@Param("record") AlertMsgRecordDO record, @Param("example") AlertMsgRecordDOExample example);

    int updateByPrimaryKeySelective(AlertMsgRecordDO record);

    int updateByPrimaryKeyWithBLOBs(AlertMsgRecordDO record);

    int updateByPrimaryKey(AlertMsgRecordDO record);
}