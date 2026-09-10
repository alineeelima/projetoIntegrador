package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome do colaborador: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a idade do funcionário: ");
        int idade = entrada.nextInt();

        System.out.print("Digite o salário mensal do colaborador: ");
        double salario = entrada.nextDouble();

        System.out.print("Digite o tempo de empresa desse funcionário (em meses): ");
        int tempoEmpresa = entrada.nextInt();

        System.out.print("Digite a quantidade de filhos desse colaborador: ");
        int quantFilhos = entrada.nextInt();

        System.out.print("Digite a modalidade de trabalho desse funcionário (presencial ou home office): ");
        String modalidade = entrada.nextLine();

        System.out.print("O colaborador possui veículo próprio? (sim/não) ");
        String veiculo = entrada.nextLine();

        /// O bônus do PLR é a mesma quantidade do salário
        double plr = salario;

        ///  funcionários com salários abaixo de R$4.000,00 tem direito ao vale alimentação
        if (salario <= 4000) {
            System.out.println("A(o) funcionária(o)" + nome + "possui direito ao vale alimentação;");
        }else {
            System.out.println("O funcionário " + nome + " não possui direito ao vale alimentação;");
        }

        /// Funcionários com pelo menos um filho tem direito ao auxílio creche
        if (quantFilhos > 0) {
            System.out.println("Possui direito ao auxílio creche;");
        }else {
            System.out.println("Não possui direito ao auxílio creche;");
        }

        /// Funcionários com mais de três meses de contratação tem direito ao plano de saúde
        if (tempoEmpresa > 3) {
            System.out.println("Pode aderir ao plano de saúde;");
        }else {
            System.out.println("Não pode aderir ao plano de saúde;");
        }

        /// Funcionários que trabalham no modelo Home Office possuem direito ao auxílio Home Office
        if (modalidade.equalsIgnoreCase("HOME OFFICE")) {
            System.out.println("Possui direito ao auxílio Home Office;");
        }else {
            System.out.println(" Não possui direito ao auxílio Home Office;");
        }

        /// Funcionários que possuem veículo próprio tem direito ao auxílio combustível
        if (veiculo.equalsIgnoreCase("SIM")) {
            System.out.println("Possui direito ao auxílio combustível;");
        }else {
            System.out.println("Não possui direito ao auxílio combustível;");
        }

        ///  funcionários com mai de 1 ano de empresa tem direito a bolsa de estudos
        if (tempoEmpresa >=12) {
            System.out.println("Possui direito a bolsa de estudos;");
        }else {
            System.out.println("Não possui direito a bolsa de estudos;");

        }

        System.out.println("E vai receber R$" + plr + "de participação nos lucros da empresa.");
    }
}