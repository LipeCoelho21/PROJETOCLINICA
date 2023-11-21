package repositorio;

import dominio.Responsavel;
import fakedb.ResponsavelFakeDB;

public class ResponsavelRepositorio extends BaseGenericaRepositorio<ResponsavelFakeDB, Responsavel>{
    
    
    public ResponsavelRepositorio(){
        this.db = new ResponsavelFakeDB();
        this.dataset = this.db.getTabela();
    }
   
    @Override
    public Responsavel Create(Responsavel instancia) {
        int tamanho = this.dataset.size();
        int posicao = tamanho --;
        int codigo = this.dataset.get(posicao).getCodigo();
        codigo = codigo ++;
        instancia.setCodigo(codigo);
        this.dataset.add(instancia);
        return instancia;

    }

    @Override
    public Responsavel Read(int codigo) {
        for (Responsavel Responsavel : this.dataset) {
            if (Responsavel.getCodigo() == codigo) {
                return Responsavel;
            }
        }
        return null;
    }

    @Override 
    public Responsavel Update(Responsavel instancia){
        Responsavel alt = this.Read(instancia.getCodigo());
        if (alt == null){
            return null;
        }
        else {
            alt.setCpf(instancia.getCpf());
            alt.setRg(instancia.getRg());
            alt.setDataNascimento(instancia.getDataNascimento());
            alt.setEmail(instancia.getEmail());
            alt.setRelacionamento(instancia.getRelacionamento());
            alt.setNome(instancia.getNome());
            return alt;
        }
    }

    @Override
    public Responsavel Delete(int codigo){
        Responsavel del = this.Read(codigo);
        if (del == null){
            return null;
        }
        else {
            this.dataset.remove(del);
            return del;
        }
    }
}

    
