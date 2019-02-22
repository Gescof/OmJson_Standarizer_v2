package es.upm.etsisi.persistence;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;

import es.upm.etsisi.entities.mota.MotaMeasureTraza;

/**
 * @author Guillermo, Yan Liu
 * @version 1.0
 */
public interface DAOMotaMeasures {
	
	/**
	 * Alta de una traza de mota.
	 * @param motaTraza
	 * @return
	 */
	public boolean altaMota(MotaMeasureTraza motaTraza) throws JsonProcessingException;
	
	/**
	 * Baja de una traza de mota.
	 * @param id
	 * @return
	 */
	public boolean bajaMota(String id);	
	
	/**
	 * Búsqueda de una traza de mota.
	 * @param id
	 * @return
	 */
	public MotaMeasureTraza getMotaTraza(String id);
	
	/**
	 * Lista todas las trazas de mota.
	 * @return
	 */
	public List<MotaMeasureTraza> getListaMotaTrazas();
	
}
