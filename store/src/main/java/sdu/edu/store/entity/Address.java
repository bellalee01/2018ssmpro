package sdu.edu.store.entity;

import java.io.Serializable;
import java.util.Date;

//+---------------+-------------+------+-----+---------+----------------+
//| Field         | Type        | Null | Key | Default | Extra          |
//+---------------+-------------+------+-----+---------+----------------+
//| id            | int(11)     | NO   | PRI | NULL    | auto_increment |
//| uid           | int(11)     | NO   |     | NULL    |                |
//| recv_name     | varchar(50) | NO   |     | NULL    |                |
//| recv_province | varchar(6)  | NO   |     | NULL    |                |
//| recv_city     | varchar(6)  | NO   |     | NULL    |                |
//| recv_area     | varchar(6)  | NO   |     | NULL    |                |
//| recv_district | varchar(50) | NO   |     | NULL    |                |
//| recv_addr     | varchar(50) | NO   |     | NULL    |                |
//| recv_phone    | varchar(32) | NO   |     | NULL    |                |
//| recv_tel      | varchar(32) | YES  |     | NULL    |                |
//| recv_zip      | varchar(6)  | YES  |     | NULL    |                |
//| recv_tag      | varchar(6)  | YES  |     | NULL    |                |
//| is_default    | int(11)     | YES  |     | NULL    |                |
//| created_user  | varchar(50) | YES  |     | NULL    |                |
//| created_time  | datetime    | YES  |     | NULL    |                |
//| modified_user | varchar(50) | YES  |     | NULL    |                |
//| modified_time | datetime    | YES  |     | NULL    |                |
//+---------------+-------------+------+-----+---------+----------------+
public class Address implements Serializable{
	
