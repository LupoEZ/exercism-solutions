import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !(myCollection.containsAll(theirCollection) || theirCollection.containsAll(myCollection));
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        if (collections.isEmpty()) return new HashSet<>();
        Set<String> commonCards = new HashSet<>(collections.getFirst());
        collections.forEach(commonCards::retainAll);
        return commonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> commonCards = new HashSet<>();
        collections.forEach(commonCards::addAll);
        return commonCards;
    }

}
