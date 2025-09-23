package designpatterns.behavioral.chainOfResponsibility.CashDispenser;

public class OneHundredHandler extends MoneyHandler {
    public OneHundredHandler(int notes, MoneyHandler next){
        super(notes,next);
    }
    @Override
    public void dispense(int money) {
            int notesNeeded = money/100;
            if(notesNeeded>notes){
                notesNeeded = notes;
                notes = 0;
            } else {
                notes -= notesNeeded;
            }
            if(notesNeeded>0)
                System.out.println("Dispensing " + notesNeeded +  " $100");

            int remaining = money-(100*notesNeeded);
            if(remaining>0){
                if(nextHandler!=null)
                    nextHandler.dispense(remaining);
                else
                    System.out.println("Remaining amount of " + money + " cannot be fulfilled");
            }
    }
}
