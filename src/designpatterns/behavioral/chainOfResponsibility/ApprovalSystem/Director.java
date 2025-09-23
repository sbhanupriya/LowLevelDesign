package designpatterns.behavioral.chainOfResponsibility.ApprovalSystem;

public class Director extends Approver {
    public Director(Approver approver){
        super(approver);
    }
    @Override
    public void processLeaveRequest(int days) {
        if(days<=20){
            System.out.println("Director: Approved leaves of " + days + " working days");
        }
        else {
            nextApprover.processLeaveRequest(days);
        }
    }
}
