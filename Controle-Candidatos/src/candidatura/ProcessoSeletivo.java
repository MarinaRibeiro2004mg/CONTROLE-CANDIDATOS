package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();

    }

    static void selecaoCandidatos() {
        String candidatos[] = { "Felipe ", "Jonas ", "Marcele ", "Maycon ", "Talita ", "Paulo ", "Talisson " };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("Candidato " + candidato + "solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("o candidato " + candidato + "foi selecionado para vaga ");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2000);

    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        }

        else if (salarioBase == salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");

        else {
            System.out.println("Aguardando resultado de outros candidatos");
        }

    }
}
