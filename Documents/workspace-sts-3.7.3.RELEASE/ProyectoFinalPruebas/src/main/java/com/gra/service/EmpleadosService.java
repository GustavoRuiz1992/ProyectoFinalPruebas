package com.gra.service;

import java.util.List;

import com.gra.domain.EmpleadosBean;

public interface EmpleadosService {
	public boolean insertaEmpleado(EmpleadosBean obj) throws Exception;
    //public boolean borraEmpleado(EmpleadosBean obj) throws Exception;
    public boolean actualizaEmpleado(EmpleadosBean obj) throws Exception;
    public List<EmpleadosBean> consultaEmpleados() throws Exception;
    public EmpleadosBean getEmpleadoPorId(EmpleadosBean obj) throws Exception;

}
