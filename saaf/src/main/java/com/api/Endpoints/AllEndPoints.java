package com.api.Endpoints;

public class AllEndPoints {

    // Admin Notifications

    public static final String ADMIN_NOTIFICATIONS_INDEX = "/admin-notifications";
    public static final String ADMIN_NOTIFICATIONS_MARK_READ = "/admin-notifications/{id}/markread";
    public static final String ADMIN_NOTIFICATIONS_UNREAD = "/admin-notifications/{id}/unread";

    // Employees
    public static final String EMPLOYEES_INDEX = "/employees";
    public static final String EMPLOYEES_STORE = "/employees";
    public static final String EMPLOYEES_SHOW = "/employees/{id}";
    public static final String EMPLOYEES_UPDATE = "/employees/{id}";
    public static final String EMPLOYEES_DELETE = "/employees/{id}";
    public static final String EMPLOYEES_TOGGLE = "/employees/{id}/toggle";

    // Roles
    public static final String ROLES_INDEX = "/roles";
    public static final String ROLES_STORE = "/roles";
    public static final String ROLES_SHOW = "/roles/{id}";
    public static final String ROLES_UPDATE = "/roles/{id}";
    public static final String ROLES_DELETE = "/roles/{id}";
    public static final String ROLES_TOGGLE = "/roles/{id}/toggle";

    // Departments
    public static final String DEPARTMENTS_INDEX = "/departments";
    public static final String DEPARTMENTS_STORE = "/departments";
    public static final String DEPARTMENTS_SHOW = "/departments/{id}";
    public static final String DEPARTMENTS_UPDATE = "/departments/{id}";
    public static final String DEPARTMENTS_DELETE = "/departments/{id}";
    public static final String DEPARTMENTS_TOGGLE = "/departments/{id}/toggle";
    public static final String DEPARTMENTS_IMPORT = "/departments/import";
    public static final String DEPARTMENTS_EXPORT = "/departments/export";

    // Investors
    public static final String INVESTORS_INDEX = "/investors";
    public static final String INVESTORS_STORE = "/investors";
    public static final String INVESTORS_SHOW = "/investors/{id}";
    public static final String INVESTORS_UPDATE = "/investors/{id}";
    public static final String INVESTORS_DELETE = "/investors/{id}";
    public static final String INVESTORS_TOGGLE = "/investors/{id}/toggle";

    // Funds
    public static final String FUNDS_INDEX = "/funds";
    public static final String FUNDS_STORE = "/funds";
    public static final String FUNDS_SHOW = "/funds/{id}";
    public static final String FUNDS_UPDATE = "/funds/{id}";
    public static final String FUNDS_DELETE = "/funds/{id}";
    public static final String FUNDS_PUBLISH = "/funds/{id}/publish";
    public static final String FUNDS_START = "/funds/{id}/start";
    public static final String FUNDS_HIDE = "/funds/{id}/hide";
    public static final String FUNDS_TOGGLE_SETTINGS = "/funds/{id}/togglesetting";

    public static final String FUNDS_LIST_INVESTORS = "/funds/{id}/investors";
    public static final String FUNDS_LIST_BANK_ACCOUNTS = "/funds/{id}/bank-accounts";
    public static final String FUNDS_WALLET_TRANSACTIONS = "/funds/{id}/wallet-transactions";
    public static final String FUNDS_WALLET_TRANSACTION_SHOW = "/funds/{id}/wallet-transactions/{transactionId}";

    public static final String FUNDS_BALANCE_SHEET = "/funds/{id}/balance-sheet";
    public static final String FUNDS_INCOME_STATEMENT = "/funds/{id}/income-statement";
    public static final String FUNDS_NAV_HISTORY = "/funds/{id}/nav-history";
    public static final String FUNDS_LOGS = "/funds/{id}/logs";

    public static final String FUNDS_TRANSFER_WALLET = "/funds/{id}/transfer-wallet";
    public static final String FUNDS_AUTO_TRANSFER = "/funds/{id}/auto-transfer";
    public static final String FUNDS_WITHDRAW = "/funds/{id}/withdraw";

    // KYC

