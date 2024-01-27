package br.com.fiap.soat.tech_challenge.fase4msproducao.api.requests;

import br.com.fiap.soat.tech_challenge.fase4msproducao.entities.Pedido;
import br.com.fiap.soat.tech_challenge.fase4msproducao.entities.StatusDoPagamento;
import br.com.fiap.soat.tech_challenge.fase4msproducao.entities.StatusDoPedido;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class PedidoRequest {

    private UUID id;

    private UUID clienteId;

    private BigDecimal preco;

    private List<ItemDoPedidoRequest> itens;

    private LocalDateTime dataDeCriacao;

    public List<ItemDoPedidoRequest> getItens() {
        return itens;
    }


    public Pedido toDomain() {
        return new Pedido(
                id,
                clienteId,
                preco,
                StatusDoPedido.RECEBIDO,
                StatusDoPagamento.PENDENTE,
                itens.stream().map(item -> item.toDomain()).collect(Collectors.toList()),
                null,
                dataDeCriacao);
    }
}