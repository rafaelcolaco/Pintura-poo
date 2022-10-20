package cone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Class classe = new Class();
		Scanner entrada =  new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		
		System.out.print("Digite o raio: ");
		classe.setRaio(entrada.nextFloat());
		System.out.print("Digite a altura: ");
		classe.setAltura(entrada.nextFloat());
		System.out.print("Digite o tipo da tinta: ");
		classe.setTipo(entrada.nextInt());
		
		builder.append("\n raio= ");
		builder.append(classe.getRaio());
		builder.append("\n altura= ");
		builder.append(classe.getAltura());
		builder.append("\n nivel= ");
		builder.append(classe.getTipoTinta());
		builder.append("\n geratriz = ");
		builder.append(classe.geratriz());
		builder.append("\n area do fundo = ");
		builder.append(classe.areaFundo());
		builder.append("\n area lateral cone = ");
		builder.append(classe.areaLateral());
		builder.append("\n area total = ");
		builder.append(classe.areaTotal());
		builder.append("\n litros = ");
		builder.append(classe.litros());
		builder.append("\n latas = ");
		builder.append(classe.latas());
		builder.append("\n preco total = ");
		builder.append(classe.preço());
		System.out.println(builder);
		entrada.close();
	}

}