    public static final String KYC_INDEX = "/kyc";
    public static final String KYC_STORE = "/kyc";
    public static final String KYC_SHOW = "/kyc/{id}";
    public static final String KYC_UPDATE = "/kyc/{id}";
    public static final String KYC_DELETE = "/kyc/{id}";
    public static final String KYC_BULK = "/kyc/bulk";
    public static final String KYC_PAGES = "/kyc/pages";
    public static final String KYC_UPDATE_RISK_PAGE = "/kyc/{id}/update-risk-page";
    public static final String KYC_EXPORT = "/kyc/export";

    // Users
    public static final String USERS_INDEX = "/users";
    public static final String USERS_STORE = "/users";
    public static final String USERS_SHOW = "/users/{id}";
    public static final String USERS_UPDATE = "/users/{id}";
    public static final String USERS_DELETE = "/users/{id}";
    public static final String USERS_ACTIVATE = "/users/{id}/activate";
    public static final String USERS_RESTORE = "/users/{id}/restore";
    public static final String USERS_UPDATE_STATUS = "/users/{id}/status";
    public static final String USERS_SEARCH = "/users/search";

    // bank accounts
    public static final String BANK_ACCOUNTS_INDEX = "/bank-accounts";
    public static final String BANK_ACCOUNTS_STORE = "/bank-accounts";
    public static final String BANK_ACCOUNTS_SHOW = "/bank-accounts/{id}";
    public static final String BANK_ACCOUNTS_UPDATE = "/bank-accounts/{id}";
    public static final String BANK_ACCOUNTS_DELETE = "/bank-accounts/{id}";
    public static final String BANK_ACCOUNTS_DETAILS = "/bank-accounts/{id}/details";

    // AML
    public static final String AML_INDEX = "/aml";
    public static final String AML_STORE = "/aml";
    public static final String AML_SHOW = "/aml/{id}";
    public static final String AML_UPDATE = "/aml/{id}";
    public static final String AML_FETCH = "/aml/fetch";
    public static final String AML_TYPES = "/aml/types";
    public static final String AML_TOGGLE_SAFE = "/aml/{id}/toggle-safe";

    // settings
    public static final String SETTINGS_INDEX = "/settings";

    // Holidays
    public static final String HOLIDAYS_INDEX = "/holidays";
    public static final String HOLIDAYS_STORE = "/holidays";
    public static final String HOLIDAYS_SHOW = "/holidays/{id}";
    public static final String HOLIDAYS_UPDATE = "/holidays/{id}";
    public static final String HOLIDAYS_DELETE = "/holidays/{id}";
    public static final String HOLIDAYS_TOGGLE = "/holidays/{id}/toggle";

    // Currencies
    public static final String CURRENCIES_INDEX = "/currencies";
    public static final String CURRENCIES_STORE = "/currencies";
    public static final String CURRENCIES_SHOW = "/currencies/{id}";
    public static final String CURRENCIES_UPDATE = "/currencies/{id}";
    public static final String CURRENCIES_DELETE = "/currencies/{id}";
    public static final String CURRENCIES_UPDATE_EXCHANGE_RATES = "/currencies/update-exchange-rates";
    public static final String CURRENCIES_TOGGLE = "/currencies/{id}/toggle";

    // Countries
    public static final String COUNTRIES_INDEX = "/countries";
    public static final String COUNTRIES_STORE = "/countries";
    public static final String COUNTRIES_SHOW = "/countries/{id}";
    public static final String COUNTRIES_UPDATE = "/countries/{id}";
    public static final String COUNTRIES_DELETE = "/countries/{id}";
    public static final String COUNTRIES_TOGGLE = "/countries/{id}/toggle";

    // Cities
    public static final String CITIES_INDEX = "/cities";
    public static final String CITIES_STORE = "/cities";
    public static final String CITIES_SHOW = "/cities/{id}";
    public static final String CITIES_UPDATE = "/cities/{id}";
    public static final String CITIES_DELETE = "/cities/{id}";
    public static final String CITIES_TOGGLE = "/cities/{id}/toggle";

    // Nationalities
    public static final String NATIONALITIES_INDEX = "/nationalities";
    public static final String NATIONALITIES_STORE = "/nationalities";
    public static final String NATIONALITIES_SHOW = "/nationalities/{id}";
    public static final String NATIONALITIES_UPDATE = "/nationalities/{id}";
    public static final String NATIONALITIES_DELETE = "/nationalities/{id}";
    public static final String NATIONALITIES_TOGGLE = "/nationalities/{id}/toggle";
    public static final String NATIONALITIES_LOGS = "/nationalities/{id}/logs";

