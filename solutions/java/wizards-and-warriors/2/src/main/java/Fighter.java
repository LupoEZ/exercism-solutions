class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    private final static int VULNERABLE_DAMAGE = 10;
    private final static int NOT_VULNERABLE_DAMAGE = 6;

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? VULNERABLE_DAMAGE : NOT_VULNERABLE_DAMAGE;
    }

}

class Wizard extends Fighter {

    private final static int PREPARED_SPELL_DAMAGE = 12;
    private final static int NO_PREPARED_SPELL_DAMAGE = 3;

    private boolean preparedSpell = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    void prepareSpell() {
        preparedSpell = true;
    }

    @Override
    boolean isVulnerable() {
        return !preparedSpell;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        return preparedSpell ? PREPARED_SPELL_DAMAGE : NO_PREPARED_SPELL_DAMAGE;
    }

}


