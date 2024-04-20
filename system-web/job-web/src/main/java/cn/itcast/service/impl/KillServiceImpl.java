package cn.itcast.service.impl;

import java.util.ArrayList;
import java.util.List;

import cn.itcast.pojo.KillPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import cn.itcast.mapper.KillMapper;
import cn.itcast.service.KillService;
@Service
public class KillServiceImpl implements KillService {
	@Autowired
	private KillMapper mapper;
	@Transactional
	public String getKillData() {
		List<KillPojo> lists = mapper.selectKill();
		List<String> resultData = new ArrayList<String>();
		for (KillPojo killPojo : lists) {
			resultData.add(killPojo.toString());
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
