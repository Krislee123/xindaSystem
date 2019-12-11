package com.datangdu.cn.model.businessOrder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessOrderExample {

	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public BusinessOrderExample() {
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

		public Criteria andBIdIsNull() {
			addCriterion("b_id is null");
			return (Criteria) this;
		}

		public Criteria andBIdIsNotNull() {
			addCriterion("b_id is not null");
			return (Criteria) this;
		}

		public Criteria andBIdEqualTo(Integer value) {
			addCriterion("b_id =", value, "bId");
			return (Criteria) this;
		}

		public Criteria andBIdNotEqualTo(Integer value) {
			addCriterion("b_id <>", value, "bId");
			return (Criteria) this;
		}

		public Criteria andBIdGreaterThan(Integer value) {
			addCriterion("b_id >", value, "bId");
			return (Criteria) this;
		}

		public Criteria andBIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("b_id >=", value, "bId");
			return (Criteria) this;
		}

		public Criteria andBIdLessThan(Integer value) {
			addCriterion("b_id <", value, "bId");
			return (Criteria) this;
		}

		public Criteria andBIdLessThanOrEqualTo(Integer value) {
			addCriterion("b_id <=", value, "bId");
			return (Criteria) this;
		}

		public Criteria andBIdIn(List<Integer> values) {
			addCriterion("b_id in", values, "bId");
			return (Criteria) this;
		}

		public Criteria andBIdNotIn(List<Integer> values) {
			addCriterion("b_id not in", values, "bId");
			return (Criteria) this;
		}

		public Criteria andBIdBetween(Integer value1, Integer value2) {
			addCriterion("b_id between", value1, value2, "bId");
			return (Criteria) this;
		}

		public Criteria andBIdNotBetween(Integer value1, Integer value2) {
			addCriterion("b_id not between", value1, value2, "bId");
			return (Criteria) this;
		}

		public Criteria andBusinessNoIsNull() {
			addCriterion("business_no is null");
			return (Criteria) this;
		}

		public Criteria andBusinessNoIsNotNull() {
			addCriterion("business_no is not null");
			return (Criteria) this;
		}

		public Criteria andBusinessNoEqualTo(String value) {
			addCriterion("business_no =", value, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoNotEqualTo(String value) {
			addCriterion("business_no <>", value, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoGreaterThan(String value) {
			addCriterion("business_no >", value, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoGreaterThanOrEqualTo(String value) {
			addCriterion("business_no >=", value, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoLessThan(String value) {
			addCriterion("business_no <", value, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoLessThanOrEqualTo(String value) {
			addCriterion("business_no <=", value, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoLike(String value) {
			addCriterion("business_no like", value, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoNotLike(String value) {
			addCriterion("business_no not like", value, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoIn(List<String> values) {
			addCriterion("business_no in", values, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoNotIn(List<String> values) {
			addCriterion("business_no not in", values, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoBetween(String value1, String value2) {
			addCriterion("business_no between", value1, value2, "businessNo");
			return (Criteria) this;
		}

		public Criteria andBusinessNoNotBetween(String value1, String value2) {
			addCriterion("business_no not between", value1, value2, "businessNo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoIsNull() {
			addCriterion("order_info is null");
			return (Criteria) this;
		}

		public Criteria andOrderInfoIsNotNull() {
			addCriterion("order_info is not null");
			return (Criteria) this;
		}

		public Criteria andOrderInfoEqualTo(String value) {
			addCriterion("order_info =", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoNotEqualTo(String value) {
			addCriterion("order_info <>", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoGreaterThan(String value) {
			addCriterion("order_info >", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoGreaterThanOrEqualTo(String value) {
			addCriterion("order_info >=", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoLessThan(String value) {
			addCriterion("order_info <", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoLessThanOrEqualTo(String value) {
			addCriterion("order_info <=", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoLike(String value) {
			addCriterion("order_info like", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoNotLike(String value) {
			addCriterion("order_info not like", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoIn(List<String> values) {
			addCriterion("order_info in", values, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoNotIn(List<String> values) {
			addCriterion("order_info not in", values, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoBetween(String value1, String value2) {
			addCriterion("order_info between", value1, value2, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoNotBetween(String value1, String value2) {
			addCriterion("order_info not between", value1, value2, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(Integer value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Integer value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Integer value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Integer value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Integer value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Integer> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Integer> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Integer value1, Integer value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andToyalPriceIsNull() {
			addCriterion("toyal_price is null");
			return (Criteria) this;
		}

		public Criteria andToyalPriceIsNotNull() {
			addCriterion("toyal_price is not null");
			return (Criteria) this;
		}

		public Criteria andToyalPriceEqualTo(Integer value) {
			addCriterion("toyal_price =", value, "toyalPrice");
			return (Criteria) this;
		}

		public Criteria andToyalPriceNotEqualTo(Integer value) {
			addCriterion("toyal_price <>", value, "toyalPrice");
			return (Criteria) this;
		}

		public Criteria andToyalPriceGreaterThan(Integer value) {
			addCriterion("toyal_price >", value, "toyalPrice");
			return (Criteria) this;
		}

		public Criteria andToyalPriceGreaterThanOrEqualTo(Integer value) {
			addCriterion("toyal_price >=", value, "toyalPrice");
			return (Criteria) this;
		}

		public Criteria andToyalPriceLessThan(Integer value) {
			addCriterion("toyal_price <", value, "toyalPrice");
			return (Criteria) this;
		}

		public Criteria andToyalPriceLessThanOrEqualTo(Integer value) {
			addCriterion("toyal_price <=", value, "toyalPrice");
			return (Criteria) this;
		}

		public Criteria andToyalPriceIn(List<Integer> values) {
			addCriterion("toyal_price in", values, "toyalPrice");
			return (Criteria) this;
		}

		public Criteria andToyalPriceNotIn(List<Integer> values) {
			addCriterion("toyal_price not in", values, "toyalPrice");
			return (Criteria) this;
		}

		public Criteria andToyalPriceBetween(Integer value1, Integer value2) {
			addCriterion("toyal_price between", value1, value2, "toyalPrice");
			return (Criteria) this;
		}

		public Criteria andToyalPriceNotBetween(Integer value1, Integer value2) {
			addCriterion("toyal_price not between", value1, value2, "toyalPrice");
			return (Criteria) this;
		}

		public Criteria andPayTypeIsNull() {
			addCriterion("pay_type is null");
			return (Criteria) this;
		}

		public Criteria andPayTypeIsNotNull() {
			addCriterion("pay_type is not null");
			return (Criteria) this;
		}

		public Criteria andPayTypeEqualTo(Integer value) {
			addCriterion("pay_type =", value, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeNotEqualTo(Integer value) {
			addCriterion("pay_type <>", value, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeGreaterThan(Integer value) {
			addCriterion("pay_type >", value, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("pay_type >=", value, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeLessThan(Integer value) {
			addCriterion("pay_type <", value, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
			addCriterion("pay_type <=", value, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeIn(List<Integer> values) {
			addCriterion("pay_type in", values, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeNotIn(List<Integer> values) {
			addCriterion("pay_type not in", values, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeBetween(Integer value1, Integer value2) {
			addCriterion("pay_type between", value1, value2, "payType");
			return (Criteria) this;
		}

		public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("pay_type not between", value1, value2, "payType");
			return (Criteria) this;
		}

		public Criteria andMemberIdIsNull() {
			addCriterion("member_id is null");
			return (Criteria) this;
		}

		public Criteria andMemberIdIsNotNull() {
			addCriterion("member_id is not null");
			return (Criteria) this;
		}

		public Criteria andMemberIdEqualTo(String value) {
			addCriterion("member_id =", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotEqualTo(String value) {
			addCriterion("member_id <>", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdGreaterThan(String value) {
			addCriterion("member_id >", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
			addCriterion("member_id >=", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdLessThan(String value) {
			addCriterion("member_id <", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdLessThanOrEqualTo(String value) {
			addCriterion("member_id <=", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdLike(String value) {
			addCriterion("member_id like", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotLike(String value) {
			addCriterion("member_id not like", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdIn(List<String> values) {
			addCriterion("member_id in", values, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotIn(List<String> values) {
			addCriterion("member_id not in", values, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdBetween(String value1, String value2) {
			addCriterion("member_id between", value1, value2, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotBetween(String value1, String value2) {
			addCriterion("member_id not between", value1, value2, "memberId");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andMemberNameIsNull() {
			addCriterion("member_name is null");
			return (Criteria) this;
		}

		public Criteria andMemberNameIsNotNull() {
			addCriterion("member_name is not null");
			return (Criteria) this;
		}

		public Criteria andMemberNameEqualTo(String value) {
			addCriterion("member_name =", value, "memberName");
			return (Criteria) this;
		}

		public Criteria andMemberNameNotEqualTo(String value) {
			addCriterion("member_name <>", value, "memberName");
			return (Criteria) this;
		}

		public Criteria andMemberNameGreaterThan(String value) {
			addCriterion("member_name >", value, "memberName");
			return (Criteria) this;
		}

		public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
			addCriterion("member_name >=", value, "memberName");
			return (Criteria) this;
		}

		public Criteria andMemberNameLessThan(String value) {
			addCriterion("member_name <", value, "memberName");
			return (Criteria) this;
		}

		public Criteria andMemberNameLessThanOrEqualTo(String value) {
			addCriterion("member_name <=", value, "memberName");
			return (Criteria) this;
		}

		public Criteria andMemberNameLike(String value) {
			addCriterion("member_name like", value, "memberName");
			return (Criteria) this;
		}

		public Criteria andMemberNameNotLike(String value) {
			addCriterion("member_name not like", value, "memberName");
			return (Criteria) this;
		}

		public Criteria andMemberNameIn(List<String> values) {
			addCriterion("member_name in", values, "memberName");
			return (Criteria) this;
		}

		public Criteria andMemberNameNotIn(List<String> values) {
			addCriterion("member_name not in", values, "memberName");
			return (Criteria) this;
		}

		public Criteria andMemberNameBetween(String value1, String value2) {
			addCriterion("member_name between", value1, value2, "memberName");
			return (Criteria) this;
		}

		public Criteria andMemberNameNotBetween(String value1, String value2) {
			addCriterion("member_name not between", value1, value2, "memberName");
			return (Criteria) this;
		}

		public Criteria andProductNameIsNull() {
			addCriterion("product_name is null");
			return (Criteria) this;
		}

		public Criteria andProductNameIsNotNull() {
			addCriterion("product_name is not null");
			return (Criteria) this;
		}

		public Criteria andProductNameEqualTo(String value) {
			addCriterion("product_name =", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotEqualTo(String value) {
			addCriterion("product_name <>", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameGreaterThan(String value) {
			addCriterion("product_name >", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameGreaterThanOrEqualTo(String value) {
			addCriterion("product_name >=", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLessThan(String value) {
			addCriterion("product_name <", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLessThanOrEqualTo(String value) {
			addCriterion("product_name <=", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLike(String value) {
			addCriterion("product_name like", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotLike(String value) {
			addCriterion("product_name not like", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameIn(List<String> values) {
			addCriterion("product_name in", values, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotIn(List<String> values) {
			addCriterion("product_name not in", values, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameBetween(String value1, String value2) {
			addCriterion("product_name between", value1, value2, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotBetween(String value1, String value2) {
			addCriterion("product_name not between", value1, value2, "productName");
			return (Criteria) this;
		}

		public Criteria andAmountIsNull() {
			addCriterion("amount is null");
			return (Criteria) this;
		}

		public Criteria andAmountIsNotNull() {
			addCriterion("amount is not null");
			return (Criteria) this;
		}

		public Criteria andAmountEqualTo(String value) {
			addCriterion("amount =", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotEqualTo(String value) {
			addCriterion("amount <>", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThan(String value) {
			addCriterion("amount >", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountGreaterThanOrEqualTo(String value) {
			addCriterion("amount >=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThan(String value) {
			addCriterion("amount <", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLessThanOrEqualTo(String value) {
			addCriterion("amount <=", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountLike(String value) {
			addCriterion("amount like", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotLike(String value) {
			addCriterion("amount not like", value, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountIn(List<String> values) {
			addCriterion("amount in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotIn(List<String> values) {
			addCriterion("amount not in", values, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountBetween(String value1, String value2) {
			addCriterion("amount between", value1, value2, "amount");
			return (Criteria) this;
		}

		public Criteria andAmountNotBetween(String value1, String value2) {
			addCriterion("amount not between", value1, value2, "amount");
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

		public Criteria andProductIdIsNull() {
			addCriterion("product_id is null");
			return (Criteria) this;
		}

		public Criteria andProductIdIsNotNull() {
			addCriterion("product_id is not null");
			return (Criteria) this;
		}

		public Criteria andProductIdEqualTo(Integer value) {
			addCriterion("product_id =", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotEqualTo(Integer value) {
			addCriterion("product_id <>", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdGreaterThan(Integer value) {
			addCriterion("product_id >", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("product_id >=", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdLessThan(Integer value) {
			addCriterion("product_id <", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdLessThanOrEqualTo(Integer value) {
			addCriterion("product_id <=", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdIn(List<Integer> values) {
			addCriterion("product_id in", values, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotIn(List<Integer> values) {
			addCriterion("product_id not in", values, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdBetween(Integer value1, Integer value2) {
			addCriterion("product_id between", value1, value2, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
			addCriterion("product_id not between", value1, value2, "productId");
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