package com.pattern.action.chainresponsibility;

public class Director implements Approver {
    private Approver next;

    public void setNextApprover(Approver next) {
        this.next = next;
    }

    @Override
    public void processRequest(PurchaseOrder order) {
        if (order.getAmount() < 1000) {
            System.out.println("Director审批");
        } else {
            this.next.processRequest(order);
        }
    }

}
