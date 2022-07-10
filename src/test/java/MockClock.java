import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class MockClock extends Clock {

    private Instant time;

    public MockClock(Instant time) {
        this.time = time;
    }

    @Override
    public ZoneId getZone() {
        return ZoneId.of("UTC");
    }

    @Override
    public Clock withZone(ZoneId zoneId) {
        return new MockClock(Instant.now());
    }

    @Override
    public Instant instant() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public void plusMillis(long millis) {
        setTime(instant().plusMillis(millis));
    }
}
