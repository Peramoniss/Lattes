package entidades;
import java.util.ArrayList;

import objetos.Endereco;

public class Universidade {
    private String nome;
    private Endereco endereco;
    private ArrayList<Pesquisador> pesquisadores = new ArrayList<Pesquisador>();    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Pesquisador> getPesquisadores() {
        return pesquisadores;
    }

    public void setPesquisadores(ArrayList<Pesquisador> pesquisadores) {
        this.pesquisadores = pesquisadores;
    }

    /**
	 * Método que escreve no console os pesquisadores que a universidade que chamou o método possui. É diferente de getPesquisadores(), visto que um escreve os pesquisadores na tela e não possui valor de retorno, e o outro retorna o atributo "pesquisadores" do objeto que o chama
	*/
    void listarPesquisadores()
    {
    	for(int i=0; i<pesquisadores.size(); i++)
    	{
    		System.out.println(pesquisadores.get(i));
    	}
    }
    
    
}
