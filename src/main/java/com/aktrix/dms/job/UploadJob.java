package com.aktrix.dms.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
<<<<<<< Updated upstream
@Component
public class UploadJob {
	@Scheduled(cron="*/10 * * * * *")
	public void getFilesJob() {
		System.out.println("file will be upload for every ten seconds");
	}
=======

@Component
public class UploadJob {
	@Scheduled(cron="*/10 * * * * *")
	public void run() {
		System.out.println("this method will be execute every ten seconds");
	}

>>>>>>> Stashed changes
}
