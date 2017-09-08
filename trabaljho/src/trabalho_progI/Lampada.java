package trabalho_progI;

public class Lampada {
	private boolean estado_lampada;
	
	public Lampada(boolean est){
		this.estado_lampada = est;
	}
	
	public boolean alteraEstado(boolean est){
		if (est == true){
			estado_lampada = false;
		} else
			if(est == false)
				estado_lampada = true;
		return estado_lampada;
	}
}
