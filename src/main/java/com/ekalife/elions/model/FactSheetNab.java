package com.ekalife.elions.model;

import java.io.Serializable;


/**
 * @author : daru
 * 
 * 
 * @since : Dec 17, 2012
 */
public class FactSheetNab implements Serializable {

	/**
	 * 
	 * @author : daru
	 * @since : Dec 17, 2012
	 */
	private static final long serialVersionUID = 3995136268947245342L;
	private String id;
	private String jenis;
	private String tahun;
	private String bulan;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getJenis() {
		return jenis;
	}
	
	public void setJenis(String jenis) {
		this.jenis = jenis;
	}
	

	public String getTahun() {
		return tahun;
	}

	public void setTahun(String tahun) {
		this.tahun = tahun;
	}

	public String getBulan() {
		return bulan;
	}

	public void setBulan(String bulan) {
		this.bulan = bulan;
	}
	
	

}
