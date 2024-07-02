package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String candidatos[] = { "Marcele ", "Maycon ", "Talita ", "Paulo ", "Talisson " };

        System.out.println("Imprimindo lista de candidato informando o indice do elemento");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("Meu candidato de n° " + indice + " é " + candidatos[indice]);

            /*
             * PARA NÍVEL DE USUÁRIO É INTERESSANTE UTILIZAR O INDICE ENTRE (INDICE+1)
             * ASSIM AO EXECUTAR A APLICAÇÃO PODEMOS VISUALIZAR OS CADIDATOS A PARTIR DO
             * NÚMERO 1
             */
        }

        System.out.println("Forma abreviada de interação for each");
        // forma abre abrevida aonde não precisamos demonstrar o indice
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }

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
