public class Oggetto {
    private String nome;
    private String peso;

    public Oggetto(String nome, String peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Oggetto{" +
                "nome='" + nome + '\'' +
                ", peso='" + peso + '\'' +
                '}';
    }


}
