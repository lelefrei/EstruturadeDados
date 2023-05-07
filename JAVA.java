public class JAVA {
    public static void main(String[] args) {
        String paisesA[] = {"Ucrânia", "Turquia", "Suíça", "México", "França", "Espanha",
                "Chile", "Brasil", "Argentina"};
        String paisesB[] = {"Argentina", "Brasil", "Chile", "Dinamarca", "Espanha", "França",
                "Inglaterra", "Turquia", "Uruguai"};
        String paisesC[] = {"Canadá", "Áustria", "Chile", "Itália", "Portugal", "Grécia",
                "Angola", "Moçambique", "Rússia"};


        int indicePais = buscaSequencial(paisesA, "Brasil");
        System.out.println("O Brasil se encontra na posição: " + indicePais);

        indicePais = buscaSequencial(paisesB, "Inglaterra");
        System.out.println("A Inglaterra se encontra na posição: " + indicePais);

        indicePais = buscaSequencial(paisesC, "Rússia");
        System.out.println("A Rússia se encontra na posição: " + indicePais);


    }

    public static int buscaSequencial(String[] vet, String buscado) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i].equals(buscado)) {
                return i; // retorna o índice do elemento encontrado
            }
        }
        return 0; // retorna -1 se o elemento não foi encontrado


    }


}

