package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Configuration {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String profileName;
	private Boolean mdmClientDisplay;
	private Boolean statusBar;
	private Boolean homeKey;
	private Boolean backKey;
	private Boolean recentsKey;
	private Boolean powerKey;
	private Boolean firmwareUpgrade;
	private Boolean factoryReset;
	private Boolean svoice;
	private Boolean androidSettings;
	private Boolean volumeKey;
	private Boolean multiWindow;
	private Boolean notifications;
	private Boolean lockScreen;
	private Boolean bluetooth;
	private Boolean gps;
	
	public Boolean getMdmClientDisplay() {
		return mdmClientDisplay;
	}
	public void setMdmClientDisplay(Boolean mdmClientDisplay) {
		this.mdmClientDisplay = mdmClientDisplay;
	}
	public Boolean getStatusBar() {
		return statusBar;
	}
	public void setStatusBar(Boolean statusBar) {
		this.statusBar = statusBar;
	}
	public Boolean getHomeKey() {
		return homeKey;
	}
	public void setHomeKey(Boolean homeKey) {
		this.homeKey = homeKey;
	}
	public Boolean getBackKey() {
		return backKey;
	}
	public void setBackKey(Boolean backKey) {
		this.backKey = backKey;
	}
	public Boolean getRecentsKey() {
		return recentsKey;
	}
	public void setRecentsKey(Boolean recentsKey) {
		this.recentsKey = recentsKey;
	}
	public Boolean getPowerKey() {
		return powerKey;
	}
	public void setPowerKey(Boolean powerKey) {
		this.powerKey = powerKey;
	}
	public Boolean getFirmwareUpgrade() {
		return firmwareUpgrade;
	}
	public void setFirmwareUpgrade(Boolean firmwareUpgrade) {
		this.firmwareUpgrade = firmwareUpgrade;
	}
	public Boolean getFactoryReset() {
		return factoryReset;
	}
	public void setFactoryReset(Boolean factoryReset) {
		this.factoryReset = factoryReset;
	}
	public Boolean getSvoice() {
		return svoice;
	}
	public void setSvoice(Boolean svoice) {
		this.svoice = svoice;
	}
	public Boolean getAndroidSettings() {
		return androidSettings;
	}
	public void setAndroidSettings(Boolean androidSettings) {
		this.androidSettings = androidSettings;
	}
	public Boolean getVolumeKey() {
		return volumeKey;
	}
	public void setVolumeKey(Boolean volumeKey) {
		this.volumeKey = volumeKey;
	}
	public Boolean getMultiWindow() {
		return multiWindow;
	}
	public void setMultiWindow(Boolean multiWindow) {
		this.multiWindow = multiWindow;
	}
	public Boolean getNotifications() {
		return notifications;
	}
	public void setNotifications(Boolean notifications) {
		this.notifications = notifications;
	}
	public Boolean getLockScreen() {
		return lockScreen;
	}
	public void setLockScreen(Boolean lockScreen) {
		this.lockScreen = lockScreen;
	}
	public Boolean getBluetooth() {
		return bluetooth;
	}
	public void setBluetooth(Boolean bluetooth) {
		this.bluetooth = bluetooth;
	}
	public Boolean getGps() {
		return gps;
	}
	public void setGps(Boolean gps) {
		this.gps = gps;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
}