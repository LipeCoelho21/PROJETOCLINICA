package servico;

import java.util.ArrayList;

import dominio.Medico;
import repositorio.MedicoRepositorio;

public class MedicoServico 
    extends BaseGenericaServico<MedicoRepositorio, Medico>{

    public MedicoServico(){
        this.repo = new MedicoRepositorio();
    }

    @Override
    public Medico Inserir(Medico tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public Medico Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Medico> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Medico Atualizar(Medico tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Medico Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }
}