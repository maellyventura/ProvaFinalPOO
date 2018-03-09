public class WTTextual<Mensagem> {
	private static final int nome = 0;
	private String nickname;
	private boolean estaOnline;
	private Mensagem msgAtual;
	public Object conectar;
	public Object desconectar;
	
	public WTTextual (){
		
	}
    public void enviarMsg (WTTextual<?> dest, int opc){
    	if (dest.estaOnline == true){
    		dest.QuickEmoticonMsg(String texto, String remetente);
    	}
    	
    	
    		
    	}
    	
    
    public void enviarMsg(WTTextual<?> dest, String txt ){
    	dest.estaOnline = true;
    }
    public void conectar(){
    	estaOnline = true;
    }
    public void desconectar(){
    	estaOnline = false;
    }
    public String verStatus(){
    	if (estaOnline == true){
    		System.out.println("<nickname> está online :)");
    	}else
    		  System.out.println("<nickname> está offline :(");
		return nickname;
    			
    		
    	}
    	
    
    public boolean estaOnline(){
    	if (estaOnline == true){
    		return true;
    	}else
    			return false;
    			
    }
    @SuppressWarnings({ "hiding", "unused" })
	private <Mensagem> String receberMsg(Mensagem m){
    	String Mensagem = "";
		return  (+nome+ "||||" +Mensagem);
    }
	public Mensagem getMsgAtual() {
		return msgAtual;
	}
	public void setMsgAtual(Mensagem msgAtual) {
		this.msgAtual = msgAtual;
	}

}


