package Controle;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "contato")
public class Contato {


private String nome;
private String email;
private String mensagem;
private String resposta;

public void enviar() {

    System.out.println("Nome: " + nome);
    System.out.println("Email: " + email);
    System.out.println("Mensagem: " + mensagem);

    resposta = "Mensagem enviada com sucesso! Obrigado pelo contato, "
            + nome + ".";

    nome = "";
    email = "";
    mensagem = "";
}

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

public String getMensagem() {
    return mensagem;
}

public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
}

public String getResposta() {
    return resposta;
}

public void setResposta(String resposta) {
    this.resposta = resposta;
}

}
