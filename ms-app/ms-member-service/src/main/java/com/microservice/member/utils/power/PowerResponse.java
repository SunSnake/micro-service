package com.microservice.member.utils.power;

import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author haoahoxiansheng
 * @date 2019/11/23 9:08
 */
public class PowerResponse implements Serializable {

    private String respCode;

    private String respMsg;

    private Object respData;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public PowerResponse letRespCode(String respCode) {
        setRespCode(respCode);
        return this;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public PowerResponse letRespMsg(String respMsg) {
        setRespMsg(respMsg);
        return this;
    }

    public Object getRespData() {
        return respData;
    }

    public void setRespData(Object respData) {
        this.respData = respData;
    }

    public PowerResponse letRespData(Object respData) {
        setRespData(respData);
        return this;
    }

    @JSONField(serialize = false)
    public Map<String, Object> getMapRespData() {
        return null == getRespData() ? new HashMap<String, Object>() : (Map<String, Object>) getRespData();
    }

    @JSONField(serialize = false)
    public com.alibaba.fastjson.JSONObject getJSONRespData() {
        return null == getRespData() ? new com.alibaba.fastjson.JSONObject() : (com.alibaba.fastjson.JSONObject) getRespData();
    }

    @JSONField(serialize = false)
    public PowerJSON getPowerRespData() {
        Object resData = getRespData();
        if (null == resData) {
            return new PowerJSON();
        }
        return PowerJSON.toPowerJSON(resData);
    }

    /**
     * <p>成功响应</p>
     *
     * @author mengqk
     * @version 1.0
     * @since [2019/5/21]
     */
    public static PowerResponse success() {
        return success(null);
    }

    /**
     * <p>成功响应，自定义返回描述</p>
     *
     * @author mengqk
     * @version 1.0
     * @since [2019/5/21]
     */
    public static PowerResponse success(String respMsg) {
        return new PowerResponse().letRespCode(PowerConst.RESULT_CODE_OK).letRespMsg(respMsg);
    }

    /**
     * <p>失败响应</p>
     *
     * @author mengqk
     * @version 1.0
     * @since [2019/5/21]
     */
    public static PowerResponse error() {
        return error(null);
    }

    /**
     * <p>失败响应指定错误码</p>
     *
     * @author mengqk
     * @version 1.0
     * @since [2019/5/21]
     */
    public static PowerResponse error(String respCode) {
        return error(respCode, null);
    }

    /**
     * <p>失败响应使用默认错误码，指定错误描述</p>
     *
     * @author mengqk
     * @version 1.0
     * @since [2019/5/21]
     */
    public static PowerResponse errorWithMsg(String respMsg) {
        return error(null, respMsg);
    }

    /**
     * <p>失败响应使用默认错误码，指定错误描述</p>
     * <p>指定错误描述为空，返回默认错误描述</p>
     *
     * @author mengqk
     * @version 1.0
     * @since [2019/5/21]
     */
    public static PowerResponse errorWithMsg(String respMsg, String defaultMsg) {
        if (StringUtils.isBlank(respMsg) && StringUtils.isNotBlank(defaultMsg)) {
            return error(null, defaultMsg);
        }
        return error(null, respMsg);
    }

    /**
     * <p>失败响应，指定错误码和错误描述</p>
     *
     * @author mengqk
     * @version 1.0
     * @since [2019/5/21]
     */
    public static PowerResponse error(String respCode, String respMsg) {
        return new PowerResponse()
                .letRespCode(null == respCode ? PowerConst.RESULT_CODE_ERROR : respCode)
                .letRespMsg(respMsg);
    }

    /**
     * <p>判断接口是否成功</p>
     *
     * @author mengqk
     * @version 1.0
     * @since [2019/5/21]
     */
    @JSONField(serialize = false)
    public boolean isSuccess() {
        return PowerConst.RESULT_CODE_OK.equals(getRespCode());
    }

    /**
     * <p>判断接口是否失败</p>
     *
     * @author mengqk
     * @version 1.0
     * @since [2019/5/21]
     */
    @JSONField(serialize = false)
    public boolean isError() {
        return !isSuccess();
    }

}
