package com.gra.entity;

import java.io.Serializable;

public class Empleados implements Serializable {
	//
	 private static final long serialVersionUID = 2286378858501851031L;
	 private Integer id;
	 private String nombre;
	 private String app;
	 private String apm;
	 private String rfc;
	 private double pago;
	 private Index usuario;

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
	 public Index getUsuario() {
		 return usuario;
	 }
	 public void setUsuario(Index usuario) {
		 this.usuario = usuario;
	 }
}
