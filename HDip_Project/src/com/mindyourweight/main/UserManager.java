/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2013
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.mindyourweight.main;

import java.net.UnknownHostException;

import com.mongodb.*;

@SuppressWarnings("deprecation")
public class UserManager {

    private static Mongo m;
    private static DB db;
    private static DBCollection people;
    private static BasicDBObject person;
    private static BasicDBObject query;
    static {
        try {
            m = new Mongo("localhost");
            db = m.getDB("test_db");
            people = db.getCollection("people");
        } catch (final UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param user
     */
    @SuppressWarnings("deprecation")
    public void persistNewUserToDatabase(final User user) {
        // TODO Auto-generated method stub
        person = new BasicDBObject();
        person.put("firstName", user.getFirstName());
        person.put("lastName", user.getLastName());
        person.put("email", user.getEmail());
        person.put("password", user.getPassword());
        people.insert(person);
    }

    /**
     * @param email
     */
    public void getUserDetailsFromDatabase(final String email) {
        // TODO Auto-generated method stub
        query = new BasicDBObject();
    }
}
