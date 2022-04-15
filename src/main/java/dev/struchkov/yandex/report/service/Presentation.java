package dev.struchkov.yandex.report.service;

import dev.struchkov.yandex.report.domain.MonthlyReport;
import dev.struchkov.yandex.report.domain.YearlyReport;

import java.time.Month;
import java.util.List;
import java.util.Set;

public interface Presentation {

    void displayMenu();

    String userInput(String text);

    void showMonthReport(List<MonthlyReport> monthlyReports);

    void showYearReport(List<YearlyReport> yearlyReports);

    void showResultDataReconciliation(Set<Month> months);

}
