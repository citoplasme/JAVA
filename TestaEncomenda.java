/**
 * @author Pimentel
 * @version First Day 
 */
import java.time.LocalDate;
public class TestaEncomenda {
    public static void main(String[] args) {
        LinhaEncomenda[] linhas = {new LinhaEncomenda("p1", "P1", 10, 5, 0.23, 0.10),
                                   new LinhaEncomenda("p2", "P2", 20, 15, 0.23, 0),
                                   new LinhaEncomenda("p3", "P3", 30, 25, 0.23, 0.05),
                                   new LinhaEncomenda("p4", "P4", 40, 35, 0.23, 0.20),
                                  };
        Encomenda e = new Encomenda("XPTO", "12345", "Rua Direita", 1, LocalDate.now(), linhas);
        
        System.out.println(e.toString());  
        
        e.adicionaLinha(new LinhaEncomenda("p5", "P5", 25, 5, 0.13, 0.1));        
        e.adicionaLinha(new LinhaEncomenda("p1", "P5", 25, 5, 0.13, 0.1));
        System.out.println(e);
        
        System.out.println("Valor total: "+e.calculaValorTotal());
        System.out.println("Valor desconto: "+e.calculaValorDesconto());
        System.out.println("Número total de produtos: "+e.numeroTotalProdutos());

        //e.removeProduto("p1");
        //e.removeProduto("p0");
        //System.out.println(e);
        
    }
}
