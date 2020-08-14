package br.com.mastertech.couto.fatura.controller;

import br.com.mastertech.couto.fatura.dtos.GetInvoiceResponse;
import br.com.mastertech.couto.fatura.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @GetMapping(value = "/fatura/{cliente-id}/{cartao-id}")
    public ResponseEntity<List<GetInvoiceResponse>> getPaymentsByCardId(@PathVariable("cartao-id") Long cardId,
                                                                        @PathVariable("cliente-id") Long customerId) {
        return ResponseEntity.ok(invoiceService.getPayments(cardId, customerId));
    }

}
