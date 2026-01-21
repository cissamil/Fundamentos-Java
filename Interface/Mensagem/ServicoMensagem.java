/* 
Envia mensagens de marketing
deve ter a possibilidade de enviar a mesma mensagem para serviços diferentes, 
esses serviços devem ter um método para receber a mensagem como parâmetro
os serviços:

    SMS;
    E-mail;
    Redes Sociais;
    WhatsApp;

 */
//garante que a interface tenha apenas um metodo, contrato
@FunctionalInterface
    interface ServicoMensagem{
        void Enviar(String mensagem);
    }

