package br.com.mastertech.couto.fatura.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class PayInvoiceResponse {

    @Getter
    @Setter
    @JsonProperty(value = "id")
    private Long id;

    @Getter
    @Setter
    @JsonProperty(value = "valorPago")
    private Double amountPaid;

    @Getter
    @Setter
    @JsonProperty(value = "pagoEm")
    private Date paidAt;

}
