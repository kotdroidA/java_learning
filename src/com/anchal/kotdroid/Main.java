package com.anchal.kotdroid;

public class Main {

    static final int PRIVATE_BANK = 1;
    static final int GOVT_BANK = 2;


    public static void main(String[] args) {


        Bank bank1 = getBank(PRIVATE_BANK);
        System.out.println("Rate of interest is "+bank1.getROI()); ///9

        Bank bank2 = getBank(GOVT_BANK);
        System.out.println("Rate of interest is "+bank2.getROI()); ///7

    }


    static Bank getBank(int type) {
        if (type == GOVT_BANK) {
            return new SBI();
        } else {
            return new HDFC();
        }
    }

    /**
     * this is non-static method and it will require object to be called,
     * @param type
     * @return
     */
     Bank getBankNow(int type) {
        if (type == GOVT_BANK) {
            return new SBI();
        } else {
            return new HDFC();
        }
    }
}


abstract class Bank {
    abstract int getROI();
}


class SBI extends Bank {

    @Override
    int getROI() {
        return 7;
    }
}

class HDFC extends Bank {

    @Override
    int getROI() {
        return 9;
    }
}
