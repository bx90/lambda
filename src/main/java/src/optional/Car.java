package src.optional;

import java.util.Optional;

public class Car {
//    private Optional<Insurance> insurance;
    private Insurance insurance;

//    public Optional<Insurance> getInsurance() {
//        return insurance;
//    }
    public Optional<Insurance> getInsurance() {
        return  Optional.ofNullable(insurance);
    }

//    public void setInsurance(Optional<Insurance> insurance) {
//        this.insurance = insurance;
//    }
}
