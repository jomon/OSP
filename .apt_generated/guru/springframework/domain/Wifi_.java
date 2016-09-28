package guru.springframework.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Wifi.class)
public abstract class Wifi_ {

	public static volatile SingularAttribute<Wifi, String> phaseAuth;
	public static volatile SingularAttribute<Wifi, String> password;
	public static volatile SingularAttribute<Wifi, String> eapMethod;
	public static volatile SingularAttribute<Wifi, String> identity;
	public static volatile SingularAttribute<Wifi, String> globalProxy;
	public static volatile SingularAttribute<Wifi, String> globalPort;
	public static volatile SingularAttribute<Wifi, Eaplist> eaplist;
	public static volatile SingularAttribute<Wifi, Integer> id;
	public static volatile SingularAttribute<Wifi, String> ssid;

}

