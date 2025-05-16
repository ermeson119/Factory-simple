package com.fullcycle.admin.catalago.infrastructure;

public class ExportadorListaHtml extends AbstractExportadorListaProduto {
    @Override
    public String abrirTabela() {
        return "<table>\n";
    }

    @Override
    public String fecharTabela() {
        return "</table>\n";
    }

    @Override
    public String abrirLinha() {
        return "<tr>";
    }

    @Override
    public String fecharLinha() {
        return "</tr>\n";
    }

    @Override
    public String abrirLinhaTitulos() {
        return "<thead><tr>\n";
    }

    @Override
    public String fecharLinhaTitulos() {
        return "</tr></thead>\n";
    }

    @Override
    public String abrirColuna(Object valor) {
        return "<td>" + valor;
    }

    @Override
    public String fecharColuna() {
        return "</td>";
    }
}
