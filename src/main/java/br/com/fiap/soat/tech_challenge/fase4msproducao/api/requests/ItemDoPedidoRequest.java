package br.com.fiap.soat.tech_challenge.fase4msproducao.api.requests;

import br.com.fiap.soat.tech_challenge.fase4msproducao.entities.ItemDoPedido;

import java.math.BigDecimal;
import java.util.UUID;

public class ItemDoPedidoRequest {
    private String nome;
    private String descricao;
    private String categoria;
    private String imagem;
    private int quantidade;
    private BigDecimal precoUnitario;

    public UUID getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(UUID produtoId) {
        this.produtoId = produtoId;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ItemDoPedido toDomain() {
    }
}
