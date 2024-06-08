public class GetPlanFactory {
    public Plan getPlan(String planType) {
        if(planType == null) {
            return null;
        }
        if(planType.equalsIgnoreCase("COMMERCIAL")) {
            return new CommercialPlan();
        } else if(planType.equalsIgnoreCase("DOMESTIC")) {
            return new DomesticPlan();
        }
        return null;
    }
}
