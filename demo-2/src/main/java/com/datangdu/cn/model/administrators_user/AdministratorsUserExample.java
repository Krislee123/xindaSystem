package com.datangdu.cn.model.administrators_user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdministratorsUserExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public AdministratorsUserExample() {
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

		public Criteria andAdministratorsPhIsNull() {
			addCriterion("Administrators_ph is null");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPhIsNotNull() {
			addCriterion("Administrators_ph is not null");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPhEqualTo(String value) {
			addCriterion("Administrators_ph =", value, "administratorsPh");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPhNotEqualTo(String value) {
			addCriterion("Administrators_ph <>", value, "administratorsPh");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPhGreaterThan(String value) {
			addCriterion("Administrators_ph >", value, "administratorsPh");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPhGreaterThanOrEqualTo(String value) {
			addCriterion("Administrators_ph >=", value, "administratorsPh");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPhLessThan(String value) {
			addCriterion("Administrators_ph <", value, "administratorsPh");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPhLessThanOrEqualTo(String value) {
			addCriterion("Administrators_ph <=", value, "administratorsPh");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPhLike(String value) {
			addCriterion("Administrators_ph like", value, "administratorsPh");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPhNotLike(String value) {
			addCriterion("Administrators_ph not like", value, "administratorsPh");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPhIn(List<String> values) {
			addCriterion("Administrators_ph in", values, "administratorsPh");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPhNotIn(List<String> values) {
			addCriterion("Administrators_ph not in", values, "administratorsPh");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPhBetween(String value1, String value2) {
			addCriterion("Administrators_ph between", value1, value2, "administratorsPh");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPhNotBetween(String value1, String value2) {
			addCriterion("Administrators_ph not between", value1, value2, "administratorsPh");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPwIsNull() {
			addCriterion("administrators_pw is null");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPwIsNotNull() {
			addCriterion("administrators_pw is not null");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPwEqualTo(String value) {
			addCriterion("administrators_pw =", value, "administratorsPw");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPwNotEqualTo(String value) {
			addCriterion("administrators_pw <>", value, "administratorsPw");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPwGreaterThan(String value) {
			addCriterion("administrators_pw >", value, "administratorsPw");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPwGreaterThanOrEqualTo(String value) {
			addCriterion("administrators_pw >=", value, "administratorsPw");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPwLessThan(String value) {
			addCriterion("administrators_pw <", value, "administratorsPw");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPwLessThanOrEqualTo(String value) {
			addCriterion("administrators_pw <=", value, "administratorsPw");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPwLike(String value) {
			addCriterion("administrators_pw like", value, "administratorsPw");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPwNotLike(String value) {
			addCriterion("administrators_pw not like", value, "administratorsPw");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPwIn(List<String> values) {
			addCriterion("administrators_pw in", values, "administratorsPw");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPwNotIn(List<String> values) {
			addCriterion("administrators_pw not in", values, "administratorsPw");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPwBetween(String value1, String value2) {
			addCriterion("administrators_pw between", value1, value2, "administratorsPw");
			return (Criteria) this;
		}

		public Criteria andAdministratorsPwNotBetween(String value1, String value2) {
			addCriterion("administrators_pw not between", value1, value2, "administratorsPw");
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