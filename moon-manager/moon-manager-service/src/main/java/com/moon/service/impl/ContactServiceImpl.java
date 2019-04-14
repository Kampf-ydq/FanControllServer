package com.moon.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moon.common.pojo.MoonResult;
import com.moon.mapper.TbContactMapper;
import com.moon.pojo.TbContact;
import com.moon.pojo.TbContactExample;
import com.moon.pojo.TbContactExample.Criteria;
import com.moon.service.ContactService;

/*
 * 联系人管理Service
 */
@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private TbContactMapper contactMapper;
	
	@Override
	public MoonResult getAllContact() {
		//返回所有联系人
		TbContactExample example = new TbContactExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIsNotNull();
		
		List<TbContact> list = contactMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return MoonResult.ok(list);
		}
		return MoonResult.ok();
	}

	@Override
	public MoonResult createContact(TbContact contact) {
		//补全Contact对象
		contactMapper.insert(contact);
		return MoonResult.ok();
	}

}
