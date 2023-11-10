package com.aktrix.dms.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class UploadJob {
	@Scheduled(cron="*/10 * * * * *")
	public void getFilesJob() {
		System.out.println("file will be upload for every ten seconds");
	}

}
