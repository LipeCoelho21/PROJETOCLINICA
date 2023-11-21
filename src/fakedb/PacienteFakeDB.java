package fakedb;

import java.time.LocalDate;

import dominio.Paciente;

public class PacienteFakeDB extends BaseGenericaFakeDB<Paciente>
{
    public PacienteFakeDB(){
        super();
    }

    @Override 
    protected void CarregarDados(){
        this.tabela.add(new Paciente(6, "Carla", "teste6@gmail.com", "rg6", "cpf6", LocalDate.of(1973, 9, 27), "Ludiane"));
        this.tabela.add(new Paciente(7, "Rodrigo", "teste7@gmail.com", "rg7", "cpf7", LocalDate.of(1982, 11, 15), "Larissa"));
        this.tabela.add(new Paciente(8, "Jorge", "teste8@gmail.com", "rg8", "cpf8", LocalDate.of(1984, 5, 14), "Melissa"));
        this.tabela.add(new Paciente(9, "Murilo", "teste9@gmail.com", "rg9", "cpf9", LocalDate.of(1987, 3, 8), "Marcela"));
        this.tabela.add(new Paciente(10, "Laura", "teste10@gmail.com", "rg10", "cpf10", LocalDate.of(1999, 1, 16), "Jorgina"));
    }
}
