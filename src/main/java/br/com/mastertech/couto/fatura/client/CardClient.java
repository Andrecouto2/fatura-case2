package br.com.mastertech.couto.fatura.client;

import br.com.mastertech.couto.fatura.dtos.CreditCard;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "CAR")
public interface CardClient {
    @GetMapping("/{id}")
    CreditCard getById(@PathVariable Long id);
}