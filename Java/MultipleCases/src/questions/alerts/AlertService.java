package questions.alerts;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

class AlertService {
    private final MapAlertDAO storage = new MapAlertDAO();

    public AlertService(AlertDAO MapAlertDAO) {
    }

    public UUID raiseAlert(AlertDAO MapAlertDAO) {
        return this.storage.addAlert(new Date());
    }

    public Date getAlertTime(UUID id, AlertDAO MapAlertDAO) {
        return this.storage.getAlert(id);
    }

}

class MapAlertDAO implements AlertDAO{
    private final Map<UUID, Date> alerts = new HashMap<UUID, Date>();

    @Override
    public UUID addAlert(Date time) {
        UUID id = UUID.randomUUID();
        this.alerts.put(id, time);
        return id;
    }

    @Override
    public Date getAlert(UUID id) {
        return this.alerts.get(id);
    }

}
