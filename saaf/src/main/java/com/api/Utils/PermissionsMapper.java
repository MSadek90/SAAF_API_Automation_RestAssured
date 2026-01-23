package com.api.Utils;

import java.util.HashMap;
import java.util.Map;

import com.api.Endpoints.AllEndPoints;
import com.api.models.UtilsModels.EndpointModel;

public class PermissionsMapper {

    private static Map<String, EndpointModel> permissionMap = new HashMap<>();

    static {

        // ======================= ADMIN NOTIFICATIONS =======================
        permissionMap.put("admin-notifications.index",
                new EndpointModel(AllEndPoints.ADMIN_NOTIFICATIONS_INDEX, "GET"));

        permissionMap.put("admin-notifications.markread",
                new EndpointModel(AllEndPoints.ADMIN_NOTIFICATIONS_MARK_READ, "POST"));

        permissionMap.put("admin-notifications.unread",
                new EndpointModel(AllEndPoints.ADMIN_NOTIFICATIONS_UNREAD, "POST"));

        // ======================= EMPLOYEE MANAGEMENT =======================
        permissionMap.put("employee.index",
                new EndpointModel(AllEndPoints.EMPLOYEES_INDEX, "GET"));

        permissionMap.put("employee.show",
                new EndpointModel(AllEndPoints.EMPLOYEES_SHOW, "GET"));

        permissionMap.put("employee.store",
                new EndpointModel(AllEndPoints.EMPLOYEES_STORE, "POST"));

        permissionMap.put("employee.update",
                new EndpointModel(AllEndPoints.EMPLOYEES_UPDATE, "PUT"));

        permissionMap.put("employee.destroy",
                new EndpointModel(AllEndPoints.EMPLOYEES_DELETE, "DELETE"));

        permissionMap.put("employee.toggle",
                new EndpointModel(AllEndPoints.EMPLOYEES_TOGGLE, "POST"));

        // ======================= ROLE MANAGEMENT =======================
        permissionMap.put("role.index",
                new EndpointModel(AllEndPoints.ROLES_INDEX, "GET"));

        permissionMap.put("role.show",
                new EndpointModel(AllEndPoints.ROLES_SHOW, "GET"));

        permissionMap.put("role.store",
                new EndpointModel(AllEndPoints.ROLES_STORE, "POST"));

        permissionMap.put("role.update",
                new EndpointModel(AllEndPoints.ROLES_UPDATE, "PUT"));

        permissionMap.put("role.destroy",
                new EndpointModel(AllEndPoints.ROLES_DELETE, "DELETE"));

        permissionMap.put("role.toggle",
                new EndpointModel(AllEndPoints.ROLES_TOGGLE, "POST"));

        // ======================= DEPARTMENTS =======================
        permissionMap.put("department.index",
                new EndpointModel(AllEndPoints.DEPARTMENTS_INDEX, "GET"));

        permissionMap.put("department.show",
                new EndpointModel(AllEndPoints.DEPARTMENTS_SHOW, "GET"));

        permissionMap.put("department.store",
                new EndpointModel(AllEndPoints.DEPARTMENTS_STORE, "POST"));

        permissionMap.put("department.update",
                new EndpointModel(AllEndPoints.DEPARTMENTS_UPDATE, "PUT"));

        permissionMap.put("department.destroy",
                new EndpointModel(AllEndPoints.DEPARTMENTS_DELETE, "DELETE"));

        permissionMap.put("department.toggle",
                new EndpointModel(AllEndPoints.DEPARTMENTS_TOGGLE, "POST"));

        permissionMap.put("department.import",
                new EndpointModel(AllEndPoints.DEPARTMENTS_IMPORT, "POST"));

        permissionMap.put("department.export",
                new EndpointModel(AllEndPoints.DEPARTMENTS_EXPORT, "POST"));

        // ======================= INVESTORS =======================
        permissionMap.put("investor.index",
                new EndpointModel(AllEndPoints.INVESTORS_INDEX, "GET"));

        permissionMap.put("investor.show",
                new EndpointModel(AllEndPoints.INVESTORS_SHOW, "GET"));

        permissionMap.put("investor.store",
                new EndpointModel(AllEndPoints.INVESTORS_STORE, "POST"));

        permissionMap.put("investor.update",
                new EndpointModel(AllEndPoints.INVESTORS_UPDATE, "PUT"));

        permissionMap.put("investor.destroy",
                new EndpointModel(AllEndPoints.INVESTORS_DELETE, "DELETE"));

        permissionMap.put("investor.toggle",
                new EndpointModel(AllEndPoints.INVESTORS_TOGGLE, "POST"));

        // ======================= FUNDS =======================

        permissionMap.put("funds.index",
                new EndpointModel(AllEndPoints.FUNDS_INDEX, "GET"));

        permissionMap.put("funds.store",
                new EndpointModel(AllEndPoints.FUNDS_STORE, "POST"));

        permissionMap.put("funds.show",
                new EndpointModel(AllEndPoints.FUNDS_SHOW, "GET"));

        permissionMap.put("funds.update",
                new EndpointModel(AllEndPoints.FUNDS_UPDATE, "PUT"));

        permissionMap.put("funds.destroy",
                new EndpointModel(AllEndPoints.FUNDS_DELETE, "DELETE"));

        permissionMap.put("funds.publish",
                new EndpointModel(AllEndPoints.FUNDS_PUBLISH, "POST"));

        permissionMap.put("funds.start",
                new EndpointModel(AllEndPoints.FUNDS_START, "POST"));

        permissionMap.put("funds.hide",
                new EndpointModel(AllEndPoints.FUNDS_HIDE, "POST"));

        permissionMap.put("funds.togglesetting",
                new EndpointModel(AllEndPoints.FUNDS_TOGGLE_SETTINGS, "PATCH"));

        permissionMap.put("funds.listinvestors",
                new EndpointModel(AllEndPoints.FUNDS_LIST_INVESTORS, "GET"));

        permissionMap.put("funds.listbankaccounts",
                new EndpointModel(AllEndPoints.FUNDS_LIST_BANK_ACCOUNTS, "GET"));

        permissionMap.put("funds.listwallettransactions",
                new EndpointModel(AllEndPoints.FUNDS_WALLET_TRANSACTIONS, "GET"));

        permissionMap.put("funds.showwallettransaction",
                new EndpointModel(AllEndPoints.FUNDS_WALLET_TRANSACTION_SHOW, "GET"));

        permissionMap.put("funds.showbalancesheet",
                new EndpointModel(AllEndPoints.FUNDS_BALANCE_SHEET, "GET"));

        permissionMap.put("funds.showincomestatement",
                new EndpointModel(AllEndPoints.FUNDS_INCOME_STATEMENT, "GET"));

        permissionMap.put("funds.listnavhistory",
                new EndpointModel(AllEndPoints.FUNDS_NAV_HISTORY, "GET"));

        permissionMap.put("funds.listlogs",
                new EndpointModel(AllEndPoints.FUNDS_LOGS, "GET"));

        permissionMap.put("funds.transferwallet",
                new EndpointModel(AllEndPoints.FUNDS_TRANSFER_WALLET, "POST"));

        permissionMap.put("funds.autotransfer",
                new EndpointModel(AllEndPoints.FUNDS_AUTO_TRANSFER, "POST"));

        permissionMap.put("funds.withdraw",
                new EndpointModel(AllEndPoints.FUNDS_WITHDRAW, "POST"));

        // ======================= KYC =======================

        permissionMap.put("kyc.index",
                new EndpointModel(AllEndPoints.KYC_INDEX, "GET"));

        permissionMap.put("kyc.store",
                new EndpointModel(AllEndPoints.KYC_STORE, "POST"));

        permissionMap.put("kyc.show",
                new EndpointModel(AllEndPoints.KYC_SHOW, "GET"));

        permissionMap.put("kyc.update",
                new EndpointModel(AllEndPoints.KYC_UPDATE, "PUT"));

        permissionMap.put("kyc.destroy",
                new EndpointModel(AllEndPoints.KYC_DELETE, "DELETE"));

        permissionMap.put("kyc.bulk",
                new EndpointModel(AllEndPoints.KYC_BULK, "POST"));

        permissionMap.put("kyc.pages",
                new EndpointModel(AllEndPoints.KYC_PAGES, "GET"));

        permissionMap.put("kyc.updateriskpage",
                new EndpointModel(AllEndPoints.KYC_UPDATE_RISK_PAGE, "PATCH"));

        permissionMap.put("kyc.export",
                new EndpointModel(AllEndPoints.KYC_EXPORT, "GET"));

        // ======================= USERS =======================

        permissionMap.put("users.index",
                new EndpointModel(AllEndPoints.USERS_INDEX, "GET"));

        permissionMap.put("users.store",
                new EndpointModel(AllEndPoints.USERS_STORE, "POST"));

        permissionMap.put("users.show",
                new EndpointModel(AllEndPoints.USERS_SHOW, "GET"));

        permissionMap.put("users.update",
                new EndpointModel(AllEndPoints.USERS_UPDATE, "PUT"));

        permissionMap.put("users.destroy",
                new EndpointModel(AllEndPoints.USERS_DELETE, "DELETE"));

        permissionMap.put("users.activate",
                new EndpointModel(AllEndPoints.USERS_ACTIVATE, "POST"));

        permissionMap.put("users.restore",
                new EndpointModel(AllEndPoints.USERS_RESTORE, "POST"));

        permissionMap.put("users.updatestatus",
                new EndpointModel(AllEndPoints.USERS_UPDATE_STATUS, "PATCH"));

        permissionMap.put("users.search",
                new EndpointModel(AllEndPoints.USERS_SEARCH, "GET"));

        // ======================= BANK ACCOUNTS =======================

        permissionMap.put("bank-accounts.index",
                new EndpointModel(AllEndPoints.BANK_ACCOUNTS_INDEX, "GET"));

        permissionMap.put("bank-accounts.store",
                new EndpointModel(AllEndPoints.BANK_ACCOUNTS_STORE, "POST"));

        permissionMap.put("bank-accounts.show",
                new EndpointModel(AllEndPoints.BANK_ACCOUNTS_SHOW, "GET"));

        permissionMap.put("bank-accounts.update",
                new EndpointModel(AllEndPoints.BANK_ACCOUNTS_UPDATE, "PUT"));

        permissionMap.put("bank-accounts.destroy",
                new EndpointModel(AllEndPoints.BANK_ACCOUNTS_DELETE, "DELETE"));

        permissionMap.put("bank-accounts.details",
                new EndpointModel(AllEndPoints.BANK_ACCOUNTS_DETAILS, "GET"));

        // ======================= AML =======================

        permissionMap.put("aml.index",
                new EndpointModel(AllEndPoints.AML_INDEX, "GET"));

        permissionMap.put("aml.store",
                new EndpointModel(AllEndPoints.AML_STORE, "POST"));

        permissionMap.put("aml.show",
                new EndpointModel(AllEndPoints.AML_SHOW, "GET"));

        permissionMap.put("aml.update",
                new EndpointModel(AllEndPoints.AML_UPDATE, "PUT"));

        permissionMap.put("aml.fetch",
                new EndpointModel(AllEndPoints.AML_FETCH, "POST"));

        permissionMap.put("aml.types",
                new EndpointModel(AllEndPoints.AML_TYPES, "GET"));

        permissionMap.put("aml.togglesafe",
                new EndpointModel(AllEndPoints.AML_TOGGLE_SAFE, "PATCH"));

        // ======================= SETTINGS =======================
        permissionMap.put("settings.index",
                new EndpointModel(AllEndPoints.SETTINGS_INDEX, "GET"));

        // ======================= HOLIDAYS =======================
        permissionMap.put("holidays.index",
                new EndpointModel(AllEndPoints.HOLIDAYS_INDEX, "GET"));
        permissionMap.put("holidays.store",
                new EndpointModel(AllEndPoints.HOLIDAYS_STORE, "POST"));
        permissionMap.put("holidays.show",
                new EndpointModel(AllEndPoints.HOLIDAYS_SHOW, "GET"));
        permissionMap.put("holidays.update",
                new EndpointModel(AllEndPoints.HOLIDAYS_UPDATE, "PUT"));
        permissionMap.put("holidays.delete",
                new EndpointModel(AllEndPoints.HOLIDAYS_DELETE, "DELETE"));
        permissionMap.put("holidays.toggle",
                new EndpointModel(AllEndPoints.HOLIDAYS_TOGGLE, "PATCH"));

        // ======================= CURRENCIES =======================
        permissionMap.put("currencies.index",
                new EndpointModel(AllEndPoints.CURRENCIES_INDEX, "GET"));
        permissionMap.put("currencies.store",
                new EndpointModel(AllEndPoints.CURRENCIES_STORE, "POST"));
        permissionMap.put("currencies.show",
                new EndpointModel(AllEndPoints.CURRENCIES_SHOW, "GET"));
        permissionMap.put("currencies.update",
                new EndpointModel(AllEndPoints.CURRENCIES_UPDATE, "PUT"));
        permissionMap.put("currencies.delete",
                new EndpointModel(AllEndPoints.CURRENCIES_DELETE, "DELETE"));
        permissionMap.put("currencies.updateExchangeRates",
                new EndpointModel(AllEndPoints.CURRENCIES_UPDATE_EXCHANGE_RATES, "POST"));
        permissionMap.put("currencies.toggle",
                new EndpointModel(AllEndPoints.CURRENCIES_TOGGLE, "PATCH"));

        // ======================= COUNTRIES =======================
        permissionMap.put("countries.index",
                new EndpointModel(AllEndPoints.COUNTRIES_INDEX, "GET"));
        permissionMap.put("countries.store",
                new EndpointModel(AllEndPoints.COUNTRIES_STORE, "POST"));
        permissionMap.put("countries.show",
                new EndpointModel(AllEndPoints.COUNTRIES_SHOW, "GET"));
        permissionMap.put("countries.update",
                new EndpointModel(AllEndPoints.COUNTRIES_UPDATE, "PUT"));
        permissionMap.put("countries.delete",
                new EndpointModel(AllEndPoints.COUNTRIES_DELETE, "DELETE"));
        permissionMap.put("countries.toggle",
                new EndpointModel(AllEndPoints.COUNTRIES_TOGGLE, "PATCH"));

        // ======================= CITIES =======================
        permissionMap.put("cities.index",
                new EndpointModel(AllEndPoints.CITIES_INDEX, "GET"));
        permissionMap.put("cities.store",
                new EndpointModel(AllEndPoints.CITIES_STORE, "POST"));
        permissionMap.put("cities.show",
                new EndpointModel(AllEndPoints.CITIES_SHOW, "GET"));
        permissionMap.put("cities.update",
                new EndpointModel(AllEndPoints.CITIES_UPDATE, "PUT"));
        permissionMap.put("cities.delete",
                new EndpointModel(AllEndPoints.CITIES_DELETE, "DELETE"));
        permissionMap.put("cities.toggle",
                new EndpointModel(AllEndPoints.CITIES_TOGGLE, "PATCH"));

        // ======================= NATIONALITIES =======================
        permissionMap.put("nationalities.index",
                new EndpointModel(AllEndPoints.NATIONALITIES_INDEX, "GET"));
        permissionMap.put("nationalities.store",
                new EndpointModel(AllEndPoints.NATIONALITIES_STORE, "POST"));
        permissionMap.put("nationalities.show",
                new EndpointModel(AllEndPoints.NATIONALITIES_SHOW, "GET"));
        permissionMap.put("nationalities.update",
                new EndpointModel(AllEndPoints.NATIONALITIES_UPDATE, "PUT"));
        permissionMap.put("nationalities.delete",
                new EndpointModel(AllEndPoints.NATIONALITIES_DELETE, "DELETE"));
        permissionMap.put("nationalities.toggle",
                new EndpointModel(AllEndPoints.NATIONALITIES_TOGGLE, "PATCH"));
        permissionMap.put("nationalities.logs",
                new EndpointModel(AllEndPoints.NATIONALITIES_LOGS, "GET"));

        // ======================= JOBS =======================
        permissionMap.put("jobs.index",
                new EndpointModel(AllEndPoints.JOBS_INDEX, "GET"));
        permissionMap.put("jobs.store",
                new EndpointModel(AllEndPoints.JOBS_STORE, "POST"));
        permissionMap.put("jobs.show",
                new EndpointModel(AllEndPoints.JOBS_SHOW, "GET"));
        permissionMap.put("jobs.update",
                new EndpointModel(AllEndPoints.JOBS_UPDATE, "PUT"));
        permissionMap.put("jobs.delete",
                new EndpointModel(AllEndPoints.JOBS_DELETE, "DELETE"));
        permissionMap.put("jobs.toggle",
                new EndpointModel(AllEndPoints.JOBS_TOGGLE, "PATCH"));
        permissionMap.put("jobs.logs",
                new EndpointModel(AllEndPoints.JOBS_LOGS, "GET"));

        // ======================= COMPANIES =======================
        permissionMap.put("companies.index",
                new EndpointModel(AllEndPoints.COMPANIES_INDEX, "GET"));
        permissionMap.put("companies.store",
                new EndpointModel(AllEndPoints.COMPANIES_STORE, "POST"));
        permissionMap.put("companies.show",
                new EndpointModel(AllEndPoints.COMPANIES_SHOW, "GET"));
        permissionMap.put("companies.update",
                new EndpointModel(AllEndPoints.COMPANIES_UPDATE, "PUT"));
        permissionMap.put("companies.delete",
                new EndpointModel(AllEndPoints.COMPANIES_DELETE, "DELETE"));

        // ======================= FUND FEES =======================
        permissionMap.put("fundFees.index",
                new EndpointModel(AllEndPoints.FUND_FEES_INDEX, "GET"));
        permissionMap.put("fundFees.store",
                new EndpointModel(AllEndPoints.FUND_FEES_STORE, "POST"));
        permissionMap.put("fundFees.show",
                new EndpointModel(AllEndPoints.FUND_FEES_SHOW, "GET"));
        permissionMap.put("fundFees.update",
                new EndpointModel(AllEndPoints.FUND_FEES_UPDATE, "PUT"));
        permissionMap.put("fundFees.delete",
                new EndpointModel(AllEndPoints.FUND_FEES_DELETE, "DELETE"));
        permissionMap.put("fundFees.import",
                new EndpointModel(AllEndPoints.FUND_FEES_IMPORT, "POST"));

        // ======================= FUND CATEGORIES =======================
        permissionMap.put("fundCategories.index",
                new EndpointModel(AllEndPoints.FUND_CATEGORIES_INDEX, "GET"));
        permissionMap.put("fundCategories.store",
                new EndpointModel(AllEndPoints.FUND_CATEGORIES_STORE, "POST"));
        permissionMap.put("fundCategories.show",
                new EndpointModel(AllEndPoints.FUND_CATEGORIES_SHOW, "GET"));
        permissionMap.put("fundCategories.update",
                new EndpointModel(AllEndPoints.FUND_CATEGORIES_UPDATE, "PUT"));
        permissionMap.put("fundCategories.delete",
                new EndpointModel(AllEndPoints.FUND_CATEGORIES_DELETE, "DELETE"));
        permissionMap.put("fundCategories.toggle",
                new EndpointModel(AllEndPoints.FUND_CATEGORIES_TOGGLE, "PATCH"));
        permissionMap.put("fundCategories.logs",
                new EndpointModel(AllEndPoints.FUND_CATEGORIES_LOGS, "GET"));

        // ======================= FUND BROKERS =======================
        permissionMap.put("fundBrokers.index",
                new EndpointModel(AllEndPoints.FUND_BROKERS_INDEX, "GET"));
        permissionMap.put("fundBrokers.store",
                new EndpointModel(AllEndPoints.FUND_BROKERS_STORE, "POST"));
        permissionMap.put("fundBrokers.show",
                new EndpointModel(AllEndPoints.FUND_BROKERS_SHOW, "GET"));
        permissionMap.put("fundBrokers.update",
                new EndpointModel(AllEndPoints.FUND_BROKERS_UPDATE, "PUT"));
        permissionMap.put("fundBrokers.delete",
                new EndpointModel(AllEndPoints.FUND_BROKERS_DELETE, "DELETE"));
        permissionMap.put("fundBrokers.toggle",
                new EndpointModel(AllEndPoints.FUND_BROKERS_TOGGLE, "PATCH"));
        permissionMap.put("fundBrokers.import",
                new EndpointModel(AllEndPoints.FUND_BROKERS_IMPORT, "POST"));
        permissionMap.put("fundBrokers.logs",
                new EndpointModel(AllEndPoints.FUND_BROKERS_LOGS, "GET"));

        // ======================= FUND MANAGERS =======================
        permissionMap.put("fundManagers.index",
                new EndpointModel(AllEndPoints.FUND_MANAGERS_INDEX, "GET"));
        permissionMap.put("fundManagers.store",
                new EndpointModel(AllEndPoints.FUND_MANAGERS_STORE, "POST"));
        permissionMap.put("fundManagers.show",
                new EndpointModel(AllEndPoints.FUND_MANAGERS_SHOW, "GET"));
        permissionMap.put("fundManagers.update",
                new EndpointModel(AllEndPoints.FUND_MANAGERS_UPDATE, "PUT"));
        permissionMap.put("fundManagers.delete",
                new EndpointModel(AllEndPoints.FUND_MANAGERS_DELETE, "DELETE"));
        permissionMap.put("fundManagers.toggle",
                new EndpointModel(AllEndPoints.FUND_MANAGERS_TOGGLE, "PATCH"));
        permissionMap.put("fundManagers.import",
                new EndpointModel(AllEndPoints.FUND_MANAGERS_IMPORT, "POST"));

        // ======================= MARKET COVERAGE =======================
        permissionMap.put("marketCoverage.index",
                new EndpointModel(AllEndPoints.MARKET_COVERAGE_INDEX, "GET"));
        permissionMap.put("marketCoverage.store",
                new EndpointModel(AllEndPoints.MARKET_COVERAGE_STORE, "POST"));
        permissionMap.put("marketCoverage.show",
                new EndpointModel(AllEndPoints.MARKET_COVERAGE_SHOW, "GET"));
        permissionMap.put("marketCoverage.update",
                new EndpointModel(AllEndPoints.MARKET_COVERAGE_UPDATE, "PUT"));
        permissionMap.put("marketCoverage.toggle",
                new EndpointModel(AllEndPoints.MARKET_COVERAGE_TOGGLE, "PATCH"));
        permissionMap.put("marketCoverage.import",
                new EndpointModel(AllEndPoints.MARKET_COVERAGE_IMPORT, "POST"));

        // ======================= TIME DEPOSITS =======================
        permissionMap.put("timeDeposits.index",
                new EndpointModel(AllEndPoints.TIME_DEPOSITS_INDEX, "GET"));
        permissionMap.put("timeDeposits.store",
                new EndpointModel(AllEndPoints.TIME_DEPOSITS_STORE, "POST"));
        permissionMap.put("timeDeposits.show",
                new EndpointModel(AllEndPoints.TIME_DEPOSITS_SHOW, "GET"));
        permissionMap.put("timeDeposits.update",
                new EndpointModel(AllEndPoints.TIME_DEPOSITS_UPDATE, "PUT"));
        permissionMap.put("timeDeposits.delete",
                new EndpointModel(AllEndPoints.TIME_DEPOSITS_DELETE, "DELETE"));
        permissionMap.put("timeDeposits.post",
                new EndpointModel(AllEndPoints.TIME_DEPOSITS_POST, "POST"));
        permissionMap.put("timeDeposits.liquidate",
                new EndpointModel(AllEndPoints.TIME_DEPOSITS_LIQUIDATE, "POST"));
        permissionMap.put("timeDeposits.break",
                new EndpointModel(AllEndPoints.TIME_DEPOSITS_BREAK, "POST"));
        permissionMap.put("timeDeposits.return",
                new EndpointModel(AllEndPoints.TIME_DEPOSITS_RETURN, "POST"));
        permissionMap.put("timeDeposits.interestTypes",
                new EndpointModel(AllEndPoints.TIME_DEPOSITS_INTEREST_TYPES, "GET"));

        // ======================= LOANS =======================
        permissionMap.put("loans.index",
                new EndpointModel(AllEndPoints.LOANS_INDEX, "GET"));
        permissionMap.put("loans.store",
                new EndpointModel(AllEndPoints.LOANS_STORE, "POST"));
        permissionMap.put("loans.show",
                new EndpointModel(AllEndPoints.LOANS_SHOW, "GET"));
        permissionMap.put("loans.update",
                new EndpointModel(AllEndPoints.LOANS_UPDATE, "PUT"));
        permissionMap.put("loans.delete",
                new EndpointModel(AllEndPoints.LOANS_DELETE, "DELETE"));
        permissionMap.put("loans.post",
                new EndpointModel(AllEndPoints.LOANS_POST, "POST"));
        permissionMap.put("loans.settle",
                new EndpointModel(AllEndPoints.LOANS_SETTLE, "POST"));
        permissionMap.put("loans.addFinanceCost",
                new EndpointModel(AllEndPoints.LOANS_ADD_FINANCE_COST, "POST"));
        permissionMap.put("loans.payFinanceCost",
                new EndpointModel(AllEndPoints.LOANS_PAY_FINANCE_COST, "POST"));

        // ======================= STOCKS =======================
        permissionMap.put("stocks.index",
                new EndpointModel(AllEndPoints.STOCKS_INDEX, "GET"));
        permissionMap.put("stocks.store",
                new EndpointModel(AllEndPoints.STOCKS_STORE, "POST"));
        permissionMap.put("stocks.show",
                new EndpointModel(AllEndPoints.STOCKS_SHOW, "GET"));
        permissionMap.put("stocks.update",
                new EndpointModel(AllEndPoints.STOCKS_UPDATE, "PUT"));
        permissionMap.put("stocks.delete",
                new EndpointModel(AllEndPoints.STOCKS_DELETE, "DELETE"));
        permissionMap.put("stocks.uploadBulk",
                new EndpointModel(AllEndPoints.STOCKS_UPLOAD_BULK, "POST"));
        permissionMap.put("stocks.suspend",
                new EndpointModel(AllEndPoints.STOCKS_SUSPEND, "POST"));
        permissionMap.put("stocks.activate",
                new EndpointModel(AllEndPoints.STOCKS_ACTIVATE, "POST"));
        permissionMap.put("stocks.updatePrice",
                new EndpointModel(AllEndPoints.STOCKS_UPDATE_PRICE, "POST"));
        permissionMap.put("stocks.dividend",
                new EndpointModel(AllEndPoints.STOCKS_DIVIDEND, "POST"));
        permissionMap.put("stocks.split",
                new EndpointModel(AllEndPoints.STOCKS_SPLIT, "POST"));
        permissionMap.put("stocks.delist",
                new EndpointModel(AllEndPoints.STOCKS_DELIST, "POST"));
        permissionMap.put("stocks.storeOrder",
                new EndpointModel(AllEndPoints.STOCKS_STORE_ORDER, "POST"));
        permissionMap.put("stocks.showOrder",
                new EndpointModel(AllEndPoints.STOCKS_SHOW_ORDER, "GET"));
        permissionMap.put("stocks.updateOrder",
                new EndpointModel(AllEndPoints.STOCKS_UPDATE_ORDER, "PUT"));

        // ======================= SUKUKS =======================
        permissionMap.put("sukuks.index",
                new EndpointModel(AllEndPoints.SUKUKS_INDEX, "GET"));
        permissionMap.put("sukuks.store",
                new EndpointModel(AllEndPoints.SUKUKS_STORE, "POST"));
        permissionMap.put("sukuks.show",
                new EndpointModel(AllEndPoints.SUKUKS_SHOW, "GET"));
        permissionMap.put("sukuks.update",
                new EndpointModel(AllEndPoints.SUKUKS_UPDATE, "PUT"));
        permissionMap.put("sukuks.delete",
                new EndpointModel(AllEndPoints.SUKUKS_DELETE, "DELETE"));
        permissionMap.put("sukuks.updatePrice",
                new EndpointModel(AllEndPoints.SUKUKS_UPDATE_PRICE, "POST"));
        permissionMap.put("sukuks.addCoupon",
                new EndpointModel(AllEndPoints.SUKUKS_ADD_COUPON, "POST"));
        permissionMap.put("sukuks.toggle",
                new EndpointModel(AllEndPoints.SUKUKS_TOGGLE, "PATCH"));
        permissionMap.put("sukuks.storeOrder",
                new EndpointModel(AllEndPoints.SUKUKS_STORE_ORDER, "POST"));
        permissionMap.put("sukuks.showOrder",
                new EndpointModel(AllEndPoints.SUKUKS_SHOW_ORDER, "GET"));
        permissionMap.put("sukuks.updateOrder",
                new EndpointModel(AllEndPoints.SUKUKS_UPDATE_ORDER, "PUT"));
        permissionMap.put("sukuks.logs",
                new EndpointModel(AllEndPoints.SUKUKS_LOGS, "GET"));

        // ======================= MMF =======================
        permissionMap.put("mmf.index",
                new EndpointModel(AllEndPoints.MMF_INDEX, "GET"));
        permissionMap.put("mmf.store",
                new EndpointModel(AllEndPoints.MMF_STORE, "POST"));
        permissionMap.put("mmf.show",
                new EndpointModel(AllEndPoints.MMF_SHOW, "GET"));
        permissionMap.put("mmf.update",
                new EndpointModel(AllEndPoints.MMF_UPDATE, "PUT"));
        permissionMap.put("mmf.delete",
                new EndpointModel(AllEndPoints.MMF_DELETE, "DELETE"));
        permissionMap.put("mmf.updatePrice",
                new EndpointModel(AllEndPoints.MMF_UPDATE_PRICE, "POST"));
        permissionMap.put("mmf.dividend",
                new EndpointModel(AllEndPoints.MMF_DIVIDEND, "POST"));
        permissionMap.put("mmf.toggle",
                new EndpointModel(AllEndPoints.MMF_TOGGLE, "PATCH"));

        permissionMap.put("mmf.storeOrder",
                new EndpointModel(AllEndPoints.MMF_STORE_ORDER, "POST"));
        permissionMap.put("mmf.showOrder",
                new EndpointModel(AllEndPoints.MMF_SHOW_ORDER, "GET"));
        permissionMap.put("mmf.updateOrder",
                new EndpointModel(AllEndPoints.MMF_UPDATE_ORDER, "PUT"));
        permissionMap.put("mmf.approveOrder",
                new EndpointModel(AllEndPoints.MMF_APPROVE_ORDER, "PATCH"));
        permissionMap.put("mmf.rejectOrder",
                new EndpointModel(AllEndPoints.MMF_REJECT_ORDER, "PATCH"));
        permissionMap.put("mmf.settleOrder",
                new EndpointModel(AllEndPoints.MMF_SETTLE_ORDER, "POST"));
        permissionMap.put("mmf.logs",
                new EndpointModel(AllEndPoints.MMF_LOGS, "GET"));
        permissionMap.put("mmf.showHolding",
                new EndpointModel(AllEndPoints.MMF_SHOW_HOLDING, "GET"));

        // ======================= PROJECTS =======================
        permissionMap.put("projects.index",
                new EndpointModel(AllEndPoints.PROJECTS_INDEX, "GET"));
        permissionMap.put("projects.store",
                new EndpointModel(AllEndPoints.PROJECTS_STORE, "POST"));
        permissionMap.put("projects.show",
                new EndpointModel(AllEndPoints.PROJECTS_SHOW, "GET"));
        permissionMap.put("projects.update",
                new EndpointModel(AllEndPoints.PROJECTS_UPDATE, "PUT"));
        permissionMap.put("projects.delete",
                new EndpointModel(AllEndPoints.PROJECTS_DELETE, "DELETE"));
        permissionMap.put("projects.toggle",
                new EndpointModel(AllEndPoints.PROJECTS_TOGGLE, "PATCH"));
        permissionMap.put("projects.logs",
                new EndpointModel(AllEndPoints.PROJECTS_LOGS, "GET"));

        permissionMap.put("projects.sell",
                new EndpointModel(AllEndPoints.PROJECTS_SELL, "POST"));
        permissionMap.put("projects.receivePayment",
                new EndpointModel(AllEndPoints.PROJECTS_RECEIVE_PAYMENT, "POST"));
        permissionMap.put("projects.deliver",
                new EndpointModel(AllEndPoints.PROJECTS_DELIVER, "POST"));
        permissionMap.put("projects.returnAdvance",
                new EndpointModel(AllEndPoints.PROJECTS_RETURN_ADVANCE, "POST"));
        permissionMap.put("projects.phaseUpdate",
                new EndpointModel(AllEndPoints.PROJECTS_PHASE_UPDATE, "PATCH"));
        permissionMap.put("projects.linkFund",
                new EndpointModel(AllEndPoints.PROJECTS_LINK_FUND, "POST"));

        permissionMap.put("projects.evaluationHistory",
                new EndpointModel(AllEndPoints.PROJECTS_EVALUATION_HISTORY, "GET"));
        permissionMap.put("projects.evaluationStore",
                new EndpointModel(AllEndPoints.PROJECTS_EVALUATION_STORE, "POST"));

        // ======================= PROJECT UNITS =======================
        permissionMap.put("projectUnits.index",
                new EndpointModel(AllEndPoints.PROJECT_UNITS_INDEX, "GET"));
        permissionMap.put("projectUnits.store",
                new EndpointModel(AllEndPoints.PROJECT_UNITS_STORE, "POST"));
        permissionMap.put("projectUnits.show",
                new EndpointModel(AllEndPoints.PROJECT_UNITS_SHOW, "GET"));
        permissionMap.put("projectUnits.update",
                new EndpointModel(AllEndPoints.PROJECT_UNITS_UPDATE, "PUT"));
        permissionMap.put("projectUnits.delete",
                new EndpointModel(AllEndPoints.PROJECT_UNITS_DELETE, "DELETE"));
        permissionMap.put("projectUnits.logs",
                new EndpointModel(AllEndPoints.PROJECT_UNITS_LOGS, "GET"));

        permissionMap.put("projectUnits.sell",
                new EndpointModel(AllEndPoints.PROJECT_UNITS_SELL, "POST"));
        permissionMap.put("projectUnits.receivePayment",
                new EndpointModel(AllEndPoints.PROJECT_UNITS_RECEIVE_PAYMENT, "POST"));
        permissionMap.put("projectUnits.deliver",
                new EndpointModel(AllEndPoints.PROJECT_UNITS_DELIVER, "POST"));
        permissionMap.put("projectUnits.returnAdvance",
                new EndpointModel(AllEndPoints.PROJECT_UNITS_RETURN_ADVANCE, "POST"));
        permissionMap.put("projectUnits.lease",
                new EndpointModel(AllEndPoints.PROJECT_UNITS_LEASE, "POST"));

        // ======================= DEVELOPERS =======================
        permissionMap.put("developers.index",
                new EndpointModel(AllEndPoints.DEVELOPERS_INDEX, "GET"));
        permissionMap.put("developers.store",
                new EndpointModel(AllEndPoints.DEVELOPERS_STORE, "POST"));
        permissionMap.put("developers.show",
                new EndpointModel(AllEndPoints.DEVELOPERS_SHOW, "GET"));
        permissionMap.put("developers.update",
                new EndpointModel(AllEndPoints.DEVELOPERS_UPDATE, "PUT"));
        permissionMap.put("developers.delete",
                new EndpointModel(AllEndPoints.DEVELOPERS_DELETE, "DELETE"));
        permissionMap.put("developers.toggle",
                new EndpointModel(AllEndPoints.DEVELOPERS_TOGGLE, "PATCH"));

        // ======================= WALLETS MANAGEMENT =======================
        permissionMap.put("walletsManagement.index",
                new EndpointModel(AllEndPoints.WALLETS_MANAGEMENT_INDEX, "GET"));
        permissionMap.put("walletsManagement.store",
                new EndpointModel(AllEndPoints.WALLETS_MANAGEMENT_STORE, "POST"));
        permissionMap.put("walletsManagement.show",
                new EndpointModel(AllEndPoints.WALLETS_MANAGEMENT_SHOW, "GET"));
        permissionMap.put("walletsManagement.update",
                new EndpointModel(AllEndPoints.WALLETS_MANAGEMENT_UPDATE, "PUT"));
        permissionMap.put("walletsManagement.delete",
                new EndpointModel(AllEndPoints.WALLETS_MANAGEMENT_DELETE, "DELETE"));
        permissionMap.put("walletsManagement.activities",
                new EndpointModel(AllEndPoints.WALLETS_MANAGEMENT_ACTIVITIES, "GET"));
        permissionMap.put("walletsManagement.transactions",
                new EndpointModel(AllEndPoints.WALLETS_MANAGEMENT_TRANSACTIONS, "GET"));
        permissionMap.put("walletsManagement.export",
                new EndpointModel(AllEndPoints.WALLETS_MANAGEMENT_EXPORT, "GET"));

        // ======================= WALLETS REQUESTS =======================
        permissionMap.put("walletsRequests.index",
                new EndpointModel(AllEndPoints.WALLETS_REQUESTS_INDEX, "GET"));
        permissionMap.put("walletsRequests.store",
                new EndpointModel(AllEndPoints.WALLETS_REQUESTS_STORE, "POST"));
        permissionMap.put("walletsRequests.show",
                new EndpointModel(AllEndPoints.WALLETS_REQUESTS_SHOW, "GET"));
        permissionMap.put("walletsRequests.update",
                new EndpointModel(AllEndPoints.WALLETS_REQUESTS_UPDATE, "PUT"));
        permissionMap.put("walletsRequests.delete",
                new EndpointModel(AllEndPoints.WALLETS_REQUESTS_DELETE, "DELETE"));
        permissionMap.put("walletsRequests.updateStatus",
                new EndpointModel(AllEndPoints.WALLETS_REQUESTS_UPDATE_STATUS, "PATCH"));

        // ======================= HOME =======================
        permissionMap.put("home.statistics",
                new EndpointModel(AllEndPoints.HOME_STATISTICS, "GET"));
        permissionMap.put("home.offeringFunds",
                new EndpointModel(AllEndPoints.HOME_OFFERING_FUNDS, "GET"));

        // ======================= GROUPS =======================
        permissionMap.put("groups.index",
                new EndpointModel(AllEndPoints.GROUPS_INDEX, "GET"));
        permissionMap.put("groups.store",
                new EndpointModel(AllEndPoints.GROUPS_STORE, "POST"));
        permissionMap.put("groups.show",
                new EndpointModel(AllEndPoints.GROUPS_SHOW, "GET"));

    }



    public static EndpointModel getEndPoint(String permission){
        return permissionMap.get(permission);
    }

}
