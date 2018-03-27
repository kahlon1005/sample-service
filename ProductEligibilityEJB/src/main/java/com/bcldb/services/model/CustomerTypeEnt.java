package com.bcldb.services.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "SRV_CUSTOMERS", schema="WSPRICE_REPO")
@NamedQueries({ 
@NamedQuery(name = CustomerTypeEnt.ALL, query = "select o from CustomerTypeEnt o") 
})
public class CustomerTypeEnt implements Serializable {
    private static final long serialVersionUID = 6328439798350839856L;
    
    public static final String ALL = "CustomerType.findAll";
    //
    public static final String WHOLESALE_GROUP = "WHOLESALE";
    public static final String SPECIAL_GROUP = "SPECIAL";
    public static final String OTHER_GROUP = "OTHER";
    public static final String PATH_RETAIL = "RETAIL";
    public static final String PATH_WHOLESALE = "WHOLESALE";
    
    @Column(name = "GROUP_NAME")
    String groupName;    
    @Id
    @Column(name = "TYPE_NAME")
    String typeName;
    @Column(name = "RETAIL_CHANNEL_PATH")
    String retailPath;
    @Column(name = "WHOLESALE_CHANNEL_PATH")
    String wholesalePath;
    
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }


    public void setRetailPath(String retailPath) {
        this.retailPath = retailPath;
    }

    public String getRetailPath() {
        return retailPath;
    }

    public void setWholesalePath(String wholesalePath) {
        this.wholesalePath = wholesalePath;
    }

    public String getWholesalePath() {
        return wholesalePath;
    }
}
