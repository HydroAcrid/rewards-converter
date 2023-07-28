import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.lang.Math;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = Math.random() * 1000;
        var rewardValue = new RewardValue(cashValue);
        assert rewardValue.getMilesValue() == (int)(cashValue / 0.0035);
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = (int)(Math.random() * 1000);
        var rewardValue = new RewardValue(milesValue);
        assert rewardValue.getCashValue() == (milesValue * 0.0035);

    }
}
