package br.com.mastertech.couto.fatura.client;

import br.com.mastertech.couto.fatura.dtos.GetInvoiceResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "PAYMENT")
public interface PaymentClient {

    @GetMapping(value = "/pagamentos/{id_cartao}")
    List<GetInvoiceResponse> getPaymentsByCardId(@PathVariable("id_cartao") Long cardId);
}
