package tasks.task1;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class TariffPlan {

    private final static int START_RANGE = 0;
    private final static int END_RANGE = 100;

    @Getter
    private int sumForPay;

    @Getter
    @Setter
    private int subscriptPayment;

    @Getter
    @Setter
    private int countMb;

    @Getter
    @Setter
    private int sumOneMbUpper;

    @Getter
    @Setter
    private int commonUsingMb;


    public TariffPlan(int subscriptPayment, int countMb, int sumOneMbUpper, int commonUsingMb) {
        if (!checkInputValue(subscriptPayment) ||
                !checkInputValue(countMb) ||
                !checkInputValue(sumOneMbUpper) ||
                !checkInputValue(commonUsingMb)
        )
            throw new RuntimeException("Incorrect Data");

        this.subscriptPayment = subscriptPayment;
        this.sumForPay = subscriptPayment;
        this.countMb = countMb;
        this.sumOneMbUpper = sumOneMbUpper;
        this.commonUsingMb = commonUsingMb;

    }

    private void setSumForPay() {
        if (countMb < commonUsingMb) {
            int countUpperMb = commonUsingMb - countMb;
            sumForPay += sumOneMbUpper * countUpperMb;
        }
    }

    private boolean checkInputValue(int value) {
        if (value > START_RANGE && value <= END_RANGE) {
            return true;
        }

        return false;
    }

}
