package matheus;

public class AdapterData extends Datas {
	public AdapterData(int ano,int mes , int dia ) {
		super(dia,mes,ano);
	}
	
	
	public void setMesAno(int mes,int ano) {
		super.setAno(ano);
		super.setMes(mes);
	}
	
	public void setDiaMesAno(int dia,int mes , int ano) {
		super.setAno(ano);
		super.setMes(mes);
		super.setDia(dia);
	}
	public void setDiaMes(int dia,int mes) {
		super.setMes( mes);
		super.setDia(dia);
		
	}
	public void setDiaAno(int dia,int ano) {
		super.setAno(ano);
		super.setDia(dia);
	}
}
