package cone;

public class Class {
	
	private int tipoTinta;
	private float raio;
	private float altura;
	
	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getTipoTinta() {
		return tipoTinta;
	}
	
	public void setTipo(int tipoTinta) {
		this.tipoTinta = tipoTinta;
	}

	public double geratriz() {
		return Math.sqrt((raio*raio)+(altura*altura));
	}
	
	public double areaFundo() {
		return Math.pow(raio, 2)*3.14;
	}
	
	public double areaTotal() {
		return 3.14*raio*(raio+geratriz());
	}
	
	public double areaLateral() {
		return areaTotal() - areaFundo();
	}
	
	public double litros() {
		return areaTotal() * 3.45;
	}
	
	public double latas() {
		return Math.ceil(litros()/18); 
	}
	
	public double preço() {
		double preco;
		if(tipoTinta == 1) 
	        preco = latas()*238.90; 
	    else if(tipoTinta == 2) 
	        preco = latas()*467.98;
	    else
	        preco = latas()*758.34;
	    return(preco);
	}
}
