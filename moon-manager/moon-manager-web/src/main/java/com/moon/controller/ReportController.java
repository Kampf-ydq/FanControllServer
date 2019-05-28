package com.moon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.moon.common.pojo.MoonResult;
import com.moon.service.ReportService;

/*
 * 报表管理Controller
 */
@Controller
public class ReportController {

	@Autowired
	private ReportService reportService;
	
	@RequestMapping("/report/{number}")
	@ResponseBody
	public MoonResult getReportByNumber(@PathVariable String number){
		return reportService.getReport(number);
	}
}
