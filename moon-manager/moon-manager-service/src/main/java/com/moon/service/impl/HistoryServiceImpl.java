package com.moon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moon.common.pojo.MoonResult;
import com.moon.mapper.TbHistoryMapper;
import com.moon.pojo.TbHistory;
import com.moon.pojo.TbHistoryExample;
import com.moon.pojo.TbHistoryExample.Criteria;
import com.moon.service.HistoryService;

/*
 * 历史记录Service
 */
@Service
public class HistoryServiceImpl implements HistoryService {

	@Autowired
	private TbHistoryMapper HistoryMapper;
	
	@Override
	public MoonResult getAllHistoryInfor() {
		TbHistoryExample example = new TbHistoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIsNotNull();
		
		List<TbHistory> list = HistoryMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return MoonResult.ok(list);
		}
		return null;
	}

}
