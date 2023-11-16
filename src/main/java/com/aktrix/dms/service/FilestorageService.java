package com.aktrix.dms.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aktrix.dms.entity.Filestorage;
import com.aktrix.dms.repo.FilestorageRepository;

@Service
public class FilestorageService {
	@Autowired
	FilestorageRepository filestorageRepository;
	public void downloadFile(Long did) {
		Optional<Filestorage> filestorage= filestorageRepository.findById(did);
		byte[] byteArray = filestorage.get().getBfiledata();
		//TODO convert byte[] to file
	}
	
	public boolean upload(File file) throws IOException {
		Filestorage filestorage = new Filestorage();
		filestorage.setDid(1223L);
		filestorage.setDrenditionid("primaryFile"); // webViewableFile // rendition:T
		Long millis = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(millis);
		filestorage.setDlastmodified(date);
		filestorage.setDfilesize(file.length());
		filestorage.setDisdeleted("N");
		byte[] byteFile = Files.readAllBytes(file.toPath());
		filestorage.setBfiledata(byteFile);
		filestorageRepository.save(filestorage);
		return true;
	}
	public List<Filestorage> getBfiledata() {
		return null;
	}
}
