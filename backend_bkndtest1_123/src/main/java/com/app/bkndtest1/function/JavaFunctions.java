package com.app.bkndtest1.function;

import com.app.bkndtest1.model.Manager;
import com.app.bkndtest1.model.Pet;
import com.app.bkndtest1.model.PetCareCenter;
import com.app.bkndtest1.model.PetOwner;
import com.app.bkndtest1.model.Document;
import com.app.bkndtest1.model.PetService;
import com.app.bkndtest1.enums.PetServiceType;
import com.app.bkndtest1.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.bkndtest1.repository.PetServiceRepository;
import com.app.bkndtest1.repository.PetOwnerRepository;
import com.app.bkndtest1.repository.PetCareCenterRepository;
import com.app.bkndtest1.repository.ManagerRepository;
import com.app.bkndtest1.repository.DocumentRepository;
import com.app.bkndtest1.repository.PetRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
