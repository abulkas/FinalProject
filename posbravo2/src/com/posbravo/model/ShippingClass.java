package com.posbravo.model;

// Generated Jan 31, 2014 8:16:08 PM by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ShippingClass generated by hbm2java
 */
@Entity
@Table(name = "shipping_class", catalog = "posbravo")
public class ShippingClass implements java.io.Serializable {

	private Integer shippingClassId;
	private String title;
	private String description;
	private Date lastModified;
	private Date dateAdded;

	public ShippingClass() {
	}

	public ShippingClass(String title, String description, Date lastModified,
			Date dateAdded) {
		this.title = title;
		this.description = description;
		this.lastModified = lastModified;
		this.dateAdded = dateAdded;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ShippingClassID", unique = true, nullable = false)
	public Integer getShippingClassId() {
		return this.shippingClassId;
	}

	public void setShippingClassId(Integer shippingClassId) {
		this.shippingClassId = shippingClassId;
	}

	@Column(name = "Title")
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "Description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LastModified", length = 19)
	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateAdded", length = 19)
	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

}
