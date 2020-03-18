package com.capstone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	@Autowired
	private BookService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Book> listBooks = service.listAll();
		model.addAttribute("listBooks", listBooks);
		return "index";
	}
	
	@RequestMapping("/new")
	public String enterNewBookForm(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);		
		return "new_book";	
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveBook(@ModelAttribute("book")Book book) {
		service.save(book);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView editBookForm(@PathVariable(name = "id") Long id) {
		ModelAndView mav = new ModelAndView("edit_book");
		
		Book book = service.get(id);
		mav.addObject("book", book);
		
		return mav;	
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id")Long id) {
		service.delete(id);		
		return "redirect:/";
	}
	
	
}
