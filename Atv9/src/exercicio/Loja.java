package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Loja {

	public static void main(String[] args) {
		
		List <Produto> estoque = new ArrayList<>();
		
		estoque.add (new Produto ("Delineador", "M1", 25.50, 50));
		estoque.add (new Produto ("Batom", "M2", 33.90, 30));
		estoque.add (new Produto ("Maleta de Sombras", "M3", 110.50, 15));
		estoque.add (new Produto ("Lápiz preto", "M4", 15.00, 100));
		estoque.add (new Produto ("Base líquida", "M5", 55.90, 60));
		
		System.out.println("*** PRODUTOS EM ESTOQUE ***");
		System.out.println("CODIGO\t\tQTDE ESTOQUE\tVALOR UNITARIO\t\tPRODUTO");
		
		for(Produto atual : estoque) {
			System.out.println(atual.getCodigo() + "\t\t" + atual.getQtdeEstoque() +
					"\t\t" + atual.getPreco() + "\t\t\t" + atual.getTipo());
		}
		
		estoque.remove(3);
		
		estoque.get(0).setQtdeEstoque(44);
		
		System.out.println("\n\n*** PRODUTOS EM ESTOQUE ***");
		System.out.println("CODIGO\t\tQTDE ESTOQUE\tVALOR UNITARIO\t\tPRODUTO");
		
		for(Produto atual : estoque) {
			System.out.println(atual.getCodigo() + "\t\t" + atual.getQtdeEstoque() +
					"\t\t" + atual.getPreco() + "\t\t\t" + atual.getTipo());
		}
		
	}

}
