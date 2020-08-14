package br.com.mastertech.couto.fatura.service;

import br.com.mastertech.couto.fatura.Exception.InvalidCustomerException;
import br.com.mastertech.couto.fatura.client.CardClient;
import br.com.mastertech.couto.fatura.client.PaymentClient;
import br.com.mastertech.couto.fatura.dtos.CreditCard;
import br.com.mastertech.couto.fatura.dtos.GetInvoiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {


    @Autowired
    private CardClient cardClient;

    @Autowired
    private PaymentClient paymentClient;

    public List<GetInvoiceResponse> getPayments(Long cardId, Long customerId) {
        CreditCard creditCard = cardClient.getById(cardId);
        if (creditCard.getCustomerId() != customerId) {
            throw new InvalidCustomerException();
        }

        return paymentClient.getPaymentsByCardId(cardId);
    }
}
