public class SchoolResult {
    public static void main(String[] args) {
//no exemplo a seguir, temos uma situação de nota escolar feita com a condicional ternária, que tem o código mais enxuto        
        int finalNote = 5;
        String result = finalNote >=7 ? "Aprovado!" : finalNote >=5 && finalNote <7 ? "Prova de recuperação!" : "Reprovado!";
        System.out.println(result);


    }
}
