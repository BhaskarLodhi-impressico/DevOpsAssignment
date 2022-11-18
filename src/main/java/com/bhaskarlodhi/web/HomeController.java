package com.bhaskarlodhi.web;

import com.bhaskarlodhi.model.FibonacciSeries;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HomeController
{
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@PostMapping("/")
	public String fibonacci(@ModelAttribute("series")  FibonacciSeries fibonacciSeries, Model model)
	{
		model.addAttribute("series", fibonacciSeries);
		int firstNumber = fibonacciSeries.getFirstNumber();
		int secondNumber = fibonacciSeries.getSecondNumber();
		List<Integer> list = new ArrayList<>();
		list.add(firstNumber);
		list.add(secondNumber);
		for(int i=0; i < 8; i++)
		{
			int nextNumber = firstNumber + secondNumber;
			list.add(nextNumber);
			firstNumber = secondNumber;
			secondNumber = nextNumber;
		}
		System.out.println(list);
		model.addAttribute("result",list.toString());
		return "index";
	}

}
