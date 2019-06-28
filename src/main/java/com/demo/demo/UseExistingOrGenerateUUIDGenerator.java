package com.demo.demo;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.UUIDGenerator;

import java.io.Serializable;

public class UseExistingOrGenerateUUIDGenerator extends UUIDGenerator {

    @Override
    public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
        Serializable identifier =
                session.getEntityPersister(null, object).getClassMetadata().getIdentifier(object, session);

        return identifier == null ? super.generate(session, object) : identifier;
    }
}
