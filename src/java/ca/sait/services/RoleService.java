package ca.sait.services;

import ca.sait.dataacces.RoleDB;
import java.util.List;
import ca.sait.models.Role;

public class RoleService {
    private RoleDB roleDB = new RoleDB();
      
    public List<Role> getAll() throws Exception {
        List<Role> roles = this.roleDB.getAll();
        return roles;
    }
}

