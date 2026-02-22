package MyExercises;

class Computer {            // Oh, this is a default. So, only in the package
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

