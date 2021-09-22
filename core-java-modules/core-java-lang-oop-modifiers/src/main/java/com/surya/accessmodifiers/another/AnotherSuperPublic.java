package com.surya.accessmodifiers.another;

import com.surya.accessmodifiers.SuperPublic;

public class AnotherSuperPublic {
    public AnotherSuperPublic() {
        SuperPublic.publicMethod(); // Available everywhere. Let's note different package.
    }
}
