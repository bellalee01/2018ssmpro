package sdu.edu.store.entity;
//+---------------+-------------+------+-----+---------+----------------+
//| Field         | Type        | Null | Key | Default | Extra          |
//+---------------+-------------+------+-----+---------+----------------+
//| id            | int(11)     | NO   | PRI | NULL    | auto_increment |
//| province_code | varchar(6)  | YES  |     | NULL    |                |
//| city_code     | varchar(6)  | YES  |     | NULL    |                |
//| city_name     | varchar(16) | YES  |     | NULL    |                |
//+---------------+-------------+------+-----+---------+----------------+

public class Provinces {
	private Integer provinceId;
	private String province_code;
	private String city_code;
	private String city_name;
	public Provinces() {
		super();
	}
	public Provinces(Integer provinceId, String province_code, String city_code, String city_name) {
		super();
		this.provinceId = provinceId;
		this.province_code = province_code;
		this.city_code = city_code;
		this.city_name = city_name;
	}
	@Override
	public String toString() {
		return "Provinces [provinceId=" + provinceId + ", province_code=" + province_code + ", city_code=" + city_code
				+ ", city_name=" + city_name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city_code == null) ? 0 : city_code.hashCode());
		result = prime * result + ((city_name == null) ? 0 : city_name.hashCode());
		result = prime * result + ((provinceId == null) ? 0 : provinceId.hashCode());
		result = prime * result + ((province_code == null) ? 0 : province_code.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Provinces other = (Provinces) obj;
		if (city_code == null) {
			if (other.city_code != null)
				return false;
		} else if (!city_code.equals(other.city_code))
			return false;
		if (city_name == null) {
			if (other.city_name != null)
				return false;
		} else if (!city_name.equals(other.city_name))
			return false;
		if (provinceId == null) {
			if (other.provinceId != null)
				return false;
		} else if (!provinceId.equals(other.provinceId))
			return false;
		if (province_code == null) {
			if (other.province_code != null)
				return false;
		} else if (!province_code.equals(other.province_code))
			return false;
		return true;
	}
	public Integer getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
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
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	
	
}
