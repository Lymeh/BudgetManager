package com.lymeh.dv.budgetmanager.models

/**
 * Created by Guillaume Poignant on 10/04/2019.
 */
const val NO_CATEGORY_CODE = -1;
class Transaction {
    var amount: Int = 0;
    var info: String = "";
    var extra_info: String = "";
    var date: Long = 0;
    var currency: String = "€";
    var categoryCode: Int = NO_CATEGORY_CODE;
}
