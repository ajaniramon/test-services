/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ajanicorp.business.service;

import es.ajanicorp.business.domain.Mensaje;
import es.ajanicorp.core.exception.BusinessException;
import java.util.List;

/**
 *
 * @author Ajani
 */
public interface MensajeService {
    public Mensaje insert(Mensaje mensaje) throws BusinessException;
    public boolean delete(int idMensaje) throws BusinessException;
    public Mensaje get(int idMensaje) throws BusinessException;
    public List<Mensaje> findAll() throws BusinessException;
}
