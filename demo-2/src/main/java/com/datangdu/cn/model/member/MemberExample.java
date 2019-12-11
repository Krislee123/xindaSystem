package com.datangdu.cn.model.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Iterator;

public class MemberExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	protected int pageSize; // 1

	protected int pageNum; // 2

	protected String likeName;

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

	public MemberExample() {
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
		pageSize = 1;
		pageNum = 2;
		likeName = null;
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

		public Criteria andGenderIsNull() {
			addCriterion("GENDER is null");
			return (Criteria) this;
		}

		public Criteria andGenderIsNotNull() {
			addCriterion("GENDER is not null");
			return (Criteria) this;
		}

		public Criteria andGenderEqualTo(Integer value) {
			addCriterion("GENDER =", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotEqualTo(Integer value) {
			addCriterion("GENDER <>", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThan(Integer value) {
			addCriterion("GENDER >", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
			addCriterion("GENDER >=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThan(Integer value) {
			addCriterion("GENDER <", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderLessThanOrEqualTo(Integer value) {
			addCriterion("GENDER <=", value, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderIn(List<Integer> values) {
			addCriterion("GENDER in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotIn(List<Integer> values) {
			addCriterion("GENDER not in", values, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderBetween(Integer value1, Integer value2) {
			addCriterion("GENDER between", value1, value2, "gender");
			return (Criteria) this;
		}

		public Criteria andGenderNotBetween(Integer value1, Integer value2) {
			addCriterion("GENDER not between", value1, value2, "gender");
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

		public Criteria andHeadImgIsNull() {
			addCriterion("HEAD_IMG is null");
			return (Criteria) this;
		}

		public Criteria andHeadImgIsNotNull() {
			addCriterion("HEAD_IMG is not null");
			return (Criteria) this;
		}

		public Criteria andHeadImgEqualTo(String value) {
			addCriterion("HEAD_IMG =", value, "headImg");
			return (Criteria) this;
		}

		public Criteria andHeadImgNotEqualTo(String value) {
			addCriterion("HEAD_IMG <>", value, "headImg");
			return (Criteria) this;
		}

		public Criteria andHeadImgGreaterThan(String value) {
			addCriterion("HEAD_IMG >", value, "headImg");
			return (Criteria) this;
		}

		public Criteria andHeadImgGreaterThanOrEqualTo(String value) {
			addCriterion("HEAD_IMG >=", value, "headImg");
			return (Criteria) this;
		}

		public Criteria andHeadImgLessThan(String value) {
			addCriterion("HEAD_IMG <", value, "headImg");
			return (Criteria) this;
		}

		public Criteria andHeadImgLessThanOrEqualTo(String value) {
			addCriterion("HEAD_IMG <=", value, "headImg");
			return (Criteria) this;
		}

		public Criteria andHeadImgLike(String value) {
			addCriterion("HEAD_IMG like", value, "headImg");
			return (Criteria) this;
		}

		public Criteria andHeadImgNotLike(String value) {
			addCriterion("HEAD_IMG not like", value, "headImg");
			return (Criteria) this;
		}

		public Criteria andHeadImgIn(List<String> values) {
			addCriterion("HEAD_IMG in", values, "headImg");
			return (Criteria) this;
		}

		public Criteria andHeadImgNotIn(List<String> values) {
			addCriterion("HEAD_IMG not in", values, "headImg");
			return (Criteria) this;
		}

		public Criteria andHeadImgBetween(String value1, String value2) {
			addCriterion("HEAD_IMG between", value1, value2, "headImg");
			return (Criteria) this;
		}

		public Criteria andHeadImgNotBetween(String value1, String value2) {
			addCriterion("HEAD_IMG not between", value1, value2, "headImg");
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

		public Criteria andBuyNumIsNull() {
			addCriterion("BUY_NUM is null");
			return (Criteria) this;
		}

		public Criteria andBuyNumIsNotNull() {
			addCriterion("BUY_NUM is not null");
			return (Criteria) this;
		}

		public Criteria andBuyNumEqualTo(Integer value) {
			addCriterion("BUY_NUM =", value, "buyNum");
			return (Criteria) this;
		}

		public Criteria andBuyNumNotEqualTo(Integer value) {
			addCriterion("BUY_NUM <>", value, "buyNum");
			return (Criteria) this;
		}

		public Criteria andBuyNumGreaterThan(Integer value) {
			addCriterion("BUY_NUM >", value, "buyNum");
			return (Criteria) this;
		}

		public Criteria andBuyNumGreaterThanOrEqualTo(Integer value) {
			addCriterion("BUY_NUM >=", value, "buyNum");
			return (Criteria) this;
		}

		public Criteria andBuyNumLessThan(Integer value) {
			addCriterion("BUY_NUM <", value, "buyNum");
			return (Criteria) this;
		}

		public Criteria andBuyNumLessThanOrEqualTo(Integer value) {
			addCriterion("BUY_NUM <=", value, "buyNum");
			return (Criteria) this;
		}

		public Criteria andBuyNumIn(List<Integer> values) {
			addCriterion("BUY_NUM in", values, "buyNum");
			return (Criteria) this;
		}

		public Criteria andBuyNumNotIn(List<Integer> values) {
			addCriterion("BUY_NUM not in", values, "buyNum");
			return (Criteria) this;
		}

		public Criteria andBuyNumBetween(Integer value1, Integer value2) {
			addCriterion("BUY_NUM between", value1, value2, "buyNum");
			return (Criteria) this;
		}

		public Criteria andBuyNumNotBetween(Integer value1, Integer value2) {
			addCriterion("BUY_NUM not between", value1, value2, "buyNum");
			return (Criteria) this;
		}

		public Criteria andTotalPriceIsNull() {
			addCriterion("TOTAL_PRICE is null");
			return (Criteria) this;
		}

		public Criteria andTotalPriceIsNotNull() {
			addCriterion("TOTAL_PRICE is not null");
			return (Criteria) this;
		}

		public Criteria andTotalPriceEqualTo(Integer value) {
			addCriterion("TOTAL_PRICE =", value, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andTotalPriceNotEqualTo(Integer value) {
			addCriterion("TOTAL_PRICE <>", value, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andTotalPriceGreaterThan(Integer value) {
			addCriterion("TOTAL_PRICE >", value, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andTotalPriceGreaterThanOrEqualTo(Integer value) {
			addCriterion("TOTAL_PRICE >=", value, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andTotalPriceLessThan(Integer value) {
			addCriterion("TOTAL_PRICE <", value, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andTotalPriceLessThanOrEqualTo(Integer value) {
			addCriterion("TOTAL_PRICE <=", value, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andTotalPriceIn(List<Integer> values) {
			addCriterion("TOTAL_PRICE in", values, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andTotalPriceNotIn(List<Integer> values) {
			addCriterion("TOTAL_PRICE not in", values, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andTotalPriceBetween(Integer value1, Integer value2) {
			addCriterion("TOTAL_PRICE between", value1, value2, "totalPrice");
			return (Criteria) this;
		}

		public Criteria andTotalPriceNotBetween(Integer value1, Integer value2) {
			addCriterion("TOTAL_PRICE not between", value1, value2, "totalPrice");
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