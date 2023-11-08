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
}
