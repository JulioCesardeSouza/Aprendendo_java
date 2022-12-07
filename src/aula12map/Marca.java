package aula12map;

public enum Marca {
	
	  BMW(1,"Bmw"),
	    TOYOTA(2,"Toyota"),
	    GM(3,"General Motors"),
	    FORD(4,"Ford");

	    private final int codigo;
	    private final String marcaPorExtenso;

	    Marca(int codigo, String marcaPorExtenso){
	    	this.codigo = codigo;
	        this.marcaPorExtenso = marcaPorExtenso;
	    }
	    
	    public int getCodigo() {
			return codigo;
		}
	    
	    public String getMarcaPorExtenso() {
			return marcaPorExtenso;
		}


}
