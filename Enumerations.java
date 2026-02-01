// Gender.java
enum Gender {
    M, F
}

// RoleUser.java
enum RoleUser {
    PublicRelation, Division, Manager
}

// StatusProposal.java
enum StatusProposal {
    Waiting, Rejected, Accepted;

    public void changeStatus() {
        // Logic สำหรับเปลี่ยนสถานะ
    }
}