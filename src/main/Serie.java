package main;

public class Serie {

    private String nome;
    private String plataforma;
    private double nota;

    public Serie(String nome, String plataforma) {
        this.nome = nome;
        this.plataforma = plataforma;
        this.nota = 0.0;
    }

    public Serie(String nome) {
        this.nome = nome;
        this.plataforma = "plataforma indefinida";
        this.nota = 0.0;
    }

    @Override
    public String toString() {
        return "Series{" +
                "nome='" + nome + '\'' +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getNota() {
        return nota;
    }

    public boolean setNota(double nota) {
        if (nota >= 0 && nota <= 10) {

            this.nota = nota;
            return true;

        } else {

            return false;
        }


    }

}
