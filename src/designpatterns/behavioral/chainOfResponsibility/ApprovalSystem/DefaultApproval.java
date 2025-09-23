package designpatterns.behavioral.chainOfResponsibility.ApprovalSystem;

public class DefaultApproval extends Approver {
    public DefaultApproval(Approver approver){
        super(approver);
    }
    @Override
    public void processLeaveRequest(int days) {
       System.out.println("Default Approval of " + days + " working days");
    }
}
