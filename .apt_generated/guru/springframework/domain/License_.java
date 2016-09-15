package guru.springframework.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(License.class)
public abstract class License_ {

	public static volatile SingularAttribute<License, Integer> quantity;
	public static volatile SingularAttribute<License, Date> created;
	public static volatile SingularAttribute<License, Integer> id;
	public static volatile SingularAttribute<License, String> licenseName;
	public static volatile SingularAttribute<License, String> licenseCode;
	public static volatile SingularAttribute<License, Date> updated;

}

