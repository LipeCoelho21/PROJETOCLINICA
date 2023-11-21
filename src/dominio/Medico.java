package dominio;

import java.time.LocalDate;

public class Medico extends BasePessoa {
    
    private String matricula;
    
    public Medico(int codigo, String nome, String email, String rg, String cpf, LocalDate dataNascimento,
            String matricula) {
        super(codigo, nome, email, rg, cpf, dataNascimento);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        String msg = "";
        msg += "BaseIdentificador [codigo=" + codigo + "]\n";
        msg += "BasePessoa [nome=" + nome + ", email=" + email + ", rg=" + rg + ", cpf=" + cpf + ", dataNascimento="
                + dataNascimento + ", profissão=" + profissão + ", escolaridade=" + escolaridade + ", enderecos="
                + enderecos + "]\n";
        msg += "Medico [matricula=" + matricula + "]\n";
        return msg;
    }
}

