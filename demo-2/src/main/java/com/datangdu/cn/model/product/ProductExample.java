package com.datangdu.cn.model.product;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	protected String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductExample() {
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

		public Criteria andCodeIsNull() {
			addCriterion("code is null");
			return (Criteria) this;
		}

		public Criteria andCodeIsNotNull() {
			addCriterion("code is not null");
			return (Criteria) this;
		}

		public Criteria andCodeEqualTo(Integer value) {
			addCriterion("code =", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotEqualTo(Integer value) {
			addCriterion("code <>", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThan(Integer value) {
			addCriterion("code >", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeGreaterThanOrEqualTo(Integer value) {
			addCriterion("code >=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThan(Integer value) {
			addCriterion("code <", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeLessThanOrEqualTo(Integer value) {
			addCriterion("code <=", value, "code");
			return (Criteria) this;
		}

		public Criteria andCodeIn(List<Integer> values) {
			addCriterion("code in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotIn(List<Integer> values) {
			addCriterion("code not in", values, "code");
			return (Criteria) this;
		}

		public Criteria andCodeBetween(Integer value1, Integer value2) {
			addCriterion("code between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andCodeNotBetween(Integer value1, Integer value2) {
			addCriterion("code not between", value1, value2, "code");
			return (Criteria) this;
		}

		public Criteria andImgIsNull() {
			addCriterion("img is null");
			return (Criteria) this;
		}

		public Criteria andImgIsNotNull() {
			addCriterion("img is not null");
			return (Criteria) this;
		}

		public Criteria andImgEqualTo(String value) {
			addCriterion("img =", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotEqualTo(String value) {
			addCriterion("img <>", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgGreaterThan(String value) {
			addCriterion("img >", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgGreaterThanOrEqualTo(String value) {
			addCriterion("img >=", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgLessThan(String value) {
			addCriterion("img <", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgLessThanOrEqualTo(String value) {
			addCriterion("img <=", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgLike(String value) {
			addCriterion("img like", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotLike(String value) {
			addCriterion("img not like", value, "img");
			return (Criteria) this;
		}

		public Criteria andImgIn(List<String> values) {
			addCriterion("img in", values, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotIn(List<String> values) {
			addCriterion("img not in", values, "img");
			return (Criteria) this;
		}

		public Criteria andImgBetween(String value1, String value2) {
			addCriterion("img between", value1, value2, "img");
			return (Criteria) this;
		}

		public Criteria andImgNotBetween(String value1, String value2) {
			addCriterion("img not between", value1, value2, "img");
			return (Criteria) this;
		}

		public Criteria andInfoIsNull() {
			addCriterion("info is null");
			return (Criteria) this;
		}

		public Criteria andInfoIsNotNull() {
			addCriterion("info is not null");
			return (Criteria) this;
		}

		public Criteria andInfoEqualTo(String value) {
			addCriterion("info =", value, "info");
			return (Criteria) this;
		}

		public Criteria andInfoNotEqualTo(String value) {
			addCriterion("info <>", value, "info");
			return (Criteria) this;
		}

		public Criteria andInfoGreaterThan(String value) {
			addCriterion("info >", value, "info");
			return (Criteria) this;
		}

		public Criteria andInfoGreaterThanOrEqualTo(String value) {
			addCriterion("info >=", value, "info");
			return (Criteria) this;
		}

		public Criteria andInfoLessThan(String value) {
			addCriterion("info <", value, "info");
			return (Criteria) this;
		}

		public Criteria andInfoLessThanOrEqualTo(String value) {
			addCriterion("info <=", value, "info");
			return (Criteria) this;
		}

		public Criteria andInfoLike(String value) {
			addCriterion("info like", value, "info");
			return (Criteria) this;
		}

		public Criteria andInfoNotLike(String value) {
			addCriterion("info not like", value, "info");
			return (Criteria) this;
		}

		public Criteria andInfoIn(List<String> values) {
			addCriterion("info in", values, "info");
			return (Criteria) this;
		}

		public Criteria andInfoNotIn(List<String> values) {
			addCriterion("info not in", values, "info");
			return (Criteria) this;
		}

		public Criteria andInfoBetween(String value1, String value2) {
			addCriterion("info between", value1, value2, "info");
			return (Criteria) this;
		}

		public Criteria andInfoNotBetween(String value1, String value2) {
			addCriterion("info not between", value1, value2, "info");
			return (Criteria) this;
		}

		public Criteria andShowOrderIsNull() {
			addCriterion("show_order is null");
			return (Criteria) this;
		}

		public Criteria andShowOrderIsNotNull() {
			addCriterion("show_order is not null");
			return (Criteria) this;
		}

		public Criteria andShowOrderEqualTo(Integer value) {
			addCriterion("show_order =", value, "showOrder");
			return (Criteria) this;
		}

		public Criteria andShowOrderNotEqualTo(Integer value) {
			addCriterion("show_order <>", value, "showOrder");
			return (Criteria) this;
		}

		public Criteria andShowOrderGreaterThan(Integer value) {
			addCriterion("show_order >", value, "showOrder");
			return (Criteria) this;
		}

		public Criteria andShowOrderGreaterThanOrEqualTo(Integer value) {
			addCriterion("show_order >=", value, "showOrder");
			return (Criteria) this;
		}

		public Criteria andShowOrderLessThan(Integer value) {
			addCriterion("show_order <", value, "showOrder");
			return (Criteria) this;
		}

		public Criteria andShowOrderLessThanOrEqualTo(Integer value) {
			addCriterion("show_order <=", value, "showOrder");
			return (Criteria) this;
		}

		public Criteria andShowOrderIn(List<Integer> values) {
			addCriterion("show_order in", values, "showOrder");
			return (Criteria) this;
		}

		public Criteria andShowOrderNotIn(List<Integer> values) {
			addCriterion("show_order not in", values, "showOrder");
			return (Criteria) this;
		}

		public Criteria andShowOrderBetween(Integer value1, Integer value2) {
			addCriterion("show_order between", value1, value2, "showOrder");
			return (Criteria) this;
		}

		public Criteria andShowOrderNotBetween(Integer value1, Integer value2) {
			addCriterion("show_order not between", value1, value2, "showOrder");
			return (Criteria) this;
		}

		public Criteria andStyleIdIsNull() {
			addCriterion("style_id is null");
			return (Criteria) this;
		}

		public Criteria andStyleIdIsNotNull() {
			addCriterion("style_id is not null");
			return (Criteria) this;
		}

		public Criteria andStyleIdEqualTo(String value) {
			addCriterion("style_id =", value, "styleId");
			return (Criteria) this;
		}

		public Criteria andStyleIdNotEqualTo(String value) {
			addCriterion("style_id <>", value, "styleId");
			return (Criteria) this;
		}

		public Criteria andStyleIdGreaterThan(String value) {
			addCriterion("style_id >", value, "styleId");
			return (Criteria) this;
		}

		public Criteria andStyleIdGreaterThanOrEqualTo(String value) {
			addCriterion("style_id >=", value, "styleId");
			return (Criteria) this;
		}

		public Criteria andStyleIdLessThan(String value) {
			addCriterion("style_id <", value, "styleId");
			return (Criteria) this;
		}

		public Criteria andStyleIdLessThanOrEqualTo(String value) {
			addCriterion("style_id <=", value, "styleId");
			return (Criteria) this;
		}

		public Criteria andStyleIdLike(String value) {
			addCriterion("style_id like", value, "styleId");
			return (Criteria) this;
		}

		public Criteria andStyleIdNotLike(String value) {
			addCriterion("style_id not like", value, "styleId");
			return (Criteria) this;
		}

		public Criteria andStyleIdIn(List<String> values) {
			addCriterion("style_id in", values, "styleId");
			return (Criteria) this;
		}

		public Criteria andStyleIdNotIn(List<String> values) {
			addCriterion("style_id not in", values, "styleId");
			return (Criteria) this;
		}

		public Criteria andStyleIdBetween(String value1, String value2) {
			addCriterion("style_id between", value1, value2, "styleId");
			return (Criteria) this;
		}

		public Criteria andStyleIdNotBetween(String value1, String value2) {
			addCriterion("style_id not between", value1, value2, "styleId");
			return (Criteria) this;
		}

		public Criteria andTypeIdIsNull() {
			addCriterion("type_id is null");
			return (Criteria) this;
		}

		public Criteria andTypeIdIsNotNull() {
			addCriterion("type_id is not null");
			return (Criteria) this;
		}

		public Criteria andTypeIdEqualTo(String value) {
			addCriterion("type_id =", value, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdNotEqualTo(String value) {
			addCriterion("type_id <>", value, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdGreaterThan(String value) {
			addCriterion("type_id >", value, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdGreaterThanOrEqualTo(String value) {
			addCriterion("type_id >=", value, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdLessThan(String value) {
			addCriterion("type_id <", value, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdLessThanOrEqualTo(String value) {
			addCriterion("type_id <=", value, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdLike(String value) {
			addCriterion("type_id like", value, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdNotLike(String value) {
			addCriterion("type_id not like", value, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdIn(List<String> values) {
			addCriterion("type_id in", values, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdNotIn(List<String> values) {
			addCriterion("type_id not in", values, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdBetween(String value1, String value2) {
			addCriterion("type_id between", value1, value2, "typeId");
			return (Criteria) this;
		}

		public Criteria andTypeIdNotBetween(String value1, String value2) {
			addCriterion("type_id not between", value1, value2, "typeId");
			return (Criteria) this;
		}

		public Criteria andMarketPriceIsNull() {
			addCriterion("market_price is null");
			return (Criteria) this;
		}

		public Criteria andMarketPriceIsNotNull() {
			addCriterion("market_price is not null");
			return (Criteria) this;
		}

		public Criteria andMarketPriceEqualTo(Integer value) {
			addCriterion("market_price =", value, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceNotEqualTo(Integer value) {
			addCriterion("market_price <>", value, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceGreaterThan(Integer value) {
			addCriterion("market_price >", value, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceGreaterThanOrEqualTo(Integer value) {
			addCriterion("market_price >=", value, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceLessThan(Integer value) {
			addCriterion("market_price <", value, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceLessThanOrEqualTo(Integer value) {
			addCriterion("market_price <=", value, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceIn(List<Integer> values) {
			addCriterion("market_price in", values, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceNotIn(List<Integer> values) {
			addCriterion("market_price not in", values, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceBetween(Integer value1, Integer value2) {
			addCriterion("market_price between", value1, value2, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andMarketPriceNotBetween(Integer value1, Integer value2) {
			addCriterion("market_price not between", value1, value2, "marketPrice");
			return (Criteria) this;
		}

		public Criteria andUnitIsNull() {
			addCriterion("unit is null");
			return (Criteria) this;
		}

		public Criteria andUnitIsNotNull() {
			addCriterion("unit is not null");
			return (Criteria) this;
		}

		public Criteria andUnitEqualTo(String value) {
			addCriterion("unit =", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotEqualTo(String value) {
			addCriterion("unit <>", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitGreaterThan(String value) {
			addCriterion("unit >", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitGreaterThanOrEqualTo(String value) {
			addCriterion("unit >=", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitLessThan(String value) {
			addCriterion("unit <", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitLessThanOrEqualTo(String value) {
			addCriterion("unit <=", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitLike(String value) {
			addCriterion("unit like", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotLike(String value) {
			addCriterion("unit not like", value, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitIn(List<String> values) {
			addCriterion("unit in", values, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotIn(List<String> values) {
			addCriterion("unit not in", values, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitBetween(String value1, String value2) {
			addCriterion("unit between", value1, value2, "unit");
			return (Criteria) this;
		}

		public Criteria andUnitNotBetween(String value1, String value2) {
			addCriterion("unit not between", value1, value2, "unit");
			return (Criteria) this;
		}

		public Criteria andStoreNumIsNull() {
			addCriterion("store_num is null");
			return (Criteria) this;
		}

		public Criteria andStoreNumIsNotNull() {
			addCriterion("store_num is not null");
			return (Criteria) this;
		}

		public Criteria andStoreNumEqualTo(Integer value) {
			addCriterion("store_num =", value, "storeNum");
			return (Criteria) this;
		}

		public Criteria andStoreNumNotEqualTo(Integer value) {
			addCriterion("store_num <>", value, "storeNum");
			return (Criteria) this;
		}

		public Criteria andStoreNumGreaterThan(Integer value) {
			addCriterion("store_num >", value, "storeNum");
			return (Criteria) this;
		}

		public Criteria andStoreNumGreaterThanOrEqualTo(Integer value) {
			addCriterion("store_num >=", value, "storeNum");
			return (Criteria) this;
		}

		public Criteria andStoreNumLessThan(Integer value) {
			addCriterion("store_num <", value, "storeNum");
			return (Criteria) this;
		}

		public Criteria andStoreNumLessThanOrEqualTo(Integer value) {
			addCriterion("store_num <=", value, "storeNum");
			return (Criteria) this;
		}

		public Criteria andStoreNumIn(List<Integer> values) {
			addCriterion("store_num in", values, "storeNum");
			return (Criteria) this;
		}

		public Criteria andStoreNumNotIn(List<Integer> values) {
			addCriterion("store_num not in", values, "storeNum");
			return (Criteria) this;
		}

		public Criteria andStoreNumBetween(Integer value1, Integer value2) {
			addCriterion("store_num between", value1, value2, "storeNum");
			return (Criteria) this;
		}

		public Criteria andStoreNumNotBetween(Integer value1, Integer value2) {
			addCriterion("store_num not between", value1, value2, "storeNum");
			return (Criteria) this;
		}

		public Criteria andSaleNumIsNull() {
			addCriterion("sale_num is null");
			return (Criteria) this;
		}

		public Criteria andSaleNumIsNotNull() {
			addCriterion("sale_num is not null");
			return (Criteria) this;
		}

		public Criteria andSaleNumEqualTo(Integer value) {
			addCriterion("sale_num =", value, "saleNum");
			return (Criteria) this;
		}

		public Criteria andSaleNumNotEqualTo(Integer value) {
			addCriterion("sale_num <>", value, "saleNum");
			return (Criteria) this;
		}

		public Criteria andSaleNumGreaterThan(Integer value) {
			addCriterion("sale_num >", value, "saleNum");
			return (Criteria) this;
		}

		public Criteria andSaleNumGreaterThanOrEqualTo(Integer value) {
			addCriterion("sale_num >=", value, "saleNum");
			return (Criteria) this;
		}

		public Criteria andSaleNumLessThan(Integer value) {
			addCriterion("sale_num <", value, "saleNum");
			return (Criteria) this;
		}

		public Criteria andSaleNumLessThanOrEqualTo(Integer value) {
			addCriterion("sale_num <=", value, "saleNum");
			return (Criteria) this;
		}

		public Criteria andSaleNumIn(List<Integer> values) {
			addCriterion("sale_num in", values, "saleNum");
			return (Criteria) this;
		}

		public Criteria andSaleNumNotIn(List<Integer> values) {
			addCriterion("sale_num not in", values, "saleNum");
			return (Criteria) this;
		}

		public Criteria andSaleNumBetween(Integer value1, Integer value2) {
			addCriterion("sale_num between", value1, value2, "saleNum");
			return (Criteria) this;
		}

		public Criteria andSaleNumNotBetween(Integer value1, Integer value2) {
			addCriterion("sale_num not between", value1, value2, "saleNum");
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

		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andServiceContentIsNull() {
			addCriterion("service_content is null");
			return (Criteria) this;
		}

		public Criteria andServiceContentIsNotNull() {
			addCriterion("service_content is not null");
			return (Criteria) this;
		}

		public Criteria andServiceContentEqualTo(String value) {
			addCriterion("service_content =", value, "serviceContent");
			return (Criteria) this;
		}

		public Criteria andServiceContentNotEqualTo(String value) {
			addCriterion("service_content <>", value, "serviceContent");
			return (Criteria) this;
		}

		public Criteria andServiceContentGreaterThan(String value) {
			addCriterion("service_content >", value, "serviceContent");
			return (Criteria) this;
		}

		public Criteria andServiceContentGreaterThanOrEqualTo(String value) {
			addCriterion("service_content >=", value, "serviceContent");
			return (Criteria) this;
		}

		public Criteria andServiceContentLessThan(String value) {
			addCriterion("service_content <", value, "serviceContent");
			return (Criteria) this;
		}

		public Criteria andServiceContentLessThanOrEqualTo(String value) {
			addCriterion("service_content <=", value, "serviceContent");
			return (Criteria) this;
		}

		public Criteria andServiceContentLike(String value) {
			addCriterion("service_content like", value, "serviceContent");
			return (Criteria) this;
		}

		public Criteria andServiceContentNotLike(String value) {
			addCriterion("service_content not like", value, "serviceContent");
			return (Criteria) this;
		}

		public Criteria andServiceContentIn(List<String> values) {
			addCriterion("service_content in", values, "serviceContent");
			return (Criteria) this;
		}

		public Criteria andServiceContentNotIn(List<String> values) {
			addCriterion("service_content not in", values, "serviceContent");
			return (Criteria) this;
		}

		public Criteria andServiceContentBetween(String value1, String value2) {
			addCriterion("service_content between", value1, value2, "serviceContent");
			return (Criteria) this;
		}

		public Criteria andServiceContentNotBetween(String value1, String value2) {
			addCriterion("service_content not between", value1, value2, "serviceContent");
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