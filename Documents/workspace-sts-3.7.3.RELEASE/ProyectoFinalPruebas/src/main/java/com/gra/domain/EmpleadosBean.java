package com.gra.domain;

public class EmpleadosBean {
	private static final long serialVersionUID = -1833702209651210286L;
    private Integer id;
    private String nombre;
    private String app;
    private String apm;
    private String rfc;
    private double pago;
    private IndexBean usuario;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApp() {
        return app;
    }
    public void setApp(String app) {
        this.app = app;
    }
    public String getApm() {
        return apm;
    }
    public void setApm(String apm) {
        this.apm = apm;
    }
    public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public double getPago() {
		return pago;
	}
	public void setPago(double pago) {
		this.pago = pago;
	}
    public IndexBean getUsuario() {
        return usuario;
    }
    public void setUsuario(IndexBean usuario) {
        this.usuario = usuario;
    }

}
