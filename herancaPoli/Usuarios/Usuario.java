package herancaPoli.Usuarios;

/*
    hierarquia com tipos de usuários de um sistema:
        Classe Gerente : Nome, Email, Senha e um atributo que informa se ele é administrador(verdadeiro)
        Classe Vendedor : Nome, Email, Senha, Quantidade de vendas e um atributo que informa se ele é administrador(falso)
        Classe Atendente : Nome, Email, Senha, Valor em caixa e um atributo que informa se ele é administrador(falso)

    respectivos getters e setters + métodos
    A classe Gerente:   Gerar relatório financeiro, Consultar vendas, Realizar login, Realizar logff, alterar dados, alterar senha;
    A classe Vendedor:  Realizar venda ( incrementar o número de vendas quando acionado), Consultar vendas, Realizar login, Realizar logoff, alterar dados, alterar senha;
    A classe Atendente: Receber pagamentos (onde o método recebe um valor que deve ser incrementado no valor em caixa), Fechar o caixa, Realizar Login, Realizar logoff, alterar dados e alterar senha;
*/

//encapsulamento
public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private boolean admin;

    //construtor inicializa os atributos normalmente no Main.java
    public Usuario(String nome, String email, String senha, boolean admin){
        this.nome = nome;
        this.email = email;
        this.senha = senha; 
        this.admin = admin;    
    }

    //getters(ler) e setters(altera)
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean getAdmin() {
        return admin;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    //metodos
    public void realizarLogin(){
        System.out.println("Usuário " + this.nome + " realizou login.");
    }

    public void realizarLogoff(){
        System.out.println("Usuário " + this.nome + " realizou logoff.");
    }

    public void alterarSenha(String novaSenha, String senhaAntiga){
        if(this.senha.equals(senhaAntiga) && !novaSenha.equals(senhaAntiga)){
            this.setSenha(novaSenha);
            System.out.println("Senha alterada com sucesso para o usuário " + this.nome);
        } else {
            System.out.println("Verifique se a senha antiga esta correta ou se a nova é diferente da atual ");
        }

    }
}
