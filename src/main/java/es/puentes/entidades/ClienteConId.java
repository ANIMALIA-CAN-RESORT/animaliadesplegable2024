package es.puentes.entidades;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import es.puentes.repositorios.ClienteListener;

@Entity
@EntityListeners(ClienteListener.class)
@Table(name = "CLIENTES")
public class ClienteConId {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private Long id;
	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String tfno;
	private String email;
	@OneToMany(targetEntity = MascotaConId.class)
	private Collection<MascotaConId> mascotas;

	public ClienteConId() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getTfno() {
		return tfno;
	}

	public void setTfno(String tfno) {
		this.tfno = tfno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<MascotaConId> getMascotas() {
		return mascotas;
	}

	public void setMascotas(Collection<MascotaConId> mascotas) {
		this.mascotas = mascotas;
	}

	// Establece la relacion en los dos sentidos
	public void addMascotaConId(MascotaConId mascota) {
		getMascotas().add(mascota);
		mascota.setCliente(this);
	}
}
