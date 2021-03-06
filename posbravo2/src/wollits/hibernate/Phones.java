package wollits.hibernate;

// Generated Jun 14, 2014 7:45:27 PM by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Phones generated by hbm2java
 */
@Entity
@Table(name = "phones", catalog = "wollits")
public class Phones implements java.io.Serializable {

	private int phoneId;
	private Contacts contacts;
	private String phoneNumber;

	public Phones() {
	}

	public Phones(int phoneId, String phoneNumber) {
		this.phoneId = phoneId;
		this.phoneNumber = phoneNumber;
	}

	public Phones(int phoneId, Contacts contacts, String phoneNumber) {
		this.phoneId = phoneId;
		this.contacts = contacts;
		this.phoneNumber = phoneNumber;
	}

	@Id
	@Column(name = "phone_id", unique = true, nullable = false)
	public int getPhoneId() {
		return this.phoneId;
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contact_id")
	public Contacts getContacts() {
		return this.contacts;
	}

	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}

	@Column(name = "phone_number", nullable = false)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
