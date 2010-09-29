/**
Copyright 2010 University of South Florida

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

**/
package edu.usf.cutr.go_sync.object;

/**
 *
 * @author Khoa Tran
 */
public class Session {
    private static String userName="";
    private static String password="";
    private static String csetComment="";
    public Session(String user, String pass, String comment) {
        userName = user;
        password = pass;
        csetComment = comment;
    }

    public static String getUserName(){
        return userName;
    }

    public static String getPassword(){
        return password;
    }

    public static String getChangeSetComment(){
        return csetComment;
    }
}
