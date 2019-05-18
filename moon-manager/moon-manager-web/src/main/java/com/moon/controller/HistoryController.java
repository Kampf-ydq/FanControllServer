package com.moon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moon.common.pojo.MoonResult;
import com.moon.service.HistoryService;

/*
 * 历史记录Controller
 */
@Controller
public class HistoryController {

	@Autowired
	private HistoryService historyService;
	
	@RequestMapping("/history")
	@ResponseBody
	public MoonResult getAllHistoryInfor(){
		if (historyService.getAllHistoryInfor() == null) {
			return MoonResult.ok();
		}else {
			return historyService.getAllHistoryInfor();
		}
	}
}
