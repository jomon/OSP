package guru.springframework.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
public class License {
@Id
@GeneratedValue(strategy = javax.persistence.GenerationType.AUTO)
private Integer id;
private String licenseName;
private String licenseCode;
private Integer quantity;
private Date created;
private Date updated;

@PrePersist
protected void onCreate() {
  created = new Date();
}

@PreUpdate
protected void onUpdate() {
  updated = new Date();
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getLicenseName() {
	return licenseName;
}
public void setLicenseName(String licenseName) {
	this.licenseName = licenseName;
}
public String getLicenseCode() {
	return licenseCode;
}
public void setLicenseCode(String licenseCode) {
	this.licenseCode = licenseCode;
}
public Integer getQuantity() {
	return quantity;
}
public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}


}

