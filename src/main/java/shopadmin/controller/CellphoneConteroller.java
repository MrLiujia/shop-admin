package shopadmin.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shopadmin.model.Cellphone;
import shopadmin.service.CellphoneService;

@Controller
public class CellphoneConteroller {

	private CellphoneService cellphoneService;
	@Autowired
	public CellphoneConteroller(CellphoneService cellphoneService) {
		this.cellphoneService = cellphoneService;
	}

	@RequestMapping(method=RequestMethod.GET, value="/cellphone/cellphone-List")
	public String list(Model model) {
		List<Cellphone> cellphones =  cellphoneService.findAll();
		model.addAttribute("cellphones", cellphones);
		return "cellphone-list";
		
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/cellphone/cellphone-details/{id}")
	public String details(@PathVariable Long id, Model model) {
		Cellphone cellphone = cellphoneService.findOne(id);
	    model.addAttribute("cellphones", cellphone);
	    return "cellphone-details";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/cellphone/add")
	public String add(@ModelAttribute Cellphone cellphone) {
	    return "cellphone-edit";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/cellphone/add")
    public String create(@ModelAttribute @Valid Cellphone cellphone,
    						BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "cellphone-edit";
		}
		
		cellphoneService.create(cellphone);
        return "redirect:/cellphone/cellphone-List";
    }
	
	@RequestMapping(method = RequestMethod.GET, value = "/cellphone-d/{id}")
	public String delete(@PathVariable Integer id) {
		cellphoneService.delete(id);
	    return "redirect:/cellphone/cellphone-List";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/cellphone/{id}/edit")
	public String edit(@PathVariable Long id, Model model) {
		Cellphone cellphone = cellphoneService.findOne(id);
		model.addAttribute("cellphone", cellphone);
		return "cellphone-edit";
	}
	
	 @RequestMapping(method = RequestMethod.POST, value = "/cellphone/{id}/edit")
	    public String update(@ModelAttribute @Valid Cellphone cellphone, 
	                         BindingResult bindingResult) {
	        if (bindingResult.hasErrors()) {
	            return "cellphone-edit";
	        }
	        cellphoneService.update(cellphone);
	        return "redirect:/cellphone/cellphone-List";
	    }
	
}