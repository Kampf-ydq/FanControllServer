package com.moon.mapper;

import com.moon.pojo.TbParam;
import com.moon.pojo.TbParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbParamMapper {
    int countByExample(TbParamExample example);

    int deleteByExample(TbParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbParam record);

    int insertSelective(TbParam record);

    List<TbParam> selectByExample(TbParamExample example);

    TbParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbParam record, @Param("example") TbParamExample example);

    int updateByExample(@Param("record") TbParam record, @Param("example") TbParamExample example);

    int updateByPrimaryKeySelective(TbParam record);

    int updateByPrimaryKey(TbParam record);
}