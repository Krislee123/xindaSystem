package com.datangdu.cn.model.service_user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceUserExample {
	protected int pageSize; // 每页展示的数据条数

	protected int pageNum; // 当前页

	protected String orderByClause;

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

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ServiceUserExample() {
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

		public Criteria andIdEqualTo(String value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(String value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(String value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(String value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(String value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(String value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLike(String value) {
			addCriterion("id like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotLike(String value) {
			addCriterion("id not like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<String> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<String> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(String value1, String value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(String value1, String value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andAreaIsNull() {
			addCriterion("area is null");
			return (Criteria) this;
		}

		public Criteria andAreaIsNotNull() {
			addCriterion("area is not null");
			return (Criteria) this;
		}

		public Criteria andAreaEqualTo(String value) {
			addCriterion("area =", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotEqualTo(String value) {
			addCriterion("area <>", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaGreaterThan(String value) {
			addCriterion("area >", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaGreaterThanOrEqualTo(String value) {
			addCriterion("area >=", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaLessThan(String value) {
			addCriterion("area <", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaLessThanOrEqualTo(String value) {
			addCriterion("area <=", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaLike(String value) {
			addCriterion("area like", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotLike(String value) {
			addCriterion("area not like", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaIn(List<String> values) {
			addCriterion("area in", values, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotIn(List<String> values) {
			addCriterion("area not in", values, "area");
			return (Criteria) this;
		}

		public Criteria andAreaBetween(String value1, String value2) {
			addCriterion("area between", value1, value2, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotBetween(String value1, String value2) {
			addCriterion("area not between", value1, value2, "area");
			return (Criteria) this;
		}

		public Criteria andServicePhIsNull() {
			addCriterion("service_ph is null");
			return (Criteria) this;
		}

		public Criteria andServicePhIsNotNull() {
			addCriterion("service_ph is not null");
			return (Criteria) this;
		}

		public Criteria andServicePhEqualTo(String value) {
			addCriterion("service_ph =", value, "servicePh");
			return (Criteria) this;
		}

		public Criteria andServicePhNotEqualTo(String value) {
			addCriterion("service_ph <>", value, "servicePh");
			return (Criteria) this;
		}

		public Criteria andServicePhGreaterThan(String value) {
			addCriterion("service_ph >", value, "servicePh");
			return (Criteria) this;
		}

		public Criteria andServicePhGreaterThanOrEqualTo(String value) {
			addCriterion("service_ph >=", value, "servicePh");
			return (Criteria) this;
		}

		public Criteria andServicePhLessThan(String value) {
			addCriterion("service_ph <", value, "servicePh");
			return (Criteria) this;
		}

		public Criteria andServicePhLessThanOrEqualTo(String value) {
			addCriterion("service_ph <=", value, "servicePh");
			return (Criteria) this;
		}

		public Criteria andServicePhLike(String value) {
			addCriterion("service_ph like", value, "servicePh");
			return (Criteria) this;
		}

		public Criteria andServicePhNotLike(String value) {
			addCriterion("service_ph not like", value, "servicePh");
			return (Criteria) this;
		}

		public Criteria andServicePhIn(List<String> values) {
			addCriterion("service_ph in", values, "servicePh");
			return (Criteria) this;
		}

		public Criteria andServicePhNotIn(List<String> values) {
			addCriterion("service_ph not in", values, "servicePh");
			return (Criteria) this;
		}

		public Criteria andServicePhBetween(String value1, String value2) {
			addCriterion("service_ph between", value1, value2, "servicePh");
			return (Criteria) this;
		}

		public Criteria andServicePhNotBetween(String value1, String value2) {
			addCriterion("service_ph not between", value1, value2, "servicePh");
			return (Criteria) this;
		}

		public Criteria andServicePwIsNull() {
			addCriterion("service_pw is null");
			return (Criteria) this;
		}

		public Criteria andServicePwIsNotNull() {
			addCriterion("service_pw is not null");
			return (Criteria) this;
		}

		public Criteria andServicePwEqualTo(String value) {
			addCriterion("service_pw =", value, "servicePw");
			return (Criteria) this;
		}

		public Criteria andServicePwNotEqualTo(String value) {
			addCriterion("service_pw <>", value, "servicePw");
			return (Criteria) this;
		}

		public Criteria andServicePwGreaterThan(String value) {
			addCriterion("service_pw >", value, "servicePw");
			return (Criteria) this;
		}

		public Criteria andServicePwGreaterThanOrEqualTo(String value) {
			addCriterion("service_pw >=", value, "servicePw");
			return (Criteria) this;
		}

		public Criteria andServicePwLessThan(String value) {
			addCriterion("service_pw <", value, "servicePw");
			return (Criteria) this;
		}

		public Criteria andServicePwLessThanOrEqualTo(String value) {
			addCriterion("service_pw <=", value, "servicePw");
			return (Criteria) this;
		}

		public Criteria andServicePwLike(String value) {
			addCriterion("service_pw like", value, "servicePw");
			return (Criteria) this;
		}

		public Criteria andServicePwNotLike(String value) {
			addCriterion("service_pw not like", value, "servicePw");
			return (Criteria) this;
		}

		public Criteria andServicePwIn(List<String> values) {
			addCriterion("service_pw in", values, "servicePw");
			return (Criteria) this;
		}

		public Criteria andServicePwNotIn(List<String> values) {
			addCriterion("service_pw not in", values, "servicePw");
			return (Criteria) this;
		}

		public Criteria andServicePwBetween(String value1, String value2) {
			addCriterion("service_pw between", value1, value2, "servicePw");
			return (Criteria) this;
		}

		public Criteria andServicePwNotBetween(String value1, String value2) {
			addCriterion("service_pw not between", value1, value2, "servicePw");
			return (Criteria) this;
		}

		public Criteria andAdminIntroductionIsNull() {
			addCriterion("admin_introduction is null");
			return (Criteria) this;
		}

		public Criteria andAdminIntroductionIsNotNull() {
			addCriterion("admin_introduction is not null");
			return (Criteria) this;
		}

		public Criteria andAdminIntroductionEqualTo(String value) {
			addCriterion("admin_introduction =", value, "adminIntroduction");
			return (Criteria) this;
		}

		public Criteria andAdminIntroductionNotEqualTo(String value) {
			addCriterion("admin_introduction <>", value, "adminIntroduction");
			return (Criteria) this;
		}

		public Criteria andAdminIntroductionGreaterThan(String value) {
			addCriterion("admin_introduction >", value, "adminIntroduction");
			return (Criteria) this;
		}

		public Criteria andAdminIntroductionGreaterThanOrEqualTo(String value) {
			addCriterion("admin_introduction >=", value, "adminIntroduction");
			return (Criteria) this;
		}

		public Criteria andAdminIntroductionLessThan(String value) {
			addCriterion("admin_introduction <", value, "adminIntroduction");
			return (Criteria) this;
		}

		public Criteria andAdminIntroductionLessThanOrEqualTo(String value) {
			addCriterion("admin_introduction <=", value, "adminIntroduction");
			return (Criteria) this;
		}

		public Criteria andAdminIntroductionLike(String value) {
			addCriterion("admin_introduction like", value, "adminIntroduction");
			return (Criteria) this;
		}

		public Criteria andAdminIntroductionNotLike(String value) {
			addCriterion("admin_introduction not like", value, "adminIntroduction");
			return (Criteria) this;
		}

		public Criteria andAdminIntroductionIn(List<String> values) {
			addCriterion("admin_introduction in", values, "adminIntroduction");
			return (Criteria) this;
		}

		public Criteria andAdminIntroductionNotIn(List<String> values) {
			addCriterion("admin_introduction not in", values, "adminIntroduction");
			return (Criteria) this;
		}

		public Criteria andAdminIntroductionBetween(String value1, String value2) {
			addCriterion("admin_introduction between", value1, value2, "adminIntroduction");
			return (Criteria) this;
		}

		public Criteria andAdminIntroductionNotBetween(String value1, String value2) {
			addCriterion("admin_introduction not between", value1, value2, "adminIntroduction");
			return (Criteria) this;
		}

		public Criteria andStateIsNull() {
			addCriterion("state is null");
			return (Criteria) this;
		}

		public Criteria andStateIsNotNull() {
			addCriterion("state is not null");
			return (Criteria) this;
		}

		public Criteria andStateEqualTo(String value) {
			addCriterion("state =", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotEqualTo(String value) {
			addCriterion("state <>", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThan(String value) {
			addCriterion("state >", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThanOrEqualTo(String value) {
			addCriterion("state >=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThan(String value) {
			addCriterion("state <", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThanOrEqualTo(String value) {
			addCriterion("state <=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLike(String value) {
			addCriterion("state like", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotLike(String value) {
			addCriterion("state not like", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateIn(List<String> values) {
			addCriterion("state in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotIn(List<String> values) {
			addCriterion("state not in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateBetween(String value1, String value2) {
			addCriterion("state between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotBetween(String value1, String value2) {
			addCriterion("state not between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andMailIsNull() {
			addCriterion("mail is null");
			return (Criteria) this;
		}

		public Criteria andMailIsNotNull() {
			addCriterion("mail is not null");
			return (Criteria) this;
		}

		public Criteria andMailEqualTo(String value) {
			addCriterion("mail =", value, "mail");
			return (Criteria) this;
		}

		public Criteria andMailNotEqualTo(String value) {
			addCriterion("mail <>", value, "mail");
			return (Criteria) this;
		}

		public Criteria andMailGreaterThan(String value) {
			addCriterion("mail >", value, "mail");
			return (Criteria) this;
		}

		public Criteria andMailGreaterThanOrEqualTo(String value) {
			addCriterion("mail >=", value, "mail");
			return (Criteria) this;
		}

		public Criteria andMailLessThan(String value) {
			addCriterion("mail <", value, "mail");
			return (Criteria) this;
		}

		public Criteria andMailLessThanOrEqualTo(String value) {
			addCriterion("mail <=", value, "mail");
			return (Criteria) this;
		}

		public Criteria andMailLike(String value) {
			addCriterion("mail like", value, "mail");
			return (Criteria) this;
		}

		public Criteria andMailNotLike(String value) {
			addCriterion("mail not like", value, "mail");
			return (Criteria) this;
		}

		public Criteria andMailIn(List<String> values) {
			addCriterion("mail in", values, "mail");
			return (Criteria) this;
		}

		public Criteria andMailNotIn(List<String> values) {
			addCriterion("mail not in", values, "mail");
			return (Criteria) this;
		}

		public Criteria andMailBetween(String value1, String value2) {
			addCriterion("mail between", value1, value2, "mail");
			return (Criteria) this;
		}

		public Criteria andMailNotBetween(String value1, String value2) {
			addCriterion("mail not between", value1, value2, "mail");
			return (Criteria) this;
		}

		public Criteria andTsIsNull() {
			addCriterion("ts is null");
			return (Criteria) this;
		}

		public Criteria andTsIsNotNull() {
			addCriterion("ts is not null");
			return (Criteria) this;
		}

		public Criteria andTsEqualTo(Date value) {
			addCriterion("ts =", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsNotEqualTo(Date value) {
			addCriterion("ts <>", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsGreaterThan(Date value) {
			addCriterion("ts >", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsGreaterThanOrEqualTo(Date value) {
			addCriterion("ts >=", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsLessThan(Date value) {
			addCriterion("ts <", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsLessThanOrEqualTo(Date value) {
			addCriterion("ts <=", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsIn(List<Date> values) {
			addCriterion("ts in", values, "ts");
			return (Criteria) this;
		}

		public Criteria andTsNotIn(List<Date> values) {
			addCriterion("ts not in", values, "ts");
			return (Criteria) this;
		}

		public Criteria andTsBetween(Date value1, Date value2) {
			addCriterion("ts between", value1, value2, "ts");
			return (Criteria) this;
		}

		public Criteria andTsNotBetween(Date value1, Date value2) {
			addCriterion("ts not between", value1, value2, "ts");
			return (Criteria) this;
		}

		public Criteria andUserIntroductionIsNull() {
			addCriterion("user_introduction is null");
			return (Criteria) this;
		}

		public Criteria andUserIntroductionIsNotNull() {
			addCriterion("user_introduction is not null");
			return (Criteria) this;
		}

		public Criteria andUserIntroductionEqualTo(String value) {
			addCriterion("user_introduction =", value, "userIntroduction");
			return (Criteria) this;
		}

		public Criteria andUserIntroductionNotEqualTo(String value) {
			addCriterion("user_introduction <>", value, "userIntroduction");
			return (Criteria) this;
		}

		public Criteria andUserIntroductionGreaterThan(String value) {
			addCriterion("user_introduction >", value, "userIntroduction");
			return (Criteria) this;
		}

		public Criteria andUserIntroductionGreaterThanOrEqualTo(String value) {
			addCriterion("user_introduction >=", value, "userIntroduction");
			return (Criteria) this;
		}

		public Criteria andUserIntroductionLessThan(String value) {
			addCriterion("user_introduction <", value, "userIntroduction");
			return (Criteria) this;
		}

		public Criteria andUserIntroductionLessThanOrEqualTo(String value) {
			addCriterion("user_introduction <=", value, "userIntroduction");
			return (Criteria) this;
		}

		public Criteria andUserIntroductionLike(String value) {
			addCriterion("user_introduction like", value, "userIntroduction");
			return (Criteria) this;
		}

		public Criteria andUserIntroductionNotLike(String value) {
			addCriterion("user_introduction not like", value, "userIntroduction");
			return (Criteria) this;
		}

		public Criteria andUserIntroductionIn(List<String> values) {
			addCriterion("user_introduction in", values, "userIntroduction");
			return (Criteria) this;
		}

		public Criteria andUserIntroductionNotIn(List<String> values) {
			addCriterion("user_introduction not in", values, "userIntroduction");
			return (Criteria) this;
		}

		public Criteria andUserIntroductionBetween(String value1, String value2) {
			addCriterion("user_introduction between", value1, value2, "userIntroduction");
			return (Criteria) this;
		}

		public Criteria andUserIntroductionNotBetween(String value1, String value2) {
			addCriterion("user_introduction not between", value1, value2, "userIntroduction");
			return (Criteria) this;
		}

		public Criteria andWorkTsIsNull() {
			addCriterion("work_ts is null");
			return (Criteria) this;
		}

		public Criteria andWorkTsIsNotNull() {
			addCriterion("work_ts is not null");
			return (Criteria) this;
		}

		public Criteria andWorkTsEqualTo(String value) {
			addCriterion("work_ts =", value, "workTs");
			return (Criteria) this;
		}

		public Criteria andWorkTsNotEqualTo(String value) {
			addCriterion("work_ts <>", value, "workTs");
			return (Criteria) this;
		}

		public Criteria andWorkTsGreaterThan(String value) {
			addCriterion("work_ts >", value, "workTs");
			return (Criteria) this;
		}

		public Criteria andWorkTsGreaterThanOrEqualTo(String value) {
			addCriterion("work_ts >=", value, "workTs");
			return (Criteria) this;
		}

		public Criteria andWorkTsLessThan(String value) {
			addCriterion("work_ts <", value, "workTs");
			return (Criteria) this;
		}

		public Criteria andWorkTsLessThanOrEqualTo(String value) {
			addCriterion("work_ts <=", value, "workTs");
			return (Criteria) this;
		}

		public Criteria andWorkTsLike(String value) {
			addCriterion("work_ts like", value, "workTs");
			return (Criteria) this;
		}

		public Criteria andWorkTsNotLike(String value) {
			addCriterion("work_ts not like", value, "workTs");
			return (Criteria) this;
		}

		public Criteria andWorkTsIn(List<String> values) {
			addCriterion("work_ts in", values, "workTs");
			return (Criteria) this;
		}

		public Criteria andWorkTsNotIn(List<String> values) {
			addCriterion("work_ts not in", values, "workTs");
			return (Criteria) this;
		}

		public Criteria andWorkTsBetween(String value1, String value2) {
			addCriterion("work_ts between", value1, value2, "workTs");
			return (Criteria) this;
		}

		public Criteria andWorkTsNotBetween(String value1, String value2) {
			addCriterion("work_ts not between", value1, value2, "workTs");
			return (Criteria) this;
		}

		public Criteria andQqIsNull() {
			addCriterion("qq is null");
			return (Criteria) this;
		}

		public Criteria andQqIsNotNull() {
			addCriterion("qq is not null");
			return (Criteria) this;
		}

		public Criteria andQqEqualTo(String value) {
			addCriterion("qq =", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotEqualTo(String value) {
			addCriterion("qq <>", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqGreaterThan(String value) {
			addCriterion("qq >", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqGreaterThanOrEqualTo(String value) {
			addCriterion("qq >=", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqLessThan(String value) {
			addCriterion("qq <", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqLessThanOrEqualTo(String value) {
			addCriterion("qq <=", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqLike(String value) {
			addCriterion("qq like", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotLike(String value) {
			addCriterion("qq not like", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqIn(List<String> values) {
			addCriterion("qq in", values, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotIn(List<String> values) {
			addCriterion("qq not in", values, "qq");
			return (Criteria) this;
		}

		public Criteria andQqBetween(String value1, String value2) {
			addCriterion("qq between", value1, value2, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotBetween(String value1, String value2) {
			addCriterion("qq not between", value1, value2, "qq");
			return (Criteria) this;
		}

		public Criteria andWxIsNull() {
			addCriterion("wx is null");
			return (Criteria) this;
		}

		public Criteria andWxIsNotNull() {
			addCriterion("wx is not null");
			return (Criteria) this;
		}

		public Criteria andWxEqualTo(String value) {
			addCriterion("wx =", value, "wx");
			return (Criteria) this;
		}

		public Criteria andWxNotEqualTo(String value) {
			addCriterion("wx <>", value, "wx");
			return (Criteria) this;
		}

		public Criteria andWxGreaterThan(String value) {
			addCriterion("wx >", value, "wx");
			return (Criteria) this;
		}

		public Criteria andWxGreaterThanOrEqualTo(String value) {
			addCriterion("wx >=", value, "wx");
			return (Criteria) this;
		}

		public Criteria andWxLessThan(String value) {
			addCriterion("wx <", value, "wx");
			return (Criteria) this;
		}

		public Criteria andWxLessThanOrEqualTo(String value) {
			addCriterion("wx <=", value, "wx");
			return (Criteria) this;
		}

		public Criteria andWxLike(String value) {
			addCriterion("wx like", value, "wx");
			return (Criteria) this;
		}

		public Criteria andWxNotLike(String value) {
			addCriterion("wx not like", value, "wx");
			return (Criteria) this;
		}

		public Criteria andWxIn(List<String> values) {
			addCriterion("wx in", values, "wx");
			return (Criteria) this;
		}

		public Criteria andWxNotIn(List<String> values) {
			addCriterion("wx not in", values, "wx");
			return (Criteria) this;
		}

		public Criteria andWxBetween(String value1, String value2) {
			addCriterion("wx between", value1, value2, "wx");
			return (Criteria) this;
		}

		public Criteria andWxNotBetween(String value1, String value2) {
			addCriterion("wx not between", value1, value2, "wx");
			return (Criteria) this;
		}

		public Criteria andCustomerPhIsNull() {
			addCriterion("customer_ph is null");
			return (Criteria) this;
		}

		public Criteria andCustomerPhIsNotNull() {
			addCriterion("customer_ph is not null");
			return (Criteria) this;
		}

		public Criteria andCustomerPhEqualTo(String value) {
			addCriterion("customer_ph =", value, "customerPh");
			return (Criteria) this;
		}

		public Criteria andCustomerPhNotEqualTo(String value) {
			addCriterion("customer_ph <>", value, "customerPh");
			return (Criteria) this;
		}

		public Criteria andCustomerPhGreaterThan(String value) {
			addCriterion("customer_ph >", value, "customerPh");
			return (Criteria) this;
		}

		public Criteria andCustomerPhGreaterThanOrEqualTo(String value) {
			addCriterion("customer_ph >=", value, "customerPh");
			return (Criteria) this;
		}

		public Criteria andCustomerPhLessThan(String value) {
			addCriterion("customer_ph <", value, "customerPh");
			return (Criteria) this;
		}

		public Criteria andCustomerPhLessThanOrEqualTo(String value) {
			addCriterion("customer_ph <=", value, "customerPh");
			return (Criteria) this;
		}

		public Criteria andCustomerPhLike(String value) {
			addCriterion("customer_ph like", value, "customerPh");
			return (Criteria) this;
		}

		public Criteria andCustomerPhNotLike(String value) {
			addCriterion("customer_ph not like", value, "customerPh");
			return (Criteria) this;
		}

		public Criteria andCustomerPhIn(List<String> values) {
			addCriterion("customer_ph in", values, "customerPh");
			return (Criteria) this;
		}

		public Criteria andCustomerPhNotIn(List<String> values) {
			addCriterion("customer_ph not in", values, "customerPh");
			return (Criteria) this;
		}

		public Criteria andCustomerPhBetween(String value1, String value2) {
			addCriterion("customer_ph between", value1, value2, "customerPh");
			return (Criteria) this;
		}

		public Criteria andCustomerPhNotBetween(String value1, String value2) {
			addCriterion("customer_ph not between", value1, value2, "customerPh");
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