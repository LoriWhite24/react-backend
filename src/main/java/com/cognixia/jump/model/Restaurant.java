package com.cognixia.jump.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "restaurants")
public class Restaurant implements Serializable {

	private static final long serialVersionUID = 6041514973117274821L;
	@Transient
	public static final String SEQUENCE_NAME = "restaurants_sequence";
	
	@Id
	@NotNull
	private Long id;

	@NotNull(message = "Restaurant name must not be null")
	private String name;

	private String imageUrl;

	private String menuLink;
	@NotNull
	private String owner;

	@Pattern(regexp = "^\\(\\d{3}\\)\\s?\\d{3}-\\d{4}$")
	private String phoneNumber;
	@NotNull
	private Long addresses;
	
	public Restaurant() {
		this("N/A", "N/A", "N/A", "N/A", "N/A", -1L);
	}

	public Restaurant(@NotNull(message = "Restaurant name must not be null") String name, String imageUrl,
			String menuLink, String owner, @Pattern(regexp = "^\\(\\d{3}\\)\\s?\\d{3}-\\d{4}$") String phoneNumber,
			Long addresses) {
		super();
		this.name = name;
		this.imageUrl = imageUrl;
		this.menuLink = menuLink;
		this.owner = owner;
		this.phoneNumber = phoneNumber;
		this.addresses = addresses;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getMenuLink() {
		return menuLink;
	}

	public void setMenuLink(String menuLink) {
		this.menuLink = menuLink;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getAddresses() {
		return addresses;
	}

	public void setAddresses(Long addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", imageUrl=" + imageUrl + ", menuLink=" + menuLink
				+ ", owner=" + owner + ", phoneNumber=" + phoneNumber + ", addresses=" + addresses + "]";
	}

}