    // Jobs
    public static final String JOBS_INDEX = "/jobs";
    public static final String JOBS_STORE = "/jobs";
    public static final String JOBS_SHOW = "/jobs/{id}";
    public static final String JOBS_UPDATE = "/jobs/{id}";
    public static final String JOBS_DELETE = "/jobs/{id}";
    public static final String JOBS_TOGGLE = "/jobs/{id}/toggle";
    public static final String JOBS_LOGS = "/jobs/{id}/logs";

    // Companies
    public static final String COMPANIES_INDEX = "/companies";
    public static final String COMPANIES_STORE = "/companies";
    public static final String COMPANIES_SHOW = "/companies/{id}";
    public static final String COMPANIES_UPDATE = "/companies/{id}";
    public static final String COMPANIES_DELETE = "/companies/{id}";

    // Fund Fees
    public static final String FUND_FEES_INDEX = "/fund-fees";
    public static final String FUND_FEES_STORE = "/fund-fees";
    public static final String FUND_FEES_SHOW = "/fund-fees/{id}";
    public static final String FUND_FEES_UPDATE = "/fund-fees/{id}";
    public static final String FUND_FEES_DELETE = "/fund-fees/{id}";
    public static final String FUND_FEES_IMPORT = "/fund-fees/import";

    // Fund Categories
    public static final String FUND_CATEGORIES_INDEX = "/fund-categories";
    public static final String FUND_CATEGORIES_STORE = "/fund-categories";
    public static final String FUND_CATEGORIES_SHOW = "/fund-categories/{id}";
    public static final String FUND_CATEGORIES_UPDATE = "/fund-categories/{id}";
    public static final String FUND_CATEGORIES_DELETE = "/fund-categories/{id}";
    public static final String FUND_CATEGORIES_TOGGLE = "/fund-categories/{id}/toggle";
    public static final String FUND_CATEGORIES_LOGS = "/fund-categories/{id}/logs";

    // Fund Brokers
    public static final String FUND_BROKERS_INDEX = "/fund-brokers";
    public static final String FUND_BROKERS_STORE = "/fund-brokers";
    public static final String FUND_BROKERS_SHOW = "/fund-brokers/{id}";
    public static final String FUND_BROKERS_UPDATE = "/fund-brokers/{id}";
    public static final String FUND_BROKERS_DELETE = "/fund-brokers/{id}";
    public static final String FUND_BROKERS_TOGGLE = "/fund-brokers/{id}/toggle";
    public static final String FUND_BROKERS_IMPORT = "/fund-brokers/import";
    public static final String FUND_BROKERS_LOGS = "/fund-brokers/{id}/logs";

    // Fund Managers
    public static final String FUND_MANAGERS_INDEX = "/fund-managers";
    public static final String FUND_MANAGERS_STORE = "/fund-managers";
    public static final String FUND_MANAGERS_SHOW = "/fund-managers/{id}";
    public static final String FUND_MANAGERS_UPDATE = "/fund-managers/{id}";
    public static final String FUND_MANAGERS_DELETE = "/fund-managers/{id}";
    public static final String FUND_MANAGERS_TOGGLE = "/fund-managers/{id}/toggle";
    public static final String FUND_MANAGERS_IMPORT = "/fund-managers/import";

    // Market Coverage
    public static final String MARKET_COVERAGE_INDEX = "/market-coverage";
    public static final String MARKET_COVERAGE_STORE = "/market-coverage";
    public static final String MARKET_COVERAGE_SHOW = "/market-coverage/{id}";
    public static final String MARKET_COVERAGE_UPDATE = "/market-coverage/{id}";
    public static final String MARKET_COVERAGE_TOGGLE = "/market-coverage/{id}/toggle";
    public static final String MARKET_COVERAGE_IMPORT = "/market-coverage/import";

