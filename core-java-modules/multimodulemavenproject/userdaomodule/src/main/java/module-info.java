module com.surya.userdaomodule {
    requires com.surya.entitymodule;
    requires com.surya.daomodule;
    provides com.surya.daomodule.Dao with com.surya.userdaomodule.UserDao;
    exports com.surya.userdaomodule;
}
