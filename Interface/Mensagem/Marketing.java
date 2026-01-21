//pede o servico, mensageiro
class Marketing {
    public void disparar(String texto, ServicoMensagem servico){
        servico.Enviar(texto);
    }
}
