package designpatterns.behavioral.chainOfResponsibility.ApprovalSystem;

public class Manager extends Approver {
    public Manager(Approver approver){
        super(approver);
    }
    @Override
    public void processLeaveRequest(int days) {
        if(days<=10){
            System.out.println("Manager: Approved leaves of " + days + " working days");
        }
        else {
            nextApprover.processLeaveRequest(days);
        }
    }
}
