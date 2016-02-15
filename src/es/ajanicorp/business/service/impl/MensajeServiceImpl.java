/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ajanicorp.business.service.impl;

import es.ajanicorp.business.domain.Mensaje;
import es.ajanicorp.business.service.MensajeService;
import es.ajanicorp.core.exception.BusinessException;
import es.ajanicorp.persistence.dao.MensajeDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Ajani
 */
public class MensajeServiceImpl implements MensajeService {

    @Autowired
    MensajeDAO mensajeDAO;

    @Override
    public Mensaje insert(Mensaje mensaje) throws BusinessException {
        return mensajeDAO.insert(mensaje);
    }

    @Override
    public boolean delete(int idMensaje) throws BusinessException {
        return mensajeDAO.delete(idMensaje);
    }

    @Override
    public Mensaje get(int idMensaje) throws BusinessException {
        return mensajeDAO.get(idMensaje);
    }

    @Override
    public List<Mensaje> findAll() throws BusinessException {
        return mensajeDAO.findAll();
    }

}
