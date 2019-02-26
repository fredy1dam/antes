package modelo;

/** Esta clase permite definir unos metodos basicos  de una persona como calcular el IMC, si tiene Sobre peso,etc
 * @author Fredy
 *
 */
public class Persona {

	/**
	 * nombre atributo de la clase persona que almacena el nombre
	 */
	String nombre;

	/**
	 * edad atributo de la clase persona que almacena la edad 
	 */
	int edad;

	/**
	 * sexo atributo de la clase persona que almacena el sexo de la persona 
	 */
	char sexo;

	/**
	 * origen atributo de la clase persona que almacena el origen 
	 */
	char origen;


	/**
	 * peso atributo de la clase persona que almacena el peso 
	 */
	float peso;

	/**
	 * altura atributo de la clase persona que almacena la altura 
	 *
	 */
	int altura;


	/**
	 * pareja atributo de la clase persona y ademas es un objeto de la clase persona
	 */
	Persona pareja;


	/**
	 * Persona es un constructor vacio de la clase persona
	 */
	public Persona() {

	}

	/** Es un constructor  de la clase persona que recive todos los atributos de la clase persona
	 * @param nombre Nombre
	 * @param edad	Edad
	 * @param sexo	Sexo
	 * @param origen	Origen
	 * @param pareja	Pareja
	 * @param peso	Peso
	 * @param altura	Altura
	 */
	public Persona(String nombre, int edad, char sexo, char origen, Persona pareja, float peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.origen = origen;
		this.pareja = pareja;
		this.peso = peso;
		this.altura = altura;		
	}



	/**Es una funcion para obtener el nombre
	 * @return Retorna el nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**Es un metodo que recive un nombre e inserta el nombre
	 * @param nombre Hace referencia al atributo nombre de la clase Persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**Es una funcion para obtener la edad
	 * @return retorna la edad
	 */
	public int getEdad() {
		return edad;
	}


	/**Es un metodo que recive la edad e inserta la edad
	 * @param edad Hace referencia al atributo edad de la clase Persona
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	/** Es una funcion  para obtener el sexo
	 * @return retorna el sexo
	 */
	public char getSexo() {
		return sexo;
	}


	/**Es un metodo que recive el sexo e inserta la sexo 
	 * @param sexo Hace referencia al atributo sexo de la clase Persona
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}



	/** Es una funcion para obtener el origen 
	 * @return retorna el origen
	 */
	public char getOrigen() {
		return origen;
	}



	/**Es un metodo que recive el sexo e inserta la sexo 
	 * @param origen Hace referencia al atributo origen de la clase Persona
	 */
	public void setOrigen(char origen) {
		this.origen = origen;
	}


	/**Es una funcion para obtener pareja
	 * @return retorna la pareja
	 */
	public Persona getPareja() {
		return pareja;
	}


	/**Es un metodo que recive pareja e inserta pareja 
	 * @param pareja Hace referencia al atributo pareja de la clase Persona
	 */
	public void setPareja(Persona pareja) {
		this.pareja = pareja;
	}


	/** Es una funcion para obtener el peso 
	 * @return retorna el peso (float)
	 */
	public float getPeso() {
		return peso;
	}


	/**Es un metodo que recive el peso e inserta el peso
	 * @param peso Hace referencia al atributo peso de la clase Persona
	 */
	public void setPeso(float peso) {
		this.peso = peso;
	}


	/** Es una funcion que permite  obtener la altura
	 * @return retorna la altura(int)
	 */
	public int getAltura() {
		return altura;
	}


	/**Es un metodo que recive la altura e inserta la altura
	 * @param altura Hace referencia al atributo altura de la clase Persona
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}


	/** Es una funcion para calcular a la persona mas joven
	 * @param p es  un objeto de la clase persona que es enviado como parametro para calcular
	 * @return retorna un boolean si es menor o no
	 */
	public boolean esMasJovenQue(Persona p) {
		if(edad < p.getEdad())
			return true;
		else return false;
	}


	/** Es una funcion que permite calcular quien es mas joven con la pareja
	 * @return retorna un boolean si es menor o no
	 */
	public boolean esMasJovenQueSuPareja() {
		if(edad < pareja.getEdad())
			return true;
		else return false;
	}


	/**Es una funcion para obtener el origen
	 * @return retorna el origen completo (String)
	 */
	public String getOrigenFormatoLargo() {
		String origenLargo = new String();
		switch (origen){
		case 'N': origenLargo = "norte"; break;
		case 'S': origenLargo = "sur"; break;
		case 'E': origenLargo = "este"; break;
		case 'O': origenLargo = "oeste"; break;
		}
		return origenLargo;		
	}



	/**
	 * Es un metodo que muestra el nombre,edad y el sexo
	 */
	public void mostrarDatos(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " +  edad);
		if (sexo == 'M')
			System.out.println("Sexo: hombre");
		else
			System.out.println("Sexo: mujer");
	}



	/**Es una funcion que nos permite calcular el IMC
	 * @return retorna el peso
	 */
	public float calcularIMC(){
		float alturaMetros = altura / 100;
		return peso/((alturaMetros*alturaMetros));
	}



	/** Es una funcion que sirve para calcular si tiene el sobrepeso
	 * @return retorna un boolean si tiene sobre peso
	 */
	public boolean tieneSobrepeso(){
		float imc = calcularIMC();
		if(imc > 25)
			return true;
		else 
			return false;
	}	

}