package trabalho_progI;

public class UsaLampada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean est, estado;
		int conta;
		est = false;
		conta = 0;
		
		Lampada lmp = new Lampada(est);
		
		while (conta < 2){
			estado = lmp.alteraEstado(est);
			if (estado == true){		
				System.out.println("Estado da lampada: ligada");
				est = estado;
			} else
				System.out.println("Estado da lampada: desligada");
			est = estado;
			conta++;
		}
	}

}
