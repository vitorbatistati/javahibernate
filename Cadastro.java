package cadastrodeemail;

import javax.persistence.*;

@Entity


public class Cadastro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column (nullable = false)
    private String Nome;
    @Column (nullable = false)
    private String Email;
    @Column (nullable = false)
    private String Senha;

    public Cadastro() {

    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "Id=" + Id +
                ", Nome='" + Nome + '\'' +
                ", Email='" + Email + '\'' +
                ", Senha='" + Senha + '\'' +
                '}';
    }
}
