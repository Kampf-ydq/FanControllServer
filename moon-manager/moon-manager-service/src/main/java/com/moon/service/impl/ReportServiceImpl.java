package com.moon.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moon.common.pojo.MoonResult;
import com.moon.mapper.TbReportMapper;
import com.moon.pojo.TbReport;
import com.moon.pojo.TbReportExample;
import com.moon.pojo.TbReportExample.Criteria;
import com.moon.service.ReportService;

/*
 * 风机报表Service
 */
@Service
public class ReportServiceImpl implements ReportService {

	@Autowired
	private TbReportMapper reportMapper;
	
	@Override
	public MoonResult getReport(String number) {
		
		TbReportExample example = new TbReportExample();
		Criteria criteria = example.createCriteria();
		criteria.andNumberEqualTo(number);
		
		List<TbReport> list = reportMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return MoonResult.ok(list);
		}
		
		return null;
	}

}
