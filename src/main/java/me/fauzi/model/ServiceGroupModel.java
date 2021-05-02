package me.fauzi.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by fauzi on 02/05/2021.
 */

@Entity
@Table(name = "SERVICE_GROUP_T")
public class ServiceGroupModel {

    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "SERVICE_GROUP_ID")
    private String serviceGroupId;

    @NotNull
    @Column(name = "SERVICE_GROUP_NAME")
    private String serviceGroupName;

    @NotNull
    @Column(name = "SERVICE_GROUP_CATEGORY")
    private String serviceGroupCategory;

    public ServiceGroupModel(){

    }

    public ServiceGroupModel(String serviceGroupId, String serviceGroupName,  String serviceGroupCategory) {
        this.serviceGroupId = serviceGroupId;
        this.serviceGroupName = serviceGroupName;
        this.serviceGroupCategory = serviceGroupCategory;
    }

    //Getter Setter

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
}
