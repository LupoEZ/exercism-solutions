public class GameMaster {

    // TODO: define a 'describe' method that returns a description of a Character
    public static String describe(Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
    }

    // TODO: define a 'describe' method that returns a description of a Destination
    public static String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod
    public static String describe(TravelMethod travelMethod) {
        return "You're traveling to your destination " + travelMethod.getDescription();
    }

    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public static String describe(
            Character character,
            Destination destination,
            TravelMethod travelMethod
    ) {
        return describe(character) + " " + describe(travelMethod) + " " + describe(destination);
    }

    // TODO: define a 'describe' method that returns a description of a Character and Destination
    public static String describe(
            Character character,
            Destination destination
    ) {
        return describe(character, destination, TravelMethod.WALKING);
    }

}
