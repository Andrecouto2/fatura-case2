package br.com.mastertech.couto.fatura.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "CAR")
public interface CardClient {

}
