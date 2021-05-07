package me.fauzi.model;


import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Immutable
@Table(name = "SERVICE_V")
public class ServiceView {

    @Id @Column(name = "SERVICE_ID")
    private String serviceId;

    @Column(name = "SERVICE_NAME")
    private String serviceName;

    @Column(name = "SERVICE_TYPE")
    private String serviceType;

    @Column(name = "SERVICE_ENDPOINT")
    private String serviceEndPoint;

    @Column(name = "SERVICE_GROUP_ID")
    private String serviceGroupId;

    @Column(name = "SERVICE_GROUP_NAME")
    private String serviceGroupName;

    @Column(name = "SERVICE_GROUP_CATEGORY")
    private String serviceGroupCategory;

    private String total;

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

    public String getServiceEndPoint() {
        return serviceEndPoint;
    }

    public void setServiceEndPoint(String serviceEndPoint) {
        this.serviceEndPoint = serviceEndPoint;
    }

    public String getServiceGroupId() {
        return serviceGroupId;
    }

    public void setServiceGroupId(String serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
    }

    public String getServiceGroupName() {
        return serviceGroupName;
    }

    public void setServiceGroupName(String serviceGroupName) {
        this.serviceGroupName = serviceGroupName;
    }

    public String getServiceGroupCategory() {
        return serviceGroupCategory;
    }

    public void setServiceGroupCategory(String serviceGroupCategory) {
        this.serviceGroupCategory = serviceGroupCategory;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
