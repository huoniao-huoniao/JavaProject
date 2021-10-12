package com.pattern.action.chainresponsibility;

public interface Approver {
    public void processRequest(PurchaseOrder order);
}