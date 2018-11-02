package com.ndt.entity;

import java.util.ArrayList;
import java.util.List;

import com.ndt.entity.CaptaininfoExample.Criteria;

public class MobileregistryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;
    
    protected int offset;
    
    protected int limit;

    

    public MobileregistryExample(int offset, int limit) {
		super();
		this.offset = offset;
		this.limit = limit;
		oredCriteria = new ArrayList<Criteria>();
	}

    public MobileregistryExample() {
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

        public Criteria andRealnameIsNull() {
            addCriterion("realName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realName not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUploadstateIsNull() {
            addCriterion("UploadState is null");
            return (Criteria) this;
        }

        public Criteria andUploadstateIsNotNull() {
            addCriterion("UploadState is not null");
            return (Criteria) this;
        }

        public Criteria andUploadstateEqualTo(String value) {
            addCriterion("UploadState =", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateNotEqualTo(String value) {
            addCriterion("UploadState <>", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateGreaterThan(String value) {
            addCriterion("UploadState >", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateGreaterThanOrEqualTo(String value) {
            addCriterion("UploadState >=", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateLessThan(String value) {
            addCriterion("UploadState <", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateLessThanOrEqualTo(String value) {
            addCriterion("UploadState <=", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateLike(String value) {
            addCriterion("UploadState like", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateNotLike(String value) {
            addCriterion("UploadState not like", value, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateIn(List<String> values) {
            addCriterion("UploadState in", values, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateNotIn(List<String> values) {
            addCriterion("UploadState not in", values, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateBetween(String value1, String value2) {
            addCriterion("UploadState between", value1, value2, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andUploadstateNotBetween(String value1, String value2) {
            addCriterion("UploadState not between", value1, value2, "uploadstate");
            return (Criteria) this;
        }

        public Criteria andPcphotoIsNull() {
            addCriterion("pcPhoto is null");
            return (Criteria) this;
        }

        public Criteria andPcphotoIsNotNull() {
            addCriterion("pcPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andPcphotoEqualTo(String value) {
            addCriterion("pcPhoto =", value, "pcphoto");
            return (Criteria) this;
        }

        public Criteria andPcphotoNotEqualTo(String value) {
            addCriterion("pcPhoto <>", value, "pcphoto");
            return (Criteria) this;
        }

        public Criteria andPcphotoGreaterThan(String value) {
            addCriterion("pcPhoto >", value, "pcphoto");
            return (Criteria) this;
        }

        public Criteria andPcphotoGreaterThanOrEqualTo(String value) {
            addCriterion("pcPhoto >=", value, "pcphoto");
            return (Criteria) this;
        }

        public Criteria andPcphotoLessThan(String value) {
            addCriterion("pcPhoto <", value, "pcphoto");
            return (Criteria) this;
        }

        public Criteria andPcphotoLessThanOrEqualTo(String value) {
            addCriterion("pcPhoto <=", value, "pcphoto");
            return (Criteria) this;
        }

        public Criteria andPcphotoLike(String value) {
            addCriterion("pcPhoto like", value, "pcphoto");
            return (Criteria) this;
        }

        public Criteria andPcphotoNotLike(String value) {
            addCriterion("pcPhoto not like", value, "pcphoto");
            return (Criteria) this;
        }

        public Criteria andPcphotoIn(List<String> values) {
            addCriterion("pcPhoto in", values, "pcphoto");
            return (Criteria) this;
        }

        public Criteria andPcphotoNotIn(List<String> values) {
            addCriterion("pcPhoto not in", values, "pcphoto");
            return (Criteria) this;
        }

        public Criteria andPcphotoBetween(String value1, String value2) {
            addCriterion("pcPhoto between", value1, value2, "pcphoto");
            return (Criteria) this;
        }

        public Criteria andPcphotoNotBetween(String value1, String value2) {
            addCriterion("pcPhoto not between", value1, value2, "pcphoto");
            return (Criteria) this;
        }

        public Criteria andDrivercardIsNull() {
            addCriterion("driverCard is null");
            return (Criteria) this;
        }

        public Criteria andDrivercardIsNotNull() {
            addCriterion("driverCard is not null");
            return (Criteria) this;
        }

        public Criteria andDrivercardEqualTo(String value) {
            addCriterion("driverCard =", value, "drivercard");
            return (Criteria) this;
        }

        public Criteria andDrivercardNotEqualTo(String value) {
            addCriterion("driverCard <>", value, "drivercard");
            return (Criteria) this;
        }

        public Criteria andDrivercardGreaterThan(String value) {
            addCriterion("driverCard >", value, "drivercard");
            return (Criteria) this;
        }

        public Criteria andDrivercardGreaterThanOrEqualTo(String value) {
            addCriterion("driverCard >=", value, "drivercard");
            return (Criteria) this;
        }

        public Criteria andDrivercardLessThan(String value) {
            addCriterion("driverCard <", value, "drivercard");
            return (Criteria) this;
        }

        public Criteria andDrivercardLessThanOrEqualTo(String value) {
            addCriterion("driverCard <=", value, "drivercard");
            return (Criteria) this;
        }

        public Criteria andDrivercardLike(String value) {
            addCriterion("driverCard like", value, "drivercard");
            return (Criteria) this;
        }

        public Criteria andDrivercardNotLike(String value) {
            addCriterion("driverCard not like", value, "drivercard");
            return (Criteria) this;
        }

        public Criteria andDrivercardIn(List<String> values) {
            addCriterion("driverCard in", values, "drivercard");
            return (Criteria) this;
        }

        public Criteria andDrivercardNotIn(List<String> values) {
            addCriterion("driverCard not in", values, "drivercard");
            return (Criteria) this;
        }

        public Criteria andDrivercardBetween(String value1, String value2) {
            addCriterion("driverCard between", value1, value2, "drivercard");
            return (Criteria) this;
        }

        public Criteria andDrivercardNotBetween(String value1, String value2) {
            addCriterion("driverCard not between", value1, value2, "drivercard");
            return (Criteria) this;
        }

        public Criteria andIdcardaIsNull() {
            addCriterion("idcardA is null");
            return (Criteria) this;
        }

        public Criteria andIdcardaIsNotNull() {
            addCriterion("idcardA is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardaEqualTo(String value) {
            addCriterion("idcardA =", value, "idcarda");
            return (Criteria) this;
        }

        public Criteria andIdcardaNotEqualTo(String value) {
            addCriterion("idcardA <>", value, "idcarda");
            return (Criteria) this;
        }

        public Criteria andIdcardaGreaterThan(String value) {
            addCriterion("idcardA >", value, "idcarda");
            return (Criteria) this;
        }

        public Criteria andIdcardaGreaterThanOrEqualTo(String value) {
            addCriterion("idcardA >=", value, "idcarda");
            return (Criteria) this;
        }

        public Criteria andIdcardaLessThan(String value) {
            addCriterion("idcardA <", value, "idcarda");
            return (Criteria) this;
        }

        public Criteria andIdcardaLessThanOrEqualTo(String value) {
            addCriterion("idcardA <=", value, "idcarda");
            return (Criteria) this;
        }

        public Criteria andIdcardaLike(String value) {
            addCriterion("idcardA like", value, "idcarda");
            return (Criteria) this;
        }

        public Criteria andIdcardaNotLike(String value) {
            addCriterion("idcardA not like", value, "idcarda");
            return (Criteria) this;
        }

        public Criteria andIdcardaIn(List<String> values) {
            addCriterion("idcardA in", values, "idcarda");
            return (Criteria) this;
        }

        public Criteria andIdcardaNotIn(List<String> values) {
            addCriterion("idcardA not in", values, "idcarda");
            return (Criteria) this;
        }

        public Criteria andIdcardaBetween(String value1, String value2) {
            addCriterion("idcardA between", value1, value2, "idcarda");
            return (Criteria) this;
        }

        public Criteria andIdcardaNotBetween(String value1, String value2) {
            addCriterion("idcardA not between", value1, value2, "idcarda");
            return (Criteria) this;
        }

        public Criteria andIdcardbIsNull() {
            addCriterion("idcardB is null");
            return (Criteria) this;
        }

        public Criteria andIdcardbIsNotNull() {
            addCriterion("idcardB is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardbEqualTo(String value) {
            addCriterion("idcardB =", value, "idcardb");
            return (Criteria) this;
        }

        public Criteria andIdcardbNotEqualTo(String value) {
            addCriterion("idcardB <>", value, "idcardb");
            return (Criteria) this;
        }

        public Criteria andIdcardbGreaterThan(String value) {
            addCriterion("idcardB >", value, "idcardb");
            return (Criteria) this;
        }

        public Criteria andIdcardbGreaterThanOrEqualTo(String value) {
            addCriterion("idcardB >=", value, "idcardb");
            return (Criteria) this;
        }

        public Criteria andIdcardbLessThan(String value) {
            addCriterion("idcardB <", value, "idcardb");
            return (Criteria) this;
        }

        public Criteria andIdcardbLessThanOrEqualTo(String value) {
            addCriterion("idcardB <=", value, "idcardb");
            return (Criteria) this;
        }

        public Criteria andIdcardbLike(String value) {
            addCriterion("idcardB like", value, "idcardb");
            return (Criteria) this;
        }

        public Criteria andIdcardbNotLike(String value) {
            addCriterion("idcardB not like", value, "idcardb");
            return (Criteria) this;
        }

        public Criteria andIdcardbIn(List<String> values) {
            addCriterion("idcardB in", values, "idcardb");
            return (Criteria) this;
        }

        public Criteria andIdcardbNotIn(List<String> values) {
            addCriterion("idcardB not in", values, "idcardb");
            return (Criteria) this;
        }

        public Criteria andIdcardbBetween(String value1, String value2) {
            addCriterion("idcardB between", value1, value2, "idcardb");
            return (Criteria) this;
        }

        public Criteria andIdcardbNotBetween(String value1, String value2) {
            addCriterion("idcardB not between", value1, value2, "idcardb");
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