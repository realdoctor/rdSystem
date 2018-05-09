package com.kanglian.healthcare.back.dal.cond;

import java.util.List;

/**
 * 支付订单
 * 
 * @author xl.liu
 */
public class PaymentOrder {

    // 用户Id
    private String      userId;
    // 订单号
    private String      orderNo;
    // 交易总额
    private Double      totalAmount;
    // 订单列表
    private List<Order> goodsList;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<Order> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Order> goodsList) {
        this.goodsList = goodsList;
    }

}