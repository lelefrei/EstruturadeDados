
package exercicio07;


public class Exercicio07 {
   private Pilha p = null;
    
    public static void main(String[] args) {
        new Exercicio07();
    }
    public Exercicio07 () {
        simularLeituraDeDados();
        System.out.println(p.toString());
    }
   

    private void simularLeituraDeDados() {
       p = new Pilha(100);
        p.push(new veiculo("ABC-1234", "Ford", "Fiesta", 2010));
        p.push(new veiculo("DEF-5678", "Chevrolet", "Onix", 2015));
        p.push(new veiculo("GHI-9012", "Volkswagen", "Gol", 2020));
    }
    
}
