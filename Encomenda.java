import java.time.LocalDate;

public class Encomenda {

    private String cliente;
    private String NIF;
    private String morada;
    private long number;
    private LocalDate data;
    private LinhaEncomenda[] linhas;


    public String getCliente() {
        return this.cliente;
    }

    public String getNIF() {
        return this.NIF;
    }

    public String getMorada() {
        return this.morada;
    }

    public long getNumber() {
        return this.number;
    }


    public LocalDate getData() {
        return this.data;
    }

    public LinhaEncomenda[] getlinhas() {
        return this.linhas;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public void setTax(LocalDate data) {
        this.data = data;
    }


    public void setLinha(LinhaEncomenda[] linhas) {
        this.linhas = linhas;
    }

    public Encomenda() {
        this.cliente ="";
        this.NIF = "";
        this.morada = "";
        this.number = 0;
        this.data = LocalDate.now();
        this.linhas = new LinhaEncomenda[2];
        for(LinhaEncomenda a : this.linhas){
            a = new LinhaEncomenda();
        }
    }

    public Encomenda(String x, String y, String z, long q, LocalDate t, LinhaEncomenda[] e) {
        this.cliente = x;
        this.NIF = y;
        this.morada = z;
        this.number = q;
        this.data = t;
        this.linhas = e;
    }

    public Encomenda(Encomenda e) {
        this.cliente = e.getCliente();
        this.NIF = e.getNIF();
        this.morada = e.getMorada();
        this.number = e.getNumber();
        this.data = e.getData();
        this.linhas = e.getlinhas();
    }

    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Cliente: ");
        sb.append(this.cliente + "\n");
        sb.append("NIF: ");
        sb.append(this.NIF + "\n");
        sb.append("Morada: ");
        sb.append(this.morada + "\n");
        sb.append("Number: ");
        sb.append(this.number + "\n");

        sb.append("Data: ");
        sb.append(this.data + "\n");

        sb.append("Linhas: ");
        for (LinhaEncomenda e : this.linhas)
            sb.append(e.toString() + "\n");
        return sb.toString();
    }

    public Encomenda clone(){
        return new Encomenda(this);    
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Encomenda e = (Encomenda) o;

        boolean t = this.cliente.equals(e.cliente) && this.NIF.equals(e.NIF) && this.morada.equals(e.morada) && this.number == e.number && this.data.equals(e.data) && this.linhas.equals(e.linhas);
        return t;
    }

    public double calculaValorTotal() {
        double r = 0;
        for(LinhaEncomenda e : this.linhas) {
            r += e.calculaValorLinhaEnc();
        }
        return r;
    }

    public double calculaValorDesconto() {
        double r = 0;
        for(LinhaEncomenda e : this.linhas) {
            r += e.calculaValorDesconto();
        }
        return r;
    }

    public int numeroTotalProdutos() {
        int r = 0;
        for(LinhaEncomenda e : this.linhas) {
            r += e.getQuantidade();
        }
        return r;
    }

    public boolean existeProdutoEncomenda(String refProduto) {
        boolean r = false;
        for(LinhaEncomenda e : this.linhas) {
            if (e.getRef().equals(refProduto)) return true;
        }
        return r;
    }

    public void adicionaLinha(LinhaEncomenda linha) {
        LinhaEncomenda[] novo = new LinhaEncomenda[this.linhas.length + 1];
        int i = 0;
        for (LinhaEncomenda a : this.linhas) {
            novo[i] = a;
            i++;
        }
        novo[i] = linha;
        this.linhas = novo;
    }
/*    
    public void removeProduto(String codProd) {
        int i = 0;
        for (LinhaEncomenda a : this.linhas) {
            if (a.getRef().equals(codProd) == false) i++;
        }
        
        if (i == this.linhas.length) return;

        LinhaEncomenda[] novo = new LinhaEncomenda[i];
        
        i = 0;
        for (LinhaEncomenda a : this.linhas) {
            if (a.getRef().equals(codProd)) i++;
            else {
            novo[i] = a;
            i++;
            }
        }
        this.linhas = novo;
    }
*/

}
