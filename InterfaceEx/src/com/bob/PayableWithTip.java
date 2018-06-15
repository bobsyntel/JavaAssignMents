package com.bob;

public interface PayableWithTip extends Payable {
    public void addTipToTotal(double tipAmt);
}
