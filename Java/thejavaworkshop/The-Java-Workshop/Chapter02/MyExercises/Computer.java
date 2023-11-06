package MyExercises;

public class Computer {
    // variables
    private double cpuSpeed;     // in GHz

    // constructor
    Computer() {
        cpuSpeed = 0;
    }

    // methods
    void setCpuSpeed(double _cpuSpeed){
        cpuSpeed = _cpuSpeed;
    }

    double getCpuSpeed() {
        return cpuSpeed;
    }

}

