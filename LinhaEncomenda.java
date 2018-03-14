
public class LinhaEncomenda {

	private String referencia;
	private String descricao;
	private double precoAntes;
	private int quantidade;
	private double imposto; // percentagem
	private double valor_desconto;


	public String getRef() {
		return this.referencia;
	}

	public String getDes() {
		return this.descricao;
	}

	public double getPreco() {
		return this.precoAntes;
	}

	public int getQuantidade() {
		return this.quantidade;
	}


	public double getTax() {
		return this.imposto;
	}


	public double getDesconto() {
		return this.valor_desconto;
	}

	public void setRef(String referencia) {
		this.referencia = referencia;
	}

	public void setDes(String descricao) {
		this.descricao = descricao;
	}

	public void setPreco(double preco) {
		this.precoAntes = preco;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public void setTax(double tax) {
		this.imposto = tax;
	}


	public void setDesconto(double desconto) {
		this.valor_desconto = desconto;
	}

    public LinhaEncomenda() {
        this.referencia ="";
        this.descricao = "";
        this.precoAntes = 0;
        this.quantidade = 0;
        this.imposto = 0;
        this.valor_desconto = 0;
    }

    public LinhaEncomenda(String x, String y, double z, int q, double t, double e) {
        this.referencia = x;
        this.descricao = y;
        this.precoAntes = z;
        this.quantidade = q;
        this.imposto = t;
        this.valor_desconto = e;
    }

    public LinhaEncomenda(LinhaEncomenda e) {
        this.referencia = e.getRef();
        this.descricao = e.getDes();
        this.precoAntes = e.getPreco();
        this.quantidade = e.getQuantidade();
        this.imposto = e.getTax();
        this.valor_desconto = e.getDesconto();
    }

    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Referencia: ");
        sb.append(this.referencia + "\n");
        sb.append("Descrição: ");
        sb.append(this.descricao + "\n");
        sb.append("Preço antes de imposto: ");
        sb.append(this.precoAntes + "\n");
        sb.append("Quantidade: ");
        sb.append(this.quantidade + "\n");

        sb.append("Imposto: ");
        sb.append(this.imposto + "\n");

        sb.append("Desconto: ");
        sb.append(this.valor_desconto + "\n");
        return sb.toString();
    }

    public LinhaEncomenda clone(){
        return new LinhaEncomenda(this);    
    }

    public boolean equals(Object o) {
    	if (o == this) return true;
    	if (o == null || o.getClass() != this.getClass()) return false;
        LinhaEncomenda e = (LinhaEncomenda) o;

        boolean t = this.referencia.equals(e.referencia) && this.descricao.equals(e.descricao) && this.precoAntes == e.precoAntes && this.imposto == e.imposto && this.quantidade == e.quantidade && this.valor_desconto == e.valor_desconto;
    	return t;
    }

    public double calculaValorLinhaEnc() {
    	return this.quantidade * (this.precoAntes * this.imposto + this.precoAntes - this.calculaValorDesconto());
    }


    public double calculaValorDesconto() {
    	return this.precoAntes * this.valor_desconto;
    }
}
