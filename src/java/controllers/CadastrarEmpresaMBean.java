package controllers;
 
import java.util.ArrayList;
import java.util.List;
 
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
 
import model.Empresa;
 
/**
    * Controller para cadastro das empresas.
    * @author itamir.filho
    *
*/

@ManagedBean
@SessionScoped
public class CadastrarEmpresaMBean {
 
    private Empresa empresa;
     
    private List<Empresa> empresas;
     
    public CadastrarEmpresaMBean() {
        empresa = new Empresa();
        empresas = new ArrayList<Empresa>();
    }
          
    public String cadastrar() {
        empresas.add(empresa);
        empresa = new Empresa();
        FacesMessage msg = new FacesMessage("Empresa cadastrada com sucesso!");
        msg.setSeverity(FacesMessage.SEVERITY_INFO);
        FacesContext.getCurrentInstance().addMessage("", msg);
        return "/form_empresa.xhtml";
    }
     
    public Empresa getEmpresa() {
        return empresa;
    }
     
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
     
    public List<Empresa> getEmpresas() {
        return empresas;
    }
     
    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }

}