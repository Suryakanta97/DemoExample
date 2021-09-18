module com.surya.dip.services {
    requires com.surya.dip.entities;
    requires com.surya.dip.daos;
    uses com.surya.dip.daos.CustomerDao;
    exports com.surya.dip.services;
}
