import com.fullcycle.admin.catalago.infrastructure.ExportadorListaProduto;
import com.fullcycle.admin.catalago.infrastructure.Produto;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        var produtos = List.of(
                new Produto(1, "Ps5", "PlayStation®5", "CFI-2014B01X", 100),
                new Produto(1, "Xbox Series S", "Microsoft", "EP2-00692", 110),
                new Produto(1, "Notebook Gamer G15", "DELL", "5530", 150)
        );

        var exportadorPadrao = ExportadorListaProduto.newInstance();
        System.out.println("Lista de produtos em HTML\n");
        System.out.println(exportadorPadrao.exportar(produtos));

        var exportadorMark = ExportadorListaProduto.newInstance();
        System.out.println("Lista de produtos em Markdown\n");
        System.out.println(exportadorMark.exportar(produtos));

    }
}