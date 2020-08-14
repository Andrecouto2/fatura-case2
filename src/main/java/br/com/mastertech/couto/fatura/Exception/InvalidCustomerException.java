package br.com.mastertech.couto.fatura.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.FORBIDDEN, reason = "Cliente não permitido.")
public class InvalidCustomerException extends RuntimeException {
}
