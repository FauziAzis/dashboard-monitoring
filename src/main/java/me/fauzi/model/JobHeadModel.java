package me.fauzi.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "JOB_HEAD_T")
public class JobHeadModel {

    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "JOB_HEAD_ID")
    private String jobHeadId;

    @NotNull
    @Column(name = "JOB_HEAD_NAME")
    private String jobHeadName;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "JOB_HEAD_START")
    private Date jobHeadStart;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "JOB_HEAD_FINISH")
    private Date jobHeadFinish;

    @NotNull
    @Column(name = "JOB_HEAD_STATUS")
    private Integer jobHeadStatus;

    public JobHeadModel(){
    }

    public JobHeadModel(String jobHeadId, String jobHeadName, Date jobHeadStart, Date jobHeadFinish, Integer jobHeadStatus) {
        this.jobHeadId = jobHeadId;
        this.jobHeadName = jobHeadName;
        this.jobHeadStart = jobHeadStart;
        this.jobHeadFinish = jobHeadFinish;
        this.jobHeadStatus = jobHeadStatus;
    }

    //Getter Setter

    public String getJobHeadId() {
        return jobHeadId;
    }

    public void setJobHeadId(String jobHeadId) {
        this.jobHeadId = jobHeadId;
    }

    public String getJobHeadName() {
        return jobHeadName;
    }

    public void setJobHeadName(String jobHeadName) {
        this.jobHeadName = jobHeadName;
    }

    public Date getJobHeadStart() {
        return jobHeadStart;
    }

    public void setJobHeadStart(Date jobHeadStart) {
        this.jobHeadStart = jobHeadStart;
    }

    public Date getJobHeadFinish() {
        return jobHeadFinish;
    }

    public void setJobHeadFinish(Date jobHeadFinish) {
        this.jobHeadFinish = jobHeadFinish;
    }

    public Integer getJobHeadStatus() {
        return jobHeadStatus;
    }

    public void setJobHeadStatus(Integer jobHeadStatus) {
        this.jobHeadStatus = jobHeadStatus;
    }
}
