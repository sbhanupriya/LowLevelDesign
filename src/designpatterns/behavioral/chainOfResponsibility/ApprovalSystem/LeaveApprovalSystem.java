package designpatterns.behavioral.chainOfResponsibility.ApprovalSystem;

public class LeaveApprovalSystem {
    public static void main(String[] args){
        Approver approver = new Supervisor(new Manager(new Director(new DefaultApproval(null))));

        approver.processLeaveRequest(2);
        approver.processLeaveRequest(8);
        approver.processLeaveRequest(16);
        approver.processLeaveRequest(30);
    }
}
