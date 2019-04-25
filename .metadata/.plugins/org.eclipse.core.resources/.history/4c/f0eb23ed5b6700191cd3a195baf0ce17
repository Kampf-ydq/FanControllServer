package com.moon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moon.common.pojo.MoonResult;
import com.moon.mapper.TbParamMapper;
import com.moon.pojo.TbParam;
import com.moon.pojo.TbParamExample;
import com.moon.pojo.TbParamExample.Criteria;
import com.moon.service.FanService;

/*
 * 风机管理Service
 */
@Service
public class FanServiceImpl implements FanService {

	@Autowired
	private TbParamMapper paramMapper;
	
	@Override
	public MoonResult getFanParamByNumber(String number) {
		
		//根据查询条件查询
		TbParamExample example = new TbParamExample();
		Criteria criteria = example.createCriteria();
		criteria.andNumberEqualTo(number);
		
		List<TbParam> list = paramMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return MoonResult.ok(list.get(0));
		}
		return MoonResult.ok();
	}

}
