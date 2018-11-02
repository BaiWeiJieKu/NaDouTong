package com.ndt.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaptaininfoExample {
    protected String orderByClause;

    protected boolean distinct;
    
    protected int offset;
    
    protected int limit;

    protected List<Criteria> oredCriteria;
    

    public CaptaininfoExample(int offset, int limit) {
		super();
		this.offset = offset;
		this.limit = limit;
		oredCriteria = new ArrayList<Criteria>();
	}
    

	public int getOffset() {
		return offset;
	}


	public void setOffset(int offset) {
		this.offset = offset;
	}


	public int getLimit() {
		return limit;
	}


	public void setLimit(int limit) {
		this.limit = limit;
	}


	public CaptaininfoExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCaptainnameIsNull() {
            addCriterion("captainName is null");
            return (Criteria) this;
        }

        public Criteria andCaptainnameIsNotNull() {
            addCriterion("captainName is not null");
            return (Criteria) this;
        }

        public Criteria andCaptainnameEqualTo(String value) {
            addCriterion("captainName =", value, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameNotEqualTo(String value) {
            addCriterion("captainName <>", value, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameGreaterThan(String value) {
            addCriterion("captainName >", value, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameGreaterThanOrEqualTo(String value) {
            addCriterion("captainName >=", value, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameLessThan(String value) {
            addCriterion("captainName <", value, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameLessThanOrEqualTo(String value) {
            addCriterion("captainName <=", value, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameLike(String value) {
            addCriterion("captainName like", value, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameNotLike(String value) {
            addCriterion("captainName not like", value, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameIn(List<String> values) {
            addCriterion("captainName in", values, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameNotIn(List<String> values) {
            addCriterion("captainName not in", values, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameBetween(String value1, String value2) {
            addCriterion("captainName between", value1, value2, "captainname");
            return (Criteria) this;
        }

        public Criteria andCaptainnameNotBetween(String value1, String value2) {
            addCriterion("captainName not between", value1, value2, "captainname");
            return (Criteria) this;
        }

        public Criteria andFleetnameIsNull() {
            addCriterion("fleetName is null");
            return (Criteria) this;
        }

        public Criteria andFleetnameIsNotNull() {
            addCriterion("fleetName is not null");
            return (Criteria) this;
        }

        public Criteria andFleetnameEqualTo(String value) {
            addCriterion("fleetName =", value, "fleetname");
            return (Criteria) this;
        }

        public Criteria andFleetnameNotEqualTo(String value) {
            addCriterion("fleetName <>", value, "fleetname");
            return (Criteria) this;
        }

        public Criteria andFleetnameGreaterThan(String value) {
            addCriterion("fleetName >", value, "fleetname");
            return (Criteria) this;
        }

        public Criteria andFleetnameGreaterThanOrEqualTo(String value) {
            addCriterion("fleetName >=", value, "fleetname");
            return (Criteria) this;
        }

        public Criteria andFleetnameLessThan(String value) {
            addCriterion("fleetName <", value, "fleetname");
            return (Criteria) this;
        }

        public Criteria andFleetnameLessThanOrEqualTo(String value) {
            addCriterion("fleetName <=", value, "fleetname");
            return (Criteria) this;
        }

        public Criteria andFleetnameLike(String value) {
            addCriterion("fleetName like", value, "fleetname");
            return (Criteria) this;
        }

        public Criteria andFleetnameNotLike(String value) {
            addCriterion("fleetName not like", value, "fleetname");
            return (Criteria) this;
        }

        public Criteria andFleetnameIn(List<String> values) {
            addCriterion("fleetName in", values, "fleetname");
            return (Criteria) this;
        }

        public Criteria andFleetnameNotIn(List<String> values) {
            addCriterion("fleetName not in", values, "fleetname");
            return (Criteria) this;
        }

        public Criteria andFleetnameBetween(String value1, String value2) {
            addCriterion("fleetName between", value1, value2, "fleetname");
            return (Criteria) this;
        }

        public Criteria andFleetnameNotBetween(String value1, String value2) {
            addCriterion("fleetName not between", value1, value2, "fleetname");
            return (Criteria) this;
        }

        public Criteria andCaptaintelIsNull() {
            addCriterion("captainTel is null");
            return (Criteria) this;
        }

        public Criteria andCaptaintelIsNotNull() {
            addCriterion("captainTel is not null");
            return (Criteria) this;
        }

        public Criteria andCaptaintelEqualTo(String value) {
            addCriterion("captainTel =", value, "captaintel");
            return (Criteria) this;
        }

        public Criteria andCaptaintelNotEqualTo(String value) {
            addCriterion("captainTel <>", value, "captaintel");
            return (Criteria) this;
        }

        public Criteria andCaptaintelGreaterThan(String value) {
            addCriterion("captainTel >", value, "captaintel");
            return (Criteria) this;
        }

        public Criteria andCaptaintelGreaterThanOrEqualTo(String value) {
            addCriterion("captainTel >=", value, "captaintel");
            return (Criteria) this;
        }

        public Criteria andCaptaintelLessThan(String value) {
            addCriterion("captainTel <", value, "captaintel");
            return (Criteria) this;
        }

        public Criteria andCaptaintelLessThanOrEqualTo(String value) {
            addCriterion("captainTel <=", value, "captaintel");
            return (Criteria) this;
        }

        public Criteria andCaptaintelLike(String value) {
            addCriterion("captainTel like", value, "captaintel");
            return (Criteria) this;
        }

        public Criteria andCaptaintelNotLike(String value) {
            addCriterion("captainTel not like", value, "captaintel");
            return (Criteria) this;
        }

        public Criteria andCaptaintelIn(List<String> values) {
            addCriterion("captainTel in", values, "captaintel");
            return (Criteria) this;
        }

        public Criteria andCaptaintelNotIn(List<String> values) {
            addCriterion("captainTel not in", values, "captaintel");
            return (Criteria) this;
        }

        public Criteria andCaptaintelBetween(String value1, String value2) {
            addCriterion("captainTel between", value1, value2, "captaintel");
            return (Criteria) this;
        }

        public Criteria andCaptaintelNotBetween(String value1, String value2) {
            addCriterion("captainTel not between", value1, value2, "captaintel");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("mark like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("mark not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("mark not between", value1, value2, "mark");
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