package com.ekalife.elions.model;

import java.io.Serializable;
import java.util.List;

public class CommandUploadUw implements Serializable {
	private static final long serialVersionUID = 297007044580546629L;
	
	private List<String> errorMessages;
	
	private List<Icd> daftarStatus;
	
	public List<String> getErrorMessages() {
		return errorMessages;
	}
	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}
	
	public List<Icd> getDaftarStatus() {
		return daftarStatus;
	}
	public void setDaftarStatus(List<Icd> daftarStatus) {
		this.daftarStatus = daftarStatus;
	}

}
