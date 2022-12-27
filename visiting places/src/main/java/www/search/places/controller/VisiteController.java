package www.search.places.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import www.search.places.entity.VisiteEntity;
import www.search.places.service.VisiteService;

@Component
@RequestMapping("/send")
public class VisiteController {

	@Autowired
	private VisiteService service;
	public VisiteController() {
		System.out.println(getClass().getSimpleName());
	}
	@PostMapping
	public String onSend(VisiteEntity entity,HttpServletRequest req) {
		boolean bool=service.saveAndValidate(entity);
		if(bool) {
			req.setAttribute("meassage", "value are saved");
		}else {
			req.setAttribute("error", "value are not saved");
			req.setAttribute("entity", entity);
		}
		return "index";
	}
	@GetMapping
	public String findByGod(@RequestParam String god,Model model) {
		Optional<List<VisiteEntity>> optionalList= this.service.findByGod(god);
		if(optionalList.isPresent() && optionalList.get().size()>0)
		{
			System.out.println("Data is present ");
			List<VisiteEntity> list=optionalList.get();
			System.out.println("Total List is found"+list.size());
			model.addAttribute("list", list);
			
			return "SearchResult";
		}
		else {
			System.out.println("Data is not present for "+god);
			model.addAttribute("message", "No Results found");
			return "search";
		}
	}
}
