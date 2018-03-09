
public class Main {

	public static void main(String[] args, WTTextual dest, String opc, String txt) {
		// TODO Auto-generated method stub

	WTTextual textual = new WTTextual();
	WTTextual textual2 = new WTTextual();
	textual.conectar = textual2.conectar();
	textual.desconectar = textual2.desconectar();
	textual.verStatus();
	textual.enviarMsg(dest, txt);
	
		
	
	}

}
