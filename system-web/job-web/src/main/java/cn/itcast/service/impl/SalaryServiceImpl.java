package cn.itcast.service.impl;

import java.util.ArrayList;
import java.util.List;

import cn.itcast.pojo.SalaryPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import cn.itcast.mapper.SalaryMapper;
import cn.itcast.service.SalaryService;
@Service
public class SalaryServiceImpl implements SalaryService {
	@Autowired
	private SalaryMapper mapper;
	@Transactional
	public String getSalaryData() {
		List<SalaryPojo> lists = mapper.selectSalary();
		List<String> resultData = new ArrayList<String>();
		for (SalaryPojo salaryPojo : lists) {
			resultData.add(salaryPojo.toString());
		}	
		ObjectMapper om = new ObjectMapper();
		String beanJson = null;
		try {
			beanJson = om.writeValueAsString(resultData);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return beanJson;
	}
}
