package aplicacao;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class TesteBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5907758042213539288L;
	public String message = "Hello dsad";//valores java nao atualizam automaticamente
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
