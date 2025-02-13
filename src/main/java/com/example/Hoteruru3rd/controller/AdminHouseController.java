package com.example.Hoteruru3rd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Hoteruru3rd.entity.House;
import com.example.Hoteruru3rd.form.HouseRegisterForm;

@Controller
@RequestMapping("/admin/houses")
public class AdminHouseController {
	//======== 中略 ======== 
	@GetMapping("/{id}")
	public String show(@PathVariable(name = "id") Integer id, Model model) {
		House house = houseRepository.getReferenceById(id);
		model.addAttribute("house", house);
		return "admin/houses/show";
	}

	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("houseRegisterForm", new HouseRegisterForm());
		return "admin/houses/register";
	}
}
//12.4