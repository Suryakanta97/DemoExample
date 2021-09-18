module com.surya.mainppmodule {
    
    requires com.surya.entitymodule;
    requires com.surya.daomodule;
    requires com.surya.userdaomodule;
    uses com.surya.userdaomodule.UserDao;
    
}
