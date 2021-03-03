package br.com.impacta.models;

public class Produto {

		public int codigo;
		public String descricao;
		public double valor;

    public String montarResumo(){
        return "codigo: " + codigo + ", descricao: " + descricao + ", valor: " + valor;
    }

}