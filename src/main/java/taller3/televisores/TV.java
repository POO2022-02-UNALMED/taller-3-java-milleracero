package taller3.televisores;

public class TV {
	private int canal=1;
	private int volumen=1;
	private Marca marca; 
	private int precio=500;
	private boolean estado;
	Control control;
	static int numTV;
	
	public static int getNumTV() {
		return numTV;
	}
	

	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	public TV(Marca marca,boolean estado){
		this.marca=marca;
		this.estado=estado;
	}
	
	public int getCanal(){
		return canal;
		
	}
	public void setCanal(int canal) {
		if (estado!=true || canal>120 || canal<1) {
			return;
		}
		this.canal=canal;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	} 
	public void contador() {
		numTV++;
	}	
	public void turnOn() {
		estado=true; 
	}	
	public void turnOff() {
		estado=false;
	}
	public boolean getEstado() {
		return estado;
	}
	void canalUp(){
		if (estado==true&&canal<120) {
			canal++;
		}
	}
	void canalDown() {
		if(estado==true&&canal>1) {
			canal--;
		}
	}
	void volumenUp(){
		if (estado==true&&canal<7) {
			volumen++;
		}
	}
	void volumenDown() {
		if(estado==true&&volumen>0){
			volumen--;
		}
	}
}
		

