package aplicacao.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import aplicacao.model.Usuario;

@ManagedBean(name = "usuarioBean")
@ViewScoped
public class UsuarioBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8088588682383250479L;

	private static final List<Usuario> dados = new ArrayList<Usuario>();

	private Usuario user;

	public UsuarioBean() {
		user = new Usuario();
		System.out.println("!");
	}

	public void inserir() {
		dados.add(user);
		user = new Usuario();
	}

	public void deletar(Usuario user) {
		dados.remove(user);
	}

	public List<Usuario> getUsers() {
		return dados;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}
}
