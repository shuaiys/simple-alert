package com.galen.alert.core.dao;

import com.galen.alert.core.domain.AlertSendRecordDO;
import com.galen.alert.core.domain.AlertSendRecordDOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlertSendRecordDAO {
    long countByExample(AlertSendRecordDOExample example);

    int deleteByExample(AlertSendRecordDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AlertSendRecordDO record);

    int insertSelective(AlertSendRecordDO record);

    List<AlertSendRecordDO> selectByExample(AlertSendRecordDOExample example);

    AlertSendRecordDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AlertSendRecordDO record, @Param("example") AlertSendRecordDOExample example);

    int updateByExample(@Param("record") AlertSendRecordDO record, @Param("example") AlertSendRecordDOExample example);

    int updateByPrimaryKeySelective(AlertSendRecordDO record);

    int updateByPrimaryKey(AlertSendRecordDO record);
}