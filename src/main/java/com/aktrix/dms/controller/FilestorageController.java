package com.aktrix.dms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aktrix.dms.entity.Filestorage;
import com.aktrix.dms.service.FilestorageService;

@RestController
@RequestMapping("/fileStorage")
@Controller
public class FilestorageController {
	@Autowired
	FilestorageService filestorage;
	
	@GetMapping("/")
	public List<Filestorage> getFileStorage() {
		List<Filestorage> list = filestorage.getBfiledata();
		return list;

	}
}
