package me.fauzi.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="JOB_DET_T")
public class JobDetModel {

    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "JOB_DET_ID")
    private String jobDetId;

    @OneToOne @NotNull
    @JoinColumn(name = "JOB_HEAD_ID")
    public JobHeadModel jobHeadId;

    @OneToOne @NotNull
    @JoinColumn(name = "SERVICE_ID")
    public ServiceModel serviceId;

    @NotNull
    @Column(name = "JOB_DET_STATUS")
    private Integer jobDetStatus;

    @Column(name = "JOB_DET_RESPONSE")
    private String jobDetResponse;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "JOB_DET_TIME")
    private Date jobDetTime;

    public JobDetModel(){}

    public JobDetModel(String jobDetId, JobHeadModel jobHeadId, ServiceModel serviceId, Integer jobDetStatus, String jobDetResponse, Date jobDetTime) {
        this.jobDetId = jobDetId;
        this.jobHeadId = jobHeadId;
        this.serviceId = serviceId;
        this.jobDetStatus = jobDetStatus;
        this.jobDetResponse = jobDetResponse;
        this.jobDetTime = jobDetTime;
    }

    //Getter Setter


    public String getJobDetId() {
        return jobDetId;
    }

    public void setJobDetId(String jobDetId) {
        this.jobDetId = jobDetId;
    }

    public JobHeadModel getJobHeadId() {
        return jobHeadId;
    }

    public void setJobHeadId(JobHeadModel jobHeadId) {
        this.jobHeadId = jobHeadId;
    }

    public ServiceModel getServiceId() {
        return serviceId;
    }

    public void setServiceId(ServiceModel serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getJobDetStatus() {
        return jobDetStatus;
    }

    public void setJobDetStatus(Integer jobDetStatus) {
        this.jobDetStatus = jobDetStatus;
    }

    public String getJobDetResponse() {
        return jobDetResponse;
    }

    public void setJobDetResponse(String jobDetResponse) {
        this.jobDetResponse = jobDetResponse;
    }

    public Date getJobDetTime() {
        return jobDetTime;
    }

    public void setJobDetTime(Date jobDetTime) {
        this.jobDetTime = jobDetTime;
    }
}

