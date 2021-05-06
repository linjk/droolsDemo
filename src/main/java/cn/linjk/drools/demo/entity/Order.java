package cn.linjk.drools.demo.entity;

/**
 * Copyright 1990-2020 LinJK
 *
 * @fileName: Order
 * @author: linjk
 * @date: 2021/5/6 下午9:23
 * @description:
 */
public class Order {
    private Double originalPrice; // 订单优惠前价格
    private Double realPrice; // 订单优惠后价格

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Double getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Double realPrice) {
        this.realPrice = realPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "originalPrice=" + originalPrice +
                ", realPrice=" + realPrice +
                '}';
    }
}
