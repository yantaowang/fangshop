package com.fang.fangshop.web.controller;

import com.fang.fangshop.been.OrdersReport;
import com.fang.fangshop.core.been.SystemSetting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fang.fangshop.services.IOrderService;
import com.fang.fangshop.services.ISystemSettingService;
import com.fang.fangshop.web.framework.BaseController;

@Controller
@RequestMapping("/manage/home")
public class HomeController extends BaseController {
	@Autowired
	private IOrderService orderService;
	@Autowired
	private ISystemSettingService systemSettingService;

	@RequestMapping(value = "index")
	public String Index(ModelMap modelMap) {
		try {
			OrdersReport ordersReport = orderService.getHomeOrders();
			SystemSetting systemSetting = systemSettingService.selectOne(new SystemSetting());
			modelMap.addAttribute("ordersReport", ordersReport);
			modelMap.addAttribute("systemSetting", systemSetting);
		} catch (Exception e) {
		    e.printStackTrace();
		}
		return "manage/system/home";
	}

}
