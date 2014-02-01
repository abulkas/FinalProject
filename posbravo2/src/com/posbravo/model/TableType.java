package com.posbravo.model;

// Generated Jan 31, 2014 8:16:08 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TableType generated by hbm2java
 */
@Entity
@Table(name = "table_type", catalog = "posbravo")
public class TableType implements java.io.Serializable {

	private Integer tableTypeId;
	private String tableType;

	public TableType() {
	}

	public TableType(String tableType) {
		this.tableType = tableType;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "TableTypeID", unique = true, nullable = false)
	public Integer getTableTypeId() {
		return this.tableTypeId;
	}

	public void setTableTypeId(Integer tableTypeId) {
		this.tableTypeId = tableTypeId;
	}

	@Column(name = "TableType")
	public String getTableType() {
		return this.tableType;
	}

	public void setTableType(String tableType) {
		this.tableType = tableType;
	}

}
