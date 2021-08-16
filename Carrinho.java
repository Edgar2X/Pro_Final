public class Carrinho{

    private String disc1 = "Back in Black - AC/DC";
    private String disc2 = "Black Album - Metallica";
    private String disc3 = "Whats going on - Marvin Gaye";
    private String disc4 = "Blackstar - David Bowie";
    private String disc5 = "Lemonade - Beyoncé";

    //Inserir na Lista
    public void InserirProduto(int x){
        if (x == 1){
            System.out.println("Você escolheu: " + disc1);
        }if (x == 2){
            System.out.println("Você escolheu: " + disc2);
        }if (x == 3){
            System.out.println("Você escolheu: " + disc3);
        }if (x == 4){
            System.out.println("Você escolheu: " + disc4);
        }if (x == 5){
            System.out.println("Você escolheu: " + disc5);
        }if(x > 5){
            System.out.println("Numero Invalido");
        }    
    }

    //Apago na lista
    public void ExcluirProduto(){
        System.out.println("Excluido");
    }
    
    //Apaga no Banco
    public void FinalizarPedido(){
        System.out.println("Pedido salvo no Carrinho");
    }

}
