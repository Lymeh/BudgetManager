package com.lymeh.dv.budgetmanager.models

/**
 * Created by Guillaume Poignant on 10/04/2019.
 */
data class Budget(var amount: Int, var category: Category, var range: BudgetTimeRange = BudgetTimeRange.MONTH)