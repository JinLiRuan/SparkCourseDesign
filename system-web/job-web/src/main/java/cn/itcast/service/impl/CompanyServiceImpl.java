package cn.itcast.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import cn.itcast.mapper.CompanyMapper;
import cn.itcast.pojo.CompanyPojo;
import cn.itcast.service.CompanyService;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyMapper mapper;
	@Transactional
	public String getCompanyData(){
		
		List<CompanyPojo> lists = mapper.selectCompany();
		List<String> resultData = new ArrayList<String>();
		for (CompanyPojo companyPojo : lists) {
			resultData.add(companyPojo.toString());
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
