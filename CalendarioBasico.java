
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private DisplayDosDigitos dia;
    private DisplayDosDigitos mes;
    private DisplayDosDigitos anio;
    
    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
		dia = new DisplayDosDigitos(31);
		mes = new DisplayDosDigitos(13);
		anio = new DisplayDosDigitos(100);
	}
	
	public void fijarFecha(int nuevoDia, int nuevoMes, int nuevoAnio)
	{
		dia.setValor(nuevoDia);
		mes.setValor(nuevoMes);
		anio.setValor(nuevoAnio);	
	}
	
	public void avanzarFecha() 
	{
		dia.incrementaValor();
		if(dia.getValor() == 1){
			//Si estamos aqui es que hay que hacer avanzar al mes
			mes.incrementaValor();
			if(mes.getValor() == 1){
				//Si estamos aqui es que hay que hacer avanzar el año
				anio.incrementaValor();
			}
		}
	}
	
	public String mostrarFecha() {
		return dia.getValorDelDisplay() + "/" + mes.getValorDelDisplay() + "/" + anio.getValorDelDisplay();
	}

}
