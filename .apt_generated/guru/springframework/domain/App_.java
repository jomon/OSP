package guru.springframework.domain;

import java.io.File;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(App.class)
public abstract class App_ {

	public static volatile SingularAttribute<App, String> appName;
	public static volatile SingularAttribute<App, File> packagefile;
	public static volatile SingularAttribute<App, Integer> id;
	public static volatile SingularAttribute<App, String> versionCode;

}