    // Time Deposits
    public static final String TIME_DEPOSITS_INDEX = "/time-deposits";
    public static final String TIME_DEPOSITS_STORE = "/time-deposits";
    public static final String TIME_DEPOSITS_SHOW = "/time-deposits/{id}";
    public static final String TIME_DEPOSITS_UPDATE = "/time-deposits/{id}";
    public static final String TIME_DEPOSITS_DELETE = "/time-deposits/{id}";
    public static final String TIME_DEPOSITS_POST = "/time-deposits/{id}/post";
    public static final String TIME_DEPOSITS_LIQUIDATE = "/time-deposits/{id}/liquidate";
    public static final String TIME_DEPOSITS_BREAK = "/time-deposits/{id}/break";
    public static final String TIME_DEPOSITS_RETURN = "/time-deposits/{id}/return";
    public static final String TIME_DEPOSITS_INTEREST_TYPES = "/time-deposits/interest-types";

    // Loans
    public static final String LOANS_INDEX = "/loans";
    public static final String LOANS_STORE = "/loans";
    public static final String LOANS_SHOW = "/loans/{id}";
    public static final String LOANS_UPDATE = "/loans/{id}";
    public static final String LOANS_DELETE = "/loans/{id}";
    public static final String LOANS_POST = "/loans/{id}/post";
    public static final String LOANS_SETTLE = "/loans/{id}/settle";
    public static final String LOANS_ADD_FINANCE_COST = "/loans/{id}/add-finance-cost";
    public static final String LOANS_PAY_FINANCE_COST = "/loans/{id}/pay-finance-cost";

    // Stocks
    public static final String STOCKS_INDEX = "/stocks";
    public static final String STOCKS_STORE = "/stocks";
    public static final String STOCKS_SHOW = "/stocks/{id}";
    public static final String STOCKS_UPDATE = "/stocks/{id}";
    public static final String STOCKS_DELETE = "/stocks/{id}";
    public static final String STOCKS_UPLOAD_BULK = "/stocks/upload-bulk";
    public static final String STOCKS_SUSPEND = "/stocks/{id}/suspend";
    public static final String STOCKS_ACTIVATE = "/stocks/{id}/activate";
    public static final String STOCKS_UPDATE_PRICE = "/stocks/{id}/update-price";
    public static final String STOCKS_DIVIDEND = "/stocks/{id}/dividend";
    public static final String STOCKS_SPLIT = "/stocks/{id}/split";
    public static final String STOCKS_DELIST = "/stocks/{id}/delist";
    public static final String STOCKS_STORE_ORDER = "/stocks/{id}/orders";
    public static final String STOCKS_SHOW_ORDER = "/stocks/{id}/orders/{orderId}";
    public static final String STOCKS_UPDATE_ORDER = "/stocks/{id}/orders/{orderId}";

    // Sukuks
    public static final String SUKUKS_INDEX = "/sukuks";
    public static final String SUKUKS_STORE = "/sukuks";
    public static final String SUKUKS_SHOW = "/sukuks/{id}";
    public static final String SUKUKS_UPDATE = "/sukuks/{id}";
    public static final String SUKUKS_DELETE = "/sukuks/{id}";
    public static final String SUKUKS_UPDATE_PRICE = "/sukuks/{id}/update-price";
    public static final String SUKUKS_ADD_COUPON = "/sukuks/{id}/add-coupon";
    public static final String SUKUKS_TOGGLE = "/sukuks/{id}/toggle";
    public static final String SUKUKS_STORE_ORDER = "/sukuks/{id}/orders";
    public static final String SUKUKS_SHOW_ORDER = "/sukuks/{id}/orders/{orderId}";
    public static final String SUKUKS_UPDATE_ORDER = "/sukuks/{id}/orders/{orderId}";
    public static final String SUKUKS_LOGS = "/sukuks/{id}/logs";

    // MMF
    public static final String MMF_INDEX = "/mmf";
    public static final String MMF_STORE = "/mmf";
    public static final String MMF_SHOW = "/mmf/{id}";
    public static final String MMF_UPDATE = "/mmf/{id}";
    public static final String MMF_DELETE = "/mmf/{id}";
    public static final String MMF_UPDATE_PRICE = "/mmf/{id}/update-price";
    public static final String MMF_DIVIDEND = "/mmf/{id}/dividend";
    public static final String MMF_TOGGLE = "/mmf/{id}/toggle";

