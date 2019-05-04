package br.com.abc.javacore.Eblocodeinicializacao.classes;
public class Cliente {
    // 1 - Alocado espaco na memoria para o objeto que será criado
    // 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3 - Bloco de inicializacao é executado
    // 4 - O construtor é executado
    private int[] parcelas;
    // Boas praticas dizem que o bloco de inicializa��o deve ser iniciado antes do construtor.
    {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicializacao");
        for(int i=1; i<=100;i++){
            parcelas[i-1] = i;
        }
    }
    public Cliente(){
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
