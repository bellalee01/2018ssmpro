package sdu.edu.store.entity;

import java.io.Serializable;
import java.util.Date;

public class GoodsCategory implements Serializable{

	private static final long serialVersionUID = 5055217683047714913L;
	private Integer id;
	private Integer parentId;
	private String name;
	private Integer status;
	private Integer sortOrders;
	private Integer isParent;
	private Date createTime;
	private Date modifyTime;
	private String createUser;
	private String modifyUser;
	
	public GoodsCategory() {

	}

	

	public GoodsCategory(Integer id, Integer parentId, String name, Integer status, Integer sortOrders,
			Integer isParent, Date createTime, Date modifyTime, String createUser, String modifyUser) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.name = name;
		this.status = status;
		this.sortOrders = sortOrders;
		this.isParent = isParent;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.createUser = createUser;
		this.modifyUser = modifyUser;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStatus() {
		return status;
	}

	public Integer getIsParent() {
		return isParent;
	}



	public void setIsParent(Integer isParent) {
		this.isParent = isParent;
	}



	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getSortOrders() {
		return sortOrders;
	}

	public void setSortOrders(Integer sortOrders) {
		this.sortOrders = sortOrders;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

 
	@Override
	public String toString() {
		return "GoodsCategory [id=" + id + ", parentId=" + parentId + ", name=" + name + ", status=" + status
				+ ", sortOrders=" + sortOrders + ", isParent=" + isParent + ", createTime=" + createTime
				+ ", modifyTime=" + modifyTime + ", createUser=" + createUser + ", modifyUser=" + modifyUser + "]";
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
		GoodsCategory other = (GoodsCategory) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
