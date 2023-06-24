package main.java.alerts;

import java.util.Date;
import java.util.UUID;

interface AlertDAO {

    // ALl members of an interface are public
    UUID addAlert(Date time);
    Date getAlert(UUID id);

}
