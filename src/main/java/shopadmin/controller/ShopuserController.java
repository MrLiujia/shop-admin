package shopadmin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shopadmin.model.Shopuser;
import shopadmin.service.ShopuserService;

@Controller
public class ShopuserController {
	private ShopuserService shopuserService;
	
	@Autowired
	 public ShopuserController(ShopuserService shopuserService) {
		this.shopuserService = shopuserService;
	}


	@RequestMapping(method = RequestMethod.GET, value = "/shopusers/")
	    public String list(Model model) {
	        List<Shopuser> shopusers = shopuserService.findAll();
	        model.addAttribute("shopusers", shopusers);
	        return "shopuser-list";
	    }

}
