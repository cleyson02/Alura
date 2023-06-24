public class testaCondicional2 {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 21;
        boolean acompanhado = true;
        if (idade >= 18 && acompanhado) {
            System.out.println("seja bem vindo");
        }
        else {
            System.out.println("infelizmente você não pode entrar");
        }
    }
}

// || quer dizer "ou"
// && quer dizer "e"
// variável do tipo boolean aceita apenas true ou false ou expressões booleanas