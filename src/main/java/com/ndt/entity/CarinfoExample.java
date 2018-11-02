package com.ndt.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected int offset;
    
	protected int limit;
    

    public CarinfoExample(int offset, int limit) {
		this.offset = offset;
		this.limit = limit;
		oredCriteria = new ArrayList<Criteria>();
	}

	public CarinfoExample() {
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

        public Criteria andPlatetypeIsNull() {
            addCriterion("plateType is null");
            return (Criteria) this;
        }

        public Criteria andPlatetypeIsNotNull() {
            addCriterion("plateType is not null");
            return (Criteria) this;
        }

        public Criteria andPlatetypeEqualTo(String value) {
            addCriterion("plateType =", value, "platetype");
            return (Criteria) this;
        }

        public Criteria andPlatetypeNotEqualTo(String value) {
            addCriterion("plateType <>", value, "platetype");
            return (Criteria) this;
        }

        public Criteria andPlatetypeGreaterThan(String value) {
            addCriterion("plateType >", value, "platetype");
            return (Criteria) this;
        }

        public Criteria andPlatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("plateType >=", value, "platetype");
            return (Criteria) this;
        }

        public Criteria andPlatetypeLessThan(String value) {
            addCriterion("plateType <", value, "platetype");
            return (Criteria) this;
        }

        public Criteria andPlatetypeLessThanOrEqualTo(String value) {
            addCriterion("plateType <=", value, "platetype");
            return (Criteria) this;
        }

        public Criteria andPlatetypeLike(String value) {
            addCriterion("plateType like", value, "platetype");
            return (Criteria) this;
        }

        public Criteria andPlatetypeNotLike(String value) {
            addCriterion("plateType not like", value, "platetype");
            return (Criteria) this;
        }

        public Criteria andPlatetypeIn(List<String> values) {
            addCriterion("plateType in", values, "platetype");
            return (Criteria) this;
        }

        public Criteria andPlatetypeNotIn(List<String> values) {
            addCriterion("plateType not in", values, "platetype");
            return (Criteria) this;
        }

        public Criteria andPlatetypeBetween(String value1, String value2) {
            addCriterion("plateType between", value1, value2, "platetype");
            return (Criteria) this;
        }

        public Criteria andPlatetypeNotBetween(String value1, String value2) {
            addCriterion("plateType not between", value1, value2, "platetype");
            return (Criteria) this;
        }

        public Criteria andPlatecolorIsNull() {
            addCriterion("plateColor is null");
            return (Criteria) this;
        }

        public Criteria andPlatecolorIsNotNull() {
            addCriterion("plateColor is not null");
            return (Criteria) this;
        }

        public Criteria andPlatecolorEqualTo(String value) {
            addCriterion("plateColor =", value, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorNotEqualTo(String value) {
            addCriterion("plateColor <>", value, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorGreaterThan(String value) {
            addCriterion("plateColor >", value, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorGreaterThanOrEqualTo(String value) {
            addCriterion("plateColor >=", value, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorLessThan(String value) {
            addCriterion("plateColor <", value, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorLessThanOrEqualTo(String value) {
            addCriterion("plateColor <=", value, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorLike(String value) {
            addCriterion("plateColor like", value, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorNotLike(String value) {
            addCriterion("plateColor not like", value, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorIn(List<String> values) {
            addCriterion("plateColor in", values, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorNotIn(List<String> values) {
            addCriterion("plateColor not in", values, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorBetween(String value1, String value2) {
            addCriterion("plateColor between", value1, value2, "platecolor");
            return (Criteria) this;
        }

        public Criteria andPlatecolorNotBetween(String value1, String value2) {
            addCriterion("plateColor not between", value1, value2, "platecolor");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNull() {
            addCriterion("carType is null");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNotNull() {
            addCriterion("carType is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeEqualTo(String value) {
            addCriterion("carType =", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotEqualTo(String value) {
            addCriterion("carType <>", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThan(String value) {
            addCriterion("carType >", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("carType >=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThan(String value) {
            addCriterion("carType <", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThanOrEqualTo(String value) {
            addCriterion("carType <=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLike(String value) {
            addCriterion("carType like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotLike(String value) {
            addCriterion("carType not like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeIn(List<String> values) {
            addCriterion("carType in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotIn(List<String> values) {
            addCriterion("carType not in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeBetween(String value1, String value2) {
            addCriterion("carType between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotBetween(String value1, String value2) {
            addCriterion("carType not between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCarlengthIsNull() {
            addCriterion("carLength is null");
            return (Criteria) this;
        }

        public Criteria andCarlengthIsNotNull() {
            addCriterion("carLength is not null");
            return (Criteria) this;
        }

        public Criteria andCarlengthEqualTo(Double value) {
            addCriterion("carLength =", value, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarlengthNotEqualTo(Double value) {
            addCriterion("carLength <>", value, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarlengthGreaterThan(Double value) {
            addCriterion("carLength >", value, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarlengthGreaterThanOrEqualTo(Double value) {
            addCriterion("carLength >=", value, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarlengthLessThan(Double value) {
            addCriterion("carLength <", value, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarlengthLessThanOrEqualTo(Double value) {
            addCriterion("carLength <=", value, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarlengthIn(List<Double> values) {
            addCriterion("carLength in", values, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarlengthNotIn(List<Double> values) {
            addCriterion("carLength not in", values, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarlengthBetween(Double value1, Double value2) {
            addCriterion("carLength between", value1, value2, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarlengthNotBetween(Double value1, Double value2) {
            addCriterion("carLength not between", value1, value2, "carlength");
            return (Criteria) this;
        }

        public Criteria andFullloadIsNull() {
            addCriterion("fullLoad is null");
            return (Criteria) this;
        }

        public Criteria andFullloadIsNotNull() {
            addCriterion("fullLoad is not null");
            return (Criteria) this;
        }

        public Criteria andFullloadEqualTo(Double value) {
            addCriterion("fullLoad =", value, "fullload");
            return (Criteria) this;
        }

        public Criteria andFullloadNotEqualTo(Double value) {
            addCriterion("fullLoad <>", value, "fullload");
            return (Criteria) this;
        }

        public Criteria andFullloadGreaterThan(Double value) {
            addCriterion("fullLoad >", value, "fullload");
            return (Criteria) this;
        }

        public Criteria andFullloadGreaterThanOrEqualTo(Double value) {
            addCriterion("fullLoad >=", value, "fullload");
            return (Criteria) this;
        }

        public Criteria andFullloadLessThan(Double value) {
            addCriterion("fullLoad <", value, "fullload");
            return (Criteria) this;
        }

        public Criteria andFullloadLessThanOrEqualTo(Double value) {
            addCriterion("fullLoad <=", value, "fullload");
            return (Criteria) this;
        }

        public Criteria andFullloadIn(List<Double> values) {
            addCriterion("fullLoad in", values, "fullload");
            return (Criteria) this;
        }

        public Criteria andFullloadNotIn(List<Double> values) {
            addCriterion("fullLoad not in", values, "fullload");
            return (Criteria) this;
        }

        public Criteria andFullloadBetween(Double value1, Double value2) {
            addCriterion("fullLoad between", value1, value2, "fullload");
            return (Criteria) this;
        }

        public Criteria andFullloadNotBetween(Double value1, Double value2) {
            addCriterion("fullLoad not between", value1, value2, "fullload");
            return (Criteria) this;
        }

        public Criteria andMaxloadIsNull() {
            addCriterion("maxLoad is null");
            return (Criteria) this;
        }

        public Criteria andMaxloadIsNotNull() {
            addCriterion("maxLoad is not null");
            return (Criteria) this;
        }

        public Criteria andMaxloadEqualTo(Double value) {
            addCriterion("maxLoad =", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadNotEqualTo(Double value) {
            addCriterion("maxLoad <>", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadGreaterThan(Double value) {
            addCriterion("maxLoad >", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadGreaterThanOrEqualTo(Double value) {
            addCriterion("maxLoad >=", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadLessThan(Double value) {
            addCriterion("maxLoad <", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadLessThanOrEqualTo(Double value) {
            addCriterion("maxLoad <=", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadIn(List<Double> values) {
            addCriterion("maxLoad in", values, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadNotIn(List<Double> values) {
            addCriterion("maxLoad not in", values, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadBetween(Double value1, Double value2) {
            addCriterion("maxLoad between", value1, value2, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadNotBetween(Double value1, Double value2) {
            addCriterion("maxLoad not between", value1, value2, "maxload");
            return (Criteria) this;
        }

        public Criteria andRoadtransportcertificateIsNull() {
            addCriterion("roadTransportCertificate is null");
            return (Criteria) this;
        }

        public Criteria andRoadtransportcertificateIsNotNull() {
            addCriterion("roadTransportCertificate is not null");
            return (Criteria) this;
        }

        public Criteria andRoadtransportcertificateEqualTo(String value) {
            addCriterion("roadTransportCertificate =", value, "roadtransportcertificate");
            return (Criteria) this;
        }

        public Criteria andRoadtransportcertificateNotEqualTo(String value) {
            addCriterion("roadTransportCertificate <>", value, "roadtransportcertificate");
            return (Criteria) this;
        }

        public Criteria andRoadtransportcertificateGreaterThan(String value) {
            addCriterion("roadTransportCertificate >", value, "roadtransportcertificate");
            return (Criteria) this;
        }

        public Criteria andRoadtransportcertificateGreaterThanOrEqualTo(String value) {
            addCriterion("roadTransportCertificate >=", value, "roadtransportcertificate");
            return (Criteria) this;
        }

        public Criteria andRoadtransportcertificateLessThan(String value) {
            addCriterion("roadTransportCertificate <", value, "roadtransportcertificate");
            return (Criteria) this;
        }

        public Criteria andRoadtransportcertificateLessThanOrEqualTo(String value) {
            addCriterion("roadTransportCertificate <=", value, "roadtransportcertificate");
            return (Criteria) this;
        }

        public Criteria andRoadtransportcertificateLike(String value) {
            addCriterion("roadTransportCertificate like", value, "roadtransportcertificate");
            return (Criteria) this;
        }

        public Criteria andRoadtransportcertificateNotLike(String value) {
            addCriterion("roadTransportCertificate not like", value, "roadtransportcertificate");
            return (Criteria) this;
        }

        public Criteria andRoadtransportcertificateIn(List<String> values) {
            addCriterion("roadTransportCertificate in", values, "roadtransportcertificate");
            return (Criteria) this;
        }

        public Criteria andRoadtransportcertificateNotIn(List<String> values) {
            addCriterion("roadTransportCertificate not in", values, "roadtransportcertificate");
            return (Criteria) this;
        }

        public Criteria andRoadtransportcertificateBetween(String value1, String value2) {
            addCriterion("roadTransportCertificate between", value1, value2, "roadtransportcertificate");
            return (Criteria) this;
        }

        public Criteria andRoadtransportcertificateNotBetween(String value1, String value2) {
            addCriterion("roadTransportCertificate not between", value1, value2, "roadtransportcertificate");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIsNull() {
            addCriterion("businessName is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIsNotNull() {
            addCriterion("businessName is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnameEqualTo(String value) {
            addCriterion("businessName =", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotEqualTo(String value) {
            addCriterion("businessName <>", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameGreaterThan(String value) {
            addCriterion("businessName >", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameGreaterThanOrEqualTo(String value) {
            addCriterion("businessName >=", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLessThan(String value) {
            addCriterion("businessName <", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLessThanOrEqualTo(String value) {
            addCriterion("businessName <=", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameLike(String value) {
            addCriterion("businessName like", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotLike(String value) {
            addCriterion("businessName not like", value, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameIn(List<String> values) {
            addCriterion("businessName in", values, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotIn(List<String> values) {
            addCriterion("businessName not in", values, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameBetween(String value1, String value2) {
            addCriterion("businessName between", value1, value2, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinessnameNotBetween(String value1, String value2) {
            addCriterion("businessName not between", value1, value2, "businessname");
            return (Criteria) this;
        }

        public Criteria andBusinesstelIsNull() {
            addCriterion("businessTel is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstelIsNotNull() {
            addCriterion("businessTel is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstelEqualTo(String value) {
            addCriterion("businessTel =", value, "businesstel");
            return (Criteria) this;
        }

        public Criteria andBusinesstelNotEqualTo(String value) {
            addCriterion("businessTel <>", value, "businesstel");
            return (Criteria) this;
        }

        public Criteria andBusinesstelGreaterThan(String value) {
            addCriterion("businessTel >", value, "businesstel");
            return (Criteria) this;
        }

        public Criteria andBusinesstelGreaterThanOrEqualTo(String value) {
            addCriterion("businessTel >=", value, "businesstel");
            return (Criteria) this;
        }

        public Criteria andBusinesstelLessThan(String value) {
            addCriterion("businessTel <", value, "businesstel");
            return (Criteria) this;
        }

        public Criteria andBusinesstelLessThanOrEqualTo(String value) {
            addCriterion("businessTel <=", value, "businesstel");
            return (Criteria) this;
        }

        public Criteria andBusinesstelLike(String value) {
            addCriterion("businessTel like", value, "businesstel");
            return (Criteria) this;
        }

        public Criteria andBusinesstelNotLike(String value) {
            addCriterion("businessTel not like", value, "businesstel");
            return (Criteria) this;
        }

        public Criteria andBusinesstelIn(List<String> values) {
            addCriterion("businessTel in", values, "businesstel");
            return (Criteria) this;
        }

        public Criteria andBusinesstelNotIn(List<String> values) {
            addCriterion("businessTel not in", values, "businesstel");
            return (Criteria) this;
        }

        public Criteria andBusinesstelBetween(String value1, String value2) {
            addCriterion("businessTel between", value1, value2, "businesstel");
            return (Criteria) this;
        }

        public Criteria andBusinesstelNotBetween(String value1, String value2) {
            addCriterion("businessTel not between", value1, value2, "businesstel");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIsNull() {
            addCriterion("businessLicense is null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIsNotNull() {
            addCriterion("businessLicense is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseEqualTo(String value) {
            addCriterion("businessLicense =", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotEqualTo(String value) {
            addCriterion("businessLicense <>", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseGreaterThan(String value) {
            addCriterion("businessLicense >", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseGreaterThanOrEqualTo(String value) {
            addCriterion("businessLicense >=", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseLessThan(String value) {
            addCriterion("businessLicense <", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseLessThanOrEqualTo(String value) {
            addCriterion("businessLicense <=", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseLike(String value) {
            addCriterion("businessLicense like", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotLike(String value) {
            addCriterion("businessLicense not like", value, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseIn(List<String> values) {
            addCriterion("businessLicense in", values, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotIn(List<String> values) {
            addCriterion("businessLicense not in", values, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseBetween(String value1, String value2) {
            addCriterion("businessLicense between", value1, value2, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBusinesslicenseNotBetween(String value1, String value2) {
            addCriterion("businessLicense not between", value1, value2, "businesslicense");
            return (Criteria) this;
        }

        public Criteria andBrandmodelIsNull() {
            addCriterion("brandModel is null");
            return (Criteria) this;
        }

        public Criteria andBrandmodelIsNotNull() {
            addCriterion("brandModel is not null");
            return (Criteria) this;
        }

        public Criteria andBrandmodelEqualTo(String value) {
            addCriterion("brandModel =", value, "brandmodel");
            return (Criteria) this;
        }

        public Criteria andBrandmodelNotEqualTo(String value) {
            addCriterion("brandModel <>", value, "brandmodel");
            return (Criteria) this;
        }

        public Criteria andBrandmodelGreaterThan(String value) {
            addCriterion("brandModel >", value, "brandmodel");
            return (Criteria) this;
        }

        public Criteria andBrandmodelGreaterThanOrEqualTo(String value) {
            addCriterion("brandModel >=", value, "brandmodel");
            return (Criteria) this;
        }

        public Criteria andBrandmodelLessThan(String value) {
            addCriterion("brandModel <", value, "brandmodel");
            return (Criteria) this;
        }

        public Criteria andBrandmodelLessThanOrEqualTo(String value) {
            addCriterion("brandModel <=", value, "brandmodel");
            return (Criteria) this;
        }

        public Criteria andBrandmodelLike(String value) {
            addCriterion("brandModel like", value, "brandmodel");
            return (Criteria) this;
        }

        public Criteria andBrandmodelNotLike(String value) {
            addCriterion("brandModel not like", value, "brandmodel");
            return (Criteria) this;
        }

        public Criteria andBrandmodelIn(List<String> values) {
            addCriterion("brandModel in", values, "brandmodel");
            return (Criteria) this;
        }

        public Criteria andBrandmodelNotIn(List<String> values) {
            addCriterion("brandModel not in", values, "brandmodel");
            return (Criteria) this;
        }

        public Criteria andBrandmodelBetween(String value1, String value2) {
            addCriterion("brandModel between", value1, value2, "brandmodel");
            return (Criteria) this;
        }

        public Criteria andBrandmodelNotBetween(String value1, String value2) {
            addCriterion("brandModel not between", value1, value2, "brandmodel");
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

        public Criteria andDrivinglicensepathIsNull() {
            addCriterion("DrivingLicensePath is null");
            return (Criteria) this;
        }

        public Criteria andDrivinglicensepathIsNotNull() {
            addCriterion("DrivingLicensePath is not null");
            return (Criteria) this;
        }

        public Criteria andDrivinglicensepathEqualTo(String value) {
            addCriterion("DrivingLicensePath =", value, "drivinglicensepath");
            return (Criteria) this;
        }

        public Criteria andDrivinglicensepathNotEqualTo(String value) {
            addCriterion("DrivingLicensePath <>", value, "drivinglicensepath");
            return (Criteria) this;
        }

        public Criteria andDrivinglicensepathGreaterThan(String value) {
            addCriterion("DrivingLicensePath >", value, "drivinglicensepath");
            return (Criteria) this;
        }

        public Criteria andDrivinglicensepathGreaterThanOrEqualTo(String value) {
            addCriterion("DrivingLicensePath >=", value, "drivinglicensepath");
            return (Criteria) this;
        }

        public Criteria andDrivinglicensepathLessThan(String value) {
            addCriterion("DrivingLicensePath <", value, "drivinglicensepath");
            return (Criteria) this;
        }

        public Criteria andDrivinglicensepathLessThanOrEqualTo(String value) {
            addCriterion("DrivingLicensePath <=", value, "drivinglicensepath");
            return (Criteria) this;
        }

        public Criteria andDrivinglicensepathLike(String value) {
            addCriterion("DrivingLicensePath like", value, "drivinglicensepath");
            return (Criteria) this;
        }

        public Criteria andDrivinglicensepathNotLike(String value) {
            addCriterion("DrivingLicensePath not like", value, "drivinglicensepath");
            return (Criteria) this;
        }

        public Criteria andDrivinglicensepathIn(List<String> values) {
            addCriterion("DrivingLicensePath in", values, "drivinglicensepath");
            return (Criteria) this;
        }

        public Criteria andDrivinglicensepathNotIn(List<String> values) {
            addCriterion("DrivingLicensePath not in", values, "drivinglicensepath");
            return (Criteria) this;
        }

        public Criteria andDrivinglicensepathBetween(String value1, String value2) {
            addCriterion("DrivingLicensePath between", value1, value2, "drivinglicensepath");
            return (Criteria) this;
        }

        public Criteria andDrivinglicensepathNotBetween(String value1, String value2) {
            addCriterion("DrivingLicensePath not between", value1, value2, "drivinglicensepath");
            return (Criteria) this;
        }

        public Criteria andOperatinglicencepathIsNull() {
            addCriterion("operatingLicencePath is null");
            return (Criteria) this;
        }

        public Criteria andOperatinglicencepathIsNotNull() {
            addCriterion("operatingLicencePath is not null");
            return (Criteria) this;
        }

        public Criteria andOperatinglicencepathEqualTo(String value) {
            addCriterion("operatingLicencePath =", value, "operatinglicencepath");
            return (Criteria) this;
        }

        public Criteria andOperatinglicencepathNotEqualTo(String value) {
            addCriterion("operatingLicencePath <>", value, "operatinglicencepath");
            return (Criteria) this;
        }

        public Criteria andOperatinglicencepathGreaterThan(String value) {
            addCriterion("operatingLicencePath >", value, "operatinglicencepath");
            return (Criteria) this;
        }

        public Criteria andOperatinglicencepathGreaterThanOrEqualTo(String value) {
            addCriterion("operatingLicencePath >=", value, "operatinglicencepath");
            return (Criteria) this;
        }

        public Criteria andOperatinglicencepathLessThan(String value) {
            addCriterion("operatingLicencePath <", value, "operatinglicencepath");
            return (Criteria) this;
        }

        public Criteria andOperatinglicencepathLessThanOrEqualTo(String value) {
            addCriterion("operatingLicencePath <=", value, "operatinglicencepath");
            return (Criteria) this;
        }

        public Criteria andOperatinglicencepathLike(String value) {
            addCriterion("operatingLicencePath like", value, "operatinglicencepath");
            return (Criteria) this;
        }

        public Criteria andOperatinglicencepathNotLike(String value) {
            addCriterion("operatingLicencePath not like", value, "operatinglicencepath");
            return (Criteria) this;
        }

        public Criteria andOperatinglicencepathIn(List<String> values) {
            addCriterion("operatingLicencePath in", values, "operatinglicencepath");
            return (Criteria) this;
        }

        public Criteria andOperatinglicencepathNotIn(List<String> values) {
            addCriterion("operatingLicencePath not in", values, "operatinglicencepath");
            return (Criteria) this;
        }

        public Criteria andOperatinglicencepathBetween(String value1, String value2) {
            addCriterion("operatingLicencePath between", value1, value2, "operatinglicencepath");
            return (Criteria) this;
        }

        public Criteria andOperatinglicencepathNotBetween(String value1, String value2) {
            addCriterion("operatingLicencePath not between", value1, value2, "operatinglicencepath");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
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
}