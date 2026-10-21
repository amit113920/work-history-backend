package com.ak.work.history.work_history.entity;
import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;
import javax.naming.Name;

@Entry(objectClasses = { "person", "inetOrgPerson", "top" }, base = "ou=people")
public class Person {

    @Id
    private Name id;

    @Attribute(name = "uid")
    private String userId;

    @Attribute(name = "cn")
    private String fullName;

    @Attribute(name = "sn")
    private String lastName;

    // Getters and setters
}