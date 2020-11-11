package com.microservice.member.pojo.OperationLog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OperationLogPoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperationLogPoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOperIdIsNull() {
            addCriterion("oper_id is null");
            return (Criteria) this;
        }

        public Criteria andOperIdIsNotNull() {
            addCriterion("oper_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperIdEqualTo(String value) {
            addCriterion("oper_id =", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotEqualTo(String value) {
            addCriterion("oper_id <>", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThan(String value) {
            addCriterion("oper_id >", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThanOrEqualTo(String value) {
            addCriterion("oper_id >=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThan(String value) {
            addCriterion("oper_id <", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThanOrEqualTo(String value) {
            addCriterion("oper_id <=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLike(String value) {
            addCriterion("oper_id like", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotLike(String value) {
            addCriterion("oper_id not like", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdIn(List<String> values) {
            addCriterion("oper_id in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotIn(List<String> values) {
            addCriterion("oper_id not in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdBetween(String value1, String value2) {
            addCriterion("oper_id between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotBetween(String value1, String value2) {
            addCriterion("oper_id not between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andOperModulIsNull() {
            addCriterion("oper_modul is null");
            return (Criteria) this;
        }

        public Criteria andOperModulIsNotNull() {
            addCriterion("oper_modul is not null");
            return (Criteria) this;
        }

        public Criteria andOperModulEqualTo(String value) {
            addCriterion("oper_modul =", value, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulNotEqualTo(String value) {
            addCriterion("oper_modul <>", value, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulGreaterThan(String value) {
            addCriterion("oper_modul >", value, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulGreaterThanOrEqualTo(String value) {
            addCriterion("oper_modul >=", value, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulLessThan(String value) {
            addCriterion("oper_modul <", value, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulLessThanOrEqualTo(String value) {
            addCriterion("oper_modul <=", value, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulLike(String value) {
            addCriterion("oper_modul like", value, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulNotLike(String value) {
            addCriterion("oper_modul not like", value, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulIn(List<String> values) {
            addCriterion("oper_modul in", values, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulNotIn(List<String> values) {
            addCriterion("oper_modul not in", values, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulBetween(String value1, String value2) {
            addCriterion("oper_modul between", value1, value2, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperModulNotBetween(String value1, String value2) {
            addCriterion("oper_modul not between", value1, value2, "operModul");
            return (Criteria) this;
        }

        public Criteria andOperTypeIsNull() {
            addCriterion("oper_type is null");
            return (Criteria) this;
        }

        public Criteria andOperTypeIsNotNull() {
            addCriterion("oper_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperTypeEqualTo(String value) {
            addCriterion("oper_type =", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotEqualTo(String value) {
            addCriterion("oper_type <>", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeGreaterThan(String value) {
            addCriterion("oper_type >", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeGreaterThanOrEqualTo(String value) {
            addCriterion("oper_type >=", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLessThan(String value) {
            addCriterion("oper_type <", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLessThanOrEqualTo(String value) {
            addCriterion("oper_type <=", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeLike(String value) {
            addCriterion("oper_type like", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotLike(String value) {
            addCriterion("oper_type not like", value, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeIn(List<String> values) {
            addCriterion("oper_type in", values, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotIn(List<String> values) {
            addCriterion("oper_type not in", values, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeBetween(String value1, String value2) {
            addCriterion("oper_type between", value1, value2, "operType");
            return (Criteria) this;
        }

        public Criteria andOperTypeNotBetween(String value1, String value2) {
            addCriterion("oper_type not between", value1, value2, "operType");
            return (Criteria) this;
        }

        public Criteria andOperDescIsNull() {
            addCriterion("oper_desc is null");
            return (Criteria) this;
        }

        public Criteria andOperDescIsNotNull() {
            addCriterion("oper_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOperDescEqualTo(String value) {
            addCriterion("oper_desc =", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescNotEqualTo(String value) {
            addCriterion("oper_desc <>", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescGreaterThan(String value) {
            addCriterion("oper_desc >", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescGreaterThanOrEqualTo(String value) {
            addCriterion("oper_desc >=", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescLessThan(String value) {
            addCriterion("oper_desc <", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescLessThanOrEqualTo(String value) {
            addCriterion("oper_desc <=", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescLike(String value) {
            addCriterion("oper_desc like", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescNotLike(String value) {
            addCriterion("oper_desc not like", value, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescIn(List<String> values) {
            addCriterion("oper_desc in", values, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescNotIn(List<String> values) {
            addCriterion("oper_desc not in", values, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescBetween(String value1, String value2) {
            addCriterion("oper_desc between", value1, value2, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperDescNotBetween(String value1, String value2) {
            addCriterion("oper_desc not between", value1, value2, "operDesc");
            return (Criteria) this;
        }

        public Criteria andOperMethodIsNull() {
            addCriterion("oper_method is null");
            return (Criteria) this;
        }

        public Criteria andOperMethodIsNotNull() {
            addCriterion("oper_method is not null");
            return (Criteria) this;
        }

        public Criteria andOperMethodEqualTo(String value) {
            addCriterion("oper_method =", value, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodNotEqualTo(String value) {
            addCriterion("oper_method <>", value, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodGreaterThan(String value) {
            addCriterion("oper_method >", value, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodGreaterThanOrEqualTo(String value) {
            addCriterion("oper_method >=", value, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodLessThan(String value) {
            addCriterion("oper_method <", value, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodLessThanOrEqualTo(String value) {
            addCriterion("oper_method <=", value, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodLike(String value) {
            addCriterion("oper_method like", value, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodNotLike(String value) {
            addCriterion("oper_method not like", value, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodIn(List<String> values) {
            addCriterion("oper_method in", values, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodNotIn(List<String> values) {
            addCriterion("oper_method not in", values, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodBetween(String value1, String value2) {
            addCriterion("oper_method between", value1, value2, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperMethodNotBetween(String value1, String value2) {
            addCriterion("oper_method not between", value1, value2, "operMethod");
            return (Criteria) this;
        }

        public Criteria andOperReqIsNull() {
            addCriterion("oper_req is null");
            return (Criteria) this;
        }

        public Criteria andOperReqIsNotNull() {
            addCriterion("oper_req is not null");
            return (Criteria) this;
        }

        public Criteria andOperReqEqualTo(String value) {
            addCriterion("oper_req =", value, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqNotEqualTo(String value) {
            addCriterion("oper_req <>", value, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqGreaterThan(String value) {
            addCriterion("oper_req >", value, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqGreaterThanOrEqualTo(String value) {
            addCriterion("oper_req >=", value, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqLessThan(String value) {
            addCriterion("oper_req <", value, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqLessThanOrEqualTo(String value) {
            addCriterion("oper_req <=", value, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqLike(String value) {
            addCriterion("oper_req like", value, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqNotLike(String value) {
            addCriterion("oper_req not like", value, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqIn(List<String> values) {
            addCriterion("oper_req in", values, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqNotIn(List<String> values) {
            addCriterion("oper_req not in", values, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqBetween(String value1, String value2) {
            addCriterion("oper_req between", value1, value2, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperReqNotBetween(String value1, String value2) {
            addCriterion("oper_req not between", value1, value2, "operReq");
            return (Criteria) this;
        }

        public Criteria andOperRespIsNull() {
            addCriterion("oper_resp is null");
            return (Criteria) this;
        }

        public Criteria andOperRespIsNotNull() {
            addCriterion("oper_resp is not null");
            return (Criteria) this;
        }

        public Criteria andOperRespEqualTo(String value) {
            addCriterion("oper_resp =", value, "operResp");
            return (Criteria) this;
        }

        public Criteria andOperRespNotEqualTo(String value) {
            addCriterion("oper_resp <>", value, "operResp");
            return (Criteria) this;
        }

        public Criteria andOperRespGreaterThan(String value) {
            addCriterion("oper_resp >", value, "operResp");
            return (Criteria) this;
        }

        public Criteria andOperRespGreaterThanOrEqualTo(String value) {
            addCriterion("oper_resp >=", value, "operResp");
            return (Criteria) this;
        }

        public Criteria andOperRespLessThan(String value) {
            addCriterion("oper_resp <", value, "operResp");
            return (Criteria) this;
        }

        public Criteria andOperRespLessThanOrEqualTo(String value) {
            addCriterion("oper_resp <=", value, "operResp");
            return (Criteria) this;
        }

        public Criteria andOperRespLike(String value) {
            addCriterion("oper_resp like", value, "operResp");
            return (Criteria) this;
        }

        public Criteria andOperRespNotLike(String value) {
            addCriterion("oper_resp not like", value, "operResp");
            return (Criteria) this;
        }

        public Criteria andOperRespIn(List<String> values) {
            addCriterion("oper_resp in", values, "operResp");
            return (Criteria) this;
        }

        public Criteria andOperRespNotIn(List<String> values) {
            addCriterion("oper_resp not in", values, "operResp");
            return (Criteria) this;
        }

        public Criteria andOperRespBetween(String value1, String value2) {
            addCriterion("oper_resp between", value1, value2, "operResp");
            return (Criteria) this;
        }

        public Criteria andOperRespNotBetween(String value1, String value2) {
            addCriterion("oper_resp not between", value1, value2, "operResp");
            return (Criteria) this;
        }

        public Criteria andOperIpIsNull() {
            addCriterion("oper_ip is null");
            return (Criteria) this;
        }

        public Criteria andOperIpIsNotNull() {
            addCriterion("oper_ip is not null");
            return (Criteria) this;
        }

        public Criteria andOperIpEqualTo(String value) {
            addCriterion("oper_ip =", value, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpNotEqualTo(String value) {
            addCriterion("oper_ip <>", value, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpGreaterThan(String value) {
            addCriterion("oper_ip >", value, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpGreaterThanOrEqualTo(String value) {
            addCriterion("oper_ip >=", value, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpLessThan(String value) {
            addCriterion("oper_ip <", value, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpLessThanOrEqualTo(String value) {
            addCriterion("oper_ip <=", value, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpLike(String value) {
            addCriterion("oper_ip like", value, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpNotLike(String value) {
            addCriterion("oper_ip not like", value, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpIn(List<String> values) {
            addCriterion("oper_ip in", values, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpNotIn(List<String> values) {
            addCriterion("oper_ip not in", values, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpBetween(String value1, String value2) {
            addCriterion("oper_ip between", value1, value2, "operIp");
            return (Criteria) this;
        }

        public Criteria andOperIpNotBetween(String value1, String value2) {
            addCriterion("oper_ip not between", value1, value2, "operIp");
            return (Criteria) this;
        }

        public Criteria andRequestUriIsNull() {
            addCriterion("request_uri is null");
            return (Criteria) this;
        }

        public Criteria andRequestUriIsNotNull() {
            addCriterion("request_uri is not null");
            return (Criteria) this;
        }

        public Criteria andRequestUriEqualTo(String value) {
            addCriterion("request_uri =", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriNotEqualTo(String value) {
            addCriterion("request_uri <>", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriGreaterThan(String value) {
            addCriterion("request_uri >", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriGreaterThanOrEqualTo(String value) {
            addCriterion("request_uri >=", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriLessThan(String value) {
            addCriterion("request_uri <", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriLessThanOrEqualTo(String value) {
            addCriterion("request_uri <=", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriLike(String value) {
            addCriterion("request_uri like", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriNotLike(String value) {
            addCriterion("request_uri not like", value, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriIn(List<String> values) {
            addCriterion("request_uri in", values, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriNotIn(List<String> values) {
            addCriterion("request_uri not in", values, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriBetween(String value1, String value2) {
            addCriterion("request_uri between", value1, value2, "requestUri");
            return (Criteria) this;
        }

        public Criteria andRequestUriNotBetween(String value1, String value2) {
            addCriterion("request_uri not between", value1, value2, "requestUri");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
