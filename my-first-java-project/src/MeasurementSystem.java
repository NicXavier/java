public class MeasurementSystem {
    public static void main(String[] args) {
//no exemplo a seguir, temos o swich case usado de modo que não apareça nenhuma mensagem ses o usuário colocar uma letra indevida        
        String acronym = "N";

        switch (acronym) {
            case "P":
                System.out.println("Tamanho pequeno");
                break;
            case "M":
                System.out.println("Tamanho médio");
                break;
            case "G":
                System.out.println("Tamanho grande");
                break;
            default:
                break;
        }
    }
}
