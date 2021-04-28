package classe;

public class produtoTeste {

	public static void main(String[] args) {

		var p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.00;
		p1.desconto = 0.25;

		var p2 = new Produto();

		p2.nome = "caneta";
		p2.preco = 12.56;
		p2.desconto = 0.29;

		System.out.println(p1.nome);
		System.out.println(p2.nome);

		double precoFinal = (p1.precoComDesconto());
		double precoFinal2 =(p2.precoComDesconto(0.1));
		double mediaCarrinho = (precoFinal + precoFinal2) / 2;

		System.out.printf(" A media do carrinho  = R$%.2f", mediaCarrinho);

	}

}
