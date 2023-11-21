package fakedb;

import java.time.LocalDate;

import dominio.Responsavel;

public class ResponsavelFakeDB extends BaseGenericaFakeDB<Responsavel>
{
    public ResponsavelFakeDB(){
        super();
    }

    @Override 
    protected void CarregarDados(){
        this.tabela.add(new Responsavel(11, "Josefa", "teste11@gmail.com", "rg11", "cpf11", LocalDate.of(1971, 4, 5), "relacionamento1"));
        this.tabela.add(new Responsavel(12, "Roberson", "teste12@gmail.com", "rg12", "cpf12", LocalDate.of(1969, 10, 8), "relacionamento2"));
        this.tabela.add(new Responsavel(13, "Laureane", "teste13@gmail.com", "rg13", "cpf13", LocalDate.of(1983, 8, 17), "relacionamento3"));
        this.tabela.add(new Responsavel(14, "Mariana", "teste14@gmail.com", "rg14", "cpf14", LocalDate.of(1979, 7, 2), "relacionamento4"));
        this.tabela.add(new Responsavel(15, "Marcia", "teste15@gmail.com", "rg15", "cpf15", LocalDate.of(1981, 10, 3), "relacionamento5"));
    }
}
