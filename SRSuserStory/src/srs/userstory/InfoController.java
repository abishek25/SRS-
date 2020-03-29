package srs.userstory;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/information")
public class InfoController {
	@RequestMapping("/show")
	public String showForm(Model theModel)
	{
		info theinfo=new info();
		theModel.addAttribute("info",theinfo);
		
		return "tvmInfo";
		
	}
@RequestMapping("/processForm")
public String processform(
		@Valid @ModelAttribute("info") info theinfo, BindingResult theBindingResult)
{
	if (theBindingResult.hasErrors())
	{
		return "tvmInfo";
	}
	else
	{
	return"confirmation";
}
}
}