package com.fatou.todo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")

public class TodoController {
	
	@Autowired
TodoService match;
	
	@RequestMapping(value = "/list-todo",method = RequestMethod.GET)
	public String retrieveTodos(ModelMap model) {
		model.addAttribute("todos",match.retrieveTodos("senegal"));
		return "list-todo";
	}
	
	@RequestMapping(value = "/add-todo",method = RequestMethod.GET)
	public String showaddpage() {
		return "todo";
		
	}
	@RequestMapping(value = "/add-todo",method = RequestMethod.POST)
	public String addtodo(ModelMap model, @RequestParam String desc) {
		match.addTodo("senegal", desc, new Date(), false);
		model.clear();
		return "redirect:list-todo";
}
	
	@RequestMapping(value = "/delete-todo",method = RequestMethod.GET)
	public String deletetodo( @RequestParam int id) {
		match.deleteTodo(id);
		return "redirect:list-todo";
}
	
	
	
}