package dominio;

import java.time.LocalDate;

public class Paciente extends BasePessoa {
    
    private String nomeMae;

    public Paciente(int codigo, String nome, String email, String rg, String cpf, LocalDate dataNascimento,
            String nomeMae) {
        super(codigo, nome, email, rg, cpf, dataNascimento);
        this.nomeMae = nomeMae;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
   
    @Override
    public String toString() {
        String msg = "";
        msg += "BaseIdentificador [codigo=" + codigo + "]\n";
        msg += "BasePessoa [nome=" + nome + ", email=" + email + ", rg=" + rg + ", cpf=" + cpf + ", dataNascimento="
                + dataNascimento + ", profissão=" + profissão + ", escolaridade=" + escolaridade + ", enderecos="
                + enderecos + "]\n";
        msg += "Paciente [nomeMae=" + nomeMae + "]\n";
        return msg;
    }  
}
