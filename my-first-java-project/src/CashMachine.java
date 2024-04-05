public class CashMachine {
    public static void main(String[] args) {
// exemplo de uso de if com operadores aritméticos
        double cash = 25.0;
        double  requestedAmount = 26.0;

        if(requestedAmount <= cash){
            cash = cash - requestedAmount;
        System.out.println("Novo saldo da conta: " + cash);
      
        }else
        System.out.println("Saldo insuficiente!");



        
    }

}
