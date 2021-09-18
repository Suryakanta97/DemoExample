package com.surya.accessmodifiers.another;

import com.surya.accessmodifiers.SuperPublic;

public class AnotherSubClass extends SuperPublic {
    public AnotherSubClass() {
        SuperPublic.publicMethod(); // Available everywhere.
        SuperPublic.protectedMethod(); // Available in subclass. Let's note different package.
    }
}
