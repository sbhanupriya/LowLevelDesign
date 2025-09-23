package designpatterns.behavioral.chainOfResponsibility.ApprovalSystem;

public class Supervisor extends Approver {
    public Supervisor(Approver approver){
        super(approver);
    }
    @Override
    public void processLeaveRequest(int days) {
        if(days<=5){
            System.out.println("Supervisor: Approved leaves of " + days + " working days");
        }
        else {
            nextApprover.processLeaveRequest(days);
        }
    }
}
