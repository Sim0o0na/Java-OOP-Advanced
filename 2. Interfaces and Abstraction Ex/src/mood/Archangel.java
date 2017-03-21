package mood;

public class Archangel extends CharacterImpl<Integer>{
    private int mana;

    public Archangel(String userName,int level, int mana) {
        super(userName, level);
        this.setPassword();
        this.setMana(mana);
    }

    public int getMana() {
        return mana;
    }

    private void setMana(int mana) {
        this.mana = mana;
    }

    private void setPassword() {
        super.setHashedPassword(this.hashPass());
    }

    @Override
    public Integer getSpecialPoints() {
        return this.getMana();
    }

    @Override
    public String hashPass() {
        return new StringBuilder(this.getUserName()).reverse().toString()+String.valueOf(this.getUserName().length()*21);
    }
    @Override
    public String toString() {
        return String.format("%s%s",super.toString(),(( this.getSpecialPoints() * this.getLevel())));
    }
}
