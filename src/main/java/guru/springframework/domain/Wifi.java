package guru.springframework.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Wifi {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String ssid;
	private String identity;
	private String password;
	private String eapMethod;
	private String phaseAuth;
	private String globalProxy;
	private String globalPort;
	
	public String getGlobalProxy() {
		return globalProxy;
	}
	public void setGlobalProxy(String globalProxy) {
		this.globalProxy = globalProxy;
	}
	public String getGlobalPort() {
		return globalPort;
	}
	public void setGlobalPort(String globalPort) {
		this.globalPort = globalPort;
	}
	public String getPhaseAuth() {
		return phaseAuth;
	}
	public void setPhaseAuth(String phaseAuth) {
		this.phaseAuth = phaseAuth;
	}
	public String getEapMethod() {
		return eapMethod;
	}
	public void setEapMethod(String eapMethod) {
		this.eapMethod = eapMethod;
	}
	@ManyToOne
	   private Eaplist eaplist;

	public Eaplist getEaplist() {
		return eaplist;
	}
	public void setEaplist(Eaplist eaplist) {
		this.eaplist = eaplist;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSsid() {
		return ssid;
	}
	public void setSsid(String ssid) {
		this.ssid = ssid;
	}
}