    public static final String MMF_STORE_ORDER = "/mmf/{id}/orders";
    public static final String MMF_SHOW_ORDER = "/mmf/{id}/orders/{orderId}";
    public static final String MMF_UPDATE_ORDER = "/mmf/{id}/orders/{orderId}";
    public static final String MMF_APPROVE_ORDER = "/mmf/{id}/orders/{orderId}/approve";
    public static final String MMF_REJECT_ORDER = "/mmf/{id}/orders/{orderId}/reject";
    public static final String MMF_SETTLE_ORDER = "/mmf/{id}/orders/{orderId}/settle";
    public static final String MMF_LOGS = "/mmf/{id}/logs";
    public static final String MMF_SHOW_HOLDING = "/mmf/{id}/holding";

    // Projects
    public static final String PROJECTS_INDEX = "/projects";
    public static final String PROJECTS_STORE = "/projects";
    public static final String PROJECTS_SHOW = "/projects/{id}";
    public static final String PROJECTS_UPDATE = "/projects/{id}";
    public static final String PROJECTS_DELETE = "/projects/{id}";
    public static final String PROJECTS_TOGGLE = "/projects/{id}/toggle";
    public static final String PROJECTS_LOGS = "/projects/{id}/logs";

    public static final String PROJECTS_SELL = "/projects/{id}/sell";
    public static final String PROJECTS_RECEIVE_PAYMENT = "/projects/{id}/receive-payment";
    public static final String PROJECTS_DELIVER = "/projects/{id}/deliver";
    public static final String PROJECTS_RETURN_ADVANCE = "/projects/{id}/return-advance";
    public static final String PROJECTS_PHASE_UPDATE = "/projects/{id}/phase-update";
    public static final String PROJECTS_LINK_FUND = "/projects/{id}/link-fund";

    public static final String PROJECTS_EVALUATION_HISTORY = "/projects/{id}/evaluation-history";
    public static final String PROJECTS_EVALUATION_STORE = "/projects/{id}/evaluation";

    // Projects Units
    public static final String PROJECT_UNITS_INDEX = "/projects-unites";
    public static final String PROJECT_UNITS_STORE = "/projects-unites";
    public static final String PROJECT_UNITS_SHOW = "/projects-unites/{id}";
    public static final String PROJECT_UNITS_UPDATE = "/projects-unites/{id}";
    public static final String PROJECT_UNITS_DELETE = "/projects-unites/{id}";
    public static final String PROJECT_UNITS_LOGS = "/projects-unites/{id}/logs";

    public static final String PROJECT_UNITS_SELL = "/projects-unites/{id}/sell";
    public static final String PROJECT_UNITS_RECEIVE_PAYMENT = "/projects-unites/{id}/receive-payment";
    public static final String PROJECT_UNITS_DELIVER = "/projects-unites/{id}/deliver";
    public static final String PROJECT_UNITS_RETURN_ADVANCE = "/projects-unites/{id}/return-advance";
    public static final String PROJECT_UNITS_LEASE = "/projects-unites/{id}/lease";

    // Developers
    public static final String DEVELOPERS_INDEX = "/developers";
    public static final String DEVELOPERS_STORE = "/developers";
    public static final String DEVELOPERS_SHOW = "/developers/{id}";
    public static final String DEVELOPERS_UPDATE = "/developers/{id}";
    public static final String DEVELOPERS_DELETE = "/developers/{id}";
    public static final String DEVELOPERS_TOGGLE = "/developers/{id}/toggle";

    // Wallets Management
    public static final String WALLETS_MANAGEMENT_INDEX = "/wallets-management";
    public static final String WALLETS_MANAGEMENT_STORE = "/wallets-management";
    public static final String WALLETS_MANAGEMENT_SHOW = "/wallets-management/{id}";
    public static final String WALLETS_MANAGEMENT_UPDATE = "/wallets-management/{id}";
    public static final String WALLETS_MANAGEMENT_DELETE = "/wallets-management/{id}";
    public static final String WALLETS_MANAGEMENT_ACTIVITIES = "/wallets-management/{id}/activities";
    public static final String WALLETS_MANAGEMENT_TRANSACTIONS = "/wallets-management/{id}/transactions";
    public static final String WALLETS_MANAGEMENT_EXPORT = "/wallets-management/export";

