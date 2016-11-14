
/**
 * Write a description of class DisplayHoraYFecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayHoraYFecha
{
    // instance variables - replace the example below with your own
    private String momentoTemporal;
    private ClockDisplay hora;
    private CalendarioBasico fecha;

    /**
     * Constructor for objects of class DisplayHoraYFecha
     */
    public DisplayHoraYFecha()
    {
        // initialise instance variables
        hora = new ClockDisplay();
        fecha = new CalendarioBasico();
    }

    public String getMomento()
    {
        momentoTemporal = hora.getTime() + " " + fecha.mostrarFecha();
        return momentoTemporal;
    }
    
    public void avanzarMomento()
    {
        hora.timeTick();
        hora.updateDisplay();
        if (hora.getTime() == "00:00"){
            fecha.avanzarFecha();
        }
    }
    
    public void setMomento(int horaNueva, int minutoNuevo, int diaNuevo, int mesNuevo, int anioNuevo)
    {
        hora.setTime(horaNueva, minutoNuevo);
        hora.updateDisplay();
        fecha.fijarFecha(diaNuevo, mesNuevo, anioNuevo);
    }
    
}
