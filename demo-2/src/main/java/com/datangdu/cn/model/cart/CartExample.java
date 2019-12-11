package com.datangdu.cn.model.cart;

import java.util.ArrayList;
import java.util.List;

public class CartExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public CartExample() {
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

		public Criteria andServiceIdIsNull() {
			addCriterion("SERVICE_ID is null");
			return (Criteria) this;
		}

		public Criteria andServiceIdIsNotNull() {
			addCriterion("SERVICE_ID is not null");
			return (Criteria) this;
		}

		public Criteria andServiceIdEqualTo(String value) {
			addCriterion("SERVICE_ID =", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdNotEqualTo(String value) {
			addCriterion("SERVICE_ID <>", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdGreaterThan(String value) {
			addCriterion("SERVICE_ID >", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdGreaterThanOrEqualTo(String value) {
			addCriterion("SERVICE_ID >=", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdLessThan(String value) {
			addCriterion("SERVICE_ID <", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdLessThanOrEqualTo(String value) {
			addCriterion("SERVICE_ID <=", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdLike(String value) {
			addCriterion("SERVICE_ID like", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdNotLike(String value) {
			addCriterion("SERVICE_ID not like", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdIn(List<String> values) {
			addCriterion("SERVICE_ID in", values, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdNotIn(List<String> values) {
			addCriterion("SERVICE_ID not in", values, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdBetween(String value1, String value2) {
			addCriterion("SERVICE_ID between", value1, value2, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdNotBetween(String value1, String value2) {
			addCriterion("SERVICE_ID not between", value1, value2, "serviceId");
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

		public Criteria andUserIdIsNull() {
			addCriterion("USER_ID is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("USER_ID is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(String value) {
			addCriterion("USER_ID =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(String value) {
			addCriterion("USER_ID <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(String value) {
			addCriterion("USER_ID >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(String value) {
			addCriterion("USER_ID >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(String value) {
			addCriterion("USER_ID <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(String value) {
			addCriterion("USER_ID <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLike(String value) {
			addCriterion("USER_ID like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotLike(String value) {
			addCriterion("USER_ID not like", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<String> values) {
			addCriterion("USER_ID in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<String> values) {
			addCriterion("USER_ID not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(String value1, String value2) {
			addCriterion("USER_ID between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(String value1, String value2) {
			addCriterion("USER_ID not between", value1, value2, "userId");
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