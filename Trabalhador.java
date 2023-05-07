package pck;

public class Trabalhador {
    private String cpf, nome; 
    private float salario;
    private char sexo;

    public Trabalhador(String cpf, String nome, float salario, char sexo) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Trabalhador{" + "cpf=" + cpf 
                + ", nome=" + nome + ", salário=R$" + salario 
                + ", sexo=" + sexo + '}';
    }
    
}
