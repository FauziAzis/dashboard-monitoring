package me.fauzi.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by fauzi on 02/05/2021.
 */

@Entity
@Table(name="SERVICE_T")
public class ServiceModel {

    @Id @NotNull
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "SERVICE_ID")
    private String serviceId;

    @Column(name = "SERVICE_NAME")
    @NotNull
    private String serviceName;

    @NotNull
    @Column(name = "SERVICE_TYPE")
    private String serviceType;

    @NotNull
    @Column(name = "SERVICE_ENDPOINT")
    private String serviceEndpoint;

    @ManyToOne @NotNull
    @JoinColumn(name = "SERVICE_GROUP_ID")
    private ServiceGroupModel groupId;


    //Getter Setter

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceEndpoint() {
        return serviceEndpoint;
    }

    public void setServiceEndpoint(String serviceEndpoint) {
        this.serviceEndpoint = serviceEndpoint;
    }

    public ServiceGroupModel getGroupId() {
        return groupId;
    }

    public void setGroupId(ServiceGroupModel groupId) {
        this.groupId = groupId;
    }
}
