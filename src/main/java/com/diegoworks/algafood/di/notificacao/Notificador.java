package com.diegoworks.algafood.di.notificacao;

import com.diegoworks.algafood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}