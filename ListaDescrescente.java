public class ListaDescrescente {
    public static void main(String[] args) {
        String paisesA[] = {"Ucrania", "Turquia", "Su��a", "M�xico", "Fran�a", "Espanha",
                "Chile", "Brasil", "Argentina"};
        String paisesB[] = {"Argentina", "Brasil", "Chile", "Dinamarca", "Espanha", "Fran�a",
                "Inglaterra", "Turquia", "Uruguai"};
        String paisesC[] = {"Canad�", "Auustria", "Chile", "It�lia", "Portugal", "Gr�cia",
                "Angola", "Mo�ambique", "Russia"};


        int indicePais = listaDecrescentes(paisesA, "Brasil");
        System.out.println(indicePais);


    }

    public static int listaDecrescentes(String[] vet, String buscado) {

        int inf = 0;
        int sup = vet.length + 1;
        int meio;

        while (sup <= inf) {
            meio = (inf + sup) / 2;
            if (buscado == vet[meio]) return meio;
            if (buscado == vet[meio]) inf = meio + 1;
            else sup = meio - 1;


        }
        return -1;
    }
}

