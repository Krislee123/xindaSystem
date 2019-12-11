package com.datangdu.cn.model.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderLExample {
	protected int pageNum;

	protected int pageSize;
	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public OrderLExample() {
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

		public Criteria andBuyNameIsNull() {
			addCriterion("buy_name is null");
			return (Criteria) this;
		}

		public Criteria andBuyNameIsNotNull() {
			addCriterion("buy_name is not null");
			return (Criteria) this;
		}

		public Criteria andBuyNameEqualTo(String value) {
			addCriterion("buy_name =", value, "buyName");
			return (Criteria) this;
		}

		public Criteria andBuyNameNotEqualTo(String value) {
			addCriterion("buy_name <>", value, "buyName");
			return (Criteria) this;
		}

		public Criteria andBuyNameGreaterThan(String value) {
			addCriterion("buy_name >", value, "buyName");
			return (Criteria) this;
		}

		public Criteria andBuyNameGreaterThanOrEqualTo(String value) {
			addCriterion("buy_name >=", value, "buyName");
			return (Criteria) this;
		}

		public Criteria andBuyNameLessThan(String value) {
			addCriterion("buy_name <", value, "buyName");
			return (Criteria) this;
		}

		public Criteria andBuyNameLessThanOrEqualTo(String value) {
			addCriterion("buy_name <=", value, "buyName");
			return (Criteria) this;
		}

		public Criteria andBuyNameLike(String value) {
			addCriterion("buy_name like", value, "buyName");
			return (Criteria) this;
		}

		public Criteria andBuyNameNotLike(String value) {
			addCriterion("buy_name not like", value, "buyName");
			return (Criteria) this;
		}

		public Criteria andBuyNameIn(List<String> values) {
			addCriterion("buy_name in", values, "buyName");
			return (Criteria) this;
		}

		public Criteria andBuyNameNotIn(List<String> values) {
			addCriterion("buy_name not in", values, "buyName");
			return (Criteria) this;
		}

		public Criteria andBuyNameBetween(String value1, String value2) {
			addCriterion("buy_name between", value1, value2, "buyName");
			return (Criteria) this;
		}

		public Criteria andBuyNameNotBetween(String value1, String value2) {
			addCriterion("buy_name not between", value1, value2, "buyName");
			return (Criteria) this;
		}

		public Criteria andOrderContentIsNull() {
			addCriterion("order_content is null");
			return (Criteria) this;
		}

		public Criteria andOrderContentIsNotNull() {
			addCriterion("order_content is not null");
			return (Criteria) this;
		}

		public Criteria andOrderContentEqualTo(String value) {
			addCriterion("order_content =", value, "orderContent");
			return (Criteria) this;
		}

		public Criteria andOrderContentNotEqualTo(String value) {
			addCriterion("order_content <>", value, "orderContent");
			return (Criteria) this;
		}

		public Criteria andOrderContentGreaterThan(String value) {
			addCriterion("order_content >", value, "orderContent");
			return (Criteria) this;
		}

		public Criteria andOrderContentGreaterThanOrEqualTo(String value) {
			addCriterion("order_content >=", value, "orderContent");
			return (Criteria) this;
		}

		public Criteria andOrderContentLessThan(String value) {
			addCriterion("order_content <", value, "orderContent");
			return (Criteria) this;
		}

		public Criteria andOrderContentLessThanOrEqualTo(String value) {
			addCriterion("order_content <=", value, "orderContent");
			return (Criteria) this;
		}

		public Criteria andOrderContentLike(String value) {
			addCriterion("order_content like", value, "orderContent");
			return (Criteria) this;
		}

		public Criteria andOrderContentNotLike(String value) {
			addCriterion("order_content not like", value, "orderContent");
			return (Criteria) this;
		}

		public Criteria andOrderContentIn(List<String> values) {
			addCriterion("order_content in", values, "orderContent");
			return (Criteria) this;
		}

		public Criteria andOrderContentNotIn(List<String> values) {
			addCriterion("order_content not in", values, "orderContent");
			return (Criteria) this;
		}

		public Criteria andOrderContentBetween(String value1, String value2) {
			addCriterion("order_content between", value1, value2, "orderContent");
			return (Criteria) this;
		}

		public Criteria andOrderContentNotBetween(String value1, String value2) {
			addCriterion("order_content not between", value1, value2, "orderContent");
			return (Criteria) this;
		}

		public Criteria andOrderPriceIsNull() {
			addCriterion("order_price is null");
			return (Criteria) this;
		}

		public Criteria andOrderPriceIsNotNull() {
			addCriterion("order_price is not null");
			return (Criteria) this;
		}

		public Criteria andOrderPriceEqualTo(Float value) {
			addCriterion("order_price =", value, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderPriceNotEqualTo(Float value) {
			addCriterion("order_price <>", value, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderPriceGreaterThan(Float value) {
			addCriterion("order_price >", value, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderPriceGreaterThanOrEqualTo(Float value) {
			addCriterion("order_price >=", value, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderPriceLessThan(Float value) {
			addCriterion("order_price <", value, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderPriceLessThanOrEqualTo(Float value) {
			addCriterion("order_price <=", value, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderPriceIn(List<Float> values) {
			addCriterion("order_price in", values, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderPriceNotIn(List<Float> values) {
			addCriterion("order_price not in", values, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderPriceBetween(Float value1, Float value2) {
			addCriterion("order_price between", value1, value2, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderPriceNotBetween(Float value1, Float value2) {
			addCriterion("order_price not between", value1, value2, "orderPrice");
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

		public Criteria andBuyIdIsNull() {
			addCriterion("buy_id is null");
			return (Criteria) this;
		}

		public Criteria andBuyIdIsNotNull() {
			addCriterion("buy_id is not null");
			return (Criteria) this;
		}

		public Criteria andBuyIdEqualTo(String value) {
			addCriterion("buy_id =", value, "buyId");
			return (Criteria) this;
		}

		public Criteria andBuyIdNotEqualTo(String value) {
			addCriterion("buy_id <>", value, "buyId");
			return (Criteria) this;
		}

		public Criteria andBuyIdGreaterThan(String value) {
			addCriterion("buy_id >", value, "buyId");
			return (Criteria) this;
		}

		public Criteria andBuyIdGreaterThanOrEqualTo(String value) {
			addCriterion("buy_id >=", value, "buyId");
			return (Criteria) this;
		}

		public Criteria andBuyIdLessThan(String value) {
			addCriterion("buy_id <", value, "buyId");
			return (Criteria) this;
		}

		public Criteria andBuyIdLessThanOrEqualTo(String value) {
			addCriterion("buy_id <=", value, "buyId");
			return (Criteria) this;
		}

		public Criteria andBuyIdLike(String value) {
			addCriterion("buy_id like", value, "buyId");
			return (Criteria) this;
		}

		public Criteria andBuyIdNotLike(String value) {
			addCriterion("buy_id not like", value, "buyId");
			return (Criteria) this;
		}

		public Criteria andBuyIdIn(List<String> values) {
			addCriterion("buy_id in", values, "buyId");
			return (Criteria) this;
		}

		public Criteria andBuyIdNotIn(List<String> values) {
			addCriterion("buy_id not in", values, "buyId");
			return (Criteria) this;
		}

		public Criteria andBuyIdBetween(String value1, String value2) {
			addCriterion("buy_id between", value1, value2, "buyId");
			return (Criteria) this;
		}

		public Criteria andBuyIdNotBetween(String value1, String value2) {
			addCriterion("buy_id not between", value1, value2, "buyId");
			return (Criteria) this;
		}

		public Criteria andPayIsNull() {
			addCriterion("pay is null");
			return (Criteria) this;
		}

		public Criteria andPayIsNotNull() {
			addCriterion("pay is not null");
			return (Criteria) this;
		}

		public Criteria andPayEqualTo(String value) {
			addCriterion("pay =", value, "pay");
			return (Criteria) this;
		}

		public Criteria andPayNotEqualTo(String value) {
			addCriterion("pay <>", value, "pay");
			return (Criteria) this;
		}

		public Criteria andPayGreaterThan(String value) {
			addCriterion("pay >", value, "pay");
			return (Criteria) this;
		}

		public Criteria andPayGreaterThanOrEqualTo(String value) {
			addCriterion("pay >=", value, "pay");
			return (Criteria) this;
		}

		public Criteria andPayLessThan(String value) {
			addCriterion("pay <", value, "pay");
			return (Criteria) this;
		}

		public Criteria andPayLessThanOrEqualTo(String value) {
			addCriterion("pay <=", value, "pay");
			return (Criteria) this;
		}

		public Criteria andPayLike(String value) {
			addCriterion("pay like", value, "pay");
			return (Criteria) this;
		}

		public Criteria andPayNotLike(String value) {
			addCriterion("pay not like", value, "pay");
			return (Criteria) this;
		}

		public Criteria andPayIn(List<String> values) {
			addCriterion("pay in", values, "pay");
			return (Criteria) this;
		}

		public Criteria andPayNotIn(List<String> values) {
			addCriterion("pay not in", values, "pay");
			return (Criteria) this;
		}

		public Criteria andPayBetween(String value1, String value2) {
			addCriterion("pay between", value1, value2, "pay");
			return (Criteria) this;
		}

		public Criteria andPayNotBetween(String value1, String value2) {
			addCriterion("pay not between", value1, value2, "pay");
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

		public Criteria andEvaluateIsNull() {
			addCriterion("evaluate is null");
			return (Criteria) this;
		}

		public Criteria andEvaluateIsNotNull() {
			addCriterion("evaluate is not null");
			return (Criteria) this;
		}

		public Criteria andEvaluateEqualTo(String value) {
			addCriterion("evaluate =", value, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateNotEqualTo(String value) {
			addCriterion("evaluate <>", value, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateGreaterThan(String value) {
			addCriterion("evaluate >", value, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateGreaterThanOrEqualTo(String value) {
			addCriterion("evaluate >=", value, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateLessThan(String value) {
			addCriterion("evaluate <", value, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateLessThanOrEqualTo(String value) {
			addCriterion("evaluate <=", value, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateLike(String value) {
			addCriterion("evaluate like", value, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateNotLike(String value) {
			addCriterion("evaluate not like", value, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateIn(List<String> values) {
			addCriterion("evaluate in", values, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateNotIn(List<String> values) {
			addCriterion("evaluate not in", values, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateBetween(String value1, String value2) {
			addCriterion("evaluate between", value1, value2, "evaluate");
			return (Criteria) this;
		}

		public Criteria andEvaluateNotBetween(String value1, String value2) {
			addCriterion("evaluate not between", value1, value2, "evaluate");
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