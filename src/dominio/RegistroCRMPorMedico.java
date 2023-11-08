package dominio;

public class RegistroCRMPorMedico extends BaseIdentificador {
    
    private String codigoMedico;
    
    private String codigoRegistroCRM;

    public RegistroCRMPorMedico(int codigo, String codigoMedico, String codigoRegistroCRM) {
        super(codigo);
        this.codigoMedico = codigoMedico;
        this.codigoRegistroCRM = codigoRegistroCRM;
    }

    public String getCodigoMedico() {
        return codigoMedico;
    }

    public void setCodigoMedico(String codigoMedico) {
        this.codigoMedico = codigoMedico;
    }

    public String getCodigoRegistroCRM() {
        return codigoRegistroCRM;
    }

    public void setCodigoRegistroCRM(String codigoRegistroCRM) {
        this.codigoRegistroCRM = codigoRegistroCRM;
    }

    
}
