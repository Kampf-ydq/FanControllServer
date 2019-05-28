package com.moon.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbParamExample() {
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

        public Criteria andPressureIsNull() {
            addCriterion("pressure is null");
            return (Criteria) this;
        }

        public Criteria andPressureIsNotNull() {
            addCriterion("pressure is not null");
            return (Criteria) this;
        }

        public Criteria andPressureEqualTo(Float value) {
            addCriterion("pressure =", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotEqualTo(Float value) {
            addCriterion("pressure <>", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureGreaterThan(Float value) {
            addCriterion("pressure >", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureGreaterThanOrEqualTo(Float value) {
            addCriterion("pressure >=", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureLessThan(Float value) {
            addCriterion("pressure <", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureLessThanOrEqualTo(Float value) {
            addCriterion("pressure <=", value, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureIn(List<Float> values) {
            addCriterion("pressure in", values, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotIn(List<Float> values) {
            addCriterion("pressure not in", values, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureBetween(Float value1, Float value2) {
            addCriterion("pressure between", value1, value2, "pressure");
            return (Criteria) this;
        }

        public Criteria andPressureNotBetween(Float value1, Float value2) {
            addCriterion("pressure not between", value1, value2, "pressure");
            return (Criteria) this;
        }

        public Criteria andElectricIsNull() {
            addCriterion("electric is null");
            return (Criteria) this;
        }

        public Criteria andElectricIsNotNull() {
            addCriterion("electric is not null");
            return (Criteria) this;
        }

        public Criteria andElectricEqualTo(Float value) {
            addCriterion("electric =", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricNotEqualTo(Float value) {
            addCriterion("electric <>", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricGreaterThan(Float value) {
            addCriterion("electric >", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricGreaterThanOrEqualTo(Float value) {
            addCriterion("electric >=", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricLessThan(Float value) {
            addCriterion("electric <", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricLessThanOrEqualTo(Float value) {
            addCriterion("electric <=", value, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricIn(List<Float> values) {
            addCriterion("electric in", values, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricNotIn(List<Float> values) {
            addCriterion("electric not in", values, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricBetween(Float value1, Float value2) {
            addCriterion("electric between", value1, value2, "electric");
            return (Criteria) this;
        }

        public Criteria andElectricNotBetween(Float value1, Float value2) {
            addCriterion("electric not between", value1, value2, "electric");
            return (Criteria) this;
        }

        public Criteria andActivePowerIsNull() {
            addCriterion("active_power is null");
            return (Criteria) this;
        }

        public Criteria andActivePowerIsNotNull() {
            addCriterion("active_power is not null");
            return (Criteria) this;
        }

        public Criteria andActivePowerEqualTo(Float value) {
            addCriterion("active_power =", value, "activePower");
            return (Criteria) this;
        }

        public Criteria andActivePowerNotEqualTo(Float value) {
            addCriterion("active_power <>", value, "activePower");
            return (Criteria) this;
        }

        public Criteria andActivePowerGreaterThan(Float value) {
            addCriterion("active_power >", value, "activePower");
            return (Criteria) this;
        }

        public Criteria andActivePowerGreaterThanOrEqualTo(Float value) {
            addCriterion("active_power >=", value, "activePower");
            return (Criteria) this;
        }

        public Criteria andActivePowerLessThan(Float value) {
            addCriterion("active_power <", value, "activePower");
            return (Criteria) this;
        }

        public Criteria andActivePowerLessThanOrEqualTo(Float value) {
            addCriterion("active_power <=", value, "activePower");
            return (Criteria) this;
        }

        public Criteria andActivePowerIn(List<Float> values) {
            addCriterion("active_power in", values, "activePower");
            return (Criteria) this;
        }

        public Criteria andActivePowerNotIn(List<Float> values) {
            addCriterion("active_power not in", values, "activePower");
            return (Criteria) this;
        }

        public Criteria andActivePowerBetween(Float value1, Float value2) {
            addCriterion("active_power between", value1, value2, "activePower");
            return (Criteria) this;
        }

        public Criteria andActivePowerNotBetween(Float value1, Float value2) {
            addCriterion("active_power not between", value1, value2, "activePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerIsNull() {
            addCriterion("reactive_power is null");
            return (Criteria) this;
        }

        public Criteria andReactivePowerIsNotNull() {
            addCriterion("reactive_power is not null");
            return (Criteria) this;
        }

        public Criteria andReactivePowerEqualTo(Float value) {
            addCriterion("reactive_power =", value, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerNotEqualTo(Float value) {
            addCriterion("reactive_power <>", value, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerGreaterThan(Float value) {
            addCriterion("reactive_power >", value, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerGreaterThanOrEqualTo(Float value) {
            addCriterion("reactive_power >=", value, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerLessThan(Float value) {
            addCriterion("reactive_power <", value, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerLessThanOrEqualTo(Float value) {
            addCriterion("reactive_power <=", value, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerIn(List<Float> values) {
            addCriterion("reactive_power in", values, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerNotIn(List<Float> values) {
            addCriterion("reactive_power not in", values, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerBetween(Float value1, Float value2) {
            addCriterion("reactive_power between", value1, value2, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andReactivePowerNotBetween(Float value1, Float value2) {
            addCriterion("reactive_power not between", value1, value2, "reactivePower");
            return (Criteria) this;
        }

        public Criteria andWindSpeedIsNull() {
            addCriterion("wind_speed is null");
            return (Criteria) this;
        }

        public Criteria andWindSpeedIsNotNull() {
            addCriterion("wind_speed is not null");
            return (Criteria) this;
        }

        public Criteria andWindSpeedEqualTo(Float value) {
            addCriterion("wind_speed =", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedNotEqualTo(Float value) {
            addCriterion("wind_speed <>", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedGreaterThan(Float value) {
            addCriterion("wind_speed >", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedGreaterThanOrEqualTo(Float value) {
            addCriterion("wind_speed >=", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedLessThan(Float value) {
            addCriterion("wind_speed <", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedLessThanOrEqualTo(Float value) {
            addCriterion("wind_speed <=", value, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedIn(List<Float> values) {
            addCriterion("wind_speed in", values, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedNotIn(List<Float> values) {
            addCriterion("wind_speed not in", values, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedBetween(Float value1, Float value2) {
            addCriterion("wind_speed between", value1, value2, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindSpeedNotBetween(Float value1, Float value2) {
            addCriterion("wind_speed not between", value1, value2, "windSpeed");
            return (Criteria) this;
        }

        public Criteria andWindAngleIsNull() {
            addCriterion("wind_angle is null");
            return (Criteria) this;
        }

        public Criteria andWindAngleIsNotNull() {
            addCriterion("wind_angle is not null");
            return (Criteria) this;
        }

        public Criteria andWindAngleEqualTo(Float value) {
            addCriterion("wind_angle =", value, "windAngle");
            return (Criteria) this;
        }

        public Criteria andWindAngleNotEqualTo(Float value) {
            addCriterion("wind_angle <>", value, "windAngle");
            return (Criteria) this;
        }

        public Criteria andWindAngleGreaterThan(Float value) {
            addCriterion("wind_angle >", value, "windAngle");
            return (Criteria) this;
        }

        public Criteria andWindAngleGreaterThanOrEqualTo(Float value) {
            addCriterion("wind_angle >=", value, "windAngle");
            return (Criteria) this;
        }

        public Criteria andWindAngleLessThan(Float value) {
            addCriterion("wind_angle <", value, "windAngle");
            return (Criteria) this;
        }

        public Criteria andWindAngleLessThanOrEqualTo(Float value) {
            addCriterion("wind_angle <=", value, "windAngle");
            return (Criteria) this;
        }

        public Criteria andWindAngleIn(List<Float> values) {
            addCriterion("wind_angle in", values, "windAngle");
            return (Criteria) this;
        }

        public Criteria andWindAngleNotIn(List<Float> values) {
            addCriterion("wind_angle not in", values, "windAngle");
            return (Criteria) this;
        }

        public Criteria andWindAngleBetween(Float value1, Float value2) {
            addCriterion("wind_angle between", value1, value2, "windAngle");
            return (Criteria) this;
        }

        public Criteria andWindAngleNotBetween(Float value1, Float value2) {
            addCriterion("wind_angle not between", value1, value2, "windAngle");
            return (Criteria) this;
        }

        public Criteria andRotationSpeedIsNull() {
            addCriterion("rotation_speed is null");
            return (Criteria) this;
        }

        public Criteria andRotationSpeedIsNotNull() {
            addCriterion("rotation_speed is not null");
            return (Criteria) this;
        }

        public Criteria andRotationSpeedEqualTo(Float value) {
            addCriterion("rotation_speed =", value, "rotationSpeed");
            return (Criteria) this;
        }

        public Criteria andRotationSpeedNotEqualTo(Float value) {
            addCriterion("rotation_speed <>", value, "rotationSpeed");
            return (Criteria) this;
        }

        public Criteria andRotationSpeedGreaterThan(Float value) {
            addCriterion("rotation_speed >", value, "rotationSpeed");
            return (Criteria) this;
        }

        public Criteria andRotationSpeedGreaterThanOrEqualTo(Float value) {
            addCriterion("rotation_speed >=", value, "rotationSpeed");
            return (Criteria) this;
        }

        public Criteria andRotationSpeedLessThan(Float value) {
            addCriterion("rotation_speed <", value, "rotationSpeed");
            return (Criteria) this;
        }

        public Criteria andRotationSpeedLessThanOrEqualTo(Float value) {
            addCriterion("rotation_speed <=", value, "rotationSpeed");
            return (Criteria) this;
        }

        public Criteria andRotationSpeedIn(List<Float> values) {
            addCriterion("rotation_speed in", values, "rotationSpeed");
            return (Criteria) this;
        }

        public Criteria andRotationSpeedNotIn(List<Float> values) {
            addCriterion("rotation_speed not in", values, "rotationSpeed");
            return (Criteria) this;
        }

        public Criteria andRotationSpeedBetween(Float value1, Float value2) {
            addCriterion("rotation_speed between", value1, value2, "rotationSpeed");
            return (Criteria) this;
        }

        public Criteria andRotationSpeedNotBetween(Float value1, Float value2) {
            addCriterion("rotation_speed not between", value1, value2, "rotationSpeed");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(Float value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(Float value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(Float value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(Float value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(Float value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(Float value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<Float> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<Float> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(Float value1, Float value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(Float value1, Float value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andCableAngleIsNull() {
            addCriterion("cable_angle is null");
            return (Criteria) this;
        }

        public Criteria andCableAngleIsNotNull() {
            addCriterion("cable_angle is not null");
            return (Criteria) this;
        }

        public Criteria andCableAngleEqualTo(Float value) {
            addCriterion("cable_angle =", value, "cableAngle");
            return (Criteria) this;
        }

        public Criteria andCableAngleNotEqualTo(Float value) {
            addCriterion("cable_angle <>", value, "cableAngle");
            return (Criteria) this;
        }

        public Criteria andCableAngleGreaterThan(Float value) {
            addCriterion("cable_angle >", value, "cableAngle");
            return (Criteria) this;
        }

        public Criteria andCableAngleGreaterThanOrEqualTo(Float value) {
            addCriterion("cable_angle >=", value, "cableAngle");
            return (Criteria) this;
        }

        public Criteria andCableAngleLessThan(Float value) {
            addCriterion("cable_angle <", value, "cableAngle");
            return (Criteria) this;
        }

        public Criteria andCableAngleLessThanOrEqualTo(Float value) {
            addCriterion("cable_angle <=", value, "cableAngle");
            return (Criteria) this;
        }

        public Criteria andCableAngleIn(List<Float> values) {
            addCriterion("cable_angle in", values, "cableAngle");
            return (Criteria) this;
        }

        public Criteria andCableAngleNotIn(List<Float> values) {
            addCriterion("cable_angle not in", values, "cableAngle");
            return (Criteria) this;
        }

        public Criteria andCableAngleBetween(Float value1, Float value2) {
            addCriterion("cable_angle between", value1, value2, "cableAngle");
            return (Criteria) this;
        }

        public Criteria andCableAngleNotBetween(Float value1, Float value2) {
            addCriterion("cable_angle not between", value1, value2, "cableAngle");
            return (Criteria) this;
        }

        public Criteria andDynamoTemIsNull() {
            addCriterion("dynamo_tem is null");
            return (Criteria) this;
        }

        public Criteria andDynamoTemIsNotNull() {
            addCriterion("dynamo_tem is not null");
            return (Criteria) this;
        }

        public Criteria andDynamoTemEqualTo(Float value) {
            addCriterion("dynamo_tem =", value, "dynamoTem");
            return (Criteria) this;
        }

        public Criteria andDynamoTemNotEqualTo(Float value) {
            addCriterion("dynamo_tem <>", value, "dynamoTem");
            return (Criteria) this;
        }

        public Criteria andDynamoTemGreaterThan(Float value) {
            addCriterion("dynamo_tem >", value, "dynamoTem");
            return (Criteria) this;
        }

        public Criteria andDynamoTemGreaterThanOrEqualTo(Float value) {
            addCriterion("dynamo_tem >=", value, "dynamoTem");
            return (Criteria) this;
        }

        public Criteria andDynamoTemLessThan(Float value) {
            addCriterion("dynamo_tem <", value, "dynamoTem");
            return (Criteria) this;
        }

        public Criteria andDynamoTemLessThanOrEqualTo(Float value) {
            addCriterion("dynamo_tem <=", value, "dynamoTem");
            return (Criteria) this;
        }

        public Criteria andDynamoTemIn(List<Float> values) {
            addCriterion("dynamo_tem in", values, "dynamoTem");
            return (Criteria) this;
        }

        public Criteria andDynamoTemNotIn(List<Float> values) {
            addCriterion("dynamo_tem not in", values, "dynamoTem");
            return (Criteria) this;
        }

        public Criteria andDynamoTemBetween(Float value1, Float value2) {
            addCriterion("dynamo_tem between", value1, value2, "dynamoTem");
            return (Criteria) this;
        }

        public Criteria andDynamoTemNotBetween(Float value1, Float value2) {
            addCriterion("dynamo_tem not between", value1, value2, "dynamoTem");
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