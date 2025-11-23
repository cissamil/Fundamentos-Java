package carro;


public class Carro {
    private boolean ligado;
    private int marcha;
    private int velocidade;
    
    public Carro(){
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public void ligar(){
        if(ligado){
            System.out.println("Seu carro ja esta ligado!");
            return;
        }

        ligado = true;
        System.out.println("Carro ligado!");

    }

    public void desligar(){
        if(!ligado){
            System.out.println("Seu carro ja esta desligado!");
            return;
        }
        if(marcha !=0){
            System.out.println("Coloque no ponto morto primeiro.");
            return;
        }
        if(velocidade != 0){
            System.out.println("Carro precisa estar na velocidade 0");
            return;
        }

        
        ligado = false;
        System.out.println("Carro desligado!");
    }

    public void trocarMarcha(int novaMarcha){
        if(!ligado){
            System.out.println("Carro desligado");
            return;

        }
        if(novaMarcha < 0 || novaMarcha > 6){
            System.out.println("Marcha invalida!");
            return;            
        }

        if(Math.abs(novaMarcha - marcha) > 1){
            System.out.println("Nao pule marchas");
            return;
        }

        if(!velocidadeMarcha(novaMarcha, velocidade)){
            System.out.println("Velocidade incompativel com a a marcha");
            return;
        }
        
        marcha = novaMarcha;
        System.out.println("Marcha trocada para: " + marcha);
        
    }

    private boolean velocidadeMarcha(int marcha, int v){
        return switch (marcha){
            case 0 -> v == 0;
            case 1 -> v > 0 && v <= 20;
            case 2 -> v >= 21 && v <= 40;
            case 3 -> v >= 41 && v <= 60;
            case 4 -> v >= 61 && v <= 80;
            case 5 -> v >= 81 && v <= 100;
            case 6 -> v >= 101 && v <= 120;
            default -> false;
        };
    }

    public void acelerar(){
        if(!ligado){
            System.out.println("Carro desligado");
            return;
        }

        if(marcha == 0){
            System.out.println("Carro em ponto morto, engate a primeira");
            return;
        }
        if(velocidade>=120){
            System.out.println("Velocidade maxima atingida (120km/h)!");
            return;
        }
        //calculo da nova velocidade
        int novaVelocidade = velocidade + 1;

        //velocidade tem que ser compativel a marcha atual
        if(!velocidadeMarcha(marcha, novaVelocidade)){
            System.out.println("Velocidadde nao compativel com a marcha atual, troque de marcha primeiro para acelerar!");
            return;
        }

        velocidade= novaVelocidade;
        System.out.println("Velocidade atual:" + velocidade + "km/h");
    }
    
    public void diminuirVelocidade(){
        if(!ligado){
            System.out.println("Carro desligado");
            return;
        }
        if(velocidade == 0){
            System.out.println("Velocidade minima atingida (0km/h)!");
            return;
        }

        int diminuiVelocidade = velocidade -1;
         if(!velocidadeMarcha(marcha, diminuiVelocidade)){
            System.out.println("Velocidade nao compativel com a marcha atual, troque desacelerar!");
            return;
        }

        velocidade = diminuiVelocidade;
        System.out.println("Velocidade atual:" + velocidade + "km/h");
    }


    public void virar(String direcao){
         if(!ligado){
            System.out.println("Carro desligado");
            return;
        }

        if(velocidade < 1 || velocidade > 40){
             System.out.println("Carro excedeu o limite maximo e minimo de velocidade para virar a esquerda/direita!");
             return;
        }

        direcao = direcao.toLowerCase();

        if(!direcao.equals("esquerda") && !direcao.equals("direita")){
            System.out.println("Direcao invalida, escreva esquerda ou direita");
            return;
        }

        System.out.println("Virando para: " + direcao);


    }

    public void verificarVelocidade(){
        if(!ligado){
            System.out.println("Carro desligado");
            return;
        }

        System.out.println(velocidade);
    }
    
}
