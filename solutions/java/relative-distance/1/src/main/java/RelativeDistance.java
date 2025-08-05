import java.util.*;

class RelativeDistance {

    private final Map<String, List<String>> familyTree;

    RelativeDistance(Map<String, List<String>> familyTree) {
        // Create a deep copy to avoid modifying the original
        this.familyTree = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : familyTree.entrySet()) {
            this.familyTree.put(entry.getKey(), new ArrayList<>(entry.getValue()));
        }
    }

    int degreeOfSeparation(String personA, String personB) {
        // Use breadth-first search to find shortest path
        if (personA.equals(personB)) return 0;

        // Create a queue for BFS
        Queue<String> queue = new LinkedList<>();
        // Track visited people
        Set<String> visited = new HashSet<>();
        // Track degrees of separation
        Map<String, Integer> distance = new HashMap<>();

        // Start with personA
        queue.add(personA);
        visited.add(personA);
        distance.put(personA, 0);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            int currentDistance = distance.get(current);

            // Check all connections from this person

            // Check if current is a parent
            if (familyTree.containsKey(current)) {
                List<String> children = familyTree.get(current);
                for (String child : children) {
                    if (child.equals(personB)) {
                        return currentDistance + 1;
                    }
                    if (!visited.contains(child)) {
                        queue.add(child);
                        visited.add(child);
                        distance.put(child, currentDistance + 1);
                    }
                }
            }

            // Check if current is a child in any parent-child relationship
            for (Map.Entry<String, List<String>> entry : familyTree.entrySet()) {
                String parent = entry.getKey();
                List<String> children = entry.getValue();

                if (children.contains(current)) {
                    // Found current as a child, check parent and siblings
                    if (parent.equals(personB)) {
                        return currentDistance + 1;
                    }
                    if (!visited.contains(parent)) {
                        queue.add(parent);
                        visited.add(parent);
                        distance.put(parent, currentDistance + 1);
                    }

                    // Check siblings (other children of this parent)
                    for (String sibling : children) {
                        if (sibling.equals(personB)) {
                            return currentDistance + 1;
                        }
                        if (!sibling.equals(current) && !visited.contains(sibling)) {
                            queue.add(sibling);
                            visited.add(sibling);
                            distance.put(sibling, currentDistance + 1);
                        }
                    }
                }
            }
        }

        return -1; // No connection found
    }
}
