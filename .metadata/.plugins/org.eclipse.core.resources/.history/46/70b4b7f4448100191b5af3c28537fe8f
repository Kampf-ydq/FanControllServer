package com.moon.mapper;

import com.moon.pojo.TbContact;
import com.moon.pojo.TbContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbContactMapper {
    int countByExample(TbContactExample example);

    int deleteByExample(TbContactExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbContact record);

    int insertSelective(TbContact record);

    List<TbContact> selectByExample(TbContactExample example);

    TbContact selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbContact record, @Param("example") TbContactExample example);

    int updateByExample(@Param("record") TbContact record, @Param("example") TbContactExample example);

    int updateByPrimaryKeySelective(TbContact record);

    int updateByPrimaryKey(TbContact record);
}