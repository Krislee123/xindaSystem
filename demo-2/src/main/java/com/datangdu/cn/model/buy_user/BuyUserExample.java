package com.datangdu.cn.model.buy_user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuyUserExample {
	protected int pageSize; // 每页展示的数据条数

	protected int pageNum; // 当前页

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

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public BuyUserExample() {
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

		public Criteria andSexIsNull() {
			addCriterion("sex is null");
			return (Criteria) this;
		}

		public Criteria andSexIsNotNull() {
			addCriterion("sex is not null");
			return (Criteria) this;
		}

		public Criteria andSexEqualTo(String value) {
			addCriterion("sex =", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotEqualTo(String value) {
			addCriterion("sex <>", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThan(String value) {
			addCriterion("sex >", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThanOrEqualTo(String value) {
			addCriterion("sex >=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThan(String value) {
			addCriterion("sex <", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThanOrEqualTo(String value) {
			addCriterion("sex <=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLike(String value) {
			addCriterion("sex like", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotLike(String value) {
			addCriterion("sex not like", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexIn(List<String> values) {
			addCriterion("sex in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotIn(List<String> values) {
			addCriterion("sex not in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexBetween(String value1, String value2) {
			addCriterion("sex between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotBetween(String value1, String value2) {
			addCriterion("sex not between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andPhIsNull() {
			addCriterion("ph is null");
			return (Criteria) this;
		}

		public Criteria andPhIsNotNull() {
			addCriterion("ph is not null");
			return (Criteria) this;
		}

		public Criteria andPhEqualTo(String value) {
			addCriterion("ph =", value, "ph");
			return (Criteria) this;
		}

		public Criteria andPhNotEqualTo(String value) {
			addCriterion("ph <>", value, "ph");
			return (Criteria) this;
		}

		public Criteria andPhGreaterThan(String value) {
			addCriterion("ph >", value, "ph");
			return (Criteria) this;
		}

		public Criteria andPhGreaterThanOrEqualTo(String value) {
			addCriterion("ph >=", value, "ph");
			return (Criteria) this;
		}

		public Criteria andPhLessThan(String value) {
			addCriterion("ph <", value, "ph");
			return (Criteria) this;
		}

		public Criteria andPhLessThanOrEqualTo(String value) {
			addCriterion("ph <=", value, "ph");
			return (Criteria) this;
		}

		public Criteria andPhLike(String value) {
			addCriterion("ph like", value, "ph");
			return (Criteria) this;
		}

		public Criteria andPhNotLike(String value) {
			addCriterion("ph not like", value, "ph");
			return (Criteria) this;
		}

		public Criteria andPhIn(List<String> values) {
			addCriterion("ph in", values, "ph");
			return (Criteria) this;
		}

		public Criteria andPhNotIn(List<String> values) {
			addCriterion("ph not in", values, "ph");
			return (Criteria) this;
		}

		public Criteria andPhBetween(String value1, String value2) {
			addCriterion("ph between", value1, value2, "ph");
			return (Criteria) this;
		}

		public Criteria andPhNotBetween(String value1, String value2) {
			addCriterion("ph not between", value1, value2, "ph");
			return (Criteria) this;
		}

		public Criteria andPwIsNull() {
			addCriterion("pw is null");
			return (Criteria) this;
		}

		public Criteria andPwIsNotNull() {
			addCriterion("pw is not null");
			return (Criteria) this;
		}

		public Criteria andPwEqualTo(String value) {
			addCriterion("pw =", value, "pw");
			return (Criteria) this;
		}

		public Criteria andPwNotEqualTo(String value) {
			addCriterion("pw <>", value, "pw");
			return (Criteria) this;
		}

		public Criteria andPwGreaterThan(String value) {
			addCriterion("pw >", value, "pw");
			return (Criteria) this;
		}

		public Criteria andPwGreaterThanOrEqualTo(String value) {
			addCriterion("pw >=", value, "pw");
			return (Criteria) this;
		}

		public Criteria andPwLessThan(String value) {
			addCriterion("pw <", value, "pw");
			return (Criteria) this;
		}

		public Criteria andPwLessThanOrEqualTo(String value) {
			addCriterion("pw <=", value, "pw");
			return (Criteria) this;
		}

		public Criteria andPwLike(String value) {
			addCriterion("pw like", value, "pw");
			return (Criteria) this;
		}

		public Criteria andPwNotLike(String value) {
			addCriterion("pw not like", value, "pw");
			return (Criteria) this;
		}

		public Criteria andPwIn(List<String> values) {
			addCriterion("pw in", values, "pw");
			return (Criteria) this;
		}

		public Criteria andPwNotIn(List<String> values) {
			addCriterion("pw not in", values, "pw");
			return (Criteria) this;
		}

		public Criteria andPwBetween(String value1, String value2) {
			addCriterion("pw between", value1, value2, "pw");
			return (Criteria) this;
		}

		public Criteria andPwNotBetween(String value1, String value2) {
			addCriterion("pw not between", value1, value2, "pw");
			return (Criteria) this;
		}

		public Criteria andBuyAreaIsNull() {
			addCriterion("buy_area is null");
			return (Criteria) this;
		}

		public Criteria andBuyAreaIsNotNull() {
			addCriterion("buy_area is not null");
			return (Criteria) this;
		}

		public Criteria andBuyAreaEqualTo(String value) {
			addCriterion("buy_area =", value, "buyArea");
			return (Criteria) this;
		}

		public Criteria andBuyAreaNotEqualTo(String value) {
			addCriterion("buy_area <>", value, "buyArea");
			return (Criteria) this;
		}

		public Criteria andBuyAreaGreaterThan(String value) {
			addCriterion("buy_area >", value, "buyArea");
			return (Criteria) this;
		}

		public Criteria andBuyAreaGreaterThanOrEqualTo(String value) {
			addCriterion("buy_area >=", value, "buyArea");
			return (Criteria) this;
		}

		public Criteria andBuyAreaLessThan(String value) {
			addCriterion("buy_area <", value, "buyArea");
			return (Criteria) this;
		}

		public Criteria andBuyAreaLessThanOrEqualTo(String value) {
			addCriterion("buy_area <=", value, "buyArea");
			return (Criteria) this;
		}

		public Criteria andBuyAreaLike(String value) {
			addCriterion("buy_area like", value, "buyArea");
			return (Criteria) this;
		}

		public Criteria andBuyAreaNotLike(String value) {
			addCriterion("buy_area not like", value, "buyArea");
			return (Criteria) this;
		}

		public Criteria andBuyAreaIn(List<String> values) {
			addCriterion("buy_area in", values, "buyArea");
			return (Criteria) this;
		}

		public Criteria andBuyAreaNotIn(List<String> values) {
			addCriterion("buy_area not in", values, "buyArea");
			return (Criteria) this;
		}

		public Criteria andBuyAreaBetween(String value1, String value2) {
			addCriterion("buy_area between", value1, value2, "buyArea");
			return (Criteria) this;
		}

		public Criteria andBuyAreaNotBetween(String value1, String value2) {
			addCriterion("buy_area not between", value1, value2, "buyArea");
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

		public Criteria andBuyNumIsNull() {
			addCriterion("buy_num is null");
			return (Criteria) this;
		}

		public Criteria andBuyNumIsNotNull() {
			addCriterion("buy_num is not null");
			return (Criteria) this;
		}

		public Criteria andBuyNumEqualTo(Integer value) {
			addCriterion("buy_num =", value, "buyNum");
			return (Criteria) this;
		}

		public Criteria andBuyNumNotEqualTo(Integer value) {
			addCriterion("buy_num <>", value, "buyNum");
			return (Criteria) this;
		}

		public Criteria andBuyNumGreaterThan(Integer value) {
			addCriterion("buy_num >", value, "buyNum");
			return (Criteria) this;
		}

		public Criteria andBuyNumGreaterThanOrEqualTo(Integer value) {
			addCriterion("buy_num >=", value, "buyNum");
			return (Criteria) this;
		}

		public Criteria andBuyNumLessThan(Integer value) {
			addCriterion("buy_num <", value, "buyNum");
			return (Criteria) this;
		}

		public Criteria andBuyNumLessThanOrEqualTo(Integer value) {
			addCriterion("buy_num <=", value, "buyNum");
			return (Criteria) this;
		}

		public Criteria andBuyNumIn(List<Integer> values) {
			addCriterion("buy_num in", values, "buyNum");
			return (Criteria) this;
		}

		public Criteria andBuyNumNotIn(List<Integer> values) {
			addCriterion("buy_num not in", values, "buyNum");
			return (Criteria) this;
		}

		public Criteria andBuyNumBetween(Integer value1, Integer value2) {
			addCriterion("buy_num between", value1, value2, "buyNum");
			return (Criteria) this;
		}

		public Criteria andBuyNumNotBetween(Integer value1, Integer value2) {
			addCriterion("buy_num not between", value1, value2, "buyNum");
			return (Criteria) this;
		}

		public Criteria andConsumePriceIsNull() {
			addCriterion("consume_price is null");
			return (Criteria) this;
		}

		public Criteria andConsumePriceIsNotNull() {
			addCriterion("consume_price is not null");
			return (Criteria) this;
		}

		public Criteria andConsumePriceEqualTo(Float value) {
			addCriterion("consume_price =", value, "consumePrice");
			return (Criteria) this;
		}

		public Criteria andConsumePriceNotEqualTo(Float value) {
			addCriterion("consume_price <>", value, "consumePrice");
			return (Criteria) this;
		}

		public Criteria andConsumePriceGreaterThan(Float value) {
			addCriterion("consume_price >", value, "consumePrice");
			return (Criteria) this;
		}

		public Criteria andConsumePriceGreaterThanOrEqualTo(Float value) {
			addCriterion("consume_price >=", value, "consumePrice");
			return (Criteria) this;
		}

		public Criteria andConsumePriceLessThan(Float value) {
			addCriterion("consume_price <", value, "consumePrice");
			return (Criteria) this;
		}

		public Criteria andConsumePriceLessThanOrEqualTo(Float value) {
			addCriterion("consume_price <=", value, "consumePrice");
			return (Criteria) this;
		}

		public Criteria andConsumePriceIn(List<Float> values) {
			addCriterion("consume_price in", values, "consumePrice");
			return (Criteria) this;
		}

		public Criteria andConsumePriceNotIn(List<Float> values) {
			addCriterion("consume_price not in", values, "consumePrice");
			return (Criteria) this;
		}

		public Criteria andConsumePriceBetween(Float value1, Float value2) {
			addCriterion("consume_price between", value1, value2, "consumePrice");
			return (Criteria) this;
		}

		public Criteria andConsumePriceNotBetween(Float value1, Float value2) {
			addCriterion("consume_price not between", value1, value2, "consumePrice");
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