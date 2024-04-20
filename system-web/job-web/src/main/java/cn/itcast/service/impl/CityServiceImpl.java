package cn.itcast.service.impl;

import java.util.ArrayList;
import java.util.List;

import cn.itcast.pojo.CityPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import cn.itcast.mapper.CityMapper;
import cn.itcast.service.CityService;

@Service
public class CityServiceImpl implements CityService {	
	@Autowired
	private CityMapper mapper;
	@Transactional
	public String getCityData() {
		List<CityPojo> lists = mapper.selectCity();
		List<String> resultData = new ArrayList<String>();
		for (CityPojo cityPojo : lists) {
			resultData.add(cityPojo.toString());
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
