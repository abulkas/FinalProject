package com.posbravo.model;

// Generated Jan 31, 2014 8:16:08 PM by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * DiscountByInvoice generated by hbm2java
 */
@Entity
@Table(name = "discount_by_invoice", catalog = "posbravo")
public class DiscountByInvoice implements java.io.Serializable {

	private DiscountByInvoiceId id;

	public DiscountByInvoice() {
	}

	public DiscountByInvoice(DiscountByInvoiceId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "invoiceNo", column = @Column(name = "InvoiceNo")),
			@AttributeOverride(name = "promId", column = @Column(name = "PromId")) })
	public DiscountByInvoiceId getId() {
		return this.id;
	}

	public void setId(DiscountByInvoiceId id) {
		this.id = id;
	}

}
