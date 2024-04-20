package cn.itcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.itcast.service.CityService;
import cn.itcast.service.CompanyService;
import cn.itcast.service.KillService;
import cn.itcast.service.SalaryService;

@Controller
public class IndexController {
	@Autowired
	private CityService cityService;
	@Autowired
	private SalaryService salaryService;
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping("/index")
	public String showIndex() {
		return "/index.jsp";
	}
	
	@RequestMapping(value = "/city", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String getCity() {
		String data = cityService.getCityData();
		return data;
	}
	@RequestMapping(value = "/salary", 
			produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String getSalary() {
		String data = salaryService.getSalaryData();
		return data;
	}
	@RequestMapping(value = "/company",
			produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String getCompany() {
		String data = companyService.getCompanyData();
		return data;
	}
	@Autowired
	private KillService killService;
	@RequestMapping(value = "/kill",
			produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String getKill() {
		String data = killService.getKillData();
		return data;
	}
}
