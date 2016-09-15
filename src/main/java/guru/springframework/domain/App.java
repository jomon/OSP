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
    private String appName;
    private String versionCode;
    private File packagefile;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getAppName() {
        return appName;
    }
    public void setAppName(String appName) {
        this.appName = appName;
    }
    public String getVersionCode() {
        return versionCode;
    }
    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }
    public File getPackagefile() {
        return packagefile;
    }
    public void setPackagefile(File packagefile) {
        this.packagefile = packagefile;
    }
    
    
}
