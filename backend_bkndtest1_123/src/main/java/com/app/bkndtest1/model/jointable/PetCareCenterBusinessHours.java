package com.app.bkndtest1.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.app.bkndtest1.model.Manager;
import com.app.bkndtest1.model.Pet;
import com.app.bkndtest1.model.PetCareCenter;
import com.app.bkndtest1.model.PetOwner;
import com.app.bkndtest1.model.Document;
import com.app.bkndtest1.model.PetService;
import com.app.bkndtest1.enums.PetServiceType;
import com.app.bkndtest1.converter.PetServiceTypeConverter;

@Entity(name = "PetCareCenterBusinessHours")
@Table(schema = "\"bkndtest1_094\"", name = "\"PetCareCenterBusinessHours\"")
@Data
public class PetCareCenterBusinessHours{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"PcId\"")
	private Integer pcId;

    
    @Column(name = "\"BusinessHours\"")
    private Integer businessHours;
}