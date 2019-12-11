package com.datangdu.cn.model.service_product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ServiceProductExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public ServiceProductExample() {
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

		public Criteria andServiceNameIsNull() {
			addCriterion("service_name is null");
			return (Criteria) this;
		}

		public Criteria andServiceNameIsNotNull() {
			addCriterion("service_name is not null");
			return (Criteria) this;
		}

		public Criteria andServiceNameEqualTo(String value) {
			addCriterion("service_name =", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameNotEqualTo(String value) {
			addCriterion("service_name <>", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameGreaterThan(String value) {
			addCriterion("service_name >", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
			addCriterion("service_name >=", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameLessThan(String value) {
			addCriterion("service_name <", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameLessThanOrEqualTo(String value) {
			addCriterion("service_name <=", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameLike(String value) {
			addCriterion("service_name like", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameNotLike(String value) {
			addCriterion("service_name not like", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameIn(List<String> values) {
			addCriterion("service_name in", values, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameNotIn(List<String> values) {
			addCriterion("service_name not in", values, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameBetween(String value1, String value2) {
			addCriterion("service_name between", value1, value2, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameNotBetween(String value1, String value2) {
			addCriterion("service_name not between", value1, value2, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceExplainIsNull() {
			addCriterion("service_explain is null");
			return (Criteria) this;
		}

		public Criteria andServiceExplainIsNotNull() {
			addCriterion("service_explain is not null");
			return (Criteria) this;
		}

		public Criteria andServiceExplainEqualTo(String value) {
			addCriterion("service_explain =", value, "serviceExplain");
			return (Criteria) this;
		}

		public Criteria andServiceExplainNotEqualTo(String value) {
			addCriterion("service_explain <>", value, "serviceExplain");
			return (Criteria) this;
		}

		public Criteria andServiceExplainGreaterThan(String value) {
			addCriterion("service_explain >", value, "serviceExplain");
			return (Criteria) this;
		}

		public Criteria andServiceExplainGreaterThanOrEqualTo(String value) {
			addCriterion("service_explain >=", value, "serviceExplain");
			return (Criteria) this;
		}

		public Criteria andServiceExplainLessThan(String value) {
			addCriterion("service_explain <", value, "serviceExplain");
			return (Criteria) this;
		}

		public Criteria andServiceExplainLessThanOrEqualTo(String value) {
			addCriterion("service_explain <=", value, "serviceExplain");
			return (Criteria) this;
		}

		public Criteria andServiceExplainLike(String value) {
			addCriterion("service_explain like", value, "serviceExplain");
			return (Criteria) this;
		}

		public Criteria andServiceExplainNotLike(String value) {
			addCriterion("service_explain not like", value, "serviceExplain");
			return (Criteria) this;
		}

		public Criteria andServiceExplainIn(List<String> values) {
			addCriterion("service_explain in", values, "serviceExplain");
			return (Criteria) this;
		}

		public Criteria andServiceExplainNotIn(List<String> values) {
			addCriterion("service_explain not in", values, "serviceExplain");
			return (Criteria) this;
		}

		public Criteria andServiceExplainBetween(String value1, String value2) {
			addCriterion("service_explain between", value1, value2, "serviceExplain");
			return (Criteria) this;
		}

		public Criteria andServiceExplainNotBetween(String value1, String value2) {
			addCriterion("service_explain not between", value1, value2, "serviceExplain");
			return (Criteria) this;
		}

		public Criteria andServicePriceIsNull() {
			addCriterion("service_price is null");
			return (Criteria) this;
		}

		public Criteria andServicePriceIsNotNull() {
			addCriterion("service_price is not null");
			return (Criteria) this;
		}

		public Criteria andServicePriceEqualTo(Float value) {
			addCriterion("service_price =", value, "servicePrice");
			return (Criteria) this;
		}

		public Criteria andServicePriceNotEqualTo(Float value) {
			addCriterion("service_price <>", value, "servicePrice");
			return (Criteria) this;
		}

		public Criteria andServicePriceGreaterThan(Float value) {
			addCriterion("service_price >", value, "servicePrice");
			return (Criteria) this;
		}

		public Criteria andServicePriceGreaterThanOrEqualTo(Float value) {
			addCriterion("service_price >=", value, "servicePrice");
			return (Criteria) this;
		}

		public Criteria andServicePriceLessThan(Float value) {
			addCriterion("service_price <", value, "servicePrice");
			return (Criteria) this;
		}

		public Criteria andServicePriceLessThanOrEqualTo(Float value) {
			addCriterion("service_price <=", value, "servicePrice");
			return (Criteria) this;
		}

		public Criteria andServicePriceIn(List<Float> values) {
			addCriterion("service_price in", values, "servicePrice");
			return (Criteria) this;
		}

		public Criteria andServicePriceNotIn(List<Float> values) {
			addCriterion("service_price not in", values, "servicePrice");
			return (Criteria) this;
		}

		public Criteria andServicePriceBetween(Float value1, Float value2) {
			addCriterion("service_price between", value1, value2, "servicePrice");
			return (Criteria) this;
		}

		public Criteria andServicePriceNotBetween(Float value1, Float value2) {
			addCriterion("service_price not between", value1, value2, "servicePrice");
			return (Criteria) this;
		}

		public Criteria andServiceStateIsNull() {
			addCriterion("service_state is null");
			return (Criteria) this;
		}

		public Criteria andServiceStateIsNotNull() {
			addCriterion("service_state is not null");
			return (Criteria) this;
		}

		public Criteria andServiceStateEqualTo(String value) {
			addCriterion("service_state =", value, "serviceState");
			return (Criteria) this;
		}

		public Criteria andServiceStateNotEqualTo(String value) {
			addCriterion("service_state <>", value, "serviceState");
			return (Criteria) this;
		}

		public Criteria andServiceStateGreaterThan(String value) {
			addCriterion("service_state >", value, "serviceState");
			return (Criteria) this;
		}

		public Criteria andServiceStateGreaterThanOrEqualTo(String value) {
			addCriterion("service_state >=", value, "serviceState");
			return (Criteria) this;
		}

		public Criteria andServiceStateLessThan(String value) {
			addCriterion("service_state <", value, "serviceState");
			return (Criteria) this;
		}

		public Criteria andServiceStateLessThanOrEqualTo(String value) {
			addCriterion("service_state <=", value, "serviceState");
			return (Criteria) this;
		}

		public Criteria andServiceStateLike(String value) {
			addCriterion("service_state like", value, "serviceState");
			return (Criteria) this;
		}

		public Criteria andServiceStateNotLike(String value) {
			addCriterion("service_state not like", value, "serviceState");
			return (Criteria) this;
		}

		public Criteria andServiceStateIn(List<String> values) {
			addCriterion("service_state in", values, "serviceState");
			return (Criteria) this;
		}

		public Criteria andServiceStateNotIn(List<String> values) {
			addCriterion("service_state not in", values, "serviceState");
			return (Criteria) this;
		}

		public Criteria andServiceStateBetween(String value1, String value2) {
			addCriterion("service_state between", value1, value2, "serviceState");
			return (Criteria) this;
		}

		public Criteria andServiceStateNotBetween(String value1, String value2) {
			addCriterion("service_state not between", value1, value2, "serviceState");
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

		public Criteria andSalesVolumeIsNull() {
			addCriterion("sales_volume is null");
			return (Criteria) this;
		}

		public Criteria andSalesVolumeIsNotNull() {
			addCriterion("sales_volume is not null");
			return (Criteria) this;
		}

		public Criteria andSalesVolumeEqualTo(Integer value) {
			addCriterion("sales_volume =", value, "salesVolume");
			return (Criteria) this;
		}

		public Criteria andSalesVolumeNotEqualTo(Integer value) {
			addCriterion("sales_volume <>", value, "salesVolume");
			return (Criteria) this;
		}

		public Criteria andSalesVolumeGreaterThan(Integer value) {
			addCriterion("sales_volume >", value, "salesVolume");
			return (Criteria) this;
		}

		public Criteria andSalesVolumeGreaterThanOrEqualTo(Integer value) {
			addCriterion("sales_volume >=", value, "salesVolume");
			return (Criteria) this;
		}

		public Criteria andSalesVolumeLessThan(Integer value) {
			addCriterion("sales_volume <", value, "salesVolume");
			return (Criteria) this;
		}

		public Criteria andSalesVolumeLessThanOrEqualTo(Integer value) {
			addCriterion("sales_volume <=", value, "salesVolume");
			return (Criteria) this;
		}

		public Criteria andSalesVolumeIn(List<Integer> values) {
			addCriterion("sales_volume in", values, "salesVolume");
			return (Criteria) this;
		}

		public Criteria andSalesVolumeNotIn(List<Integer> values) {
			addCriterion("sales_volume not in", values, "salesVolume");
			return (Criteria) this;
		}

		public Criteria andSalesVolumeBetween(Integer value1, Integer value2) {
			addCriterion("sales_volume between", value1, value2, "salesVolume");
			return (Criteria) this;
		}

		public Criteria andSalesVolumeNotBetween(Integer value1, Integer value2) {
			addCriterion("sales_volume not between", value1, value2, "salesVolume");
			return (Criteria) this;
		}

		public Criteria andServiceIdIsNull() {
			addCriterion("service_id is null");
			return (Criteria) this;
		}

		public Criteria andServiceIdIsNotNull() {
			addCriterion("service_id is not null");
			return (Criteria) this;
		}

		public Criteria andServiceIdEqualTo(String value) {
			addCriterion("service_id =", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdNotEqualTo(String value) {
			addCriterion("service_id <>", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdGreaterThan(String value) {
			addCriterion("service_id >", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdGreaterThanOrEqualTo(String value) {
			addCriterion("service_id >=", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdLessThan(String value) {
			addCriterion("service_id <", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdLessThanOrEqualTo(String value) {
			addCriterion("service_id <=", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdLike(String value) {
			addCriterion("service_id like", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdNotLike(String value) {
			addCriterion("service_id not like", value, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdIn(List<String> values) {
			addCriterion("service_id in", values, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdNotIn(List<String> values) {
			addCriterion("service_id not in", values, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdBetween(String value1, String value2) {
			addCriterion("service_id between", value1, value2, "serviceId");
			return (Criteria) this;
		}

		public Criteria andServiceIdNotBetween(String value1, String value2) {
			addCriterion("service_id not between", value1, value2, "serviceId");
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

		public Criteria andRecommendIsNull() {
			addCriterion("recommend is null");
			return (Criteria) this;
		}

		public Criteria andRecommendIsNotNull() {
			addCriterion("recommend is not null");
			return (Criteria) this;
		}

		public Criteria andRecommendEqualTo(String value) {
			addCriterion("recommend =", value, "recommend");
			return (Criteria) this;
		}

		public Criteria andRecommendNotEqualTo(String value) {
			addCriterion("recommend <>", value, "recommend");
			return (Criteria) this;
		}

		public Criteria andRecommendGreaterThan(String value) {
			addCriterion("recommend >", value, "recommend");
			return (Criteria) this;
		}

		public Criteria andRecommendGreaterThanOrEqualTo(String value) {
			addCriterion("recommend >=", value, "recommend");
			return (Criteria) this;
		}

		public Criteria andRecommendLessThan(String value) {
			addCriterion("recommend <", value, "recommend");
			return (Criteria) this;
		}

		public Criteria andRecommendLessThanOrEqualTo(String value) {
			addCriterion("recommend <=", value, "recommend");
			return (Criteria) this;
		}

		public Criteria andRecommendLike(String value) {
			addCriterion("recommend like", value, "recommend");
			return (Criteria) this;
		}

		public Criteria andRecommendNotLike(String value) {
			addCriterion("recommend not like", value, "recommend");
			return (Criteria) this;
		}

		public Criteria andRecommendIn(List<String> values) {
			addCriterion("recommend in", values, "recommend");
			return (Criteria) this;
		}

		public Criteria andRecommendNotIn(List<String> values) {
			addCriterion("recommend not in", values, "recommend");
			return (Criteria) this;
		}

		public Criteria andRecommendBetween(String value1, String value2) {
			addCriterion("recommend between", value1, value2, "recommend");
			return (Criteria) this;
		}

		public Criteria andRecommendNotBetween(String value1, String value2) {
			addCriterion("recommend not between", value1, value2, "recommend");
			return (Criteria) this;
		}

		public Criteria andEntrepreneurshipIsNull() {
			addCriterion("entrepreneurship is null");
			return (Criteria) this;
		}

		public Criteria andEntrepreneurshipIsNotNull() {
			addCriterion("entrepreneurship is not null");
			return (Criteria) this;
		}

		public Criteria andEntrepreneurshipEqualTo(String value) {
			addCriterion("entrepreneurship =", value, "entrepreneurship");
			return (Criteria) this;
		}

		public Criteria andEntrepreneurshipNotEqualTo(String value) {
			addCriterion("entrepreneurship <>", value, "entrepreneurship");
			return (Criteria) this;
		}

		public Criteria andEntrepreneurshipGreaterThan(String value) {
			addCriterion("entrepreneurship >", value, "entrepreneurship");
			return (Criteria) this;
		}

		public Criteria andEntrepreneurshipGreaterThanOrEqualTo(String value) {
			addCriterion("entrepreneurship >=", value, "entrepreneurship");
			return (Criteria) this;
		}

		public Criteria andEntrepreneurshipLessThan(String value) {
			addCriterion("entrepreneurship <", value, "entrepreneurship");
			return (Criteria) this;
		}

		public Criteria andEntrepreneurshipLessThanOrEqualTo(String value) {
			addCriterion("entrepreneurship <=", value, "entrepreneurship");
			return (Criteria) this;
		}

		public Criteria andEntrepreneurshipLike(String value) {
			addCriterion("entrepreneurship like", value, "entrepreneurship");
			return (Criteria) this;
		}

		public Criteria andEntrepreneurshipNotLike(String value) {
			addCriterion("entrepreneurship not like", value, "entrepreneurship");
			return (Criteria) this;
		}

		public Criteria andEntrepreneurshipIn(List<String> values) {
			addCriterion("entrepreneurship in", values, "entrepreneurship");
			return (Criteria) this;
		}

		public Criteria andEntrepreneurshipNotIn(List<String> values) {
			addCriterion("entrepreneurship not in", values, "entrepreneurship");
			return (Criteria) this;
		}

		public Criteria andEntrepreneurshipBetween(String value1, String value2) {
			addCriterion("entrepreneurship between", value1, value2, "entrepreneurship");
			return (Criteria) this;
		}

		public Criteria andEntrepreneurshipNotBetween(String value1, String value2) {
			addCriterion("entrepreneurship not between", value1, value2, "entrepreneurship");
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