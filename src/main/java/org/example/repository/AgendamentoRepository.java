package org.example.repository;


import org.example.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AgendamentoRepository extends JpaRepository<Agendamento,Long>{

	public List<Agendamento> findByProfissional(String profissional);
	public List<Agendamento> findById(String id);

}
