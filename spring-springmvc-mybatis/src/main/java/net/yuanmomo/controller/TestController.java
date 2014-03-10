package net.yuanmomo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import net.yuanmomo.bean.TestBean;
import net.yuanmomo.business.TestBusiness;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/result.do")
public class TestController {

	@Resource(name = "testBusiness")
	private TestBusiness testBusiness = null;
	public void setTestBusiness(TestBusiness testBusiness) {
		this.testBusiness = testBusiness;
	}

	@RequestMapping
	public String insert(HttpServletRequest request, ModelMap map){
		try {
			TestBean t=new TestBean();
			t.setNumber(1);
			boolean flag=testBusiness.insert(t);
			if(flag){
				LoggerFactory.getLogger("systemLog").info("插入成功");
				map.put("message","插入成功");
			}else{
				LoggerFactory.getLogger("systemLog").info("插入失败");
				map.put("message","插入失败");
			}
		} catch (Exception e) {
			LoggerFactory.getLogger("systemLog").error("插入异常" + e.getMessage());
			map.put("message","插入异常" + e.getMessage());
			e.printStackTrace();
		}
		return "result";
	}
}
