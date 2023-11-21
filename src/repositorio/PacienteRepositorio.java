package repositorio;

import dominio.Paciente;
import fakedb.PacienteFakeDB;

public class PacienteRepositorio extends BaseGenericaRepositorio<PacienteFakeDB, Paciente>{
    
    
    public PacienteRepositorio(){
        this.db = new PacienteFakeDB();
        this.dataset = this.db.getTabela();
    }
   
    @Override
    public Paciente Create(Paciente instancia) {
        int tamanho = this.dataset.size();
        int posicao = tamanho --;
        int codigo = this.dataset.get(posicao).getCodigo();
        codigo = codigo ++;
        instancia.setCodigo(codigo);
        this.dataset.add(instancia);
        return instancia;

    }

    @Override
    public Paciente Read(int codigo) {
        for (Paciente Paciente : this.dataset) {
            if (Paciente.getCodigo() == codigo) {
                return Paciente;
            }
        }
        return null;
    }

    @Override 
    public Paciente Update(Paciente instancia){
        Paciente alt = this.Read(instancia.getCodigo());
        if (alt == null){
            return null;
        }
        else {
            alt.setCpf(instancia.getCpf());
            alt.setRg(instancia.getRg());
            alt.setDataNascimento(instancia.getDataNascimento());
            alt.setEmail(instancia.getEmail());
            alt.setNomeMae(instancia.getNomeMae());
            alt.setNome(instancia.getNome());
            return alt;
        }
    }

    @Override
    public Paciente Delete(int codigo){
        Paciente del = this.Read(codigo);
        if (del == null){
            return null;
        }
        else {
            this.dataset.remove(del);
            return del;
        }
    }
}

    
