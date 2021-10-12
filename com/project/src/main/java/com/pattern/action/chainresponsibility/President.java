package com.pattern.action.chainresponsibility;

public class President implements Approver {

    private Approver next;

    public void setNextApprover(Approver next) {
        this.next = next;
    }

    @Override
    public void processRequest(PurchaseOrder order) {
        if (order.getAmount() > 10000) {
            System.out.println("董事长审批");
        } else {
            this.next.processRequest(order);
        }
    }

}
