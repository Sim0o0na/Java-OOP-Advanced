package mood;

public class Demon extends CharacterImpl<Double>{
    private double energy;

    public Demon(String userName, int level, double energy) {
        super(userName, level);
        this.setPassword();
        this.setEnergy(energy);
    }

    private void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getEnergy() {
        return energy;
    }

    @Override
    public Double getSpecialPoints() {
        return this.getEnergy();
    }

    @Override
    public String hashPass() {
        return String.valueOf(this.getUserName().length()*217);
    }

    private void setPassword() {
        super.setHashedPassword(this.hashPass());
    }

    @Override
    public String toString() {
        return String.format("%s%s",super.toString(),(( this.getSpecialPoints() * this.getLevel())));
    }
}
