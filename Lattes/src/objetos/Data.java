package objetos;

import java.util.Calendar;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public int getDia() {return dia;}
	public void setDia(int dia) {this.dia = dia;}
	
	public int getMes() {return mes;}
	public void setMes(int mes) {this.mes = mes;}
	
	public int getAno() {return ano;}
	public void setAno(int ano) {this.ano = ano;}
	
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data()
	{
		Calendar calendario = Calendar.getInstance(); // design pattern
		this.dia = calendario.get(Calendar.DATE);
		this.mes = calendario.get(Calendar.MONTH) + 1;
		this.ano = calendario.get(Calendar.YEAR);
	}
	
	public Data diferenca(Data fim)
	{
		Data resultado = new Data();
		// 15.3.2020    20.6.2017
		int novo_ano = fim.getAno() - this.ano;
		int novo_mes = fim.getMes() - this.mes;
		int novo_dia = fim.getDia() - this.dia;

		if(fim.getMes()<this.mes)
		{
			novo_ano--;
			novo_mes = 12 + novo_mes;
		}else if(fim.getMes() == this.mes && fim.getDia()<this.dia)
		{
			novo_ano--;
			//precisa checar o mês, mas vou considerar que todos tem 30 dias pra facilitar
			novo_dia = 30 + novo_dia;
		}
		
		resultado.setAno(novo_ano);				
		
		return resultado;
	}
}
