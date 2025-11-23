package banhoPetshop;

public class Maquina {
    // Capacidade máxima de recursos
    private final int MAX_AGUA = 30;
    private final int MAX_SHAMPOO = 10;

    private int agua;
    private int shampoo;
    private int pet;
    private boolean deuBanho;

    public Maquina(){
        // A máquina começa com os tanques cheios
        this.agua = MAX_AGUA;
        this.shampoo = MAX_SHAMPOO;
        this.pet = 0;
        this.deuBanho = false;
    }

    // Cada banho consome 10L de água e 2L de shampoo
    public void darBanho(){
        // Regra: Apenas 1 pet por vez. Primeiro, verifica se há um pet.
        if(pet == 0){
            System.out.println("Nao ha pet na maquina para dar banho!");
            return;
        }
        // Verifica se o pet atual já tomou banho
        if(deuBanho){
            System.out.println("Este pet ja tomou banho!");
            return;
        }
        // Regra: Verifica se há recursos suficientes para o banho
        if(agua < 10){
            System.out.println("Agua insuficiente. Por favor, abasteca.");
            return;
        }
        if(shampoo < 2){
            System.out.println("Shampoo insuficiente. Por favor, abasteca.");
            return;
        }

        // Se todas as verificações passaram, o banho ocorre
        System.out.println("Dando banho no pet...");
        this.agua -= 10;
        this.shampoo -= 2;
        deuBanho = true;
        System.out.println("Banho concluido");
    }
    
    // Regra: O abastecimento adiciona 2 litros por vez
    public void abastecerShampoo(){
        if(shampoo >= MAX_SHAMPOO){
            System.out.println("Tanque de shampoo ja esta cheio!");
            return;
        }

        shampoo += 2;
        // Garante que o shampoo não ultrapasse a capacidade máxima
        if (shampoo > MAX_SHAMPOO) {
            shampoo = MAX_SHAMPOO;
        }
        System.out.println("Shampoo abastecido. Nivel atual: " + shampoo + "L");
    }
    
    // Regra: O abastecimento adiciona 2 litros por vez
    public void abastecerAgua(){
         if(agua >= MAX_AGUA){
            System.out.println("Tanque de agua ja esta cheio!");
            return;
        }
        agua += 2;
        // Garante que a água não ultrapasse a capacidade máxima
        if (agua > MAX_AGUA) {
            agua = MAX_AGUA;
        }
        System.out.println("Agua abastecida. Nivel atual: " + agua + "L");
    }

    public void verificarShampoo(){
        System.out.println("Nivel de shampoo: " + shampoo + "L");
    }

    public void verificarAgua(){
        System.out.println("Nivel de agua: " + agua + "L");
    }

    public void verificarTemPet(){
        if(pet == 0){
            System.out.println("Maquina sem Pet");
        } else {
            System.out.println("Tem um pet na maquina.");
        }
    }

    public void colocarPet(){
        // Regra: Apenas 1 pet por vez
        if(pet == 1){
            System.out.println("Ja existe um pet na maquina!");
            return;
        }
        pet = 1;
        System.out.println("Pet colocado!");
    }
    
    public void retirarPet(){
        if (pet == 0) {
            System.out.println("Nao ha pet para retirar.");
            return;
        }
        
        // Regra: Se o pet for retirado sem banho, a máquina precisa ser limpa.
        if(!deuBanho && pet == 1){
            System.out.println("O pet foi retirado sem tomar banho. A maquina precisa ser limpa.");
            limparMaquina();
        }

        pet = 0;
        deuBanho = false; // Prepara a máquina para o próximo pet
        System.out.println("Retirado pet!");
    }

    // Regra: A limpeza consome 3L de água e 1L de shampoo
    public void limparMaquina(){
        System.out.println("Iniciando limpeza da maquina...");
        if(agua < 3){
            System.out.println("Nao ha agua suficiente para limpar a maquina.");
            return;
        }
        if(shampoo < 1){
            System.out.println("Nao ha shampoo suficiente para limpar a maquina.");
            return;
        }
        
        agua -= 3;
        shampoo -= 1;
        System.out.println("Limpeza concluida!");
    }
}
