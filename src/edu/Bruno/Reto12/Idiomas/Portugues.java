package Reto12.Idiomas;

public class Portugues implements Language {
    @Override
    public String getMessage(String key) {
        switch (key) {
            case "welcome":
                return "Bem-vindo à Calculadora Aritmética";
            case "select_option":
                return "Selecione uma opção:";
            case "invalid_option":
                return "Opção inválida. Por favor, tente novamente.";
            case "continue":
                return "¿Deseja continuar (s/o)?: ";
            case "exit":
                return "Saindo...";
            case "enter_first_number":
                return "Digite o primeiro número: ";
            case "enter_second_number":
                return "Digite o segundo número: ";
            case "enter_raiz":
                return "Insira o número base da raiz: ";
            case "enter_base":
                return " Dê-me o número no qual criaremos raízes:";
            case "enter_base_power":
                return "Digite a base:";
            case "enter_exponent":
                return "Insira o expoente: ";
            case "enter_dividend":
                return "Insira o dividendo: ";
            case "enter_divisor":
                return "Insira o divisor: ";
            case "enter_modulo_number":
                return "Insira o número para cálculo do módulo:";
            case "enter_modulo_divisor":
                return "Insira o divisor para o cálculo do módulo: ";
            case "enter_logarithm_number":
                return "Digite o número para o logaritmo:";
            case "enter_logarithm_base":
                return "Insira a base do logaritmo:";
            case "result":
                return "Resultado:";
            case "menu":
                return "Cardápio\n1. Soma\n2. Subtração\n3. Multiplicação\n4. Poder\n5. Divisão\n6. Módulo\n7. Logaritmo\n8.  Raiz Quadrada\n0. Sair\nSelecione uma opção: ";
            case "operation_description":
                return "Operação: ";
            case  "is":
                return  "é";
            case "Adding":
                return "Adição";
            case "Subtracting":
                return "Subtrair";
            case  "Multiplying":
                return "Multiplicação";
            case "Dividing":
                return "Dividir";
            case "Calculating the modulus of":
                return "Cálculo do módulo de:";
            case "Calculating the logarithm of: ":
                return  "Calcular o logaritmo de:";
            case "Raising":
                return "Levantamento";
            case "Calculating the square root of: ":
                return "Calcular a raiz quadrada de:";
            case "Do you want to see the arithmetic operations performed so far? (s/S):":
                return  "Você deseja ver as operações aritméticas realizadas até agora? (s/S):";

            default:
                return "Mensagem não encontrada";
        }
    }
}
