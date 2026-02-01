// Report.java
import java.util.Date;

public class Report {
    private int report_code;
    private Date report_date;
    
    // Composition: Report ผูกติดกับ Proposal รายการต่อรายการ [cite: 221]
    private Proposal proposal; 

    public void viewReports() {}
    public void createReports() {}
}