public class PhonePlan {
    public static void main(String[] args) {
//no exemplo a seguir existem três tipos de planos: o T = turbo, o M = midia e o B = basic.  
        String plan = "T";
// Usaremos o switch case para o código não ficar repetitivo, pois os planos vão aumentando os benefícios a medida que são mais caros (por isso tiramos o break)
//, ou seja, o primeiro plano descrito, contém todos os beneficios do ultimo plano descrito 
        switch (plan) {
            case "T": {
                System.out.println("5GB Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram grátis");
            }                
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
