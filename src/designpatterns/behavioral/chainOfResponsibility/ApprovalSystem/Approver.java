package designpatterns.behavioral.chainOfResponsibility.ApprovalSystem;

public abstract class Approver {
    protected Approver nextApprover;
    public Approver(Approver nextApprover){
        this.nextApprover = nextApprover;
    }
    public abstract void processLeaveRequest(int days);
}
