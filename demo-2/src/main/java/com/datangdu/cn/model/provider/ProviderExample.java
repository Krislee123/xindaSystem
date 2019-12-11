package com.datangdu.cn.model.provider;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProviderExample {
	   public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

		public int getPageSize() {
			return pageSize;
		}

		public void setPageSize(int pageSize) {
			this.pageSize = pageSize;
		}

		public int getPageNum() {
			return pageNum;
		}

		public void setPageNum(int pageNum) {
			this.pageNum = pageNum;
		}

		public String getLikeName() {
			return likeName;
		}

		public void setLikeName(String likeName) {
			this.likeName = likeName;
		}

		protected String orderByClause;

	    protected boolean distinct;

	    protected List<Criteria> oredCriteria;
	    
	    protected int pageSize;		//1
	    
	    protected int pageNum;		//2
	    
	    protected String likeName;
	    
	    protected int status;

	    public ProviderExample() {
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
	        pageSize=1;
	        pageNum=2;
	        likeName=null;
	        status=1;
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

	        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
	            if (value == null) {
	                throw new RuntimeException("Value for " + property + " cannot be null");
	            }
	            addCriterion(condition, new java.sql.Date(value.getTime()), property);
	        }

	        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
	            if (values == null || values.size() == 0) {
	                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
	            }
	            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
	            Iterator<Date> iter = values.iterator();
	            while (iter.hasNext()) {
	                dateList.add(new java.sql.Date(iter.next().getTime()));
	            }
	            addCriterion(condition, dateList, property);
	        }

	        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
	            if (value1 == null || value2 == null) {
	                throw new RuntimeException("Between values for " + property + " cannot be null");
	            }
	            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
	        }

	        public Criteria andIdIsNull() {
	            addCriterion("ID is null");
	            return (Criteria) this;
	        }

	        public Criteria andIdIsNotNull() {
	            addCriterion("ID is not null");
	            return (Criteria) this;
	        }

	        public Criteria andIdEqualTo(String value) {
	            addCriterion("ID =", value, "id");
	            return (Criteria) this;
	        }

	        public Criteria andIdNotEqualTo(String value) {
	            addCriterion("ID <>", value, "id");
	            return (Criteria) this;
	        }

	        public Criteria andIdGreaterThan(String value) {
	            addCriterion("ID >", value, "id");
	            return (Criteria) this;
	        }

	        public Criteria andIdGreaterThanOrEqualTo(String value) {
	            addCriterion("ID >=", value, "id");
	            return (Criteria) this;
	        }

	        public Criteria andIdLessThan(String value) {
	            addCriterion("ID <", value, "id");
	            return (Criteria) this;
	        }

	        public Criteria andIdLessThanOrEqualTo(String value) {
	            addCriterion("ID <=", value, "id");
	            return (Criteria) this;
	        }

	        public Criteria andIdLike(String value) {
	            addCriterion("ID like", value, "id");
	            return (Criteria) this;
	        }

	        public Criteria andIdNotLike(String value) {
	            addCriterion("ID not like", value, "id");
	            return (Criteria) this;
	        }

	        public Criteria andIdIn(List<String> values) {
	            addCriterion("ID in", values, "id");
	            return (Criteria) this;
	        }

	        public Criteria andIdNotIn(List<String> values) {
	            addCriterion("ID not in", values, "id");
	            return (Criteria) this;
	        }

	        public Criteria andIdBetween(String value1, String value2) {
	            addCriterion("ID between", value1, value2, "id");
	            return (Criteria) this;
	        }

	        public Criteria andIdNotBetween(String value1, String value2) {
	            addCriterion("ID not between", value1, value2, "id");
	            return (Criteria) this;
	        }

	        public Criteria andNameIsNull() {
	            addCriterion("NAME is null");
	            return (Criteria) this;
	        }

	        public Criteria andNameIsNotNull() {
	            addCriterion("NAME is not null");
	            return (Criteria) this;
	        }

	        public Criteria andNameEqualTo(String value) {
	            addCriterion("NAME =", value, "name");
	            return (Criteria) this;
	        }

	        public Criteria andNameNotEqualTo(String value) {
	            addCriterion("NAME <>", value, "name");
	            return (Criteria) this;
	        }

	        public Criteria andNameGreaterThan(String value) {
	            addCriterion("NAME >", value, "name");
	            return (Criteria) this;
	        }

	        public Criteria andNameGreaterThanOrEqualTo(String value) {
	            addCriterion("NAME >=", value, "name");
	            return (Criteria) this;
	        }

	        public Criteria andNameLessThan(String value) {
	            addCriterion("NAME <", value, "name");
	            return (Criteria) this;
	        }

	        public Criteria andNameLessThanOrEqualTo(String value) {
	            addCriterion("NAME <=", value, "name");
	            return (Criteria) this;
	        }

	        public Criteria andNameLike(String value) {
	            addCriterion("NAME like", value, "name");
	            return (Criteria) this;
	        }

	        public Criteria andNameNotLike(String value) {
	            addCriterion("NAME not like", value, "name");
	            return (Criteria) this;
	        }

	        public Criteria andNameIn(List<String> values) {
	            addCriterion("NAME in", values, "name");
	            return (Criteria) this;
	        }

	        public Criteria andNameNotIn(List<String> values) {
	            addCriterion("NAME not in", values, "name");
	            return (Criteria) this;
	        }

	        public Criteria andNameBetween(String value1, String value2) {
	            addCriterion("NAME between", value1, value2, "name");
	            return (Criteria) this;
	        }

	        public Criteria andNameNotBetween(String value1, String value2) {
	            addCriterion("NAME not between", value1, value2, "name");
	            return (Criteria) this;
	        }

	        public Criteria andProviderInfoIsNull() {
	            addCriterion("PROVIDER_INFO is null");
	            return (Criteria) this;
	        }

	        public Criteria andProviderInfoIsNotNull() {
	            addCriterion("PROVIDER_INFO is not null");
	            return (Criteria) this;
	        }

	        public Criteria andProviderInfoEqualTo(String value) {
	            addCriterion("PROVIDER_INFO =", value, "providerInfo");
	            return (Criteria) this;
	        }

	        public Criteria andProviderInfoNotEqualTo(String value) {
	            addCriterion("PROVIDER_INFO <>", value, "providerInfo");
	            return (Criteria) this;
	        }

	        public Criteria andProviderInfoGreaterThan(String value) {
	            addCriterion("PROVIDER_INFO >", value, "providerInfo");
	            return (Criteria) this;
	        }

	        public Criteria andProviderInfoGreaterThanOrEqualTo(String value) {
	            addCriterion("PROVIDER_INFO >=", value, "providerInfo");
	            return (Criteria) this;
	        }

	        public Criteria andProviderInfoLessThan(String value) {
	            addCriterion("PROVIDER_INFO <", value, "providerInfo");
	            return (Criteria) this;
	        }

	        public Criteria andProviderInfoLessThanOrEqualTo(String value) {
	            addCriterion("PROVIDER_INFO <=", value, "providerInfo");
	            return (Criteria) this;
	        }

	        public Criteria andProviderInfoLike(String value) {
	            addCriterion("PROVIDER_INFO like", value, "providerInfo");
	            return (Criteria) this;
	        }

	        public Criteria andProviderInfoNotLike(String value) {
	            addCriterion("PROVIDER_INFO not like", value, "providerInfo");
	            return (Criteria) this;
	        }

	        public Criteria andProviderInfoIn(List<String> values) {
	            addCriterion("PROVIDER_INFO in", values, "providerInfo");
	            return (Criteria) this;
	        }

	        public Criteria andProviderInfoNotIn(List<String> values) {
	            addCriterion("PROVIDER_INFO not in", values, "providerInfo");
	            return (Criteria) this;
	        }

	        public Criteria andProviderInfoBetween(String value1, String value2) {
	            addCriterion("PROVIDER_INFO between", value1, value2, "providerInfo");
	            return (Criteria) this;
	        }

	        public Criteria andProviderInfoNotBetween(String value1, String value2) {
	            addCriterion("PROVIDER_INFO not between", value1, value2, "providerInfo");
	            return (Criteria) this;
	        }

	        public Criteria andCellphoneIsNull() {
	            addCriterion("CELLPHONE is null");
	            return (Criteria) this;
	        }

	        public Criteria andCellphoneIsNotNull() {
	            addCriterion("CELLPHONE is not null");
	            return (Criteria) this;
	        }

	        public Criteria andCellphoneEqualTo(String value) {
	            addCriterion("CELLPHONE =", value, "cellphone");
	            return (Criteria) this;
	        }

	        public Criteria andCellphoneNotEqualTo(String value) {
	            addCriterion("CELLPHONE <>", value, "cellphone");
	            return (Criteria) this;
	        }

	        public Criteria andCellphoneGreaterThan(String value) {
	            addCriterion("CELLPHONE >", value, "cellphone");
	            return (Criteria) this;
	        }

	        public Criteria andCellphoneGreaterThanOrEqualTo(String value) {
	            addCriterion("CELLPHONE >=", value, "cellphone");
	            return (Criteria) this;
	        }

	        public Criteria andCellphoneLessThan(String value) {
	            addCriterion("CELLPHONE <", value, "cellphone");
	            return (Criteria) this;
	        }

	        public Criteria andCellphoneLessThanOrEqualTo(String value) {
	            addCriterion("CELLPHONE <=", value, "cellphone");
	            return (Criteria) this;
	        }

	        public Criteria andCellphoneLike(String value) {
	            addCriterion("CELLPHONE like", value, "cellphone");
	            return (Criteria) this;
	        }

	        public Criteria andCellphoneNotLike(String value) {
	            addCriterion("CELLPHONE not like", value, "cellphone");
	            return (Criteria) this;
	        }

	        public Criteria andCellphoneIn(List<String> values) {
	            addCriterion("CELLPHONE in", values, "cellphone");
	            return (Criteria) this;
	        }

	        public Criteria andCellphoneNotIn(List<String> values) {
	            addCriterion("CELLPHONE not in", values, "cellphone");
	            return (Criteria) this;
	        }

	        public Criteria andCellphoneBetween(String value1, String value2) {
	            addCriterion("CELLPHONE between", value1, value2, "cellphone");
	            return (Criteria) this;
	        }

	        public Criteria andCellphoneNotBetween(String value1, String value2) {
	            addCriterion("CELLPHONE not between", value1, value2, "cellphone");
	            return (Criteria) this;
	        }

	        public Criteria andLoginIdIsNull() {
	            addCriterion("LOGIN_ID is null");
	            return (Criteria) this;
	        }

	        public Criteria andLoginIdIsNotNull() {
	            addCriterion("LOGIN_ID is not null");
	            return (Criteria) this;
	        }

	        public Criteria andLoginIdEqualTo(String value) {
	            addCriterion("LOGIN_ID =", value, "loginId");
	            return (Criteria) this;
	        }

	        public Criteria andLoginIdNotEqualTo(String value) {
	            addCriterion("LOGIN_ID <>", value, "loginId");
	            return (Criteria) this;
	        }

	        public Criteria andLoginIdGreaterThan(String value) {
	            addCriterion("LOGIN_ID >", value, "loginId");
	            return (Criteria) this;
	        }

	        public Criteria andLoginIdGreaterThanOrEqualTo(String value) {
	            addCriterion("LOGIN_ID >=", value, "loginId");
	            return (Criteria) this;
	        }

	        public Criteria andLoginIdLessThan(String value) {
	            addCriterion("LOGIN_ID <", value, "loginId");
	            return (Criteria) this;
	        }

	        public Criteria andLoginIdLessThanOrEqualTo(String value) {
	            addCriterion("LOGIN_ID <=", value, "loginId");
	            return (Criteria) this;
	        }

	        public Criteria andLoginIdLike(String value) {
	            addCriterion("LOGIN_ID like", value, "loginId");
	            return (Criteria) this;
	        }

	        public Criteria andLoginIdNotLike(String value) {
	            addCriterion("LOGIN_ID not like", value, "loginId");
	            return (Criteria) this;
	        }

	        public Criteria andLoginIdIn(List<String> values) {
	            addCriterion("LOGIN_ID in", values, "loginId");
	            return (Criteria) this;
	        }

	        public Criteria andLoginIdNotIn(List<String> values) {
	            addCriterion("LOGIN_ID not in", values, "loginId");
	            return (Criteria) this;
	        }

	        public Criteria andLoginIdBetween(String value1, String value2) {
	            addCriterion("LOGIN_ID between", value1, value2, "loginId");
	            return (Criteria) this;
	        }

	        public Criteria andLoginIdNotBetween(String value1, String value2) {
	            addCriterion("LOGIN_ID not between", value1, value2, "loginId");
	            return (Criteria) this;
	        }

	        public Criteria andPasswordIsNull() {
	            addCriterion("PASSWORD is null");
	            return (Criteria) this;
	        }

	        public Criteria andPasswordIsNotNull() {
	            addCriterion("PASSWORD is not null");
	            return (Criteria) this;
	        }

	        public Criteria andPasswordEqualTo(String value) {
	            addCriterion("PASSWORD =", value, "password");
	            return (Criteria) this;
	        }

	        public Criteria andPasswordNotEqualTo(String value) {
	            addCriterion("PASSWORD <>", value, "password");
	            return (Criteria) this;
	        }

	        public Criteria andPasswordGreaterThan(String value) {
	            addCriterion("PASSWORD >", value, "password");
	            return (Criteria) this;
	        }

	        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
	            addCriterion("PASSWORD >=", value, "password");
	            return (Criteria) this;
	        }

	        public Criteria andPasswordLessThan(String value) {
	            addCriterion("PASSWORD <", value, "password");
	            return (Criteria) this;
	        }

	        public Criteria andPasswordLessThanOrEqualTo(String value) {
	            addCriterion("PASSWORD <=", value, "password");
	            return (Criteria) this;
	        }

	        public Criteria andPasswordLike(String value) {
	            addCriterion("PASSWORD like", value, "password");
	            return (Criteria) this;
	        }

	        public Criteria andPasswordNotLike(String value) {
	            addCriterion("PASSWORD not like", value, "password");
	            return (Criteria) this;
	        }

	        public Criteria andPasswordIn(List<String> values) {
	            addCriterion("PASSWORD in", values, "password");
	            return (Criteria) this;
	        }

	        public Criteria andPasswordNotIn(List<String> values) {
	            addCriterion("PASSWORD not in", values, "password");
	            return (Criteria) this;
	        }

	        public Criteria andPasswordBetween(String value1, String value2) {
	            addCriterion("PASSWORD between", value1, value2, "password");
	            return (Criteria) this;
	        }

	        public Criteria andPasswordNotBetween(String value1, String value2) {
	            addCriterion("PASSWORD not between", value1, value2, "password");
	            return (Criteria) this;
	        }

	        public Criteria andProviderImgIsNull() {
	            addCriterion("PROVIDER_IMG is null");
	            return (Criteria) this;
	        }

	        public Criteria andProviderImgIsNotNull() {
	            addCriterion("PROVIDER_IMG is not null");
	            return (Criteria) this;
	        }

	        public Criteria andProviderImgEqualTo(String value) {
	            addCriterion("PROVIDER_IMG =", value, "providerImg");
	            return (Criteria) this;
	        }

	        public Criteria andProviderImgNotEqualTo(String value) {
	            addCriterion("PROVIDER_IMG <>", value, "providerImg");
	            return (Criteria) this;
	        }

	        public Criteria andProviderImgGreaterThan(String value) {
	            addCriterion("PROVIDER_IMG >", value, "providerImg");
	            return (Criteria) this;
	        }

	        public Criteria andProviderImgGreaterThanOrEqualTo(String value) {
	            addCriterion("PROVIDER_IMG >=", value, "providerImg");
	            return (Criteria) this;
	        }

	        public Criteria andProviderImgLessThan(String value) {
	            addCriterion("PROVIDER_IMG <", value, "providerImg");
	            return (Criteria) this;
	        }

	        public Criteria andProviderImgLessThanOrEqualTo(String value) {
	            addCriterion("PROVIDER_IMG <=", value, "providerImg");
	            return (Criteria) this;
	        }

	        public Criteria andProviderImgLike(String value) {
	            addCriterion("PROVIDER_IMG like", value, "providerImg");
	            return (Criteria) this;
	        }

	        public Criteria andProviderImgNotLike(String value) {
	            addCriterion("PROVIDER_IMG not like", value, "providerImg");
	            return (Criteria) this;
	        }

	        public Criteria andProviderImgIn(List<String> values) {
	            addCriterion("PROVIDER_IMG in", values, "providerImg");
	            return (Criteria) this;
	        }

	        public Criteria andProviderImgNotIn(List<String> values) {
	            addCriterion("PROVIDER_IMG not in", values, "providerImg");
	            return (Criteria) this;
	        }

	        public Criteria andProviderImgBetween(String value1, String value2) {
	            addCriterion("PROVIDER_IMG between", value1, value2, "providerImg");
	            return (Criteria) this;
	        }

	        public Criteria andProviderImgNotBetween(String value1, String value2) {
	            addCriterion("PROVIDER_IMG not between", value1, value2, "providerImg");
	            return (Criteria) this;
	        }

	        public Criteria andRegionIdIsNull() {
	            addCriterion("REGION_ID is null");
	            return (Criteria) this;
	        }

	        public Criteria andRegionIdIsNotNull() {
	            addCriterion("REGION_ID is not null");
	            return (Criteria) this;
	        }

	        public Criteria andRegionIdEqualTo(String value) {
	            addCriterion("REGION_ID =", value, "regionId");
	            return (Criteria) this;
	        }

	        public Criteria andRegionIdNotEqualTo(String value) {
	            addCriterion("REGION_ID <>", value, "regionId");
	            return (Criteria) this;
	        }

	        public Criteria andRegionIdGreaterThan(String value) {
	            addCriterion("REGION_ID >", value, "regionId");
	            return (Criteria) this;
	        }

	        public Criteria andRegionIdGreaterThanOrEqualTo(String value) {
	            addCriterion("REGION_ID >=", value, "regionId");
	            return (Criteria) this;
	        }

	        public Criteria andRegionIdLessThan(String value) {
	            addCriterion("REGION_ID <", value, "regionId");
	            return (Criteria) this;
	        }

	        public Criteria andRegionIdLessThanOrEqualTo(String value) {
	            addCriterion("REGION_ID <=", value, "regionId");
	            return (Criteria) this;
	        }

	        public Criteria andRegionIdLike(String value) {
	            addCriterion("REGION_ID like", value, "regionId");
	            return (Criteria) this;
	        }

	        public Criteria andRegionIdNotLike(String value) {
	            addCriterion("REGION_ID not like", value, "regionId");
	            return (Criteria) this;
	        }

	        public Criteria andRegionIdIn(List<String> values) {
	            addCriterion("REGION_ID in", values, "regionId");
	            return (Criteria) this;
	        }

	        public Criteria andRegionIdNotIn(List<String> values) {
	            addCriterion("REGION_ID not in", values, "regionId");
	            return (Criteria) this;
	        }

	        public Criteria andRegionIdBetween(String value1, String value2) {
	            addCriterion("REGION_ID between", value1, value2, "regionId");
	            return (Criteria) this;
	        }

	        public Criteria andRegionIdNotBetween(String value1, String value2) {
	            addCriterion("REGION_ID not between", value1, value2, "regionId");
	            return (Criteria) this;
	        }

	        public Criteria andRegisterTimeIsNull() {
	            addCriterion("REGISTER_TIME is null");
	            return (Criteria) this;
	        }

	        public Criteria andRegisterTimeIsNotNull() {
	            addCriterion("REGISTER_TIME is not null");
	            return (Criteria) this;
	        }

	        public Criteria andRegisterTimeEqualTo(Date value) {
	            addCriterionForJDBCDate("REGISTER_TIME =", value, "registerTime");
	            return (Criteria) this;
	        }

	        public Criteria andRegisterTimeNotEqualTo(Date value) {
	            addCriterionForJDBCDate("REGISTER_TIME <>", value, "registerTime");
	            return (Criteria) this;
	        }

	        public Criteria andRegisterTimeGreaterThan(Date value) {
	            addCriterionForJDBCDate("REGISTER_TIME >", value, "registerTime");
	            return (Criteria) this;
	        }

	        public Criteria andRegisterTimeGreaterThanOrEqualTo(Date value) {
	            addCriterionForJDBCDate("REGISTER_TIME >=", value, "registerTime");
	            return (Criteria) this;
	        }

	        public Criteria andRegisterTimeLessThan(Date value) {
	            addCriterionForJDBCDate("REGISTER_TIME <", value, "registerTime");
	            return (Criteria) this;
	        }

	        public Criteria andRegisterTimeLessThanOrEqualTo(Date value) {
	            addCriterionForJDBCDate("REGISTER_TIME <=", value, "registerTime");
	            return (Criteria) this;
	        }

	        public Criteria andRegisterTimeIn(List<Date> values) {
	            addCriterionForJDBCDate("REGISTER_TIME in", values, "registerTime");
	            return (Criteria) this;
	        }

	        public Criteria andRegisterTimeNotIn(List<Date> values) {
	            addCriterionForJDBCDate("REGISTER_TIME not in", values, "registerTime");
	            return (Criteria) this;
	        }

	        public Criteria andRegisterTimeBetween(Date value1, Date value2) {
	            addCriterionForJDBCDate("REGISTER_TIME between", value1, value2, "registerTime");
	            return (Criteria) this;
	        }

	        public Criteria andRegisterTimeNotBetween(Date value1, Date value2) {
	            addCriterionForJDBCDate("REGISTER_TIME not between", value1, value2, "registerTime");
	            return (Criteria) this;
	        }

	        public Criteria andStatusIsNull() {
	            addCriterion("STATUS is null");
	            return (Criteria) this;
	        }

	        public Criteria andStatusIsNotNull() {
	            addCriterion("STATUS is not null");
	            return (Criteria) this;
	        }

	        public Criteria andStatusEqualTo(Integer value) {
	            addCriterion("STATUS =", value, "status");
	            return (Criteria) this;
	        }

	        public Criteria andStatusNotEqualTo(Integer value) {
	            addCriterion("STATUS <>", value, "status");
	            return (Criteria) this;
	        }

	        public Criteria andStatusGreaterThan(Integer value) {
	            addCriterion("STATUS >", value, "status");
	            return (Criteria) this;
	        }

	        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
	            addCriterion("STATUS >=", value, "status");
	            return (Criteria) this;
	        }

	        public Criteria andStatusLessThan(Integer value) {
	            addCriterion("STATUS <", value, "status");
	            return (Criteria) this;
	        }

	        public Criteria andStatusLessThanOrEqualTo(Integer value) {
	            addCriterion("STATUS <=", value, "status");
	            return (Criteria) this;
	        }

	        public Criteria andStatusIn(List<Integer> values) {
	            addCriterion("STATUS in", values, "status");
	            return (Criteria) this;
	        }

	        public Criteria andStatusNotIn(List<Integer> values) {
	            addCriterion("STATUS not in", values, "status");
	            return (Criteria) this;
	        }

	        public Criteria andStatusBetween(Integer value1, Integer value2) {
	            addCriterion("STATUS between", value1, value2, "status");
	            return (Criteria) this;
	        }

	        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
	            addCriterion("STATUS not between", value1, value2, "status");
	            return (Criteria) this;
	        }

	        public Criteria andAuthFileIsNull() {
	            addCriterion("AUTH_FILE is null");
	            return (Criteria) this;
	        }

	        public Criteria andAuthFileIsNotNull() {
	            addCriterion("AUTH_FILE is not null");
	            return (Criteria) this;
	        }

	        public Criteria andAuthFileEqualTo(String value) {
	            addCriterion("AUTH_FILE =", value, "authFile");
	            return (Criteria) this;
	        }

	        public Criteria andAuthFileNotEqualTo(String value) {
	            addCriterion("AUTH_FILE <>", value, "authFile");
	            return (Criteria) this;
	        }

	        public Criteria andAuthFileGreaterThan(String value) {
	            addCriterion("AUTH_FILE >", value, "authFile");
	            return (Criteria) this;
	        }

	        public Criteria andAuthFileGreaterThanOrEqualTo(String value) {
	            addCriterion("AUTH_FILE >=", value, "authFile");
	            return (Criteria) this;
	        }

	        public Criteria andAuthFileLessThan(String value) {
	            addCriterion("AUTH_FILE <", value, "authFile");
	            return (Criteria) this;
	        }

	        public Criteria andAuthFileLessThanOrEqualTo(String value) {
	            addCriterion("AUTH_FILE <=", value, "authFile");
	            return (Criteria) this;
	        }

	        public Criteria andAuthFileLike(String value) {
	            addCriterion("AUTH_FILE like", value, "authFile");
	            return (Criteria) this;
	        }

	        public Criteria andAuthFileNotLike(String value) {
	            addCriterion("AUTH_FILE not like", value, "authFile");
	            return (Criteria) this;
	        }

	        public Criteria andAuthFileIn(List<String> values) {
	            addCriterion("AUTH_FILE in", values, "authFile");
	            return (Criteria) this;
	        }

	        public Criteria andAuthFileNotIn(List<String> values) {
	            addCriterion("AUTH_FILE not in", values, "authFile");
	            return (Criteria) this;
	        }

	        public Criteria andAuthFileBetween(String value1, String value2) {
	            addCriterion("AUTH_FILE between", value1, value2, "authFile");
	            return (Criteria) this;
	        }

	        public Criteria andAuthFileNotBetween(String value1, String value2) {
	            addCriterion("AUTH_FILE not between", value1, value2, "authFile");
	            return (Criteria) this;
	        }

	        public Criteria andWeixinIsNull() {
	            addCriterion("WEIXIN is null");
	            return (Criteria) this;
	        }

	        public Criteria andWeixinIsNotNull() {
	            addCriterion("WEIXIN is not null");
	            return (Criteria) this;
	        }

	        public Criteria andWeixinEqualTo(String value) {
	            addCriterion("WEIXIN =", value, "weixin");
	            return (Criteria) this;
	        }

	        public Criteria andWeixinNotEqualTo(String value) {
	            addCriterion("WEIXIN <>", value, "weixin");
	            return (Criteria) this;
	        }

	        public Criteria andWeixinGreaterThan(String value) {
	            addCriterion("WEIXIN >", value, "weixin");
	            return (Criteria) this;
	        }

	        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
	            addCriterion("WEIXIN >=", value, "weixin");
	            return (Criteria) this;
	        }

	        public Criteria andWeixinLessThan(String value) {
	            addCriterion("WEIXIN <", value, "weixin");
	            return (Criteria) this;
	        }

	        public Criteria andWeixinLessThanOrEqualTo(String value) {
	            addCriterion("WEIXIN <=", value, "weixin");
	            return (Criteria) this;
	        }

	        public Criteria andWeixinLike(String value) {
	            addCriterion("WEIXIN like", value, "weixin");
	            return (Criteria) this;
	        }

	        public Criteria andWeixinNotLike(String value) {
	            addCriterion("WEIXIN not like", value, "weixin");
	            return (Criteria) this;
	        }

	        public Criteria andWeixinIn(List<String> values) {
	            addCriterion("WEIXIN in", values, "weixin");
	            return (Criteria) this;
	        }

	        public Criteria andWeixinNotIn(List<String> values) {
	            addCriterion("WEIXIN not in", values, "weixin");
	            return (Criteria) this;
	        }

	        public Criteria andWeixinBetween(String value1, String value2) {
	            addCriterion("WEIXIN between", value1, value2, "weixin");
	            return (Criteria) this;
	        }

	        public Criteria andWeixinNotBetween(String value1, String value2) {
	            addCriterion("WEIXIN not between", value1, value2, "weixin");
	            return (Criteria) this;
	        }

	        public Criteria andQqIsNull() {
	            addCriterion("QQ is null");
	            return (Criteria) this;
	        }

	        public Criteria andQqIsNotNull() {
	            addCriterion("QQ is not null");
	            return (Criteria) this;
	        }

	        public Criteria andQqEqualTo(String value) {
	            addCriterion("QQ =", value, "qq");
	            return (Criteria) this;
	        }

	        public Criteria andQqNotEqualTo(String value) {
	            addCriterion("QQ <>", value, "qq");
	            return (Criteria) this;
	        }

	        public Criteria andQqGreaterThan(String value) {
	            addCriterion("QQ >", value, "qq");
	            return (Criteria) this;
	        }

	        public Criteria andQqGreaterThanOrEqualTo(String value) {
	            addCriterion("QQ >=", value, "qq");
	            return (Criteria) this;
	        }

	        public Criteria andQqLessThan(String value) {
	            addCriterion("QQ <", value, "qq");
	            return (Criteria) this;
	        }

	        public Criteria andQqLessThanOrEqualTo(String value) {
	            addCriterion("QQ <=", value, "qq");
	            return (Criteria) this;
	        }

	        public Criteria andQqLike(String value) {
	            addCriterion("QQ like", value, "qq");
	            return (Criteria) this;
	        }

	        public Criteria andQqNotLike(String value) {
	            addCriterion("QQ not like", value, "qq");
	            return (Criteria) this;
	        }

	        public Criteria andQqIn(List<String> values) {
	            addCriterion("QQ in", values, "qq");
	            return (Criteria) this;
	        }

	        public Criteria andQqNotIn(List<String> values) {
	            addCriterion("QQ not in", values, "qq");
	            return (Criteria) this;
	        }

	        public Criteria andQqBetween(String value1, String value2) {
	            addCriterion("QQ between", value1, value2, "qq");
	            return (Criteria) this;
	        }

	        public Criteria andQqNotBetween(String value1, String value2) {
	            addCriterion("QQ not between", value1, value2, "qq");
	            return (Criteria) this;
	        }

	        public Criteria andWorkTimeIsNull() {
	            addCriterion("WORK_TIME is null");
	            return (Criteria) this;
	        }

	        public Criteria andWorkTimeIsNotNull() {
	            addCriterion("WORK_TIME is not null");
	            return (Criteria) this;
	        }

	        public Criteria andWorkTimeEqualTo(String value) {
	            addCriterion("WORK_TIME =", value, "workTime");
	            return (Criteria) this;
	        }

	        public Criteria andWorkTimeNotEqualTo(String value) {
	            addCriterion("WORK_TIME <>", value, "workTime");
	            return (Criteria) this;
	        }

	        public Criteria andWorkTimeGreaterThan(String value) {
	            addCriterion("WORK_TIME >", value, "workTime");
	            return (Criteria) this;
	        }

	        public Criteria andWorkTimeGreaterThanOrEqualTo(String value) {
	            addCriterion("WORK_TIME >=", value, "workTime");
	            return (Criteria) this;
	        }

	        public Criteria andWorkTimeLessThan(String value) {
	            addCriterion("WORK_TIME <", value, "workTime");
	            return (Criteria) this;
	        }

	        public Criteria andWorkTimeLessThanOrEqualTo(String value) {
	            addCriterion("WORK_TIME <=", value, "workTime");
	            return (Criteria) this;
	        }

	        public Criteria andWorkTimeLike(String value) {
	            addCriterion("WORK_TIME like", value, "workTime");
	            return (Criteria) this;
	        }

	        public Criteria andWorkTimeNotLike(String value) {
	            addCriterion("WORK_TIME not like", value, "workTime");
	            return (Criteria) this;
	        }

	        public Criteria andWorkTimeIn(List<String> values) {
	            addCriterion("WORK_TIME in", values, "workTime");
	            return (Criteria) this;
	        }

	        public Criteria andWorkTimeNotIn(List<String> values) {
	            addCriterion("WORK_TIME not in", values, "workTime");
	            return (Criteria) this;
	        }

	        public Criteria andWorkTimeBetween(String value1, String value2) {
	            addCriterion("WORK_TIME between", value1, value2, "workTime");
	            return (Criteria) this;
	        }

	        public Criteria andWorkTimeNotBetween(String value1, String value2) {
	            addCriterion("WORK_TIME not between", value1, value2, "workTime");
	            return (Criteria) this;
	        }

	        public Criteria andEmailIsNull() {
	            addCriterion("EMAIL is null");
	            return (Criteria) this;
	        }

	        public Criteria andEmailIsNotNull() {
	            addCriterion("EMAIL is not null");
	            return (Criteria) this;
	        }

	        public Criteria andEmailEqualTo(String value) {
	            addCriterion("EMAIL =", value, "email");
	            return (Criteria) this;
	        }

	        public Criteria andEmailNotEqualTo(String value) {
	            addCriterion("EMAIL <>", value, "email");
	            return (Criteria) this;
	        }

	        public Criteria andEmailGreaterThan(String value) {
	            addCriterion("EMAIL >", value, "email");
	            return (Criteria) this;
	        }

	        public Criteria andEmailGreaterThanOrEqualTo(String value) {
	            addCriterion("EMAIL >=", value, "email");
	            return (Criteria) this;
	        }

	        public Criteria andEmailLessThan(String value) {
	            addCriterion("EMAIL <", value, "email");
	            return (Criteria) this;
	        }

	        public Criteria andEmailLessThanOrEqualTo(String value) {
	            addCriterion("EMAIL <=", value, "email");
	            return (Criteria) this;
	        }

	        public Criteria andEmailLike(String value) {
	            addCriterion("EMAIL like", value, "email");
	            return (Criteria) this;
	        }

	        public Criteria andEmailNotLike(String value) {
	            addCriterion("EMAIL not like", value, "email");
	            return (Criteria) this;
	        }

	        public Criteria andEmailIn(List<String> values) {
	            addCriterion("EMAIL in", values, "email");
	            return (Criteria) this;
	        }

	        public Criteria andEmailNotIn(List<String> values) {
	            addCriterion("EMAIL not in", values, "email");
	            return (Criteria) this;
	        }

	        public Criteria andEmailBetween(String value1, String value2) {
	            addCriterion("EMAIL between", value1, value2, "email");
	            return (Criteria) this;
	        }

	        public Criteria andEmailNotBetween(String value1, String value2) {
	            addCriterion("EMAIL not between", value1, value2, "email");
	            return (Criteria) this;
	        }

	        public Criteria andRecommendIsNull() {
	            addCriterion("RECOMMEND is null");
	            return (Criteria) this;
	        }

	        public Criteria andRecommendIsNotNull() {
	            addCriterion("RECOMMEND is not null");
	            return (Criteria) this;
	        }

	        public Criteria andRecommendEqualTo(Integer value) {
	            addCriterion("RECOMMEND =", value, "recommend");
	            return (Criteria) this;
	        }

	        public Criteria andRecommendNotEqualTo(Integer value) {
	            addCriterion("RECOMMEND <>", value, "recommend");
	            return (Criteria) this;
	        }

	        public Criteria andRecommendGreaterThan(Integer value) {
	            addCriterion("RECOMMEND >", value, "recommend");
	            return (Criteria) this;
	        }

	        public Criteria andRecommendGreaterThanOrEqualTo(Integer value) {
	            addCriterion("RECOMMEND >=", value, "recommend");
	            return (Criteria) this;
	        }

	        public Criteria andRecommendLessThan(Integer value) {
	            addCriterion("RECOMMEND <", value, "recommend");
	            return (Criteria) this;
	        }

	        public Criteria andRecommendLessThanOrEqualTo(Integer value) {
	            addCriterion("RECOMMEND <=", value, "recommend");
	            return (Criteria) this;
	        }

	        public Criteria andRecommendIn(List<Integer> values) {
	            addCriterion("RECOMMEND in", values, "recommend");
	            return (Criteria) this;
	        }

	        public Criteria andRecommendNotIn(List<Integer> values) {
	            addCriterion("RECOMMEND not in", values, "recommend");
	            return (Criteria) this;
	        }

	        public Criteria andRecommendBetween(Integer value1, Integer value2) {
	            addCriterion("RECOMMEND between", value1, value2, "recommend");
	            return (Criteria) this;
	        }

	        public Criteria andRecommendNotBetween(Integer value1, Integer value2) {
	            addCriterion("RECOMMEND not between", value1, value2, "recommend");
	            return (Criteria) this;
	        }

	        public Criteria andProviderIntroduceIsNull() {
	            addCriterion("PROVIDER_INTRODUCE is null");
	            return (Criteria) this;
	        }

	        public Criteria andProviderIntroduceIsNotNull() {
	            addCriterion("PROVIDER_INTRODUCE is not null");
	            return (Criteria) this;
	        }

	        public Criteria andProviderIntroduceEqualTo(String value) {
	            addCriterion("PROVIDER_INTRODUCE =", value, "providerIntroduce");
	            return (Criteria) this;
	        }

	        public Criteria andProviderIntroduceNotEqualTo(String value) {
	            addCriterion("PROVIDER_INTRODUCE <>", value, "providerIntroduce");
	            return (Criteria) this;
	        }

	        public Criteria andProviderIntroduceGreaterThan(String value) {
	            addCriterion("PROVIDER_INTRODUCE >", value, "providerIntroduce");
	            return (Criteria) this;
	        }

	        public Criteria andProviderIntroduceGreaterThanOrEqualTo(String value) {
	            addCriterion("PROVIDER_INTRODUCE >=", value, "providerIntroduce");
	            return (Criteria) this;
	        }

	        public Criteria andProviderIntroduceLessThan(String value) {
	            addCriterion("PROVIDER_INTRODUCE <", value, "providerIntroduce");
	            return (Criteria) this;
	        }

	        public Criteria andProviderIntroduceLessThanOrEqualTo(String value) {
	            addCriterion("PROVIDER_INTRODUCE <=", value, "providerIntroduce");
	            return (Criteria) this;
	        }

	        public Criteria andProviderIntroduceLike(String value) {
	            addCriterion("PROVIDER_INTRODUCE like", value, "providerIntroduce");
	            return (Criteria) this;
	        }

	        public Criteria andProviderIntroduceNotLike(String value) {
	            addCriterion("PROVIDER_INTRODUCE not like", value, "providerIntroduce");
	            return (Criteria) this;
	        }

	        public Criteria andProviderIntroduceIn(List<String> values) {
	            addCriterion("PROVIDER_INTRODUCE in", values, "providerIntroduce");
	            return (Criteria) this;
	        }

	        public Criteria andProviderIntroduceNotIn(List<String> values) {
	            addCriterion("PROVIDER_INTRODUCE not in", values, "providerIntroduce");
	            return (Criteria) this;
	        }

	        public Criteria andProviderIntroduceBetween(String value1, String value2) {
	            addCriterion("PROVIDER_INTRODUCE between", value1, value2, "providerIntroduce");
	            return (Criteria) this;
	        }

	        public Criteria andProviderIntroduceNotBetween(String value1, String value2) {
	            addCriterion("PROVIDER_INTRODUCE not between", value1, value2, "providerIntroduce");
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