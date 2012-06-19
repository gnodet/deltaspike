package org.apache.deltaspike.example.securityconsole.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.apache.deltaspike.security.api.permission.annotations.ACLStore;

@ACLStore
@Entity
public class ObjectPermission implements Serializable 
{
    private static final long serialVersionUID = 2386489292457994509L;
    
    @Id @GeneratedValue
    private Long id;
    
    public Long getId()
    {
        return id;
    }
    
    public void setId(Long id)
    {
        this.id = id;
    }
}