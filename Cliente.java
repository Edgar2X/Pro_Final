public class Cliente extends Carrinho{

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    
    //Terá dois tipos de usuario: o Admin e o Cliente
    //Somente Admin poderá fazer funcionalidades do sisteme(Cadastro,Exclusão,etc)
    private String tipo;


    // O cliente podera visualizar seus dados

    public void CadastrarConta(String n, String e, String s, String ed,String t){
        this.nome = n;
        System.out.println(n);
        this.email = e;
        System.out.println(e);
        this.senha = s;
        System.out.println(s);
        this.endereco = ed;
        System.out.println(ed);
        this.tipo = t;
        System.out.println(t);
    }
    
    // Terá que verificar no banco se o id requisitado existe na tabela
    public void AlterarConta(int i,String n, String e, String s, String ed,String t){
        //Irei usar um id pré-definido temporariamente
        id = 2;
        if(id == i){
            this.nome = n;
            System.out.println(n);
            this.email = e;
            System.out.println(e);
            this.senha = s;
            System.out.println(s);
            this.endereco = ed;
            System.out.println(ed);
            this.tipo = t;
            System.out.println(t);
        }
    }

    //Apagara no banco
    public void ExcluirConta(){
        System.out.println("Conta apagada");
    }

}
