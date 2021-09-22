package com.surya.performancetests;

import com.surya.performancetests.model.destination.DestinationCode;
import com.surya.performancetests.model.source.SourceCode;
import com.surya.performancetests.model.source.SourceOrder;
import com.surya.performancetests.model.destination.Order;

public interface Converter {
    Order convert(SourceOrder sourceOrder);
    DestinationCode convert(SourceCode sourceCode);
}
