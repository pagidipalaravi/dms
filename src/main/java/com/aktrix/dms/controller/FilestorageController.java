package com.aktrix.dms.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.aktrix.dms.entity.Filestorage;
import com.aktrix.dms.service.FilestorageService;

@RestController
@RequestMapping("/fileStorage")
@Controller
public class FilestorageController {
	@Autowired
	FilestorageService filestorage;
	
	@GetMapping("/download")
	public List<Filestorage> download() {
		List<Filestorage> list = filestorage.getBfiledata();
		return list;

	}
	@PostMapping("/upload")
	public boolean upload(@RequestParam("multipartFile") MultipartFile file) throws IOException {
		boolean isUpladed = filestorage.upload(new File(file.getOriginalFilename()));
		return isUpladed;

	}
}
