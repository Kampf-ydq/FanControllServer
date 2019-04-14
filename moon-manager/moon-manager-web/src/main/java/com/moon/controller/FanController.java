package com.moon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moon.common.pojo.MoonResult;
import com.moon.service.FanService;

/*
 * 风机管理Controller
 */
@Controller
public class FanController {

	@Autowired
	private FanService fanService;
	
	//返回json格式的数据
	@RequestMapping("/fan/{number}")
	@ResponseBody
	public MoonResult getFanParamByNumber(@PathVariable String number)
	{
		return fanService.getFanParamByNumber(number);
	}
}
