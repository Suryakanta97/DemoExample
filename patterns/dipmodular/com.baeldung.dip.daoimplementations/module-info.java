module com.surya.dip.daoimplementations {
    requires com.surya.dip.entities;
    requires com.surya.dip.daos;
    provides com.surya.dip.daos.CustomerDao with com.surya.dip.daoimplementations.SimpleCustomerDao;
    exports com.surya.dip.daoimplementations;
}
