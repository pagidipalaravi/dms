package com.aktrix.dms.service;

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
		byte[] ayteArray = filestorage.get().getBfiledata();
		//TODO convert byte[] to file
	}
	public void uploadFile(Long did) {
		Filestorage filestorage = null;
		filestorageRepository.save(filestorage);
	}
}
