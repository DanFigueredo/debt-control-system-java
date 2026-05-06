package projects.debtcontrol;


public class DebtService {
    public void listDebts(String [] names, double [] values, int [] days, int count, boolean [] states){
        for (int i = 0; i < count; i++) {
            System.out.println("Debt " + (i + 1));
            System.out.println("Name: " + names[i]);
            System.out.println("Value: " + values[i]);
            System.out.println("Days Left: " + days[i]);
            if (states[i] == true){
                System.out.println("States: Paid");
            }else{
                System.out.println("States: Pending");
            }
            System.out.println("-----------------------------------");
        }


    }

    public void totalDebts(double [] values, int count){
        double sum = 0;
        for (int i = 0; i < count ; i++){
            sum += values[i];
        }
        System.out.println("--- Show Total Debts ---");
        System.out.println("Total debts: " + sum);
        System.out.println("-----------------------------");
    }

}
