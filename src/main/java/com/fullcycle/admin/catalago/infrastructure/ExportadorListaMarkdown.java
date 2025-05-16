package com.fullcycle.admin.catalago.infrastructure;

public class ExportadorListaMarkdown extends AbstractExportadorListaProduto{


    @Override
    public String abrirTabela() {
        return "";
    }

    @Override
    public String fecharTabela() {
        return "";
    }

    @Override
    public String abrirLinha() {
        return "| ";
    }

    @Override
    public String fecharLinha() {
        return " |\n";
    }

    @Override
    public String abrirLinhaTitulos() {
        return "| ";
    }

    @Override
    public String fecharLinhaTitulos() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String titulo : TITULO_COLUNAS){
            stringBuilder.append("--- | ");
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    @Override
    public String abrirColuna(Object valor) {
        return valor + " | ";
    }

    @Override
    public String fecharColuna() {
        return "";
    }
}
