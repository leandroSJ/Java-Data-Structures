package main.com.leandroSJ;

class Automovel {
    String cor;
    String marca;
    String nome;

    void liga (){
        System.out.println("O automóvel está ligado");
    }

    void desliga (){
        System.out.println("O automóvel está desligado");
    }

    void neutro(){
        System.out.println("o automóvel está no neutro");
    }

    void tiraTrava(){
        System.out.println("Trava removida");
    }

    void embreagem(){
        System.out.println("Pisou na embreagem");
    }

    void trocar_marcha(){
        System.out.println("Trocou de marcha");
    }

    void acelerar(){
        System.out.println("Acelerando...");
    }
}

class Projeto {
    public static void main(String [] args){
        Automovel fusca;
        fusca = new Automovel();

        fusca.cor = "Branco";
        fusca.marca = "Volkswagen";
        fusca.nome = "Fusca";

        System.out.println("Seu carro é o: " + fusca.nome);
        System.out.println("A cor dele é: " + fusca.cor);
        System.out.println("A marca dele é: " + fusca.marca);
        System.out.print("Status: " );
        fusca.neutro();
        fusca.liga();
        fusca.embreagem();
        fusca.trocar_marcha();
        fusca.tiraTrava();
        fusca.acelerar();
    }
}