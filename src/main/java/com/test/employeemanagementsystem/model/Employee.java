package com.test.employeemanagementsystem.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employees")
public class Employee {

	private long id;
	private String name;
	private Date date_entered;
	private Date date_modified;
	private String modified_user_id;
	private String created_by;
	private Boolean is_parent;
	private String alias;
	private String contacts;
	
	public Employee() {
		
	}
	
	
	public Employee(long id, String name, Date date_entered,
			Date date_modified, String modified_user_id, String created_by,
			Boolean is_parent, String alias, String contacts) {
		super();
		this.id = id;
		this.name = name;
		this.date_entered = date_entered;
		this.date_modified = date_modified;
		this.modified_user_id = modified_user_id;
		this.created_by = created_by;
		this.is_parent = is_parent;
		this.alias = alias;
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", date_entered="
				+ date_entered + ", date_modified=" + date_modified
				+ ", modified_user_id=" + modified_user_id + ""
				+ ", created_by=" + created_by + ", is_parent=" + is_parent
				+ ", alias=" + alias + ", contacts=" + contacts + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "date_entered", nullable = false)
	public Date getDate_entered() {
		return date_entered;
	}

	public void setDate_entered(Date date_entered) {
		this.date_entered = date_entered;
	}

	@Column(name = "date_modified", nullable = false)
	public Date getDate_modified() {
		return date_modified;
	}

	public void setDate_modified(Date date_modified) {
		this.date_modified = date_modified;
	}

	@Column(name = "modified_user_id", nullable = false)
	public String getModified_user_id() {
		return modified_user_id;
	}

	public void setModified_user_id(String modified_user_id) {
		this.modified_user_id = modified_user_id;
	}

	@Column(name = "created_by", nullable = false)
	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	@Column(name = "is_parent", nullable = false)
	public Boolean getIs_parent() {
		return is_parent;
	}

	public void setIs_parent(Boolean is_parent) {
		this.is_parent = is_parent;
	}

	@Column(name = "alias", nullable = false)
	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	@Column(name = "contacts", nullable = false)
	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	
}
