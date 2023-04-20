package entidades;

import java.util.ArrayList;

import objetos.Data;

/** 
 * Classe Artigo, utilizada para representar os artigos publicados por pesquisadores registrados no site.
 * Atributos descritos no metodo construtor
 * @author Pera
 * @version 19-04-23
 * 
 */

public class Artigo {
	
	private String titulo; 
	private Data data_publicacao;
	private String titulo_revista;
	ArrayList<Pesquisador> autores = new ArrayList<Pesquisador>(); 	//relaciona a classe pesquisador
	
	/**
	 * Construtor padrao da classe Artigo
	 * @param titulo Titulo do artigo
	 * @param data_publicacao Data de publicacao do artigo
	 * @param titulo_revista Titulo da revista em que o artigo foi veiculado
	 * @param pesquisadores Pesquisadores que participaram da produção do artigo
	 */
	public Artigo(String titulo, Data data_publicacao, String titulo_revista, ArrayList<Pesquisador> pesquisadores){
		this.titulo = titulo;
		this.data_publicacao = data_publicacao;
		this.titulo_revista = titulo_revista;
		this.autores = pesquisadores;
	}
	
	public String getTitulo() {	return titulo;}
	public void setTitulo(String titulo) {this.titulo = titulo;}
	
	public Data getData_publicacao() {return data_publicacao;}
	public void setData_publicacao(Data data_publicacao) {this.data_publicacao = data_publicacao;}
	
	public String getTitulo_revista() {return titulo_revista;}
	public void setTitulo_revista(String titulo_revista) {this.titulo_revista = titulo_revista;}
	
	public ArrayList<Pesquisador> getPesquisadores() {return autores;}
	public void setPesquisadores(ArrayList<Pesquisador> pesquisadores) {this.autores = pesquisadores;}
	
	/**
	 * Metodo para listar (escrever no console) todos os autores (pesquisadores) de um artigo especifico. Nao recebe parametros, pois so precisa saber qual e o artigo em questao, que sera o objeto chamando a funcao.
	 */
	void listarAutores()
    {
    	for(int i=0; i<autores.size(); i++)
    	{
    		System.out.println(autores.get(i));
    	}
    }

}
