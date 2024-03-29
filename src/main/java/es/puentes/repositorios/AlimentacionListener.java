package es.puentes.repositorios;

import jakarta.persistence.PostLoad;
import jakarta.persistence.PostRemove;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreRemove;
import jakarta.persistence.PreUpdate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.puentes.entidades.AlimentacionConId;



@Component
public class AlimentacionListener {

	private Logger log = LoggerFactory.getLogger(AlimentacionListener.class);
	private AlimentacionDAO alimentacionDAO;
	
	@Autowired
	public void init(AlimentacionDAO alimentacionDAO) {
		this.alimentacionDAO = alimentacionDAO;
	}
	
//	@PrePersist
//	public void preGuardar(AlimentacionConId alimentacion) {
//		System.err.println("Se va a guardar una alimentacion: " + alimentacion.getFechaEntrada() + " - " + alimentacion.getFechaSalida());
//	}
	
	@PostRemove
	public void postBorrar(AlimentacionConId alimentacion) {
		System.err.println("Se ha borrado una alimentacion: " + alimentacion.getFechaEntrada() + " - " + alimentacion.getFechaSalida());
	}
	
	@PostUpdate
	public void postActualizar(AlimentacionConId alimentacion) {
		System.err.println("Se ha actualizado una alimentacion: " + alimentacion.getFechaEntrada() + " - " + alimentacion.getFechaSalida());
	}
	
//	@PostLoad
//	public void postGuardar(AlimentacionConId alimentacion) {
//		log.warn("has guardado una alimentacion: " + alimentacion.getFechaEntrada() + " - " + alimentacion.getFechaSalida());
//	}
}



