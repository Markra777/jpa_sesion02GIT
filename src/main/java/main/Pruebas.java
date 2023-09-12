package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TbUsuario;

public class Pruebas {

	public static void main(String[] args) {
		System.out.println("===JPA CRUD====");
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpa_sesion02GIT");
		EntityManager em = fabrica.createEntityManager();
		
		List<TbUsuario> lstUsuarios = em.createQuery("Select a From TbUsuario a", TbUsuario.class).getResultList();
		System.out.println("==============================================");
		
		/*Mostrar cantidad de usuarios*/
		System.out.println("nro de usuarios:" +lstUsuarios.size());
		System.out.println("==============================================");
		
		/*Listar todos los usuarios*/
		System.out.println("Lista de usuarios:");
		System.out.println("-----------------");
		for(TbUsuario u: lstUsuarios){
			System.out.println("usuario: "+u.getNomUsua()+ " " + u.getApeUsua()+ " "+ u.getClaUsua());
		}
		System.out.println("==============================================");

	}

}
