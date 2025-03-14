package cuentas;

	/*
	 * Clase que contiene el metodo main.
	 * @author Héctor Gil Lires
	 * @version 0.1
	 * 
	 */
public class Main {

	/*
	 * Metodo principal.
	 */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        //Creación del objeto cuenta
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        //Consulta del saldo.
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        
        //Llamada al metodo que opera con la cuenta.
        operativa_cuenta(cuenta1);
    }

    /*
     * Método operativa_cuenta que realiza las operaciones de la cuenta.
     * @param cuenta1 objeto cuenta con el que se opera.
     * @param float nuevo parametro no utilizado de momento.
     */
	private static void operativa_cuenta(CCuenta cuenta1) {
		float cantidad;
		try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
