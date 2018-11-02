package com.ndt.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SendermanagementinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected int offset;
    
    protected int limit;

    public SendermanagementinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }
    
    public SendermanagementinfoExample(int offset, int limit) {
    	oredCriteria = new ArrayList<Criteria>();
    	this.offset = offset;
		this.limit = limit;
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

        public Criteria andOrdernumberIsNull() {
            addCriterion("orderNumber is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNotNull() {
            addCriterion("orderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberEqualTo(String value) {
            addCriterion("orderNumber =", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotEqualTo(String value) {
            addCriterion("orderNumber <>", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThan(String value) {
            addCriterion("orderNumber >", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThanOrEqualTo(String value) {
            addCriterion("orderNumber >=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThan(String value) {
            addCriterion("orderNumber <", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThanOrEqualTo(String value) {
            addCriterion("orderNumber <=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLike(String value) {
            addCriterion("orderNumber like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotLike(String value) {
            addCriterion("orderNumber not like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIn(List<String> values) {
            addCriterion("orderNumber in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotIn(List<String> values) {
            addCriterion("orderNumber not in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberBetween(String value1, String value2) {
            addCriterion("orderNumber between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotBetween(String value1, String value2) {
            addCriterion("orderNumber not between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyIsNull() {
            addCriterion("orderMoney is null");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyIsNotNull() {
            addCriterion("orderMoney is not null");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyEqualTo(Double value) {
            addCriterion("orderMoney =", value, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyNotEqualTo(Double value) {
            addCriterion("orderMoney <>", value, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyGreaterThan(Double value) {
            addCriterion("orderMoney >", value, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("orderMoney >=", value, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyLessThan(Double value) {
            addCriterion("orderMoney <", value, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyLessThanOrEqualTo(Double value) {
            addCriterion("orderMoney <=", value, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyIn(List<Double> values) {
            addCriterion("orderMoney in", values, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyNotIn(List<Double> values) {
            addCriterion("orderMoney not in", values, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyBetween(Double value1, Double value2) {
            addCriterion("orderMoney between", value1, value2, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andOrdermoneyNotBetween(Double value1, Double value2) {
            addCriterion("orderMoney not between", value1, value2, "ordermoney");
            return (Criteria) this;
        }

        public Criteria andNumberplateIsNull() {
            addCriterion("numberPlate is null");
            return (Criteria) this;
        }

        public Criteria andNumberplateIsNotNull() {
            addCriterion("numberPlate is not null");
            return (Criteria) this;
        }

        public Criteria andNumberplateEqualTo(String value) {
            addCriterion("numberPlate =", value, "numberplate");
            return (Criteria) this;
        }

        public Criteria andNumberplateNotEqualTo(String value) {
            addCriterion("numberPlate <>", value, "numberplate");
            return (Criteria) this;
        }

        public Criteria andNumberplateGreaterThan(String value) {
            addCriterion("numberPlate >", value, "numberplate");
            return (Criteria) this;
        }

        public Criteria andNumberplateGreaterThanOrEqualTo(String value) {
            addCriterion("numberPlate >=", value, "numberplate");
            return (Criteria) this;
        }

        public Criteria andNumberplateLessThan(String value) {
            addCriterion("numberPlate <", value, "numberplate");
            return (Criteria) this;
        }

        public Criteria andNumberplateLessThanOrEqualTo(String value) {
            addCriterion("numberPlate <=", value, "numberplate");
            return (Criteria) this;
        }

        public Criteria andNumberplateLike(String value) {
            addCriterion("numberPlate like", value, "numberplate");
            return (Criteria) this;
        }

        public Criteria andNumberplateNotLike(String value) {
            addCriterion("numberPlate not like", value, "numberplate");
            return (Criteria) this;
        }

        public Criteria andNumberplateIn(List<String> values) {
            addCriterion("numberPlate in", values, "numberplate");
            return (Criteria) this;
        }

        public Criteria andNumberplateNotIn(List<String> values) {
            addCriterion("numberPlate not in", values, "numberplate");
            return (Criteria) this;
        }

        public Criteria andNumberplateBetween(String value1, String value2) {
            addCriterion("numberPlate between", value1, value2, "numberplate");
            return (Criteria) this;
        }

        public Criteria andNumberplateNotBetween(String value1, String value2) {
            addCriterion("numberPlate not between", value1, value2, "numberplate");
            return (Criteria) this;
        }

        public Criteria andOrderdriverIsNull() {
            addCriterion("orderDriver is null");
            return (Criteria) this;
        }

        public Criteria andOrderdriverIsNotNull() {
            addCriterion("orderDriver is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdriverEqualTo(String value) {
            addCriterion("orderDriver =", value, "orderdriver");
            return (Criteria) this;
        }

        public Criteria andOrderdriverNotEqualTo(String value) {
            addCriterion("orderDriver <>", value, "orderdriver");
            return (Criteria) this;
        }

        public Criteria andOrderdriverGreaterThan(String value) {
            addCriterion("orderDriver >", value, "orderdriver");
            return (Criteria) this;
        }

        public Criteria andOrderdriverGreaterThanOrEqualTo(String value) {
            addCriterion("orderDriver >=", value, "orderdriver");
            return (Criteria) this;
        }

        public Criteria andOrderdriverLessThan(String value) {
            addCriterion("orderDriver <", value, "orderdriver");
            return (Criteria) this;
        }

        public Criteria andOrderdriverLessThanOrEqualTo(String value) {
            addCriterion("orderDriver <=", value, "orderdriver");
            return (Criteria) this;
        }

        public Criteria andOrderdriverLike(String value) {
            addCriterion("orderDriver like", value, "orderdriver");
            return (Criteria) this;
        }

        public Criteria andOrderdriverNotLike(String value) {
            addCriterion("orderDriver not like", value, "orderdriver");
            return (Criteria) this;
        }

        public Criteria andOrderdriverIn(List<String> values) {
            addCriterion("orderDriver in", values, "orderdriver");
            return (Criteria) this;
        }

        public Criteria andOrderdriverNotIn(List<String> values) {
            addCriterion("orderDriver not in", values, "orderdriver");
            return (Criteria) this;
        }

        public Criteria andOrderdriverBetween(String value1, String value2) {
            addCriterion("orderDriver between", value1, value2, "orderdriver");
            return (Criteria) this;
        }

        public Criteria andOrderdriverNotBetween(String value1, String value2) {
            addCriterion("orderDriver not between", value1, value2, "orderdriver");
            return (Criteria) this;
        }

        public Criteria andOncetrafficIsNull() {
            addCriterion("onceTraffic is null");
            return (Criteria) this;
        }

        public Criteria andOncetrafficIsNotNull() {
            addCriterion("onceTraffic is not null");
            return (Criteria) this;
        }

        public Criteria andOncetrafficEqualTo(String value) {
            addCriterion("onceTraffic =", value, "oncetraffic");
            return (Criteria) this;
        }

        public Criteria andOncetrafficNotEqualTo(String value) {
            addCriterion("onceTraffic <>", value, "oncetraffic");
            return (Criteria) this;
        }

        public Criteria andOncetrafficGreaterThan(String value) {
            addCriterion("onceTraffic >", value, "oncetraffic");
            return (Criteria) this;
        }

        public Criteria andOncetrafficGreaterThanOrEqualTo(String value) {
            addCriterion("onceTraffic >=", value, "oncetraffic");
            return (Criteria) this;
        }

        public Criteria andOncetrafficLessThan(String value) {
            addCriterion("onceTraffic <", value, "oncetraffic");
            return (Criteria) this;
        }

        public Criteria andOncetrafficLessThanOrEqualTo(String value) {
            addCriterion("onceTraffic <=", value, "oncetraffic");
            return (Criteria) this;
        }

        public Criteria andOncetrafficLike(String value) {
            addCriterion("onceTraffic like", value, "oncetraffic");
            return (Criteria) this;
        }

        public Criteria andOncetrafficNotLike(String value) {
            addCriterion("onceTraffic not like", value, "oncetraffic");
            return (Criteria) this;
        }

        public Criteria andOncetrafficIn(List<String> values) {
            addCriterion("onceTraffic in", values, "oncetraffic");
            return (Criteria) this;
        }

        public Criteria andOncetrafficNotIn(List<String> values) {
            addCriterion("onceTraffic not in", values, "oncetraffic");
            return (Criteria) this;
        }

        public Criteria andOncetrafficBetween(String value1, String value2) {
            addCriterion("onceTraffic between", value1, value2, "oncetraffic");
            return (Criteria) this;
        }

        public Criteria andOncetrafficNotBetween(String value1, String value2) {
            addCriterion("onceTraffic not between", value1, value2, "oncetraffic");
            return (Criteria) this;
        }

        public Criteria andSinglenumberIsNull() {
            addCriterion("singleNumber is null");
            return (Criteria) this;
        }

        public Criteria andSinglenumberIsNotNull() {
            addCriterion("singleNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSinglenumberEqualTo(String value) {
            addCriterion("singleNumber =", value, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberNotEqualTo(String value) {
            addCriterion("singleNumber <>", value, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberGreaterThan(String value) {
            addCriterion("singleNumber >", value, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberGreaterThanOrEqualTo(String value) {
            addCriterion("singleNumber >=", value, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberLessThan(String value) {
            addCriterion("singleNumber <", value, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberLessThanOrEqualTo(String value) {
            addCriterion("singleNumber <=", value, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberLike(String value) {
            addCriterion("singleNumber like", value, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberNotLike(String value) {
            addCriterion("singleNumber not like", value, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberIn(List<String> values) {
            addCriterion("singleNumber in", values, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberNotIn(List<String> values) {
            addCriterion("singleNumber not in", values, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberBetween(String value1, String value2) {
            addCriterion("singleNumber between", value1, value2, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andSinglenumberNotBetween(String value1, String value2) {
            addCriterion("singleNumber not between", value1, value2, "singlenumber");
            return (Criteria) this;
        }

        public Criteria andWaybillstateIsNull() {
            addCriterion("WaybillState is null");
            return (Criteria) this;
        }

        public Criteria andWaybillstateIsNotNull() {
            addCriterion("WaybillState is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillstateEqualTo(String value) {
            addCriterion("WaybillState =", value, "waybillstate");
            return (Criteria) this;
        }

        public Criteria andWaybillstateNotEqualTo(String value) {
            addCriterion("WaybillState <>", value, "waybillstate");
            return (Criteria) this;
        }

        public Criteria andWaybillstateGreaterThan(String value) {
            addCriterion("WaybillState >", value, "waybillstate");
            return (Criteria) this;
        }

        public Criteria andWaybillstateGreaterThanOrEqualTo(String value) {
            addCriterion("WaybillState >=", value, "waybillstate");
            return (Criteria) this;
        }

        public Criteria andWaybillstateLessThan(String value) {
            addCriterion("WaybillState <", value, "waybillstate");
            return (Criteria) this;
        }

        public Criteria andWaybillstateLessThanOrEqualTo(String value) {
            addCriterion("WaybillState <=", value, "waybillstate");
            return (Criteria) this;
        }

        public Criteria andWaybillstateLike(String value) {
            addCriterion("WaybillState like", value, "waybillstate");
            return (Criteria) this;
        }

        public Criteria andWaybillstateNotLike(String value) {
            addCriterion("WaybillState not like", value, "waybillstate");
            return (Criteria) this;
        }

        public Criteria andWaybillstateIn(List<String> values) {
            addCriterion("WaybillState in", values, "waybillstate");
            return (Criteria) this;
        }

        public Criteria andWaybillstateNotIn(List<String> values) {
            addCriterion("WaybillState not in", values, "waybillstate");
            return (Criteria) this;
        }

        public Criteria andWaybillstateBetween(String value1, String value2) {
            addCriterion("WaybillState between", value1, value2, "waybillstate");
            return (Criteria) this;
        }

        public Criteria andWaybillstateNotBetween(String value1, String value2) {
            addCriterion("WaybillState not between", value1, value2, "waybillstate");
            return (Criteria) this;
        }

        public Criteria andTotaltrafficIsNull() {
            addCriterion("totalTraffic is null");
            return (Criteria) this;
        }

        public Criteria andTotaltrafficIsNotNull() {
            addCriterion("totalTraffic is not null");
            return (Criteria) this;
        }

        public Criteria andTotaltrafficEqualTo(String value) {
            addCriterion("totalTraffic =", value, "totaltraffic");
            return (Criteria) this;
        }

        public Criteria andTotaltrafficNotEqualTo(String value) {
            addCriterion("totalTraffic <>", value, "totaltraffic");
            return (Criteria) this;
        }

        public Criteria andTotaltrafficGreaterThan(String value) {
            addCriterion("totalTraffic >", value, "totaltraffic");
            return (Criteria) this;
        }

        public Criteria andTotaltrafficGreaterThanOrEqualTo(String value) {
            addCriterion("totalTraffic >=", value, "totaltraffic");
            return (Criteria) this;
        }

        public Criteria andTotaltrafficLessThan(String value) {
            addCriterion("totalTraffic <", value, "totaltraffic");
            return (Criteria) this;
        }

        public Criteria andTotaltrafficLessThanOrEqualTo(String value) {
            addCriterion("totalTraffic <=", value, "totaltraffic");
            return (Criteria) this;
        }

        public Criteria andTotaltrafficLike(String value) {
            addCriterion("totalTraffic like", value, "totaltraffic");
            return (Criteria) this;
        }

        public Criteria andTotaltrafficNotLike(String value) {
            addCriterion("totalTraffic not like", value, "totaltraffic");
            return (Criteria) this;
        }

        public Criteria andTotaltrafficIn(List<String> values) {
            addCriterion("totalTraffic in", values, "totaltraffic");
            return (Criteria) this;
        }

        public Criteria andTotaltrafficNotIn(List<String> values) {
            addCriterion("totalTraffic not in", values, "totaltraffic");
            return (Criteria) this;
        }

        public Criteria andTotaltrafficBetween(String value1, String value2) {
            addCriterion("totalTraffic between", value1, value2, "totaltraffic");
            return (Criteria) this;
        }

        public Criteria andTotaltrafficNotBetween(String value1, String value2) {
            addCriterion("totalTraffic not between", value1, value2, "totaltraffic");
            return (Criteria) this;
        }

        public Criteria andBtimeIsNull() {
            addCriterion("bTime is null");
            return (Criteria) this;
        }

        public Criteria andBtimeIsNotNull() {
            addCriterion("bTime is not null");
            return (Criteria) this;
        }

        public Criteria andBtimeEqualTo(Date value) {
            addCriterion("bTime =", value, "btime");
            return (Criteria) this;
        }

        public Criteria andBtimeNotEqualTo(Date value) {
            addCriterion("bTime <>", value, "btime");
            return (Criteria) this;
        }

        public Criteria andBtimeGreaterThan(Date value) {
            addCriterion("bTime >", value, "btime");
            return (Criteria) this;
        }

        public Criteria andBtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bTime >=", value, "btime");
            return (Criteria) this;
        }

        public Criteria andBtimeLessThan(Date value) {
            addCriterion("bTime <", value, "btime");
            return (Criteria) this;
        }

        public Criteria andBtimeLessThanOrEqualTo(Date value) {
            addCriterion("bTime <=", value, "btime");
            return (Criteria) this;
        }

        public Criteria andBtimeIn(List<Date> values) {
            addCriterion("bTime in", values, "btime");
            return (Criteria) this;
        }

        public Criteria andBtimeNotIn(List<Date> values) {
            addCriterion("bTime not in", values, "btime");
            return (Criteria) this;
        }

        public Criteria andBtimeBetween(Date value1, Date value2) {
            addCriterion("bTime between", value1, value2, "btime");
            return (Criteria) this;
        }

        public Criteria andBtimeNotBetween(Date value1, Date value2) {
            addCriterion("bTime not between", value1, value2, "btime");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNull() {
            addCriterion("eTime is null");
            return (Criteria) this;
        }

        public Criteria andEtimeIsNotNull() {
            addCriterion("eTime is not null");
            return (Criteria) this;
        }

        public Criteria andEtimeEqualTo(Date value) {
            addCriterion("eTime =", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotEqualTo(Date value) {
            addCriterion("eTime <>", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThan(Date value) {
            addCriterion("eTime >", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("eTime >=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThan(Date value) {
            addCriterion("eTime <", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeLessThanOrEqualTo(Date value) {
            addCriterion("eTime <=", value, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeIn(List<Date> values) {
            addCriterion("eTime in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotIn(List<Date> values) {
            addCriterion("eTime not in", values, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeBetween(Date value1, Date value2) {
            addCriterion("eTime between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andEtimeNotBetween(Date value1, Date value2) {
            addCriterion("eTime not between", value1, value2, "etime");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andTransportIsNull() {
            addCriterion("transport is null");
            return (Criteria) this;
        }

        public Criteria andTransportIsNotNull() {
            addCriterion("transport is not null");
            return (Criteria) this;
        }

        public Criteria andTransportEqualTo(String value) {
            addCriterion("transport =", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotEqualTo(String value) {
            addCriterion("transport <>", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportGreaterThan(String value) {
            addCriterion("transport >", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportGreaterThanOrEqualTo(String value) {
            addCriterion("transport >=", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportLessThan(String value) {
            addCriterion("transport <", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportLessThanOrEqualTo(String value) {
            addCriterion("transport <=", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportLike(String value) {
            addCriterion("transport like", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotLike(String value) {
            addCriterion("transport not like", value, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportIn(List<String> values) {
            addCriterion("transport in", values, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotIn(List<String> values) {
            addCriterion("transport not in", values, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportBetween(String value1, String value2) {
            addCriterion("transport between", value1, value2, "transport");
            return (Criteria) this;
        }

        public Criteria andTransportNotBetween(String value1, String value2) {
            addCriterion("transport not between", value1, value2, "transport");
            return (Criteria) this;
        }

        public Criteria andOperatingIsNull() {
            addCriterion("operating is null");
            return (Criteria) this;
        }

        public Criteria andOperatingIsNotNull() {
            addCriterion("operating is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingEqualTo(String value) {
            addCriterion("operating =", value, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingNotEqualTo(String value) {
            addCriterion("operating <>", value, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingGreaterThan(String value) {
            addCriterion("operating >", value, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingGreaterThanOrEqualTo(String value) {
            addCriterion("operating >=", value, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingLessThan(String value) {
            addCriterion("operating <", value, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingLessThanOrEqualTo(String value) {
            addCriterion("operating <=", value, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingLike(String value) {
            addCriterion("operating like", value, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingNotLike(String value) {
            addCriterion("operating not like", value, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingIn(List<String> values) {
            addCriterion("operating in", values, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingNotIn(List<String> values) {
            addCriterion("operating not in", values, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingBetween(String value1, String value2) {
            addCriterion("operating between", value1, value2, "operating");
            return (Criteria) this;
        }

        public Criteria andOperatingNotBetween(String value1, String value2) {
            addCriterion("operating not between", value1, value2, "operating");
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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
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