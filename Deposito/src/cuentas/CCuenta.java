package cuentas;

/*
 * Clase la cual gestiona un objeto cuenta la cual cuenta con diferentes atributos y métodos.
 * 
 */
public class CCuenta {

	/*
	 * Atributos de la clase cuenta.
	 * @param nombre, El nombre del titular de la cuenta.
	 * @param cuenta, El numero de cuenta.
	 * @param saldo, El saldo disponible que tiene la cuenta.
	 * @param tipoInteres, El interes que se le aplica a la cuenta.
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
    
    /*
     * Constructor del objeto cuenta.
     * @param nom, parametro String que se pide al crear cuenta, es el nombre del propietario de la cuenta.
     * @param cue, parametro String que se pide al crear cuenta, es el numero de la cuenta.
     * @param sal, parametro double que se pide al crear cuenta, es el saldo inicial que se da a la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        this.nombre =nom;
        this.cuenta=cue;
        this.saldo=sal;
    }
    
    
    // Getters y Setters de todas las variables.
    public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getTipoInterés() {
		return tipoInterés;
	}
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	
	/*
	 * Método que devuelve un double que es la cantidad de dinero disponible en la cuenta.
	 * @param estado
	 * @return saldo
	 */
	public double estado()
    {
        return saldo;
    }

	/*
	 * Metodo para ingresar dinero en la cuenta.
	 * @param cantidad, cantidad de dinero que se desea ingresar en la cuenta.
	 * @throws Exception, si la cantidad de dinero es negativa.
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        this.saldo = this.saldo + cantidad;
    }

    /*
     * Método para retirar dinero de la cuenta.
     * @param cantidad, cantidad de dinero que se quiere retirar.
     * @throws Exception, puede haber dos excepciones, si la cantidad a retirar es negativa o si el saldo es inferior a la cantidad que 
     * se quiere retirar.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        this.saldo = this.saldo - cantidad;
    }
}
