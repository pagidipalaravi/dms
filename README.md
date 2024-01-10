# dms
 
DMS Project
There are few processes in document system.
Inflow/Inbound:
	manual uploading - Uploading is done by end user.
	scheduled job uploading - Uploading the documents automatically after 
			certain time interval.
	FTP(local server) - Uploading documents from local machine to local server.
	Email(required email APIs) - Used to send mails
	Scanner - Uses to Scan documents.
	invoices - Create invoices and its uploads.
	bills - It behaves same has invoices. Creates and uploads the bill.
--
Outflow/Outbound:download
	FTP - Downloading documents from local server to local machine.	
	scheduled job downloading - Downloading the documents automatically after 
			certain time interval.
	Email - Downloading particular documents (like resumes etc) from received 
			emails.
--
Search:
	It is used for searching the documents and save over time to.	
--
Workflow approvals
	If every detail is correct then the workflow gives approvals.
--
Workflow rejections
	If any detail is not correct then the workflow gives rejection.
--
Archiving - moving(main to backend/archiving server).
	If the storage is full or unused users or documents are sent main server to
	archiving server.
	Mainly unactive documents are sent.
--
Purging - deleting
	The documents stored in the archiving server are deletes permanently after 
	few years If they are unused.
