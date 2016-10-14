package guru.springframework.domain;

import java.io.File;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class App {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Integer id;
    private String packageName;
    private String versionCode;
    private File appfile;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getVersionCode() {
        return versionCode;
    }
    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public File getAppfile() {
		return appfile;
	}
	public void setAppfile(File appfile) {
		this.appfile = appfile;
	}

    
}
