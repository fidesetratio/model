package id.co.sinarmaslife.std.model.vo;

import java.io.Serializable;

/**
 * VO (value object) serbaguna, untuk dropdown select, atau bisa juga untuk lainnya
 * 
 * <p>Saat ini class ini sudah digunakan di :
 * <ul>
 * 	<li>E-Agency</li>
 * 	<li>E-Lions</li>
 * 	<li>E-Policy</li>
 * 	<li>medismart</li>
 * </ul>
 * 
 * @author Yusuf
 * @since Jul 3, 2008 (1:53:09 PM)
 */
public class DropDown implements Serializable {

	private static final long serialVersionUID = -1443071895352555541L;

	/* Variables */
	
	private String key;
	private String value;
	private String desc;

	/* Getter & Setters */
	
	public String getDesc() {return desc;}
	public void setDesc(String desc) {this.desc = desc;}

	public String getKey() {return key;}
	public void setKey(String key) {this.key = key;}

	public String getValue() {return value;}
	public void setValue(String value) {this.value = value;}

	/* Constructors */
	
	public DropDown() {}
	
	public DropDown(String key) {
		this.key = key;
	}

	public DropDown(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public DropDown(String key, String value, String desc) {
		this.key = key;
		this.value = value;
		this.desc = desc;
	}

}