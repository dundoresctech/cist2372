package GE;

  public static String getRandomWord() 
    {
        String[] word = {"Artichoke", "Bearskin", "Cuttlefish", "Digital", "Earwax", "Fluter", "Goatsbeard", "Huckleberry", "Imposter", "Juniper", "Knobbly", "Lantern", "Mammoth", "Nightmare", "Origami", "Playwright", "Quartzrose", "Racoon", "Sorcerer", "Tablespoon", "Ultrasound", "Vessel", "Yesterday", "Zesty"};
        Random rand = new Random();
        String randWord = new String(word[rand.nextInt(word.length)]);   
        return randWord;

    }
