package concordiondemo;

import org.concordion.api.ResultSummary;
import org.concordion.internal.FailFastException;

public interface IHelloWorld {
    // Remove this
    void assertIsSatisfied(ResultSummary rs, FailFastException ffe);
}
