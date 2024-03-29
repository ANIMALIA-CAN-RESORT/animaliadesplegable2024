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

import es.puentes.entidades.MascotaConId;


@Component
public class MascotaListener {

	private Logger log = LoggerFactory.getLogger(MascotaListener.class);
	private MascotaDAO mascotaDAO;
	
	@Autowired
	public void init(MascotaDAO mascotaDAO) {
		this.mascotaDAO = mascotaDAO;
	}
	
//	@PrePersist
//	public void preGuardar(MascotaConId mascota) {
//		System.err.println("Se va a guardar una mascota: " + mascota.getNombre());
//	}
	
	@PostRemove
	public void postBorrar(MascotaConId mascota) {
		System.err.println("Se ha borrado a la mascota: " + mascota.getNombre());
	}
	
	@PostUpdate
	public void postActualizar(MascotaConId mascota) {
		System.err.println("Se vha actualizado a la mascota: " + mascota.getNombre());
	}
	
//	@PostLoad
//	public void postGuardar(MascotaConId mascota) {
//		log.warn("has guardado una mascota: " + mascota.getNombre());
//	}
}



