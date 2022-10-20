package piramide;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Class classe = new Class();
		Scanner entrada =  new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		
		System.out.print("Digite o ab: ");
		classe.setAb(entrada.nextFloat());
		System.out.print("Digite o h: ");
		classe.setAltura(entrada.nextFloat());
		System.out.print("Digite o tipo de tinta: ");
		classe.setTipoTinta(entrada.nextInt());
		
		builder.append("\n ab= ");
		builder.append(classe.getAb());
		builder.append("\n h= ");
		builder.append(classe.getAltura());
		builder.append("\n al= ");
		builder.append(classe.aL());
		builder.append("\n area triangulo= ");
		builder.append(classe.areaTriangulo());
		builder.append("\n area base= ");
		builder.append(classe.areaBase());
		builder.append("\n area total= ");
		builder.append(classe.areaTotal());
		builder.append("\n tipo de tinta= ");
		builder.append(classe.getTipoTinta());
		builder.append("\n litros= ");
		builder.append(classe.litros());
		builder.append("\n latas= ");
		builder.append(classe.latas());
		builder.append("\n preco= ");
		builder.append(classe.preco());
		builder.append("\n volume= ");
		builder.append(classe.volume());
		System.out.println(builder);
		entrada.close();

	}
}
