package com.ndt.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdermanagementinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdermanagementinfoExample() {
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

        public Criteria andDispatchedpartyIsNull() {
            addCriterion("dispatchedParty is null");
            return (Criteria) this;
        }

        public Criteria andDispatchedpartyIsNotNull() {
            addCriterion("dispatchedParty is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchedpartyEqualTo(String value) {
            addCriterion("dispatchedParty =", value, "dispatchedparty");
            return (Criteria) this;
        }

        public Criteria andDispatchedpartyNotEqualTo(String value) {
            addCriterion("dispatchedParty <>", value, "dispatchedparty");
            return (Criteria) this;
        }

        public Criteria andDispatchedpartyGreaterThan(String value) {
            addCriterion("dispatchedParty >", value, "dispatchedparty");
            return (Criteria) this;
        }

        public Criteria andDispatchedpartyGreaterThanOrEqualTo(String value) {
            addCriterion("dispatchedParty >=", value, "dispatchedparty");
            return (Criteria) this;
        }

        public Criteria andDispatchedpartyLessThan(String value) {
            addCriterion("dispatchedParty <", value, "dispatchedparty");
            return (Criteria) this;
        }

        public Criteria andDispatchedpartyLessThanOrEqualTo(String value) {
            addCriterion("dispatchedParty <=", value, "dispatchedparty");
            return (Criteria) this;
        }

        public Criteria andDispatchedpartyLike(String value) {
            addCriterion("dispatchedParty like", value, "dispatchedparty");
            return (Criteria) this;
        }

        public Criteria andDispatchedpartyNotLike(String value) {
            addCriterion("dispatchedParty not like", value, "dispatchedparty");
            return (Criteria) this;
        }

        public Criteria andDispatchedpartyIn(List<String> values) {
            addCriterion("dispatchedParty in", values, "dispatchedparty");
            return (Criteria) this;
        }

        public Criteria andDispatchedpartyNotIn(List<String> values) {
            addCriterion("dispatchedParty not in", values, "dispatchedparty");
            return (Criteria) this;
        }

        public Criteria andDispatchedpartyBetween(String value1, String value2) {
            addCriterion("dispatchedParty between", value1, value2, "dispatchedparty");
            return (Criteria) this;
        }

        public Criteria andDispatchedpartyNotBetween(String value1, String value2) {
            addCriterion("dispatchedParty not between", value1, value2, "dispatchedparty");
            return (Criteria) this;
        }

        public Criteria andCarrierIsNull() {
            addCriterion("carrier is null");
            return (Criteria) this;
        }

        public Criteria andCarrierIsNotNull() {
            addCriterion("carrier is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierEqualTo(String value) {
            addCriterion("carrier =", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotEqualTo(String value) {
            addCriterion("carrier <>", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierGreaterThan(String value) {
            addCriterion("carrier >", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierGreaterThanOrEqualTo(String value) {
            addCriterion("carrier >=", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierLessThan(String value) {
            addCriterion("carrier <", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierLessThanOrEqualTo(String value) {
            addCriterion("carrier <=", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierLike(String value) {
            addCriterion("carrier like", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotLike(String value) {
            addCriterion("carrier not like", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierIn(List<String> values) {
            addCriterion("carrier in", values, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotIn(List<String> values) {
            addCriterion("carrier not in", values, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierBetween(String value1, String value2) {
            addCriterion("carrier between", value1, value2, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotBetween(String value1, String value2) {
            addCriterion("carrier not between", value1, value2, "carrier");
            return (Criteria) this;
        }

        public Criteria andDepartureIsNull() {
            addCriterion("departure is null");
            return (Criteria) this;
        }

        public Criteria andDepartureIsNotNull() {
            addCriterion("departure is not null");
            return (Criteria) this;
        }

        public Criteria andDepartureEqualTo(String value) {
            addCriterion("departure =", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotEqualTo(String value) {
            addCriterion("departure <>", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureGreaterThan(String value) {
            addCriterion("departure >", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureGreaterThanOrEqualTo(String value) {
            addCriterion("departure >=", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLessThan(String value) {
            addCriterion("departure <", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLessThanOrEqualTo(String value) {
            addCriterion("departure <=", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureLike(String value) {
            addCriterion("departure like", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotLike(String value) {
            addCriterion("departure not like", value, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureIn(List<String> values) {
            addCriterion("departure in", values, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotIn(List<String> values) {
            addCriterion("departure not in", values, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureBetween(String value1, String value2) {
            addCriterion("departure between", value1, value2, "departure");
            return (Criteria) this;
        }

        public Criteria andDepartureNotBetween(String value1, String value2) {
            addCriterion("departure not between", value1, value2, "departure");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("destination not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andSendernameIsNull() {
            addCriterion("senderName is null");
            return (Criteria) this;
        }

        public Criteria andSendernameIsNotNull() {
            addCriterion("senderName is not null");
            return (Criteria) this;
        }

        public Criteria andSendernameEqualTo(String value) {
            addCriterion("senderName =", value, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameNotEqualTo(String value) {
            addCriterion("senderName <>", value, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameGreaterThan(String value) {
            addCriterion("senderName >", value, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameGreaterThanOrEqualTo(String value) {
            addCriterion("senderName >=", value, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameLessThan(String value) {
            addCriterion("senderName <", value, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameLessThanOrEqualTo(String value) {
            addCriterion("senderName <=", value, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameLike(String value) {
            addCriterion("senderName like", value, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameNotLike(String value) {
            addCriterion("senderName not like", value, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameIn(List<String> values) {
            addCriterion("senderName in", values, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameNotIn(List<String> values) {
            addCriterion("senderName not in", values, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameBetween(String value1, String value2) {
            addCriterion("senderName between", value1, value2, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendernameNotBetween(String value1, String value2) {
            addCriterion("senderName not between", value1, value2, "sendername");
            return (Criteria) this;
        }

        public Criteria andSendertelIsNull() {
            addCriterion("senderTel is null");
            return (Criteria) this;
        }

        public Criteria andSendertelIsNotNull() {
            addCriterion("senderTel is not null");
            return (Criteria) this;
        }

        public Criteria andSendertelEqualTo(String value) {
            addCriterion("senderTel =", value, "sendertel");
            return (Criteria) this;
        }

        public Criteria andSendertelNotEqualTo(String value) {
            addCriterion("senderTel <>", value, "sendertel");
            return (Criteria) this;
        }

        public Criteria andSendertelGreaterThan(String value) {
            addCriterion("senderTel >", value, "sendertel");
            return (Criteria) this;
        }

        public Criteria andSendertelGreaterThanOrEqualTo(String value) {
            addCriterion("senderTel >=", value, "sendertel");
            return (Criteria) this;
        }

        public Criteria andSendertelLessThan(String value) {
            addCriterion("senderTel <", value, "sendertel");
            return (Criteria) this;
        }

        public Criteria andSendertelLessThanOrEqualTo(String value) {
            addCriterion("senderTel <=", value, "sendertel");
            return (Criteria) this;
        }

        public Criteria andSendertelLike(String value) {
            addCriterion("senderTel like", value, "sendertel");
            return (Criteria) this;
        }

        public Criteria andSendertelNotLike(String value) {
            addCriterion("senderTel not like", value, "sendertel");
            return (Criteria) this;
        }

        public Criteria andSendertelIn(List<String> values) {
            addCriterion("senderTel in", values, "sendertel");
            return (Criteria) this;
        }

        public Criteria andSendertelNotIn(List<String> values) {
            addCriterion("senderTel not in", values, "sendertel");
            return (Criteria) this;
        }

        public Criteria andSendertelBetween(String value1, String value2) {
            addCriterion("senderTel between", value1, value2, "sendertel");
            return (Criteria) this;
        }

        public Criteria andSendertelNotBetween(String value1, String value2) {
            addCriterion("senderTel not between", value1, value2, "sendertel");
            return (Criteria) this;
        }

        public Criteria andReceivernameIsNull() {
            addCriterion("receiverName is null");
            return (Criteria) this;
        }

        public Criteria andReceivernameIsNotNull() {
            addCriterion("receiverName is not null");
            return (Criteria) this;
        }

        public Criteria andReceivernameEqualTo(String value) {
            addCriterion("receiverName =", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotEqualTo(String value) {
            addCriterion("receiverName <>", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameGreaterThan(String value) {
            addCriterion("receiverName >", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameGreaterThanOrEqualTo(String value) {
            addCriterion("receiverName >=", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLessThan(String value) {
            addCriterion("receiverName <", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLessThanOrEqualTo(String value) {
            addCriterion("receiverName <=", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLike(String value) {
            addCriterion("receiverName like", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotLike(String value) {
            addCriterion("receiverName not like", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameIn(List<String> values) {
            addCriterion("receiverName in", values, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotIn(List<String> values) {
            addCriterion("receiverName not in", values, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameBetween(String value1, String value2) {
            addCriterion("receiverName between", value1, value2, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotBetween(String value1, String value2) {
            addCriterion("receiverName not between", value1, value2, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivertelIsNull() {
            addCriterion("receiverTel is null");
            return (Criteria) this;
        }

        public Criteria andReceivertelIsNotNull() {
            addCriterion("receiverTel is not null");
            return (Criteria) this;
        }

        public Criteria andReceivertelEqualTo(String value) {
            addCriterion("receiverTel =", value, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelNotEqualTo(String value) {
            addCriterion("receiverTel <>", value, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelGreaterThan(String value) {
            addCriterion("receiverTel >", value, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelGreaterThanOrEqualTo(String value) {
            addCriterion("receiverTel >=", value, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelLessThan(String value) {
            addCriterion("receiverTel <", value, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelLessThanOrEqualTo(String value) {
            addCriterion("receiverTel <=", value, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelLike(String value) {
            addCriterion("receiverTel like", value, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelNotLike(String value) {
            addCriterion("receiverTel not like", value, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelIn(List<String> values) {
            addCriterion("receiverTel in", values, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelNotIn(List<String> values) {
            addCriterion("receiverTel not in", values, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelBetween(String value1, String value2) {
            addCriterion("receiverTel between", value1, value2, "receivertel");
            return (Criteria) this;
        }

        public Criteria andReceivertelNotBetween(String value1, String value2) {
            addCriterion("receiverTel not between", value1, value2, "receivertel");
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

        public Criteria andOrdercreatetimeIsNull() {
            addCriterion("orderCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeIsNotNull() {
            addCriterion("orderCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeEqualTo(Date value) {
            addCriterion("orderCreateTime =", value, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeNotEqualTo(Date value) {
            addCriterion("orderCreateTime <>", value, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeGreaterThan(Date value) {
            addCriterion("orderCreateTime >", value, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("orderCreateTime >=", value, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeLessThan(Date value) {
            addCriterion("orderCreateTime <", value, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("orderCreateTime <=", value, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeIn(List<Date> values) {
            addCriterion("orderCreateTime in", values, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeNotIn(List<Date> values) {
            addCriterion("orderCreateTime not in", values, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeBetween(Date value1, Date value2) {
            addCriterion("orderCreateTime between", value1, value2, "ordercreatetime");
            return (Criteria) this;
        }

        public Criteria andOrdercreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("orderCreateTime not between", value1, value2, "ordercreatetime");
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

        public Criteria andRemainIsNull() {
            addCriterion("remain is null");
            return (Criteria) this;
        }

        public Criteria andRemainIsNotNull() {
            addCriterion("remain is not null");
            return (Criteria) this;
        }

        public Criteria andRemainEqualTo(String value) {
            addCriterion("remain =", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotEqualTo(String value) {
            addCriterion("remain <>", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainGreaterThan(String value) {
            addCriterion("remain >", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainGreaterThanOrEqualTo(String value) {
            addCriterion("remain >=", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainLessThan(String value) {
            addCriterion("remain <", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainLessThanOrEqualTo(String value) {
            addCriterion("remain <=", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainLike(String value) {
            addCriterion("remain like", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotLike(String value) {
            addCriterion("remain not like", value, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainIn(List<String> values) {
            addCriterion("remain in", values, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotIn(List<String> values) {
            addCriterion("remain not in", values, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainBetween(String value1, String value2) {
            addCriterion("remain between", value1, value2, "remain");
            return (Criteria) this;
        }

        public Criteria andRemainNotBetween(String value1, String value2) {
            addCriterion("remain not between", value1, value2, "remain");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(String value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(String value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(String value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(String value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(String value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLike(String value) {
            addCriterion("volume like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotLike(String value) {
            addCriterion("volume not like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<String> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<String> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(String value1, String value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(String value1, String value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andContractroteIsNull() {
            addCriterion("contractRote is null");
            return (Criteria) this;
        }

        public Criteria andContractroteIsNotNull() {
            addCriterion("contractRote is not null");
            return (Criteria) this;
        }

        public Criteria andContractroteEqualTo(String value) {
            addCriterion("contractRote =", value, "contractrote");
            return (Criteria) this;
        }

        public Criteria andContractroteNotEqualTo(String value) {
            addCriterion("contractRote <>", value, "contractrote");
            return (Criteria) this;
        }

        public Criteria andContractroteGreaterThan(String value) {
            addCriterion("contractRote >", value, "contractrote");
            return (Criteria) this;
        }

        public Criteria andContractroteGreaterThanOrEqualTo(String value) {
            addCriterion("contractRote >=", value, "contractrote");
            return (Criteria) this;
        }

        public Criteria andContractroteLessThan(String value) {
            addCriterion("contractRote <", value, "contractrote");
            return (Criteria) this;
        }

        public Criteria andContractroteLessThanOrEqualTo(String value) {
            addCriterion("contractRote <=", value, "contractrote");
            return (Criteria) this;
        }

        public Criteria andContractroteLike(String value) {
            addCriterion("contractRote like", value, "contractrote");
            return (Criteria) this;
        }

        public Criteria andContractroteNotLike(String value) {
            addCriterion("contractRote not like", value, "contractrote");
            return (Criteria) this;
        }

        public Criteria andContractroteIn(List<String> values) {
            addCriterion("contractRote in", values, "contractrote");
            return (Criteria) this;
        }

        public Criteria andContractroteNotIn(List<String> values) {
            addCriterion("contractRote not in", values, "contractrote");
            return (Criteria) this;
        }

        public Criteria andContractroteBetween(String value1, String value2) {
            addCriterion("contractRote between", value1, value2, "contractrote");
            return (Criteria) this;
        }

        public Criteria andContractroteNotBetween(String value1, String value2) {
            addCriterion("contractRote not between", value1, value2, "contractrote");
            return (Criteria) this;
        }

        public Criteria andGidIsNull() {
            addCriterion("gid is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("gid is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(String value) {
            addCriterion("gid =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(String value) {
            addCriterion("gid <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(String value) {
            addCriterion("gid >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(String value) {
            addCriterion("gid >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(String value) {
            addCriterion("gid <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(String value) {
            addCriterion("gid <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLike(String value) {
            addCriterion("gid like", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotLike(String value) {
            addCriterion("gid not like", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<String> values) {
            addCriterion("gid in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<String> values) {
            addCriterion("gid not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(String value1, String value2) {
            addCriterion("gid between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(String value1, String value2) {
            addCriterion("gid not between", value1, value2, "gid");
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