package com.app.bkndtest1.function;

import com.app.bkndtest1.model.Manager;
import com.app.bkndtest1.model.Pet;
import com.app.bkndtest1.model.PetCareCenter;
import com.app.bkndtest1.model.PetOwner;
import com.app.bkndtest1.model.Document;
import com.app.bkndtest1.model.PetService;




import com.app.bkndtest1.enums.PetServiceType;
import com.app.bkndtest1.converter.PetServiceTypeConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  