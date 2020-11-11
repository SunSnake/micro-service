package com.microservice.member.utils.power;

/**
 * author  zhaoqi
 * date  2020/10/23 11:26
 * 常量统一
 */
public interface PowerConst {

    String RESULT_CODE_OK = "0000";
    String RESULT_CODE_ERROR = "8888";
    String RESULT_CODE_SIGN_ERROR = "4001";

    String FLOW_STATE_SUCCESS = "success";
    String FLOW_STATE_ERROR = "error";

    String ABILITY_SUCCESS_CODE = "00000";

    // HTTP get 请求
    String HTTP_METHOD_GET = "get";

    // HTTP 使用StringEntity的POST请求
    String HTTP_METHOD_POST_TYPE1 = "post_type1";

    // HTTP 使用UrlEncodedFormEntity的POST请求
    String HTTP_METHOD_POST_TYPE2 = "post_type2";
}
