package com.fullcycle.admin.catalago.infrastructure;

import java.util.List;

public interface ExportadorListaProduto {


    String abrirTabela();
    String fecharTabela();
    String abrirLinha();
    String fecharLinha();
    String abrirLinhaTitulos();
    String fecharLinhaTitulos();
    String abrirColuna(Object valor);
    String fecharColuna();
    String exportar(List<Produto> produtos);

    static ExportadorListaProduto newInstance() {
        // Sempre que não houver especificação ele retornará o documento em Html
        // Evite código duplicado -> return new ExportadorListaHtml();
        return newInstance("html");
    }

    static ExportadorListaProduto newInstance(String extensaoArquivoExportacao) {
        return switch (extensaoArquivoExportacao) {
            case "html", ".html" -> new ExportadorListaHtml();
            case "md", ".md" -> new ExportadorListaMarkdown();
            default -> throw new UnsupportedOperationException("Formato de exportação não suportado: " + extensaoArquivoExportacao);
        };
    }
}
