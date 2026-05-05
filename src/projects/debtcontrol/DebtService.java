package projects.debtcontrol;


public class DebtService {
    public void listDebts(String [] names, double [] values, int [] days, int count, boolean [] states){
        for (int i = 0; i < count -1; i++) {
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

    }

    public void showCloseDebts(String[] names, double[] values, int[] days, int count){

    }
}
