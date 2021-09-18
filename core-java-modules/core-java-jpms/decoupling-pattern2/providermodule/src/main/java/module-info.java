module com.surya.providermodule {
    requires com.surya.servicemodule;
    provides com.surya.servicemodule.TextService with com.surya.providermodule.LowercaseTextService;
}