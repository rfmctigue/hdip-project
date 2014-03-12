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
package com.mindyourweight.test;

import org.junit.Test;

import com.mindyourweight.main.User;
import com.mindyourweight.main.UserManager;

public class TestCreateUser {

    @Test
    public void test_createUser_expectCorrectDetails() {
        final User user = new User("Joe", "Bloggs", "example@gmail.com", "password");
        final UserManager um = new UserManager();
        um.persistNewUserToDatabase(user);
        um.getUserDetailsFromDatabase(user.getEmail());
    }

}
