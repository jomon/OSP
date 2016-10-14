package guru.springframework.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Device.class)
public abstract class Device_ {

	public static volatile SingularAttribute<Device, String> gatewayIPAddress;
	public static volatile SingularAttribute<Device, String> ipAddress;
	public static volatile SingularAttribute<Device, Integer> counter;
	public static volatile SingularAttribute<Device, String> battery;
	public static volatile SingularAttribute<Device, Integer> version;
	public static volatile SingularAttribute<Device, String> deviceId;
	public static volatile SingularAttribute<Device, String> operatingSystem;
	public static volatile SingularAttribute<Device, String> macAddress;
	public static volatile SingularAttribute<Device, String> lastSeenOn;
	public static volatile SingularAttribute<Device, String> mdm;
	public static volatile SingularAttribute<Device, String> ospClientVersion;
	public static volatile SingularAttribute<Device, String> modelNumber;
	public static volatile SingularAttribute<Device, String> location;
	public static volatile SingularAttribute<Device, Integer> id;
	public static volatile SingularAttribute<Device, String> activationDate;

}

