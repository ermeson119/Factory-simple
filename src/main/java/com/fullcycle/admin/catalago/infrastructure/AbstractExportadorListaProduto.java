package com.fullcycle.admin.catalago.infrastructure;

import java.util.List;

public abstract class AbstractExportadorListaProduto implements ExportadorListaProduto {
    protected static final List<String> TITULO_COLUNAS = List.of("ID", "Descrição", "Marca", "Modelo", "Estoque");

    @Override
    public String exportar(List<Produto> listaProdutos) {
        var builder = new StringBuilder();
        builder.append(abrirTabela());
        builder.append(abrirLinhaTitulos());
        builder.append(abrirLinha());

        TITULO_COLUNAS.stream().map(titulo -> abrirColuna(titulo) + fecharColuna()).forEach(builder::append);

        for (var produto : listaProdutos){
            builder.append(abrirLinha());
            builder.append(abrirColuna(produto.getId())).append(fecharTabela());
            builder.append(abrirColuna(produto.getDescricao())).append(fecharTabela());
            builder.append(abrirColuna(produto.getMarca())).append(fecharTabela());
            builder.append(abrirColuna(produto.getModelo())).append(fecharTabela());
            builder.append(abrirColuna(produto.getEstoque())).append(fecharTabela());
            builder.append(fecharTabela());

        }

        builder.append(fecharTabela());


        return builder.toString();
    }
}
