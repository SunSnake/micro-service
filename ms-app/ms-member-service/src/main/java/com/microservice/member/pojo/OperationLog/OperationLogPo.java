package com.microservice.member.pojo.OperationLog;

import java.util.Date;

public class OperationLogPo {
    private String operId;

    private String operModul;

    private String operType;

    private String operDesc;

    private String operMethod;

    private String operReq;

    private String operResp;

    private String operIp;

    private String requestUri;

    private Date createTime;

    public OperationLogPo(String operId, String operModul, String operType, String operDesc, String operMethod, String operReq, String operResp, String operIp, String requestUri, Date createTime) {
        this.operId = operId;
        this.operModul = operModul;
        this.operType = operType;
        this.operDesc = operDesc;
        this.operMethod = operMethod;
        this.operReq = operReq;
        this.operResp = operResp;
        this.operIp = operIp;
        this.requestUri = requestUri;
        this.createTime = createTime;
    }

    public OperationLogPo() {
        super();
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId == null ? null : operId.trim();
    }

    public String getOperModul() {
        return operModul;
    }

    public void setOperModul(String operModul) {
        this.operModul = operModul == null ? null : operModul.trim();
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType == null ? null : operType.trim();
    }

    public String getOperDesc() {
        return operDesc;
    }

    public void setOperDesc(String operDesc) {
        this.operDesc = operDesc == null ? null : operDesc.trim();
    }

    public String getOperMethod() {
        return operMethod;
    }

    public void setOperMethod(String operMethod) {
        this.operMethod = operMethod == null ? null : operMethod.trim();
    }

    public String getOperReq() {
        return operReq;
    }

    public void setOperReq(String operReq) {
        this.operReq = operReq == null ? null : operReq.trim();
    }

    public String getOperResp() {
        return operResp;
    }

    public void setOperResp(String operResp) {
        this.operResp = operResp == null ? null : operResp.trim();
    }

    public String getOperIp() {
        return operIp;
    }

    public void setOperIp(String operIp) {
        this.operIp = operIp == null ? null : operIp.trim();
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri == null ? null : requestUri.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
