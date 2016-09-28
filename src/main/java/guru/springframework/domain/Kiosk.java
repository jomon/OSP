package guru.springframework.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kiosk {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer kioskType;
	private String password;
	private String kioskDecription;
	private String browser;
	
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getKioskType() {
		return kioskType;
	}
	public void setKioskType(Integer kioskType) {
		this.kioskType = kioskType;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getKioskDecription() {
		return kioskDecription;
	}
	public void setKioskDecription(String kioskDecription) {
		this.kioskDecription = kioskDecription;
	}

	
}