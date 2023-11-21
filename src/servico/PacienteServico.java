package servico;

import java.util.ArrayList;

import dominio.Paciente;
import repositorio.PacienteRepositorio;

public class PacienteServico 
    extends BaseGenericaServico<PacienteRepositorio, Paciente>{

    public PacienteServico(){
        this.repo = new PacienteRepositorio();
    }

    @Override
    public Paciente Inserir(Paciente tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public Paciente Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Paciente> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Paciente Atualizar(Paciente tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Paciente Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }
}