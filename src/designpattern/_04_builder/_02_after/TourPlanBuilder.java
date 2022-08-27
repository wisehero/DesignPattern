package src.designpattern._04_builder._02_after;

import java.time.LocalDate;

import src.designpattern._04_builder._01_before.TourPlan;

public interface TourPlanBuilder {

	TourPlanBuilder nightsAndDays(int nights, int days);

	TourPlanBuilder title(String title);

	TourPlanBuilder startDate(LocalDate localDate);

	TourPlanBuilder whereToStay(String whereToStay);

	TourPlanBuilder addPlan(int day, String plan);

	TourPlan getPlan();
}
