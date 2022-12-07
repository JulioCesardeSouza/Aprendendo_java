package Aula13.enuns;


	

public enum DiasDaSemana2 {
	
    DOMINGO(1,"Domingo"),
    SEGUNDA_FEIRA(2,"Segunda"),
    TERCA_FEIRA(3,"Terca"),
    QUARTA_FEIRA(4,"Quarta"),
    QUINTA_FEIRA(5,"Quinta"),
    SEXTA_FEIRA(6,"Sexta"),
    SABADO(7,"Sabado");

    private final int numeroDia;
    private final String diaPorExtenso;

    DiasDaSemana2(int valorOpcao, String valorDia){
        numeroDia = valorOpcao;
        diaPorExtenso = valorDia;
    }
    public int getNumeroDia(){
        return numeroDia;
    }
    public String getDiaPorExtenso(){
        return diaPorExtenso;
    }    

    public static String fromString(String text) {
        for (DiasDaSemana2 b : DiasDaSemana2.values()) {
            if (b.diaPorExtenso.equalsIgnoreCase(text)) {
                return b.diaPorExtenso;
            }
        }
        return null;
    }


}
