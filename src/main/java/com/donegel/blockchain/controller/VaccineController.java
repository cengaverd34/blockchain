package com.donegel.blockchain.controller;

import com.donegel.blockchain.Blockchain;
import com.donegel.blockchain.service.VaccineCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class VaccineController {

	@Autowired
	VaccineCountService service;

	@PostMapping("/vaccine")
	public Blockchain count(@RequestParam(required = false) String vaccineWords) {
		List<String> wordList = Arrays.asList(vaccineWords.split("\\|"));
		return (Blockchain) service.getCount(wordList);
	}

}