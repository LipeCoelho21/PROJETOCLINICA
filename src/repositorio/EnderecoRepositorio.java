package repositorio;

import dominio.Endereco;
import fakedb.EnderecoFakeDB;

public class EnderecoRepositorio extends BaseGenericaRepositorio<EnderecoFakeDB, Endereco>{
    
    public EnderecoRepositorio(){
        this.db = new EnderecoFakeDB();
        this.dataset = this.db.getTabela();
    }
   
    @Override
    public Endereco Create(Endereco instancia) {
        int tamanho = this.dataset.size();
        int posicao = tamanho --;
        int codigo = this.dataset.get(posicao).getCodigo();
        codigo = codigo ++;
        instancia.setCodigo(codigo);
        this.dataset.add(instancia);
        return instancia;

    }

    @Override
    public Endereco Read(int codigo) {
        for (Endereco Endereco : this.dataset) {
            if (Endereco.getCodigo() == codigo) {
                return Endereco;
            }
        }
        return null;
    }

    @Override 
    public Endereco Update(Endereco instancia){
        Endereco alt = this.Read(instancia.getCodigo());
        if (alt == null){
            return null;
        }
        else {
            alt.setLogradouro(instancia.getLogradouro());
            alt.setComplemento(instancia.getComplemento());
            alt.setNumero(instancia.getNumero());
            alt.setCep(instancia.getCep());
            alt.setCaixaPostal(instancia.getCaixaPostal());
            return alt;
        }
    }

    @Override
    public Endereco Delete(int codigo){
        Endereco del = this.Read(codigo);
        if (del == null){
            return null;
        }
        else {
            this.dataset.remove(del);
            return del;
        }
    }
}

    
