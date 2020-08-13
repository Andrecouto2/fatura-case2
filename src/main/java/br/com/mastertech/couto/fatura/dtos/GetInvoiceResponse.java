package br.com.mastertech.couto.fatura.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

public class GetInvoiceResponse {

    @Getter
    @Setter
    @JsonProperty(value = "id")
    private Long id;

    @Getter
    @Setter
    @JsonProperty(value = "cartao_id")
    private Long cardId;

    @Getter
    @Setter
    @JsonProperty(value = "descricao")
    private String description;

    @Getter
    @Setter
    @JsonProperty(value = "valor")
    private Double value;
}