    // Wallets Requests
    public static final String WALLETS_REQUESTS_INDEX = "/wallets-requests";
    public static final String WALLETS_REQUESTS_STORE = "/wallets-requests";
    public static final String WALLETS_REQUESTS_SHOW = "/wallets-requests/{id}";
    public static final String WALLETS_REQUESTS_UPDATE = "/wallets-requests/{id}";
    public static final String WALLETS_REQUESTS_DELETE = "/wallets-requests/{id}";
    public static final String WALLETS_REQUESTS_UPDATE_STATUS = "/wallets-requests/{id}/status";

    // Home
    public static final String HOME_STATISTICS = "/home/statistics";
    public static final String HOME_OFFERING_FUNDS = "/home/offering-funds";

    // groups
    public static final String GROUPS_INDEX = "/groups";
    public static final String GROUPS_STORE = "/groups";
    public static final String GROUPS_SHOW = "/groups/{id}";
    public static final String GROUPS_DELETE = "/groups/{id}";

    // Banks
    public static final String BANKS_INDEX = "/banks";
    public static final String BANKS_STORE = "/banks";
    public static final String BANKS_SHOW = "/banks/{id}";
    public static final String BANKS_UPDATE = "/banks/{id}";
    public static final String BANKS_DELETE = "/banks/{id}";

    // Custodians
    public static final String CUSTODIANS_INDEX = "/custodians";
    public static final String CUSTODIANS_STORE = "/custodians";
    public static final String CUSTODIANS_SHOW = "/custodians/{id}";
    public static final String CUSTODIANS_UPDATE = "/custodians/{id}";
    public static final String CUSTODIANS_DELETE = "/custodians/{id}";
    public static final String CUSTODIANS_TOGGLE = "/custodians/{id}/toggle";
    public static final String CUSTODIANS_DOWNLOAD_FILE = "/custodians/{id}/download-file";
    public static final String CUSTODIANS_LOGS = "/custodians/{id}/logs";

    // IBANs
    public static final String IBANS_INDEX = "/ibans";
    public static final String IBANS_IMPORT = "/ibans/import";
    public static final String IBANS_STATISTICS = "/ibans/statistics";
    public static final String IBANS_TOGGLE = "/ibans/{id}/toggle";

    // Risk Types
    public static final String RISK_TYPES_INDEX = "/risk-types";
    public static final String RISK_TYPES_STORE = "/risk-types";
    public static final String RISK_TYPES_SHOW = "/risk-types/{id}";
    public static final String RISK_TYPES_UPDATE = "/risk-types/{id}";
    public static final String RISK_TYPES_DELETE = "/risk-types/{id}";
    public static final String RISK_TYPES_TOGGLE_STATUS = "/risk-types/{id}/toggle-status";

    // Auditors
    public static final String AUDITORS_INDEX = "/auditors";
    public static final String AUDITORS_STORE = "/auditors";
    public static final String AUDITORS_SHOW = "/auditors/{id}";
    public static final String AUDITORS_UPDATE = "/auditors/{id}";
    public static final String AUDITORS_DELETE = "/auditors/{id}";
    public static final String AUDITORS_TOGGLE_STATUS = "/auditors/{id}/toggle-status";

    // Charts of Accounts
    public static final String CHARTS_OF_ACCOUNTS_INDEX = "/charts-of-accounts";
    public static final String CHARTS_OF_ACCOUNTS_STORE = "/charts-of-accounts";
    public static final String CHARTS_OF_ACCOUNTS_SHOW = "/charts-of-accounts/{id}";
    public static final String CHARTS_OF_ACCOUNTS_UPDATE = "/charts-of-accounts/{id}";
    public static final String CHARTS_OF_ACCOUNTS_DELETE = "/charts-of-accounts/{id}";
    public static final String CHARTS_OF_ACCOUNTS_CLONE = "/charts-of-accounts/{id}/clone";
    public static final String CHARTS_OF_ACCOUNTS_ASSIGN = "/charts-of-accounts/{id}/assign";
    public static final String CHARTS_OF_ACCOUNTS_RENAME = "/charts-of-accounts/{id}/rename";


    // Get Token For Admin
    public static final String GET_TOKEN_FOR_ADMIN = "/exp/token/{id}";

}