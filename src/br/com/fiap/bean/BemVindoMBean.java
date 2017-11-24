package br.com.fiap.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped // Escopo de sess�o
public class BemVindoMBean {
		private String boasVindas = "Seja bem vindo !!";

		public String getBoasVindas() {
			return boasVindas;
		}

		public void setBoasVindas(String boasVindas) {
			this.boasVindas = boasVindas;
		}
	
}
