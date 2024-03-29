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

import es.puentes.entidades.AlojamientoConId;



@Component
public class AlojamientoListener {

	private Logger log = LoggerFactory.getLogger(AlojamientoListener.class);
	private AlojamientoDAO alojamientoDAO;
	
	@Autowired
	public void init(AlojamientoDAO alojamientoDAO) {
		this.alojamientoDAO = alojamientoDAO;
	}
	
//	@PrePersist
//	public void preGuardar(AlojamientoConId alojamiento) {
//		System.err.println("Se va a guardar un alojamiento: " + alojamiento.getFechaEntrada() + " - " + alojamiento.getFechaSalida());
//	}
	
	@PostRemove
	public void postBorrar(AlojamientoConId alojamiento) {
		System.err.println("Se ha borrado un alojamiento: " + alojamiento.getFechaEntrada() + " - " + alojamiento.getFechaSalida());
	}
	
	@PostUpdate
	public void postActualizar(AlojamientoConId alojamiento) {
		System.err.println("Se ha actualizado  un alojamiento: " + alojamiento.getFechaEntrada() + " - " + alojamiento.getFechaSalida());
	}
	
//	@PostLoad
//	public void postGuardar(AlojamientoConId alojamiento) {
//		log.warn("has guardado un alojamiento: " + alojamiento.getFechaEntrada() + " - " + alojamiento.getFechaSalida());
//	}
}



