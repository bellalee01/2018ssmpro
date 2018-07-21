package sdu.edu.store.entity;

import java.io.Serializable;

public class IdList implements Serializable{
	private static final long serialVersionUID = 3337367706708711537L;
	private String province_code;
	private String city_code;
	private String area_code;
	public IdList() {
		super();
	}
	public IdList(String province_code, String city_code, String area_code) {
		super();
		this.province_code = province_code;
		this.city_code = city_code;
		this.area_code = area_code;
	}
	@Override
	public String toString() {
		return "IdList [province_code=" + province_code + ", city_code=" + city_code + ", area_code=" + area_code + "]";
	}
	public String getProvince_code() {
		return province_code;
	}
	public void setProvince_code(String province_code) {
		this.province_code = province_code;
	}
	public String getCity_code() {
		return city_code;
	}
	public void setCity_code(String city_code) {
		this.city_code = city_code;
	}
	public String getArea_code() {
		return area_code;
	}
	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
