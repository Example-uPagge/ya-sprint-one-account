package dev.struchkov.yandex.report.service;

import dev.struchkov.yandex.report.domain.YearData;
import dev.struchkov.yandex.report.domain.YearlyReport;

import java.time.Year;
import java.util.List;

public interface YearService extends ReportService<YearData> {

    List<YearData> getByYear(Year year);

    YearlyReport generateYearReport(Year year);

    List<YearlyReport> generateAllYearReport();

    void clear(Year year);

}
