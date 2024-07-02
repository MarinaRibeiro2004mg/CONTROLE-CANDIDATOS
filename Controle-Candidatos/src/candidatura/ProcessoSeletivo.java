package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String candidatos[] = { "Marcele ", "Maycon ", "Talita ", "Paulo ", "Talisson " };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativaRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativaRealizadas++;
            else
                System.out.println("Contato realizado com sucesso");

            // elas precisarão sofrer alterações ou o entrará emm looping ifinito
        } while (continuarTentando && tentativaRealizadas < 3);

        System.out.println("Conseguimos contato com " + candidato + " Na " + tentativaRealizadas + " tentativa");
        System.out.println("Não conseguimoes contato " + candidato + ", Número máximo de tentativas "
                + tentativaRealizadas + " realizadas.");

    }

    // método auxiliar.
    // Esse metodo simula que através de uma expressão randomica que se o valor
    // entre 1 e 3 for igual 1 quer dizer que ele atendeu
    //
    static boolean atender() {
        return new Random().nextInt(3) == 1;

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
