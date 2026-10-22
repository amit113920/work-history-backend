package com.ak.work.history.work_history.rest;

import com.ak.work.history.work_history.dto.RegisterUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.support.LdapNameBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;

@RestController
public class RegistrationApi {

    @Autowired
    private LdapTemplate ldapTemplate;

    @PostMapping("/registerUser")
    @CrossOrigin(origins = "*")
    public ResponseEntity<String> registerUser(@RequestBody RegisterUserRequest request) {
        if (request.getUserName() == null || request.getUserName().isBlank() ||
                request.getPassword() == null || request.getPassword().isBlank()) {
            return new ResponseEntity<>("Username and password cannot be empty", HttpStatus.BAD_REQUEST);
        }

        try {
            // Build DN: cn=<userName>,ou=users
            Name dn = LdapNameBuilder.newInstance()
                    .add("ou", "users")
                    .add("cn", request.getUserName())
                    .build();

            BasicAttributes attributes = new BasicAttributes();
            BasicAttribute objectClass = new BasicAttribute("objectClass");
            objectClass.add("top");
            objectClass.add("person");
            objectClass.add("organizationalPerson");
            objectClass.add("inetOrgPerson");

            attributes.put(objectClass);
            attributes.put("cn", request.getUserName());
            attributes.put("sn", request.getUserName()); // Surname is required by inetOrgPerson schema
            attributes.put("uid", request.getUserName());
            attributes.put("userPassword", request.getPassword());

            // Bind user entry into LDAP
            ldapTemplate.bind(dn, null, attributes);

            return new ResponseEntity<>("User registered successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to register user: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}