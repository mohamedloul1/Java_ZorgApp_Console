public class Roles {
    private int roleId;
    private String roleName;

    // Constructor
    public Roles(int roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }


    // Getter en setter-methoden voor roleId
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    // Getter en setter-methoden voor roleName
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
