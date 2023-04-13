package com.api.market.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Purchase {

    private int purchaseId;
    private String clientId;
    private LocalDateTime date;
    private String paymentMethod;
    private String comment;
    private String state;
    private List<PurchaseItem> items;

    public int getPurchaseId() {
        return this.purchaseId;
    }

    public void setPurchaseId(final int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getClientId() {
        return this.clientId;
    }

    public void setClientId(final String clientId) {
        this.clientId = clientId;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public void setDate(final LocalDateTime date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(final String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public String getState() {
        return this.state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public List<PurchaseItem> getItems() {
        return this.items;
    }

    public void setItems(final List<PurchaseItem> items) {
        this.items = items;
    }
}
