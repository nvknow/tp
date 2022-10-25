package pet;

public enum PetHealthyStatus implements PetStatus{
    happy,
    boring,
    sleepy,
    energetic,
    crazy;

    public String getPetStatusDescription() {
        switch (this) {
        case happy:
            return "happy";
        case boring:
            return "boring";
        case sleepy:
            return "sleepy";
        case energetic:
            return "energetic";
        case crazy:
            return "crazy";
        default:
            return "Healthy";
        }
    }
}