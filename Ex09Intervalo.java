import br.edu.up.modelos.ContadorIntervalo09;

//9. Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo 
//   entre 10 (inclusive)e 150 (inclusive).

public class Ex09Intervalo {
    public static void executar() {
        int numerosNoIntervalo = ContadorIntervalo09.contarNumerosNoIntervalo();
        System.out.println("Número(s) no intervalo entre 10 e 150 (inclusive): " + numerosNoIntervalo);
    }
}
