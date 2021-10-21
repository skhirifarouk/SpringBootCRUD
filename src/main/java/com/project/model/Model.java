package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Model implements Serializable {

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
