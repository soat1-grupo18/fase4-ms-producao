package br.com.fiap.soat.tech_challenge.fase4msproducao.api.requests;

import br.com.fiap.soat.tech_challenge.fase4msproducao.entities.ItemDoPedido;

import java.math.BigDecimal;

public class ItemDoPedidoEmProducaoRequest {
    private String nome;
    private String descricao;
    private String categoria;
    private String imagem;
    private int quantidade;
    private BigDecimal precoUnitario;

    public ItemDoPedido toDomain() {
        return new ItemDoPedido(
                null,
                nome,
                descricao,
                categoria,
                imagem,
                quantidade,
                precoUnitario);
    }
}
