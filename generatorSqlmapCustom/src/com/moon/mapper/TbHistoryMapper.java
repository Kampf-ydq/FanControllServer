package com.moon.mapper;

import com.moon.pojo.TbHistory;
import com.moon.pojo.TbHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbHistoryMapper {
    int countByExample(TbHistoryExample example);

    int deleteByExample(TbHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbHistory record);

    int insertSelective(TbHistory record);

    List<TbHistory> selectByExample(TbHistoryExample example);

    TbHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbHistory record, @Param("example") TbHistoryExample example);

    int updateByExample(@Param("record") TbHistory record, @Param("example") TbHistoryExample example);

    int updateByPrimaryKeySelective(TbHistory record);

    int updateByPrimaryKey(TbHistory record);
}