package com.moon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moon.common.pojo.MoonResult;
import com.moon.mapper.TbUserMapper;
import com.moon.pojo.TbUser;
import com.moon.pojo.TbUserExample;
import com.moon.pojo.TbUserExample.Criteria;
import com.moon.service.UserService;

/*
 * 用户管理Service
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TbUserMapper userMapper;
	@Override
	public MoonResult getUserById(String username) {
		//根据主键查询
		//TUser user = userMapper.selectByPrimaryKey(userId);
		
		//根据查询条件查询
		TbUserExample example = new TbUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<TbUser> list = userMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			TbUser user = list.get(0);
			return MoonResult.ok(user);
		}
		return MoonResult.ok();
	}

}
