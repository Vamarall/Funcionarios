import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        List<Funcionario> funcionarios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o número de funcionários: ");
        int num = sc.nextInt();
        sc.nextLine(); // Limpar o buffer após nextInt

        for (int i = 0; i < num; i++) {
            System.out.printf("Dados do funcionário %d:%n", i + 1);
            System.out.println("Terceirizado (s/n)?");
            String resposta = sc.nextLine();
           
        

            if (resposta.equalsIgnoreCase("s")) {
                FuncionariosTercerizados funcTer = new FuncionariosTercerizados();

                System.out.println("Nome: ");
                String nome = sc.nextLine();
                funcTer.setNome(nome);

                System.out.println("Horas: ");
                int horasTrabalhadas = sc.nextInt();
                funcTer.setHorasTrabalhadas(horasTrabalhadas);

                System.out.println("Valor por hora: ");
               double valorHora = sc.nextInt();
                funcTer.setValorHora(valorHora);

                System.out.println("Taxa adicional: ");
                double taxa = sc.nextDouble();
                sc.nextLine(); // Limpar o buffer após nextDouble
                funcTer.setBonus(taxa);

                funcionarios.add(funcTer);
            } else if (resposta.equalsIgnoreCase("n")) {
                FuncionariosProprios funcProp = new FuncionariosProprios();

                System.out.println("Nome: ");
                String nome = sc.nextLine();
                funcProp.setNome(nome);

                System.out.println("Horas: ");
                int horasTrabalhadas = sc.nextInt();
                funcProp.setHorasTrabalhadas(horasTrabalhadas);

                System.out.println("Valor por hora: ");
                int valorHora = sc.nextInt();
                sc.nextLine(); // Limpar o buffer após nextInt
                funcProp.setValorHora(valorHora);

                funcionarios.add(funcProp);
            }
        }

        // Exibir os funcionários cadastrados
        for (Funcionario func : funcionarios) {
            System.out.println(func); // Isso chama o método toString() de cada funcionário
        }

        sc.close();
    }
}
