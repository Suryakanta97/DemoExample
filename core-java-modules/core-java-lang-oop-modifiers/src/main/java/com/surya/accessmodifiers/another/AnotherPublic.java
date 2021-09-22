package com.surya.accessmodifiers.another;

import com.surya.accessmodifiers.SuperPublic;

public class AnotherPublic {
    public AnotherPublic() {
        SuperPublic.publicMethod(); // Available everywhere.
    }
}
