package sdu.edu.store.entity;

import java.io.Serializable;
import java.util.Date;

/*
+---------------+--------------+------+-----+---------+-------+
| Field         | Type         | Null | Key | Default | Extra |
+---------------+--------------+------+-----+---------+-------+
| id            | varchar(200) | NO   | PRI | NULL    |       |
| category_id   | bigint(20)   | YES  |     | NULL    |       |
| item_type     | varchar(100) | YES  |     | NULL    |       |
| title         | varchar(100) | YES  |     | NULL    |       |
| sell_point    | varchar(150) | YES  |     | NULL    |       |
| price         | bigint(20)   | YES  |     | NULL    |       |
| num           | int(10)      | YES  |     | NULL    |       |
| barcode       | varchar(30)  | YES  |     | NULL    |       |
| image         | varchar(500) | YES  |     | NULL    |       |
| status        | int(1)       | YES  |     | 1       |       |
| priority      | int(10)      | YES  |     | NULL    |       |
| created_time  | datetime     | YES  |     | NULL    |       |
| modified_time | datetime     | YES  |     | NULL    |       |
| created_user  | varchar(50)  | YES  |     | NULL    |       |
| modified_user | varchar(50)  | YES  |     | NULL    |       |
+---------------+--------------+------+-----+---------+-------+
 */
public class Goods implements Serializable {
	private static final long serialVersionUID = 8070455775591881475L;

	private String id;
	private Integer categoryId;
	private String itemType;
	private String title;
	private String sellPoint;
	private Long price;
	private Integer num;
	private String barcode;
	private String image;
	private Integer status;
	private Integer priority;
	private Date created_time;
	private Date modified_time;
	private String created_user;
	private String modified_user;
	
	public Goods() {
	}

	public Goods(String id, Integer categoryId, String itemType, String title, String sellPoint, Long price,
			Integer num, String barcode, String image, Integer status, Integer priority, Date created_time,
			Date modified_time, String created_user, String modified_user) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.itemType = itemType;
		this.title = title;
		this.sellPoint = sellPoint;
		this.price = price;
		this.num = num;
		this.barcode = barcode;
		this.image = image;
		this.status = status;
		this.priority = priority;
		this.created_time = created_time;
		this.modified_time = modified_time;
		this.created_user = created_user;
		this.modified_user = modified_user;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSellPoint() {
		return sellPoint;
	}

	public void setSellPoint(String sellPoint) {
		this.sellPoint = sellPoint;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Date getCreated_time() {
		return created_time;
	}

	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}

	public Date getModified_time() {
		return modified_time;
	}

	public void setModified_time(Date modified_time) {
		this.modified_time = modified_time;
	}

	public String getCreated_user() {
		return created_user;
	}

	public void setCreated_user(String created_user) {
		this.created_user = created_user;
	}

	public String getModified_user() {
		return modified_user;
	}

	public void setModified_user(String modified_user) {
		this.modified_user = modified_user;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", categoryId=" + categoryId + ", itemType=" + itemType + ", title=" + title
				+ ", sellPoint=" + sellPoint + ", price=" + price + ", num=" + num + ", barcode=" + barcode + ", image="
				+ image + ", status=" + status + ", priority=" + priority + ", created_time=" + created_time
				+ ", modified_time=" + modified_time + ", created_user=" + created_user + ", modified_user="
				+ modified_user + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Goods other = (Goods) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
