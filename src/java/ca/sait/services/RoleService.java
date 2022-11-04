package ca.sait.services;

import ca.sait.dataacces.RoleDB;
import java.util.List;
import ca.sait.dataacces.UserDB;
import ca.sait.models.Role;
import ca.sait.models.User;

public class RoleService {
    private RoleDB roleDB = new RoleDB();
      
    public List<Role> getAll() throws Exception {
        List<Role> roles = this.roleDB.getAll();
        return roles;
    }
}

