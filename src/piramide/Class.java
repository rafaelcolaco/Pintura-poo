package piramide;

public class Class {

	private int tipoTinta;
	private float ab;
	private float altura;
	
	public int getTipoTinta() {
		return tipoTinta;
	}
	
	public void setTipoTinta(int tipoTinta) {
		this.tipoTinta = tipoTinta;
	}
	
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getAb() {
		return ab;
	}

	public void setAb(float raio) {
		this.ab = raio;
	}
	
	public double aL() {
		return Math.sqrt((ab*ab)+(altura*altura));
	}
	
	public double cd() {
		return ab*2;
	}
	
	public double areaTriangulo() {
		return (cd()*aL())/2;
	}
	
	public double areaBase() {
		return Math.pow(cd(), 2);
	}
	
	public double areaTotal() {
		return areaTriangulo()*4 + areaBase();
	}
	
	public double litros() {
		return areaTotal()/4.76;
	}
	
	public double latas() {
		return Math.ceil(litros()/18); 
	}
	
	public double preco() {
		double preco;
		if(tipoTinta == 1) 
	        preco = latas()*127.90; 
	    else if(tipoTinta == 2) 
	        preco = latas()*258.98;
	    else
	        preco = latas()*344.34;
	    return(preco);
	}
	
	public double volume() {
		return (areaBase()*altura )/3;
	}
}
