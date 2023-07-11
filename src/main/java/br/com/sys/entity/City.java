package br.com.sys.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


public class City implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private Integer id;
	@Column(name = "city", length = 255, nullable = false)
	private String city;

	private String state;

	private Double population;

	private Date createdDate = new Date();
}
