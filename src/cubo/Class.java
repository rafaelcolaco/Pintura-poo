package cubo;

public class Class {

	private float lado;
	private float rendimento;
	private int tipo;
	
	public Class(float lado, float rendimento, int tipo) {
		this.lado = lado;
		this.rendimento = rendimento;
		this.tipo = tipo;
	}
	
	public float getLado() {
		return lado;
	}
	
	public float getRendimento() {
		return rendimento;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public double areaBase() {
		return lado*lado; 
	}
	
	public double areaTotal() {
		return areaBase()*6;
	}
	
	public double volume() {
		return Math.pow(lado, 3);
	}
	
	public double diagonalCubo() {
		return lado *Math.sqrt(3);
	}
	
	public double litrosTinta() {
		return areaTotal()/ rendimento;
	}
	
	public double latas() {
		return Math.ceil (litrosTinta()/18);
	}
	
	public double valorTotal() {
		double preco;
		if(tipo == 1) 
	        preco = latas()*101.90; 
	    else if(tipo == 2) 
	        preco = latas()*212.45;
	    else
	        preco = latas()*345.56;
	    return(preco);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" a=");
		builder.append(getLado());
		builder.append("\n rendimento=");
		builder.append(getRendimento());
		builder.append("\n tipo de tinta=");
		builder.append(getTipo());
		builder.append("\n area da base=");
		builder.append(areaBase());
		builder.append("\n area total=");
		builder.append(areaTotal());
		builder.append("\n volume=");
		builder.append(volume());
		builder.append("\n diagonal do cubo=");
		builder.append(diagonalCubo());
		builder.append("\n litros de tinta=");
		builder.append(litrosTinta());
		builder.append("\n latas de tinta=");
		builder.append(latas());
		builder.append("\n valor total=");
		builder.append(valorTotal());
		return builder.toString();
	}
}
