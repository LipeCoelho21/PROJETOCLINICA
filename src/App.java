import dominio.Medico;
import dominio.Paciente;
import dominio.Responsavel;
import dominio.Endereco;
import dominio.Escolaridade;

import servico.MedicoServico;
import servico.PacienteServico;
import servico.ResponsavelServico;
import servico.EnderecoServico;
import servico.EscolaridadeServico;

public class App {
    public static void main(String[] args) throws Exception {
        MedicoServico serv = new MedicoServico();
        for (Medico med : serv.Listar()) {
            System.out.println(med.toString());
        }
        PacienteServico serv1 = new PacienteServico();
        for (Paciente pac : serv1.Listar()) {
            System.out.println(pac.toString());            
        }
        ResponsavelServico serv2 = new ResponsavelServico();
        for (Responsavel res : serv2.Listar()) {
            System.out.println(res.toString());            
        }
        EnderecoServico serv3 = new EnderecoServico();
        for (Endereco end : serv3.Listar()) {
            System.out.println(end.toString());            
        }
        EscolaridadeServico serv4 = new EscolaridadeServico();
        for (Escolaridade esc : serv4.Listar()) {
            System.out.println(esc.toString());            
        }
    }
}

