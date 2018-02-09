package com.lucy.manager.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserPointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPointExample() {
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

        public Criteria andUserpointidIsNull() {
            addCriterion("UserPointId is null");
            return (Criteria) this;
        }

        public Criteria andUserpointidIsNotNull() {
            addCriterion("UserPointId is not null");
            return (Criteria) this;
        }

        public Criteria andUserpointidEqualTo(Integer value) {
            addCriterion("UserPointId =", value, "userpointid");
            return (Criteria) this;
        }

        public Criteria andUserpointidNotEqualTo(Integer value) {
            addCriterion("UserPointId <>", value, "userpointid");
            return (Criteria) this;
        }

        public Criteria andUserpointidGreaterThan(Integer value) {
            addCriterion("UserPointId >", value, "userpointid");
            return (Criteria) this;
        }

        public Criteria andUserpointidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserPointId >=", value, "userpointid");
            return (Criteria) this;
        }

        public Criteria andUserpointidLessThan(Integer value) {
            addCriterion("UserPointId <", value, "userpointid");
            return (Criteria) this;
        }

        public Criteria andUserpointidLessThanOrEqualTo(Integer value) {
            addCriterion("UserPointId <=", value, "userpointid");
            return (Criteria) this;
        }

        public Criteria andUserpointidIn(List<Integer> values) {
            addCriterion("UserPointId in", values, "userpointid");
            return (Criteria) this;
        }

        public Criteria andUserpointidNotIn(List<Integer> values) {
            addCriterion("UserPointId not in", values, "userpointid");
            return (Criteria) this;
        }

        public Criteria andUserpointidBetween(Integer value1, Integer value2) {
            addCriterion("UserPointId between", value1, value2, "userpointid");
            return (Criteria) this;
        }

        public Criteria andUserpointidNotBetween(Integer value1, Integer value2) {
            addCriterion("UserPointId not between", value1, value2, "userpointid");
            return (Criteria) this;
        }

        public Criteria andCintegralIsNull() {
            addCriterion("CIntegral is null");
            return (Criteria) this;
        }

        public Criteria andCintegralIsNotNull() {
            addCriterion("CIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andCintegralEqualTo(Integer value) {
            addCriterion("CIntegral =", value, "cintegral");
            return (Criteria) this;
        }

        public Criteria andCintegralNotEqualTo(Integer value) {
            addCriterion("CIntegral <>", value, "cintegral");
            return (Criteria) this;
        }

        public Criteria andCintegralGreaterThan(Integer value) {
            addCriterion("CIntegral >", value, "cintegral");
            return (Criteria) this;
        }

        public Criteria andCintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("CIntegral >=", value, "cintegral");
            return (Criteria) this;
        }

        public Criteria andCintegralLessThan(Integer value) {
            addCriterion("CIntegral <", value, "cintegral");
            return (Criteria) this;
        }

        public Criteria andCintegralLessThanOrEqualTo(Integer value) {
            addCriterion("CIntegral <=", value, "cintegral");
            return (Criteria) this;
        }

        public Criteria andCintegralIn(List<Integer> values) {
            addCriterion("CIntegral in", values, "cintegral");
            return (Criteria) this;
        }

        public Criteria andCintegralNotIn(List<Integer> values) {
            addCriterion("CIntegral not in", values, "cintegral");
            return (Criteria) this;
        }

        public Criteria andCintegralBetween(Integer value1, Integer value2) {
            addCriterion("CIntegral between", value1, value2, "cintegral");
            return (Criteria) this;
        }

        public Criteria andCintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("CIntegral not between", value1, value2, "cintegral");
            return (Criteria) this;
        }

        public Criteria andTintegralIsNull() {
            addCriterion("TIntegral is null");
            return (Criteria) this;
        }

        public Criteria andTintegralIsNotNull() {
            addCriterion("TIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andTintegralEqualTo(Integer value) {
            addCriterion("TIntegral =", value, "tintegral");
            return (Criteria) this;
        }

        public Criteria andTintegralNotEqualTo(Integer value) {
            addCriterion("TIntegral <>", value, "tintegral");
            return (Criteria) this;
        }

        public Criteria andTintegralGreaterThan(Integer value) {
            addCriterion("TIntegral >", value, "tintegral");
            return (Criteria) this;
        }

        public Criteria andTintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIntegral >=", value, "tintegral");
            return (Criteria) this;
        }

        public Criteria andTintegralLessThan(Integer value) {
            addCriterion("TIntegral <", value, "tintegral");
            return (Criteria) this;
        }

        public Criteria andTintegralLessThanOrEqualTo(Integer value) {
            addCriterion("TIntegral <=", value, "tintegral");
            return (Criteria) this;
        }

        public Criteria andTintegralIn(List<Integer> values) {
            addCriterion("TIntegral in", values, "tintegral");
            return (Criteria) this;
        }

        public Criteria andTintegralNotIn(List<Integer> values) {
            addCriterion("TIntegral not in", values, "tintegral");
            return (Criteria) this;
        }

        public Criteria andTintegralBetween(Integer value1, Integer value2) {
            addCriterion("TIntegral between", value1, value2, "tintegral");
            return (Criteria) this;
        }

        public Criteria andTintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("TIntegral not between", value1, value2, "tintegral");
            return (Criteria) this;
        }

        public Criteria andInserttimeIsNull() {
            addCriterion("InsertTime is null");
            return (Criteria) this;
        }

        public Criteria andInserttimeIsNotNull() {
            addCriterion("InsertTime is not null");
            return (Criteria) this;
        }

        public Criteria andInserttimeEqualTo(Date value) {
            addCriterion("InsertTime =", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotEqualTo(Date value) {
            addCriterion("InsertTime <>", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeGreaterThan(Date value) {
            addCriterion("InsertTime >", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("InsertTime >=", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeLessThan(Date value) {
            addCriterion("InsertTime <", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeLessThanOrEqualTo(Date value) {
            addCriterion("InsertTime <=", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeIn(List<Date> values) {
            addCriterion("InsertTime in", values, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotIn(List<Date> values) {
            addCriterion("InsertTime not in", values, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeBetween(Date value1, Date value2) {
            addCriterion("InsertTime between", value1, value2, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotBetween(Date value1, Date value2) {
            addCriterion("InsertTime not between", value1, value2, "inserttime");
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