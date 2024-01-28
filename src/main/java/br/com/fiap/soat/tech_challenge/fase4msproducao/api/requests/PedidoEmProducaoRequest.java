package br.com.fiap.soat.tech_challenge.fase4msproducao.api.requests;

import br.com.fiap.soat.tech_challenge.fase4msproducao.entities.Pedido;
import br.com.fiap.soat.tech_challenge.fase4msproducao.entities.StatusDoPagamento;
import br.com.fiap.soat.tech_challenge.fase4msproducao.entities.StatusDoPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class PedidoEmProducaoRequest {

    private UUID pedidoId;

    private UUID clienteId;

    private BigDecimal preco;

    private List<ItemDoPedidoEmProducaoRequest> itens;

    public List<ItemDoPedidoEmProducaoRequest> getItens() {
        return itens;
    }


    public Pedido toDomain() {
        return new Pedido(
                null,
                pedidoId,
                clienteId,
                preco,
                StatusDoPedido.RECEBIDO,
                StatusDoPagamento.PENDENTE,
                itens.stream().map(ItemDoPedidoEmProducaoRequest::toDomain).collect(Collectors.toList()),
                null,
                LocalDateTime.now());
    }
}