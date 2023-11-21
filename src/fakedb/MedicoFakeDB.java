package fakedb;

import java.time.LocalDate;

import dominio.Medico;

public class MedicoFakeDB extends BaseGenericaFakeDB<Medico>{
    public MedicoFakeDB(){
        super();
    }

    @Override 
    protected void CarregarDados(){
        this.tabela.add(new Medico(1, "João", "teste1@gmail.com", "rg1", "cpf1", LocalDate.of(1986, 7, 15), "matricula01"));
        this.tabela.add(new Medico(2, "Lucas", "teste2@gmail.com", "rg2", "cpf2", LocalDate.of(2001, 9, 13), "matricula02"));
        this.tabela.add(new Medico(3, "Maria", "teste3@gmail.com", "rg3", "cpf3", LocalDate.of(1998, 5, 8), "matricula03"));
        this.tabela.add(new Medico(4, "Jamiro", "teste4@gmail.com", "rg4", "cpf4", LocalDate.of(1995, 6, 28), "matricula04"));
        this.tabela.add(new Medico(5, "Brener", "teste5@gmail.com", "rg5", "cpf5", LocalDate.of(1989, 1, 14), "matricula05"));
    }
}



