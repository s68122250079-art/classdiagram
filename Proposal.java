
// Proposal.java
import java.util.Date;

public class Proposal {
    private String proposal_code;
    private String proposal_title;
    private String proposal_text;
    private Date proposal_date;
    private StatusProposal proposal_status = StatusProposal.Waiting;
    
    // Composition: Applicant จะถูกสร้างพร้อมกับ Proposal
    private Applicant applicant; 

    public void viewProposal() {}
    public void viewStatus() {}
    public void updateProposal() {}
    public void deleteProposal() {}
    public void archiveProposal() {}
    public void viewApplicant() {}
}