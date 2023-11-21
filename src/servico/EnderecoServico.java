package servico;

import java.util.ArrayList;

import dominio.Endereco;
import repositorio.EnderecoRepositorio;

public class EnderecoServico 
    extends BaseGenericaServico<EnderecoRepositorio, Endereco>{

    public EnderecoServico(){
        this.repo = new EnderecoRepositorio();
    }

    @Override
    public Endereco Inserir(Endereco tupla) {
        return this.repo.Create(tupla);
    }

    @Override
    public Endereco Obter(int codigo) {
        return this.repo.Read(codigo);
    }

    @Override
    public ArrayList<Endereco> Listar() {
        return this.repo.ReadAll();
    }

    @Override
    public Endereco Atualizar(Endereco tupla) {
        return this.repo.Update(tupla);
    }

    @Override
    public Endereco Excluir(int codigo) {
        return this.repo.Delete(codigo);
    }
}