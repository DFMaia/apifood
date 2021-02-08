package com.diegoworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.diegoworks.algafood.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS no telefone %s: %s\n",
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
	
}