	private static final long serialVersionUID = -6147482980211031221L;
	private Integer id;
	private Integer uid;
	private String recv_name;
	private String recv_province;
	private String recv_city;
	private String recv_area;
	private String recv_district;
	private String recv_addr;
	private String recv_phone;
	private String recv_tel;
	private String recv_zip;
	private String recv_tag;
	private Integer is_default;
	private String created_user;
	private Date created_time;
	private String modified_user;
	private Date modified_time;
	public Address() {
		super();
	}
	public Address(Integer id, Integer uid, String recv_name, String recv_province, String recv_city, String recv_area,
			String recv_district, String recv_addr, String recv_phone, String recv_tel, String recv_zip,
			String recv_tag, Integer is_default, String created_user, Date created_time, String modified_user,
			Date modified_time) {
		super();
		this.id = id;
		this.uid = uid;
		this.recv_name = recv_name;
		this.recv_province = recv_province;
		this.recv_city = recv_city;
		this.recv_area = recv_area;
		this.recv_district = recv_district;
		this.recv_addr = recv_addr;
		this.recv_phone = recv_phone;
		this.recv_tel = recv_tel;
		this.recv_zip = recv_zip;
		this.recv_tag = recv_tag;
		this.is_default = is_default;
		this.created_user = created_user;
		this.created_time = created_time;
		this.modified_user = modified_user;
		this.modified_time = modified_time;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", uid=" + uid + ", recv_name=" + recv_name + ", recv_province=" + recv_province
				+ ", recv_city=" + recv_city + ", recv_area=" + recv_area + ", recv_district=" + recv_district
				+ ", recv_addr=" + recv_addr + ", recv_phone=" + recv_phone + ", recv_tel=" + recv_tel + ", recv_zip="
				+ recv_zip + ", recv_tag=" + recv_tag + ", is_default=" + is_default + ", created_user=" + created_user
				+ ", created_time=" + created_time + ", modified_user=" + modified_user + ", modified_time="
				+ modified_time + "]";
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getRecv_name() {
		return recv_name;
	}
	public void setRecv_name(String recv_name) {
		this.recv_name = recv_name;
	}
	public String getRecv_province() {
		return recv_province;
	}
	public void setRecv_province(String recv_province) {
		this.recv_province = recv_province;
	}
	public String getRecv_city() {
		return recv_city;
	}
	public void setRecv_city(String recv_city) {
		this.recv_city = recv_city;
	}
	public String getRecv_area() {
		return recv_area;
	}
	public void setRecv_area(String recv_area) {
		this.recv_area = recv_area;
	}
	public String getRecv_district() {
		return recv_district;
	}
	public void setRecv_district(String recv_district) {
		this.recv_district = recv_district;
	}
	public String getRecv_addr() {
		return recv_addr;
	}
	public void setRecv_addr(String recv_addr) {
		this.recv_addr = recv_addr;
	}
	public String getRecv_phone() {
		return recv_phone;
	}
	public void setRecv_phone(String recv_phone) {
		this.recv_phone = recv_phone;
	}
	public String getRecv_tel() {
		return recv_tel;
	}
	public void setRecv_tel(String recv_tel) {
		this.recv_tel = recv_tel;
	}
	public String getRecv_zip() {
		return recv_zip;
	}
	public void setRecv_zip(String recv_zip) {
		this.recv_zip = recv_zip;
	}
	public String getRecv_tag() {
		return recv_tag;
	}
	public void setRecv_tag(String recv_tag) {
		this.recv_tag = recv_tag;
	}
	public Integer getIs_default() {
		return is_default;
	}
	public void setIs_default(Integer is_default) {
		this.is_default = is_default;
	}
	public String getCreated_user() {
		return created_user;
	}
	public void setCreated_user(String created_user) {
		this.created_user = created_user;
	}
	public Date getCreated_time() {
		return created_time;
	}
	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}
	public String getModified_user() {
		return modified_user;
	}
	public void setModified_user(String modified_user) {
		this.modified_user = modified_user;
	}
	public Date getModified_time() {
		return modified_time;
	}
	public void setModified_time(Date modified_time) {
		this.modified_time = modified_time;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((created_time == null) ? 0 : created_time.hashCode());
		result = prime * result + ((created_user == null) ? 0 : created_user.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((is_default == null) ? 0 : is_default.hashCode());
		result = prime * result + ((modified_time == null) ? 0 : modified_time.hashCode());
		result = prime * result + ((modified_user == null) ? 0 : modified_user.hashCode());
		result = prime * result + ((recv_addr == null) ? 0 : recv_addr.hashCode());
		result = prime * result + ((recv_area == null) ? 0 : recv_area.hashCode());
		result = prime * result + ((recv_city == null) ? 0 : recv_city.hashCode());
		result = prime * result + ((recv_district == null) ? 0 : recv_district.hashCode());
		result = prime * result + ((recv_name == null) ? 0 : recv_name.hashCode());
		result = prime * result + ((recv_phone == null) ? 0 : recv_phone.hashCode());
		result = prime * result + ((recv_province == null) ? 0 : recv_province.hashCode());
		result = prime * result + ((recv_tag == null) ? 0 : recv_tag.hashCode());
		result = prime * result + ((recv_tel == null) ? 0 : recv_tel.hashCode());
		result = prime * result + ((recv_zip == null) ? 0 : recv_zip.hashCode());
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
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
		Address other = (Address) obj;
		if (created_time == null) {
			if (other.created_time != null)
				return false;
		} else if (!created_time.equals(other.created_time))
			return false;
		if (created_user == null) {
			if (other.created_user != null)
				return false;
		} else if (!created_user.equals(other.created_user))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (is_default == null) {
			if (other.is_default != null)
				return false;
		} else if (!is_default.equals(other.is_default))
			return false;
		if (modified_time == null) {
			if (other.modified_time != null)
				return false;
		} else if (!modified_time.equals(other.modified_time))
			return false;
		if (modified_user == null) {
			if (other.modified_user != null)
				return false;
		} else if (!modified_user.equals(other.modified_user))
			return false;
		if (recv_addr == null) {
			if (other.recv_addr != null)
				return false;
		} else if (!recv_addr.equals(other.recv_addr))
			return false;
		if (recv_area == null) {
			if (other.recv_area != null)
				return false;
		} else if (!recv_area.equals(other.recv_area))
			return false;
		if (recv_city == null) {
			if (other.recv_city != null)
				return false;
		} else if (!recv_city.equals(other.recv_city))
			return false;
		if (recv_district == null) {
			if (other.recv_district != null)
				return false;
		} else if (!recv_district.equals(other.recv_district))
			return false;
		if (recv_name == null) {
			if (other.recv_name != null)
				return false;
		} else if (!recv_name.equals(other.recv_name))
			return false;
		if (recv_phone == null) {
			if (other.recv_phone != null)
				return false;
		} else if (!recv_phone.equals(other.recv_phone))
			return false;
		if (recv_province == null) {
			if (other.recv_province != null)
				return false;
		} else if (!recv_province.equals(other.recv_province))
			return false;
		if (recv_tag == null) {
			if (other.recv_tag != null)
				return false;
		} else if (!recv_tag.equals(other.recv_tag))
			return false;
		if (recv_tel == null) {
			if (other.recv_tel != null)
				return false;
		} else if (!recv_tel.equals(other.recv_tel))
			return false;
		if (recv_zip == null) {
			if (other.recv_zip != null)
				return false;
		} else if (!recv_zip.equals(other.recv_zip))
			return false;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		return true;
	}
	
	
	
	
}
