import br.edu.up.modelos.Pessoa11;
import java.util.Scanner;

//11. Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se 
//    ela éhomem ou mulher. No final informe total de homens e de mulheres.

public class Ex11NomeSexo {
        public static void executar() {
            Scanner scanner = new Scanner(System.in);
    
            Pessoa11[] pessoas = new Pessoa11[56];
    
            for (int i = 0; i < 56; i++) {
                System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
                String nome = scanner.nextLine();
    
                System.out.print("Digite o sexo da pessoa (M/F): ");
                char sexo = scanner.next().charAt(0);
                scanner.nextLine();
    
                pessoas[i] = new Pessoa11(nome, sexo);
            }
    
            Pessoa11.contarSexo(pessoas);
    
            scanner.close();
        }
    }
    