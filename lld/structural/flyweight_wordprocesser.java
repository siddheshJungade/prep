public class Character {
    private char c;
    private int size;
    String fontType;
    int row;
    int column;
    public Character(char c, int size, int color, String fontType, int row, int column) {
        this.c = c;
        this.size = size;
        this.fontType = fontType;
    }
    // getters and setters
}

public class CharacterFactory {
    private Map<Character, Character> characters = new HashMap<>();
    public Character getCharacter(char c, int size, int color, String fontType, int row, int column) {
        Character character = new Character(c, size, color, fontType, row, column);
        if (!characters.containsKey(character)) {
            characters.put(character, character);
        }
        return characters.get(character);
    }
}
x
public class WordProcessor {
    private List<Character> characters = new ArrayList<>();
    private CharacterFactory characterFactory;
    public WordProcessor(CharacterFactory characterFactory) {
        this.characterFactory = characterFactory;
    }
    public void addCharacter(char c, int size, int color, String fontType, int row, int column) {
        Character character = characterFactory.getCharacter(c, size, color, fontType, row, column);
        characters.add(character);
    }
    public void printCharacters() {
        for (Character character : characters) {
            System.out.println("Character: " + character.c + ", Size: " + character.size + ", Color: " + character.color + ", FontType: " + character.fontType + ", Row: " + character.row + ", Column: " + character.column);
        }
    }
}

public class FlyweightWordProcessor {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        WordProcessor wordProcessor = new WordProcessor(characterFactory);
        wordProcessor.addCharacter('H', 12, 1, "Arial", 1, 1);
        wordProcessor.addCharacter('e', 12, 1, "Arial", 1, 2);
        wordProcessor.addCharacter('l', 12, 1, "Arial", 1, 3);
        wordProcessor.addCharacter('l', 12, 1, "Arial", 1, 4);
        wordProcessor.addCharacter('o', 12, 1, "Arial", 1, 5);
        wordProcessor.addCharacter(' ', 12, 1, "Arial", 1, 6);
        wordProcessor.addCharacter('W', 12, 1, "Arial", 2, 1);
        wordProcessor.addCharacter('o', 12, 1, "Arial", 2, 2);
        wordProcessor.addCharacter('r', 12, 1, "Arial", 2, 3);
        wordProcessor.addCharacter('l', 12, 1, "Arial", 2, 4);
        wordProcessor.addCharacter('d', 12, 1, "Arial", 2, 5);
        wordProcessor.printCharacters();
    }
}