//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double num1 = 20;
        int num2 = 10;
        char letra = 'a';
        String texto = " ponte do terror";


        double media = ((num1 + (double) num2 )/2);
        System.out.println(media);

        String historia = """
                 A história começa com uma pedra que caiu e quebrou
                """+letra+texto;
        System.out.println(historia);

        double precoProduto = 69.9;
        int quantidade = 7;

        double valorTotal = precoProduto * quantidade;
        String mensagem = " O preço total é " + valorTotal;
        System.out.println(mensagem);

        double valorEmDolares = 2.300;
        double conversão = valorEmDolares * 4.94;
        System.out.println("O valor convertido de dolar para real é " + conversão);

    }
}