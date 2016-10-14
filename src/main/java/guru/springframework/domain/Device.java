package guru.springframework.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class Device  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Version
	private Integer version;
	private String deviceId;
	private String mdm;
	private String battery;
	private Integer counter;
	private String modelNumber;
	private String macAddress;
	private String ipAddress;
	private String location;
	private String operatingSystem;
	private String gatewayIPAddress;
	private String activationDate;
	private String lastSeenOn;
	private String ospClientVersion;
  /*  private Configuration configuration;
  //@JoinColumn(name = "CONFIGURATION_ID")

	@ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
		public Configuration getConfiguration() {
		return configuration;
	}
	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}*/
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String getGatewayIPAddress() {
		return gatewayIPAddress;
	}
	public void setGatewayIPAddress(String gatewayIPAddress) {
		this.gatewayIPAddress = gatewayIPAddress;
	}
	public String getActivationDate() {
		return activationDate;
	}
	public void setActivationDate(String activationDate) {
		this.activationDate = activationDate;
	}
	public String getLastSeenOn() {
		return lastSeenOn;
	}
	public void setLastSeenOn(String lastSeenOn) {
		this.lastSeenOn = lastSeenOn;
	}
	public String getOspClientVersion() {
		return ospClientVersion;
	}
	public void setOspClientVersion(String ospClientVersion) {
		this.ospClientVersion = ospClientVersion;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getMdm() {
		return mdm;
	}
	public void setMdm(String mdm) {
		this.mdm = mdm;
	}
	public String getBattery() {
		return battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	public Integer getCounter() {
		return counter;
	}
	public void setCounter(Integer counter) {
		this.counter = counter;
	}

}
