package com.api.market.domain;

public class PurchaseItem {

    private int productId;
    private int quantity;
    private double total;
    private boolean active;

    public int getProductId() {
        return this.productId;
    }

    public void setProductId(final int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(final double total) {
        this.total = total;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(final boolean active) {
        this.active = active;
    }
}
