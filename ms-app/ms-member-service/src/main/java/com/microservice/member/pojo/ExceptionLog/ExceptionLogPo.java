package com.microservice.member.pojo.ExceptionLog;

import java.util.Date;

public class ExceptionLogPo {
    private String excepId;

    private String reqParam;

    private String reqMethod;

    private String excepName;

    private String operUri;

    private String operIp;

    private Date createTime;

    private String excepMessage;

    public ExceptionLogPo(String excepId, String reqParam, String reqMethod, String excepName, String operUri, String operIp, Date createTime, String excepMessage) {
        this.excepId = excepId;
        this.reqParam = reqParam;
        this.reqMethod = reqMethod;
        this.excepName = excepName;
        this.operUri = operUri;
        this.operIp = operIp;
        this.createTime = createTime;
        this.excepMessage = excepMessage;
    }

    public ExceptionLogPo() {
        super();
    }

    public String getExcepId() {
        return excepId;
    }

    public void setExcepId(String excepId) {
        this.excepId = excepId == null ? null : excepId.trim();
    }

    public String getReqParam() {
        return reqParam;
    }

    public void setReqParam(String reqParam) {
        this.reqParam = reqParam == null ? null : reqParam.trim();
    }

    public String getReqMethod() {
        return reqMethod;
    }

    public void setReqMethod(String reqMethod) {
        this.reqMethod = reqMethod == null ? null : reqMethod.trim();
    }

    public String getExcepName() {
        return excepName;
    }

    public void setExcepName(String excepName) {
        this.excepName = excepName == null ? null : excepName.trim();
    }

    public String getOperUri() {
        return operUri;
    }

    public void setOperUri(String operUri) {
        this.operUri = operUri == null ? null : operUri.trim();
    }

    public String getOperIp() {
        return operIp;
    }

    public void setOperIp(String operIp) {
        this.operIp = operIp == null ? null : operIp.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getExcepMessage() {
        return excepMessage;
    }

    public void setExcepMessage(String excepMessage) {
        this.excepMessage = excepMessage == null ? null : excepMessage.trim();
    }
}
