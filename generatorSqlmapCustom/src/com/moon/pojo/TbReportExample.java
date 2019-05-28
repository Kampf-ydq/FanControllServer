package com.moon.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbReportExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNull() {
            addCriterion("trade_time is null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIsNotNull() {
            addCriterion("trade_time is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTimeEqualTo(String value) {
            addCriterion("trade_time =", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotEqualTo(String value) {
            addCriterion("trade_time <>", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThan(String value) {
            addCriterion("trade_time >", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("trade_time >=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThan(String value) {
            addCriterion("trade_time <", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLessThanOrEqualTo(String value) {
            addCriterion("trade_time <=", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeLike(String value) {
            addCriterion("trade_time like", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotLike(String value) {
            addCriterion("trade_time not like", value, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeIn(List<String> values) {
            addCriterion("trade_time in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotIn(List<String> values) {
            addCriterion("trade_time not in", values, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeBetween(String value1, String value2) {
            addCriterion("trade_time between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andTradeTimeNotBetween(String value1, String value2) {
            addCriterion("trade_time not between", value1, value2, "tradeTime");
            return (Criteria) this;
        }

        public Criteria andPowerValIsNull() {
            addCriterion("power_val is null");
            return (Criteria) this;
        }

        public Criteria andPowerValIsNotNull() {
            addCriterion("power_val is not null");
            return (Criteria) this;
        }

        public Criteria andPowerValEqualTo(Float value) {
            addCriterion("power_val =", value, "powerVal");
            return (Criteria) this;
        }

        public Criteria andPowerValNotEqualTo(Float value) {
            addCriterion("power_val <>", value, "powerVal");
            return (Criteria) this;
        }

        public Criteria andPowerValGreaterThan(Float value) {
            addCriterion("power_val >", value, "powerVal");
            return (Criteria) this;
        }

        public Criteria andPowerValGreaterThanOrEqualTo(Float value) {
            addCriterion("power_val >=", value, "powerVal");
            return (Criteria) this;
        }

        public Criteria andPowerValLessThan(Float value) {
            addCriterion("power_val <", value, "powerVal");
            return (Criteria) this;
        }

        public Criteria andPowerValLessThanOrEqualTo(Float value) {
            addCriterion("power_val <=", value, "powerVal");
            return (Criteria) this;
        }

        public Criteria andPowerValIn(List<Float> values) {
            addCriterion("power_val in", values, "powerVal");
            return (Criteria) this;
        }

        public Criteria andPowerValNotIn(List<Float> values) {
            addCriterion("power_val not in", values, "powerVal");
            return (Criteria) this;
        }

        public Criteria andPowerValBetween(Float value1, Float value2) {
            addCriterion("power_val between", value1, value2, "powerVal");
            return (Criteria) this;
        }

        public Criteria andPowerValNotBetween(Float value1, Float value2) {
            addCriterion("power_val not between", value1, value2, "powerVal");
            return (Criteria) this;
        }

        public Criteria andEnvirTempIsNull() {
            addCriterion("envir_temp is null");
            return (Criteria) this;
        }

        public Criteria andEnvirTempIsNotNull() {
            addCriterion("envir_temp is not null");
            return (Criteria) this;
        }

        public Criteria andEnvirTempEqualTo(Float value) {
            addCriterion("envir_temp =", value, "envirTemp");
            return (Criteria) this;
        }

        public Criteria andEnvirTempNotEqualTo(Float value) {
            addCriterion("envir_temp <>", value, "envirTemp");
            return (Criteria) this;
        }

        public Criteria andEnvirTempGreaterThan(Float value) {
            addCriterion("envir_temp >", value, "envirTemp");
            return (Criteria) this;
        }

        public Criteria andEnvirTempGreaterThanOrEqualTo(Float value) {
            addCriterion("envir_temp >=", value, "envirTemp");
            return (Criteria) this;
        }

        public Criteria andEnvirTempLessThan(Float value) {
            addCriterion("envir_temp <", value, "envirTemp");
            return (Criteria) this;
        }

        public Criteria andEnvirTempLessThanOrEqualTo(Float value) {
            addCriterion("envir_temp <=", value, "envirTemp");
            return (Criteria) this;
        }

        public Criteria andEnvirTempIn(List<Float> values) {
            addCriterion("envir_temp in", values, "envirTemp");
            return (Criteria) this;
        }

        public Criteria andEnvirTempNotIn(List<Float> values) {
            addCriterion("envir_temp not in", values, "envirTemp");
            return (Criteria) this;
        }

        public Criteria andEnvirTempBetween(Float value1, Float value2) {
            addCriterion("envir_temp between", value1, value2, "envirTemp");
            return (Criteria) this;
        }

        public Criteria andEnvirTempNotBetween(Float value1, Float value2) {
            addCriterion("envir_temp not between", value1, value2, "envirTemp");
            return (Criteria) this;
        }

        public Criteria andMotorAngleIsNull() {
            addCriterion("motor_angle is null");
            return (Criteria) this;
        }

        public Criteria andMotorAngleIsNotNull() {
            addCriterion("motor_angle is not null");
            return (Criteria) this;
        }

        public Criteria andMotorAngleEqualTo(Float value) {
            addCriterion("motor_angle =", value, "motorAngle");
            return (Criteria) this;
        }

        public Criteria andMotorAngleNotEqualTo(Float value) {
            addCriterion("motor_angle <>", value, "motorAngle");
            return (Criteria) this;
        }

        public Criteria andMotorAngleGreaterThan(Float value) {
            addCriterion("motor_angle >", value, "motorAngle");
            return (Criteria) this;
        }

        public Criteria andMotorAngleGreaterThanOrEqualTo(Float value) {
            addCriterion("motor_angle >=", value, "motorAngle");
            return (Criteria) this;
        }

        public Criteria andMotorAngleLessThan(Float value) {
            addCriterion("motor_angle <", value, "motorAngle");
            return (Criteria) this;
        }

        public Criteria andMotorAngleLessThanOrEqualTo(Float value) {
            addCriterion("motor_angle <=", value, "motorAngle");
            return (Criteria) this;
        }

        public Criteria andMotorAngleIn(List<Float> values) {
            addCriterion("motor_angle in", values, "motorAngle");
            return (Criteria) this;
        }

        public Criteria andMotorAngleNotIn(List<Float> values) {
            addCriterion("motor_angle not in", values, "motorAngle");
            return (Criteria) this;
        }

        public Criteria andMotorAngleBetween(Float value1, Float value2) {
            addCriterion("motor_angle between", value1, value2, "motorAngle");
            return (Criteria) this;
        }

        public Criteria andMotorAngleNotBetween(Float value1, Float value2) {
            addCriterion("motor_angle not between", value1, value2, "motorAngle");
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