package com.ekalife.elions.model;

import id.co.sinarmaslife.std.model.vo.DropDown;

import java.io.Serializable;
import java.util.List;

public class CommandUploadBac implements Serializable {

	private static final long serialVersionUID = 297007044580546629L;

	private String spaj;
	
	private List<String> errorMessages;
	

	private String mode;

	private String form;

	private String emailto;

	private String emailcc;

	private String emailsubject;

	private String emailmessage;

	private List<UploadSpaj> daftarSpaj;

	private List<DropDown> daftarStatus;
	
	public List<DropDown> getDaftarStatus() {
		return daftarStatus;
	}

	public void setDaftarStatus(List<DropDown> daftarStatus) {
		this.daftarStatus = daftarStatus;
	}

	public List<String> getErrorMessages() {
		return errorMessages;
	}

	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}

	public List<UploadSpaj> getDaftarSpaj() {
		return daftarSpaj;
	}

	public void setDaftarSpaj(List<UploadSpaj> daftarSpaj) {
		this.daftarSpaj = daftarSpaj;
	}

	public String getSpaj() {
		return spaj;
	}

	public void setSpaj(String spaj) {
		this.spaj = spaj;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	

	public String getEmailcc() {
		return emailcc;
	}

	public void setEmailcc(String emailcc) {
		this.emailcc = emailcc;
	}

	public String getEmailmessage() {
		return emailmessage;
	}

	public void setEmailmessage(String emailmessage) {
		this.emailmessage = emailmessage;
	}

	public String getEmailsubject() {
		return emailsubject;
	}

	public void setEmailsubject(String emailsubject) {
		this.emailsubject = emailsubject;
	}

	public String getEmailto() {
		return emailto;
	}

	public void setEmailto(String emailto) {
		this.emailto = emailto;
	}

}
