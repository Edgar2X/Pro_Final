
//Edgar Enthony Ferreira Lima

public class Main {
    public static void main(String[] args) {

            Login l = new Login();
            l.EfetuarLogin("Edgar Enthony", "12345");
            
            if (l.confirm == 1){

                Cliente c = new Cliente();
                
                c.CadastrarConta("Assis","assis@gmail.com","2222","Rua Linderbegue Farias","Admin");

                c.AlterarConta(2,"Pedro","pedro@gmail.com","DP332","Rua Santa Angela","Cliente");
                //Salvar no banco

                c.ExcluirConta();
                //Apagar do Banco
        
                System.out.println("Escolha um disco: ");
                c.InserirProduto(3);
                //Deixar salvo na lista

                c.ExcluirProduto();
                //Tirar da lista

                c.FinalizarPedido();
                //Salvar no banco

                }
            }
        }

