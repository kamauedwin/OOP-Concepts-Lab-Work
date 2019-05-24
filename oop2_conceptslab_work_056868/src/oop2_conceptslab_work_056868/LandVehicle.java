package oop2_conceptslab_work_056868;

public class LandVehicle extends Vehicle {

    @Override
    public double calculateFees() {

        return fees;
    }

    @Override
    public String DetermineCraft() {
        return null;
    }

    @Override
    public String DeterminePurpose(PURPOSE purpose) {
        switch (purpose) {
            case CARGO:
                return "Carrying Cargo";
            case PASSENGER:
                return "Carrying Passengers";
            default:
                return "Invalid!";
        }
    }
}
