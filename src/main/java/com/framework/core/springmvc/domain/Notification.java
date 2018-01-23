package com.framework.core.springmvc.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Notification")
@Inheritance(strategy = InheritanceType.JOINED)
public class Notification {

    @Id
    @GeneratedValue
    @Column(name = "NTF_ID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "NTN_Type")
    private NotificationType notificationType;

    @OneToOne
    @JoinColumn(name="NTN_OP_Lan_id")
    private OperationLanguage operationLanguage;

    @Column(name = "NTF_Date")
    private Date date;

    @Column(name = "NTF_Start_Date")
    private Date startDate;

    @Column(name = "NTF_End_Date")
    private Date endDate;

    @Column(name = "NTF_Status", length = 2, nullable = false)
    private int status;

    @Column(name = "NTF_Content")
    private String content;

    @Column(name = "NTF_Description")
    private String description;

    @Column(name = "NTF_Title")
    private String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public OperationLanguage getOperationLanguage() {
        return operationLanguage;
    }

    public void setOperationLanguage(OperationLanguage operationLanguage) {
        this.operationLanguage = operationLanguage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
