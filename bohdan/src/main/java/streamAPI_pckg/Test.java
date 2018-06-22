package streamAPI_pckg;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // TODO: 6/22/2018  
/*

        Map<String, Integer> countedWords = Files
                .lines(Paths.get("C:\\Users\\admin\\Desktop\\GOTSubs\\toRead"))
                .map(line -> line.replaceAll("[^a-zA-Z ]+", ""))
                .flatMap(line -> Arrays.stream(line.split(" "))
                        .map(l -> l.trim().toLowerCase())
//                        .collect(Collectors.toMap(l -> l, Map::containsKey ? (Map::get + 1) : 1));
                        .collect(HashMap::new,
                                (m, l) -> m.put(l, m.containsKey(l) ? ((Integer)m.get(l) + 1) : 1),
                                HashMap::putAll);

*/

    }
}
