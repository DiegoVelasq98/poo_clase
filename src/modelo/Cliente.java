
package modelo;


public class Cliente extends Persona {
    
    public Cliente (){};
    private String nit;

    public Cliente(String nombres, String apellidos, String direccion, String telefono, String Fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, Fecha_nacimiento);
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    
    @Override
    protected String[] agregar(){
        String datos [] = new String [6];
        
    datos[0] = getNit();
                      datos[1] = getNombres();
                      datos[2] = getApellidos();
                      datos[3] = getDireccion();
                      datos[4] = getTelefono();
                      datos[5] = getFecha_nacimiento();
                     
    
   return datos;
    

    
}

    

}
