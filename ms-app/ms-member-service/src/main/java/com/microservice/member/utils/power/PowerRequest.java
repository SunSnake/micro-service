package com.microservice.member.utils.power;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.HashMap;
import java.util.Map;

/**
 * author  zhaoqi
 * date  2020/10/23 14:27
 */
public class PowerRequest {

    private Object reqData;

    public Object getReqData() {
        return reqData;
    }

    public void setReqData(Object reqData) {
        this.reqData = reqData;
    }

    public PowerRequest letReqData(Object reqData) {
        setReqData(reqData);
        return this;
    }

    @JSONField(serialize = false)
    public Map<String, Object> getMapReqData() {
        return null == getReqData() ? new HashMap<String, Object>() : (Map<String, Object>) getReqData();
    }

    @JSONField(serialize = false)
    public com.alibaba.fastjson.JSONObject getJSONReqData() {
        return (com.alibaba.fastjson.JSONObject) getReqData();
    }

    @JSONField(serialize = false)
    public PowerJSON getPowerReqData() {
        Object reqData = getReqData();
        if (null == reqData) {
            return new PowerJSON();
        }
        return PowerJSON.toPowerJSON(reqData);
    }
}
